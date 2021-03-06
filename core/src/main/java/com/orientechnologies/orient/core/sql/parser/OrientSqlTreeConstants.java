/* Generated By:JavaCC: Do not edit this line. OrientSqlTreeConstants.java Version 5.0 */
package com.orientechnologies.orient.core.sql.parser;

public interface OrientSqlTreeConstants
{
  public int JJTRID = 0;
  public int JJTPARSE = 1;
  public int JJTIDENTIFIER = 2;
  public int JJTINTEGER = 3;
  public int JJTFLOATINGPOINT = 4;
  public int JJTNUMBER = 5;
  public int JJTSTATEMENT = 6;
  public int JJTSELECTWITHOUTTARGETSTATEMENT = 7;
  public int JJTSELECTSTATEMENT = 8;
  public int JJTTRAVERSESTATEMENT = 9;
  public int JJTDELETESTATEMENT = 10;
  public int JJTDELETEVERTEXSTATEMENT = 11;
  public int JJTDELETEEDGESTATEMENT = 12;
  public int JJTDELETEEDGEBYRIDSTATEMENT = 13;
  public int JJTDELETEEDGEFROMTOSTATEMENT = 14;
  public int JJTDELETEEDGETOSTATEMENT = 15;
  public int JJTDELETEEDGEVTOSTATEMENT = 16;
  public int JJTDELETEEDGEWHERESTATEMENT = 17;
  public int JJTUPDATESTATEMENT = 18;
  public int JJTUPDATEOPERATIONS = 19;
  public int JJTUPDATEITEM = 20;
  public int JJTUPDATEINCREMENTITEM = 21;
  public int JJTUPDATEREMOVEITEM = 22;
  public int JJTUPDATEPUTITEM = 23;
  public int JJTUPDATEADDITEM = 24;
  public int JJTINSERTSTATEMENT = 25;
  public int JJTINSERTBODY = 26;
  public int JJTCREATEVERTEXSTATEMENTEMPTYNOTARGET = 27;
  public int JJTCREATEVERTEXSTATEMENTEMPTY = 28;
  public int JJTCREATEVERTEXSTATEMENT = 29;
  public int JJTCREATEVERTEXSTATEMENTNOTARGET = 30;
  public int JJTCREATEEDGESTATEMENT = 31;
  public int JJTINPUTPARAMETER = 32;
  public int JJTPOSITIONALPARAMETER = 33;
  public int JJTNAMEDPARAMETER = 34;
  public int JJTPROJECTION = 35;
  public int JJTPROJECTIONITEM = 36;
  public int JJTARRAYSELECTOR = 37;
  public int JJTARRAYNUMBERSELECTOR = 38;
  public int JJTARRAYSINGLEVALUESSELECTOR = 39;
  public int JJTARRAYRANGESELECTOR = 40;
  public int JJTALIAS = 41;
  public int JJTRECORDATTRIBUTE = 42;
  public int JJTFUNCTIONCALL = 43;
  public int JJTMETHODCALL = 44;
  public int JJTLEVELZEROIDENTIFIER = 45;
  public int JJTSUFFIXIDENTIFIER = 46;
  public int JJTBASEIDENTIFIER = 47;
  public int JJTMODIFIER = 48;
  public int JJTEXPRESSION = 49;
  public int JJTMATHEXPRESSION = 50;
  public int JJTMULTEXPRESSION = 51;
  public int JJTFIRSTLEVELEXPRESSION = 52;
  public int JJTPARENTHESISEXPRESSION = 53;
  public int JJTBASEEXPRESSION = 54;
  public int JJTFROMCLAUSE = 55;
  public int JJTLETCLAUSE = 56;
  public int JJTLETITEM = 57;
  public int JJTFROMITEM = 58;
  public int JJTCLUSTER = 59;
  public int JJTMETADATAIDENTIFIER = 60;
  public int JJTINDEXIDENTIFIER = 61;
  public int JJTWHERECLAUSE = 62;
  public int JJTORBLOCK = 63;
  public int JJTANDBLOCK = 64;
  public int JJTNOTBLOCK = 65;
  public int JJTPARENTHESISBLOCK = 66;
  public int JJTCONDITIONBLOCK = 67;
  public int JJTCOMPAREOPERATOR = 68;
  public int JJTLTOPERATOR = 69;
  public int JJTGTOPERATOR = 70;
  public int JJTNEOPERATOR = 71;
  public int JJTNEQOPERATOR = 72;
  public int JJTGEOPERATOR = 73;
  public int JJTLEOPERATOR = 74;
  public int JJTLIKEOPERATOR = 75;
  public int JJTLUCENEOPERATOR = 76;
  public int JJTCONTAINSKEYOPERATOR = 77;
  public int JJTCONTAINSVALUEOPERATOR = 78;
  public int JJTEQUALSCOMPAREOPERATOR = 79;
  public int JJTBINARYCONDITION = 80;
  public int JJTCONTAINSVALUECONDITION = 81;
  public int JJTINSTANCEOFCONDITION = 82;
  public int JJTINDEXMATCHCONDITION = 83;
  public int JJTBETWEENCONDITION = 84;
  public int JJTISNULLCONDITION = 85;
  public int JJTISNOTNULLCONDITION = 86;
  public int JJTISDEFINEDCONDITION = 87;
  public int JJTISNOTDEFINEDCONDITION = 88;
  public int JJTCONTAINSCONDITION = 89;
  public int JJTINOPERATOR = 90;
  public int JJTINCONDITION = 91;
  public int JJTNOTINCONDITION = 92;
  public int JJTCONTAINSALLCONDITION = 93;
  public int JJTCONTAINSTEXTCONDITION = 94;
  public int JJTMATCHESCONDITION = 95;
  public int JJTORDERBY = 96;
  public int JJTGROUPBY = 97;
  public int JJTLIMIT = 98;
  public int JJTSKIP = 99;
  public int JJTTIMEOUT = 100;
  public int JJTWAIT = 101;
  public int JJTRETRY = 102;
  public int JJTCOLLECTION = 103;
  public int JJTFETCHPLAN = 104;
  public int JJTFETCHPLANITEM = 105;
  public int JJTTRAVERSEPROJECTIONITEM = 106;
  public int JJTARRAY = 107;
  public int JJTJSON = 108;


