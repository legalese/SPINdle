/**
 * SPINdle (version 2.2.0)
 * Copyright (C) 2009-2012 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
package spindle.sys.message;

/**
 * Error message constants.
 * 
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory
 * @version Last modified 2011.07.27
 * @since version 1.0.0
 */
public interface ErrorMessage {

	// Configuration, I/O
	String IO_XML_STRING_IS_EMPTY = "IO_XML_STRING_IS_EMPTY";
	String IO_EMPTY_FILENAME = "IO_EMPTY_FILENAME";
	String IO_FILE_NOT_EXIST = "IO_FILE_NOT_EXIST";
	String IO_FILE_READING_ERROR = "IO_FILE_READING_ERROR";
	String IO_UNEXPECTED_END_OF_FILE = "IO_UNEXPECTED_END_OF_FILE";
	String IO_PARSER_TYPE_NULL = "IO_PARSER_TYPE_NULL";
	String IO_PARSER_TYPE_UNKNOWN = "IO_PARSER_TYPE_UNKNOWN";
	String IO_PARSER_INITITATION_ERROR = "IO_PARSER_INITITATION_ERROR";
	String IO_OUTPUTTER_TYPE_NULL = "IO_OUTPUTTER_TYPE_NULL";
	String IO_OUTPUTTER_TYPE_UNKNOWN = "IO_OUTPUTTER_TYPE_UNKNOWN";
	String IO_OUTPUTTER_INITIATION_ERROR = "IO_OUTPUTTER_INITIATION_ERROR";
	String IO_INPUT_STREAM_NULL = "IO_INPUT_STREAM_NULL";
	String IO_OUTPUT_STREAM_NULL = "IO_OUTPUT_STREAM_NULL";
	String IO_OUTPUTTER_THEORY_SAVE_EXCEPTION = "IO_OUTPUTTER_THEORY_SAVE_EXCEPTION";

	// Application constants
	String APPLICATION_CONSTANT_LABEL_MISSING = "APPLICATION_CONSTANT_LABEL_MISSING";

	// theory
	String THEORY_NULL_THEORY = "THEORY_NULL_THEORY";
	String THEORY_EMPTY_THEORY = "THEORY_EMPTY_THEORY";
	String THEORY_UNRECOGNIZED_THEORY_TYPE = "THEORY_UNRECOGNIZED_THEORY_TYPE";
	String THEORY_UPDATE_ERROR = "THEORY_UPDATE_ERROR";
	String THEORY_NOT_IN_REGULAR_FORM_MULTIPLE_HEADS = "THEORY_NOT_IN_REGULAR_FORM_MULTIPLE_HEADS";
	String THEORY_NOT_IN_REGULAR_FORM_CONTAINS_FACT = "THEORY_NOT_IN_REGULAR_FORM_CONTAINS_FACT";
	String THEORY_NOT_IN_REGULAR_FORM_CONTAINS_DFEATER = "THEORY_NOT_IN_REGULAR_FORM_CONTAINS_DFEATER";
	String THEORY_NOT_IN_REGULAR_FORM_CONTAINS_SUPERIORITY_RELATION = "THEORY_NOT_IN_REGULAR_FORM_CONTAINS_SUPERIORITY_RELATION";
	String THEORY_SUPERIOR_RULE_NOT_FOUND_IN_THEORY = "THEORY_SUPERIOR_RULE_NOT_FOUND_IN_THEORY";
	String THEORY_INFERIOR_RULE_NOT_FOUND_IN_THEORY = "THEORY_INFERIOR_RULE_NOT_FOUND_IN_THEORY";

