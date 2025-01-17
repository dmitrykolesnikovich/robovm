/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.homekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMHome/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMHomePtr extends Ptr<HMHome, HMHomePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMHome.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMHome(Handle h, long handle) { super(h, handle); }
    protected HMHome(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HMHomeDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HMHomeDelegate v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "isPrimary")
    public native boolean isPrimary();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "homeHubState")
    public native HMHomeHubState getHomeHubState();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native NSUUID getUniqueIdentifier();
    @Property(selector = "accessories")
    public native NSArray<HMAccessory> getAccessories();
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Property(selector = "supportsAddingNetworkRouter")
    public native boolean supportsAddingNetworkRouter();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "currentUser")
    public native HMUser getCurrentUser();
    /**
     * @deprecated Deprecated in iOS 9.0. No longer supported.
     */
    @Deprecated
    @Property(selector = "users")
    public native NSArray<HMUser> getUsers();
    @Property(selector = "rooms")
    public native NSArray<HMRoom> getRooms();
    @Property(selector = "zones")
    public native NSArray<HMZone> getZones();
    @Property(selector = "serviceGroups")
    public native NSArray<HMServiceGroup> getServiceGroups();
    @Property(selector = "actionSets")
    public native NSArray<HMActionSet> getActionSets();
    @Property(selector = "triggers")
    public native NSArray<HMTrigger> getTriggers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Method(selector = "addAccessory:completionHandler:")
    public native void addAccessory(HMAccessory accessory, @Block VoidBlock1<NSError> completion);
    @Method(selector = "removeAccessory:completionHandler:")
    public native void removeAccessory(HMAccessory accessory, @Block VoidBlock1<NSError> completion);
    @Method(selector = "assignAccessory:toRoom:completionHandler:")
    public native void assignAccessoryToRoom(HMAccessory accessory, HMRoom room, @Block VoidBlock1<NSError> completion);
    @Method(selector = "servicesWithTypes:")
    public native NSArray<HMService> getServicesWithTypes(@org.robovm.rt.bro.annotation.Marshaler(HMServiceType.AsListMarshaler.class) List<HMServiceType> serviceTypes);
    @Method(selector = "unblockAccessory:completionHandler:")
    public native void unblockAccessory(HMAccessory accessory, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 15.4. Use -[HMAccessorySetupManager performAccessorySetupUsingRequest:completionHandler:] instead
     */
    @Deprecated
    @Method(selector = "addAndSetupAccessoriesWithCompletionHandler:")
    public native void addAndSetupAccessories(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 15.0. Use -[HMAccessorySetupManager performAccessorySetupUsingRequest:completionHandler:] instead
     */
    @Deprecated
    @Method(selector = "addAndSetupAccessoriesWithPayload:completionHandler:")
    public native void addAndSetupAccessories(HMAccessorySetupPayload payload, @Block VoidBlock2<NSArray<HMAccessory>, NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "manageUsersWithCompletionHandler:")
    public native void manageUsers(@Block VoidBlock1<NSError> completion);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -manageUsersWithCompletionHandler:
     */
    @Deprecated
    @Method(selector = "addUserWithCompletionHandler:")
    public native void addUser(@Block VoidBlock2<HMUser, NSError> completion);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -manageUsersWithCompletionHandler:
     */
    @Deprecated
    @Method(selector = "removeUser:completionHandler:")
    public native void removeUser(HMUser user, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "homeAccessControlForUser:")
    public native HMHomeAccessControl getHomeAccessControlForUser(HMUser user);
    @Method(selector = "addRoomWithName:completionHandler:")
    public native void addRoom(String roomName, @Block VoidBlock2<HMRoom, NSError> completion);
    @Method(selector = "removeRoom:completionHandler:")
    public native void removeRoom(HMRoom room, @Block VoidBlock1<NSError> completion);
    @Method(selector = "roomForEntireHome")
    public native HMRoom getRoomForEntireHome();
    @Method(selector = "addZoneWithName:completionHandler:")
    public native void addZone(String zoneName, @Block VoidBlock2<HMZone, NSError> completion);
    @Method(selector = "removeZone:completionHandler:")
    public native void removeZone(HMZone zone, @Block VoidBlock1<NSError> completion);
    @Method(selector = "addServiceGroupWithName:completionHandler:")
    public native void addServiceGroup(String serviceGroupName, @Block VoidBlock2<HMServiceGroup, NSError> completion);
    @Method(selector = "removeServiceGroup:completionHandler:")
    public native void removeServiceGroup(HMServiceGroup group, @Block VoidBlock1<NSError> completion);
    @Method(selector = "addActionSetWithName:completionHandler:")
    public native void addActionSet(String actionSetName, @Block VoidBlock2<HMActionSet, NSError> completion);
    @Method(selector = "removeActionSet:completionHandler:")
    public native void removeActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Method(selector = "executeActionSet:completionHandler:")
    public native void executeActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "builtinActionSetOfType:")
    public native HMActionSet getBuiltinActionSet(HMActionSetType actionSetType);
    @Method(selector = "addTrigger:completionHandler:")
    public native void addTrigger(HMTrigger trigger, @Block VoidBlock1<NSError> completion);
    @Method(selector = "removeTrigger:completionHandler:")
    public native void removeTrigger(HMTrigger trigger, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
