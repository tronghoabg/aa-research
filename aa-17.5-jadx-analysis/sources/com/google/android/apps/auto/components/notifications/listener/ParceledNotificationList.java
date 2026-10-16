package com.google.android.apps.auto.components.notifications.listener;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import defpackage.mh;

/* loaded from: classes.dex */
public class ParceledNotificationList extends AbstractParceledList<StatusBarNotification> {
    public static final Parcelable.ClassLoaderCreator<ParceledNotificationList> CREATOR = new mh(7);

    public ParceledNotificationList(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
    }

    @Override // com.google.android.apps.auto.components.notifications.listener.AbstractParceledList
    protected final Parcelable.Creator a() {
        return StatusBarNotification.CREATOR;
    }
}
