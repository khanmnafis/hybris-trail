/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30-Jan-2018 15:27:59                        ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.checkboxconfiguratortemplateservices.jalo;

import de.hybris.platform.checkboxconfiguratortemplateservices.constants.CheckboxconfiguratortemplateservicesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.order.jalo.AbstractOrderEntryProductInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.checkboxconfiguratortemplateservices.jalo.CheckboxConfiguratorOrderedProductInfo CheckboxConfiguredProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCheckboxConfiguratorOrderedProductInfo extends AbstractOrderEntryProductInfo
{
	/** Qualifier of the <code>CheckboxConfiguredProductInfo.configurationLabel</code> attribute **/
	public static final String CONFIGURATIONLABEL = "configurationLabel";
	/** Qualifier of the <code>CheckboxConfiguredProductInfo.checked</code> attribute **/
	public static final String CHECKED = "checked";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrderEntryProductInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONFIGURATIONLABEL, AttributeMode.INITIAL);
		tmp.put(CHECKED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute.
	 * @return the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public Boolean isChecked(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHECKED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute.
	 * @return the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public Boolean isChecked()
	{
		return isChecked( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute. 
	 * @return the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public boolean isCheckedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChecked( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute. 
	 * @return the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public boolean isCheckedAsPrimitive()
	{
		return isCheckedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute. 
	 * @param value the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public void setChecked(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHECKED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute. 
	 * @param value the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public void setChecked(final Boolean value)
	{
		setChecked( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute. 
	 * @param value the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public void setChecked(final SessionContext ctx, final boolean value)
	{
		setChecked( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckboxConfiguredProductInfo.checked</code> attribute. 
	 * @param value the checked - Indicates the configured value of the checkbox that will be saved along with the order entry
	 */
	public void setChecked(final boolean value)
	{
		setChecked( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckboxConfiguredProductInfo.configurationLabel</code> attribute.
	 * @return the configurationLabel - Label
	 */
	public String getConfigurationLabel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONFIGURATIONLABEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckboxConfiguredProductInfo.configurationLabel</code> attribute.
	 * @return the configurationLabel - Label
	 */
	public String getConfigurationLabel()
	{
		return getConfigurationLabel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckboxConfiguredProductInfo.configurationLabel</code> attribute. 
	 * @param value the configurationLabel - Label
	 */
	public void setConfigurationLabel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONFIGURATIONLABEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckboxConfiguredProductInfo.configurationLabel</code> attribute. 
	 * @param value the configurationLabel - Label
	 */
	public void setConfigurationLabel(final String value)
	{
		setConfigurationLabel( getSession().getSessionContext(), value );
	}
	
}