  public String[] jjtNodeName = {
    "Rid",
    "parse",
    "Identifier",
    "Integer",
    "FloatingPoint",
    "Number",
    "Statement",
    "SelectWithoutTargetStatement",
    "SelectStatement",
    "TraverseStatement",
    "DeleteStatement",
    "DeleteVertexStatement",
    "DeleteEdgeStatement",
    "DeleteEdgeByRidStatement",
    "DeleteEdgeFromToStatement",
    "DeleteEdgeToStatement",
    "DeleteEdgeVToStatement",
    "DeleteEdgeWhereStatement",
    "UpdateStatement",
    "UpdateOperations",
    "UpdateItem",
    "UpdateIncrementItem",
    "UpdateRemoveItem",
    "UpdatePutItem",
    "UpdateAddItem",
    "InsertStatement",
    "InsertBody",
    "CreateVertexStatementEmptyNoTarget",
    "CreateVertexStatementEmpty",
    "CreateVertexStatement",
    "CreateVertexStatementNoTarget",
    "CreateEdgeStatement",
    "InputParameter",
    "PositionalParameter",
    "NamedParameter",
    "Projection",
    "ProjectionItem",
    "ArraySelector",
    "ArrayNumberSelector",
    "ArraySingleValuesSelector",
    "ArrayRangeSelector",
    "Alias",
    "RecordAttribute",
    "FunctionCall",
    "MethodCall",
    "LevelZeroIdentifier",
    "SuffixIdentifier",
    "BaseIdentifier",
    "Modifier",
    "Expression",
    "MathExpression",
    "MultExpression",
    "FirstLevelExpression",
    "ParenthesisExpression",
    "BaseExpression",
    "FromClause",
    "LetClause",
    "LetItem",
    "FromItem",
    "Cluster",
    "MetadataIdentifier",
    "IndexIdentifier",
    "WhereClause",
    "OrBlock",
    "AndBlock",
    "NotBlock",
    "ParenthesisBlock",
    "ConditionBlock",
    "CompareOperator",
    "LtOperator",
    "GtOperator",
    "NeOperator",
    "NeqOperator",
    "GeOperator",
    "LeOperator",
    "LikeOperator",
    "LuceneOperator",
    "ContainsKeyOperator",
    "ContainsValueOperator",
    "EqualsCompareOperator",
    "BinaryCondition",
    "ContainsValueCondition",
    "InstanceofCondition",
    "IndexMatchCondition",
    "BetweenCondition",
    "IsNullCondition",
    "IsNotNullCondition",
    "IsDefinedCondition",
    "IsNotDefinedCondition",
    "ContainsCondition",
    "InOperator",
    "InCondition",
    "NotInCondition",
    "ContainsAllCondition",
    "ContainsTextCondition",
    "MatchesCondition",
    "OrderBy",
    "GroupBy",
    "Limit",
    "Skip",
    "Timeout",
    "Wait",
    "Retry",
    "Collection",
    "FetchPlan",
    "FetchPlanItem",
    "TraverseProjectionItem",
    "Array",
    "Json",
  };
}
/* JavaCC - OriginalChecksum=a1c6a6e18f10f96f691bbcd72537b5e7 (do not edit this line) */