	// rule
	String RULE_NULL_RULE = "RULE_NULL_RULE";
	String RULE_UNRECOGNIZED_RULE_ID = "RULE_UNRECOGNIZED_RULE_ID";
	String RULE_UNRECOGNIZED_RULE_ID_IN_TYPE = "RULE_UNRECOGNIZED_RULE_ID_IN_TYPE";
	String RULE_UNRECOGNIZED_RULE_TYPE = "RULE_UNRECOGNIZED_RULE_TYPE";
	String RULE_ALREADY_EXISTS = "RULE_ALREADY_EXISTS";
	String RULE_NO_HEAD_LITERAL = "RULE_NO_HEAD_LITERAL";
	String RULE_THEORY_VARIABLE_IN_HEAD = "RULE_THEORY_VARIABLE_IN_HEAD";
	String RULE_NON_DEFEASIBLE_RULE_WITH_MULTIPLE_HEADS = "RULE_NON_DEFEASIBLE_RULE_WITH_MULTIPLE_HEADS";
	String RULE_NO_STRONGER_RULE_EXISTS = "RULE_NO_STRONGER_RULE_EXISTS";
	String RULE_NO_WEAKER_RULE_EXISTS = "RULE_NO_WEAKER_RULE_EXISTS";

	// literal
	String LITERAL_NAME_MISSING = "LITERAL_NAME_MISSING";
	String LITERAL_NULL_LITERAL = "LITERAL_NULL_LITERAL";
	String LITERAL_MODE_ARGUMENT_MISSING = "LITERAL_MODE_ARGUMENT_MISSING";
	String LITERAL_TEMPORAL_ARGUMENT_MISSING = "LITERAL_TEMPORAL_ARGUMENT_MISSING";
	String LITERAL_COMPONENT_MISORDERED = "LITERAL_COMPONENT_MISORDERED";
	String LITERAL_COMPONENT_MISMATCH = "LITERAL_COMPONENT_MISMATCH";
	String LITERAL_STRING_INCORRECT_FORMAT = "LITERAL_STRING_INCORRECT_FORMAT";
	String LITERAL_STRING_CONTAINS_MULTIPLE_LITERALS = "LITERAL_STRING_CONTAINS_MULTIPLE_LITERALS";

	// literal variable and boolean function
	String LITERAL_VARIABLE_PREFIX_ERROR = "LITERAL_VARIABLE_PREFIX_ERROR";
	String LITERAL_VARIABLE_INPUT_STRING_ERROR = "LITERAL_VARIABLE_INPUT_STRING_ERROR";
	String LITERAL_VARIABLE_DEFINITION_NOT_FOUND = "LITERAL_VARIABLE_DEFINITION_NOT_FOUND";
	String LITERAL_VARIABLE_APP_CONSTANT_AS_NAME = "LITERAL_VARIABLE_APP_CONSTANT_AS_NAME";
	String LITERAL_VARIABLE_NULL_THEORY_VARIABLE_NAME = "LITERAL_VARIABLE_NULL_THEORY_VARIABLE_NAME";
	String LITERAL_VARIABLE_CANNOT_BE_NEGATED = "LITERAL_VARIABLE_CANNOT_BE_NEGATED";
	String LITERAL_VARIABLE_EXISTS = "LITERAL_VARIABLE_EXISTS";
	String LITERAL_BOOLEAN_FUNCTION_COMPONENT_MISMATCH = "LITERAL_BOOLEAN_FUNCTION_COMPONENT_MISMATCH";
	String LITERAL_BOOLEAN_FUNCTION_PREFIX_MISMATCH = "LITERAL_BOOLEAN_FUNCTION_PREFIX_MISMATCH";
	String LITERAL_BOOLEAN_FUNCTION_POSTFIX_MISMATCH = "LITERAL_BOOLEAN_FUNCTION_POSTFIX_MISMATCH";
	String LITERAL_BOOLEAN_FUNCTION_LEFT_ITEM_MISSING = "LITERAL_BOOLEAN_FUNCTION_LEFT_ITEM_MISSING";
	String LITERAL_BOOLEAN_FUNCTION_RIGHT_ITEM_MISSING = "LITERAL_BOOLEAN_FUNCTION_RIGHT_ITEM_MISSING";
	String LITERAL_BOOLEAN_FUNCTION_EXISTS = "LITERAL_BOOLEAN_FUNCTION_EXISTS";

	// temporal information
	String TEMPORAL_STARTTIME_ENDTIME = "LITERAL_TEMPORAL_STARTTIME_ENDTIME";
	String TEMPORAL_NOT_INTERSECTED = "TEMPORAL_NOT_INTERSECTED";

