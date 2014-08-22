/*
 * Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.resources.identitymanagement;

import java.util.Date;

import com.amazonaws.resources.ResultCapture;
import com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest
;
import com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult;
import com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest
;
import com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest;
import com.amazonaws.services.identitymanagement.model.GetLoginProfileResult;
import com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest
;

/**
 * The LoginProfile resource.
 */
public interface LoginProfile {
    /**
     * Returns true if this resource's attributes have been loaded. If this
     * method returns {@code false}, calls to attribute getter methods on this
     * instance will make an implicit call to {@code load()} to retrieve the
     * value.
     */
    boolean isLoaded();

    /**
     * Makes a call to the service to load this resource's attributes if they
     * are not loaded yet.
     *
     * @return Returns {@code true} if the resource is not yet loaded when this
     *         method is invoked, which indicates that a service call has been
     *         made to retrieve the attributes.
     * @see #load(GetLoginProfileRequest)
     */
    boolean load();

    /**
     * Makes a call to the service to load this resource's attributes if they
     * are not loaded yet.
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @return Returns {@code true} if the resource is not yet loaded when this
     *         method is invoked, which indicates that a service call has been
     *         made to retrieve the attributes.
     * @see GetLoginProfileRequest
     */
    boolean load(GetLoginProfileRequest request);

    /**
     * Makes a call to the service to load this resource's attributes if they
     * are not loaded yet, and use a ResultCapture to retrieve the low-level
     * client response
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @return Returns {@code true} if the resource is not yet loaded when this
     *         method is invoked, which indicates that a service call has been
     *         made to retrieve the attributes.
     * @see GetLoginProfileRequest
     */
    boolean load(GetLoginProfileRequest request,
            ResultCapture<GetLoginProfileResult> extractor);

    /**
     * Gets the value of the UserName identifier. This method always directly
     * returns the identifier and never involves a service call.
     */
    String getUserName();

    /**
     * Gets the value of the PasswordResetRequired attribute. If this resource
     * is not yet loaded, a call to {@code load()} is made to retrieve the value
     * of the attribute.
     */
    Boolean getPasswordResetRequired();

    /**
     * Gets the value of the CreateDate attribute. If this resource is not yet
     * loaded, a call to {@code load()} is made to retrieve the value of the
     * attribute.
     */
    Date getCreateDate();

    /**
     * Retrieves the <code>User</code> resource referenced by this resource.
     */
    User getUser();

    /**
     * Performs the <code>Update</code> action.
     *
     * <p>
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @see UpdateLoginProfileRequest
     */
    void update(UpdateLoginProfileRequest request);

    /**
     * Performs the <code>Update</code> action and use a ResultCapture to
     * retrieve the low-level client response.
     *
     * <p>
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @see UpdateLoginProfileRequest
     */
    void update(UpdateLoginProfileRequest request, ResultCapture<Void> extractor
            );

    /**
     * The convenient method form for the <code>Update</code> action.
     *
     * @see #update(UpdateLoginProfileRequest)
     */
    void update();

    /**
     * The convenient method form for the <code>Update</code> action.
     *
     * @see #update(UpdateLoginProfileRequest, ResultCapture)
     */
    void update(ResultCapture<Void> extractor);

    /**
     * Performs the <code>Create</code> action.
     *
     * <p>
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @return The response of the low-level client operation associated with
     *         this resource action.
     * @see CreateLoginProfileRequest
     */
    CreateLoginProfileResult create(CreateLoginProfileRequest request);

    /**
     * Performs the <code>Create</code> action and use a ResultCapture to
     * retrieve the low-level client response.
     *
     * <p>
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @return The response of the low-level client operation associated with
     *         this resource action.
     * @see CreateLoginProfileRequest
     */
    CreateLoginProfileResult create(CreateLoginProfileRequest request,
            ResultCapture<CreateLoginProfileResult> extractor);

    /**
     * The convenient method form for the <code>Create</code> action.
     *
     * @see #create(CreateLoginProfileRequest)
     */
    CreateLoginProfileResult create(String password);

    /**
     * The convenient method form for the <code>Create</code> action.
     *
     * @see #create(CreateLoginProfileRequest, ResultCapture)
     */
    CreateLoginProfileResult create(String password,
            ResultCapture<CreateLoginProfileResult> extractor);

    /**
     * Performs the <code>Delete</code> action.
     *
     * <p>
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @see DeleteLoginProfileRequest
     */
    void delete(DeleteLoginProfileRequest request);

    /**
     * Performs the <code>Delete</code> action and use a ResultCapture to
     * retrieve the low-level client response.
     *
     * <p>
     * The following request parameters will be populated from the data of this
     * <code>LoginProfile</code> resource, and any conflicting parameter value
     * set in the request will be overridden:
     * <ul>
     *   <li>
     *     <b><code>UserName</code></b>
     *         - mapped from the <code>UserName</code> identifier.
     *   </li>
     * </ul>
     *
     * <p>
     *
     * @see DeleteLoginProfileRequest
     */
    void delete(DeleteLoginProfileRequest request, ResultCapture<Void> extractor
            );

    /**
     * The convenient method form for the <code>Delete</code> action.
     *
     * @see #delete(DeleteLoginProfileRequest)
     */
    void delete();

    /**
     * The convenient method form for the <code>Delete</code> action.
     *
     * @see #delete(DeleteLoginProfileRequest, ResultCapture)
     */
    void delete(ResultCapture<Void> extractor);
}
