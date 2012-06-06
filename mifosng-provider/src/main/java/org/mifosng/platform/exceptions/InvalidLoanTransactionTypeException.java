package org.mifosng.platform.exceptions;

/**
 * {@link AbstractPlatformDomainRuleException} thrown an action to transition a loan from one state to another violates a domain rule.
 */
public class InvalidLoanTransactionTypeException extends AbstractPlatformDomainRuleException {

	public InvalidLoanTransactionTypeException(final String action, String postFix, String defaultUserMessage, Object... defaultUserMessageArgs) {
		super("error.msg.loan." + action + "." + postFix, defaultUserMessage, defaultUserMessageArgs);
	}
}