	// superiority relation
	String SUPERIORITY_SUPERIOR_RULE_NOT_DEFINED = "SUPERIORITY_SUPERIOR_RULE_NOT_DEFINED";
	String SUPERIORITY_INFERIOR_RULE_NOT_DEFINED = "SUPERIORITY_INFERIOR_RULE_NOT_DEFINED";
	String SUPERIORITY_UNCONFLICTING_RULES = "SUPERIORITY_UNCONFLICTING_RULES";

	// conclusion
	String CONCLUSION_UNKNOWN_CONCLUSION_TYPE = "CONCLUSION_UNKNOWN_CONCLUSION_TYPE";
	String CONCLUSION_NULL_CONCLUSION = "CONCLUSION_NULL_CONCLUSION";

	// theory normalizer
	String TRANSFORMATION_REGULAR_TRANSFORM_ERROR = "TRANSFORMATION_REGULAR_TRANSFORM_ERROR";
	String TRANSFORMATION_DEFEATER_REMOVAL_ERROR = "TRANSFORMATION_DEFEATER_REMOVAL_ERROR";
	String TRANSFORMATION_SUPERIORITY_REMOVAL_ERROR = "TRANSFORMATION_SUPERIORITY_REMOVAL_ERROR";

	// reasoning engine
	String REASONING_ENGINE_LITERAL_VARIABLES_NOT_YET_EVALUATED = "REASONING_ENGINE_LITERAL_VARIABLES_NOT_YET_EVALUATED";
	String REASONING_ENGINE_LITERAL_BOOLEAN_FUNCTION_NOT_YET_EVALUATED = "REASONING_ENGINE_LITERAL_BOOLEAN_FUNCTION_NOT_YET_EVALUATED";
	String REASONING_ENGINE_UNSUPPORTED_CONCLUSION_TYPE = "REASONING_ENGINE_UNSUPPORTED_CONCLUSION_TYPE";

	// literal variable evaluator
	String LITERAL_VARIABLE_EVALUATOR_THEORY_VARIABLE_UNRESOLVABLE = "LITERAL_VARIABLE_EVALUATOR_THEORY_VARIABLE_UNRESOLVABLE";
	String LITERAL_VARIABLE_EVALUATOR_CYCLIC_VARIABLE_DEPENDENCIES = "LITERAL_VARIABLE_EVALUATOR_CYCLIC_VARIABLE_DEPENDENCIES";
	String LITERAL_VARIABLE_EVALUATOR_IMPROPER_RESULT_TYPE = "LITERAL_VARIABLE_EVALUATOR_IMPROPER_RESULT_TYPE";

	// console
	String CONSOLE_ERROR_MESSAGE = "CONSOLE_ERROR_MESSAGE";
	String CONSOLE_NULL_SCANNER = "CONSOLE_NULL_SCANNER";
	String CONSOLE_NULL_COMMAND_NAME = "CONSOLE_NULL_COMMAND_NAME";
	String CONSOLE_UNRECOGNIZED_COMMAND = "CONSOLE_UNRECOGNIZED_COMMAND";
	String CONSOLE_NOTHING_TO_EXECUTE = "CONSOLE_NOTHING_TO_EXECUTE";
	String CONSOLE_EMPTY_CONVERT_MODE = "CONSOLE_EMPTY_CONVERT_MODE";
	String CONSOLE_EMPTY_CONFLICT_MODE = "CONSOLE_EMPTY_CONFLICT_MODE";
	String CONSOLE_COMMAND_NOT_YET_IMPLEMENTED = "CONSOLE_COMMAND_NOT_YET_IMPLEMENTED";
	String CONSOLE_COMMAND_OPTION_NOT_AVAILABLE = "CONSOLE_OPTION_NOT_AVAILABLE";
	String CONSOLE_COMMAND_NULL_OPTION_INFORMATION = "CONSOLE_COMMAND_NULL_OPTION_INFORMATION";

	// general
	String INCORRECT_NO_OF_ARGUMENTS = "INCORRECT_NO_OF_ARGUMENTS";
	String NOT_YET_IMPLEMENTED = "NOT_YET_IMPLEMENTED";
}
