abstract class BaseList {
  type Node <: BaseNode;


  abstract class BaseNode {
    protected def self : Node;
    private[BaseList] def self00 = self;
    def dirty : Unit = {}
    def replaceWith(node : Node) = {}
  }

  implicit def baseNode2Node(bnode : BaseNode): Node = bnode.self00;


}


trait BaseFlow extends BaseList {
  type Node <: BFNode;
  type Flow <: FlowBase;
  type Output <: OutputBase;
  type  Input <:  InputBase;

  abstract class FlowBase {

  }
  trait OutputBase extends FlowBase {

  }
  trait  InputBase extends FlowBase {

  }

  trait BFNode extends BaseNode {
    private var  input : Input  = _;
    private var output : Output = _;

    def input_=(in : Input) = {}

  }
}
