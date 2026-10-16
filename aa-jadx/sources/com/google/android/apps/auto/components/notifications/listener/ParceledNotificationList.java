package com.google.android.apps.auto.components.notifications.listener;

/* JADX INFO: loaded from: classes2.dex */
public class ParceledNotificationList extends com.google.android.apps.auto.components.notifications.listener.AbstractParceledList<android.service.notification.StatusBarNotification> {
    public static final android.os.Parcelable.ClassLoaderCreator<com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList> CREATOR = new defpackage.mk(8);

    public ParceledNotificationList(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
    }

    @Override // com.google.android.apps.auto.components.notifications.listener.AbstractParceledList
    protected final android.os.Parcelable.Creator a() {
        return android.service.notification.StatusBarNotification.CREATOR;
    }
}
