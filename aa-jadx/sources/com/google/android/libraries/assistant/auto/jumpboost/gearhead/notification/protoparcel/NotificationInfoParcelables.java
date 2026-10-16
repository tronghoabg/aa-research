package com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 -2\u00020\u0001Ê\u0001\f\b/\u0012\b\b0\u0012\u0004\b\u0003\u00104¨\u0006."}, d2 = {"Lcom/google/android/libraries/assistant/auto/jumpboost/gearhead/notification/protoparcel/NotificationInfoParcelables;", "Landroid/os/Parcelable;", "markAsReadPendingIntent", "Landroid/app/PendingIntent;", "mutePendingIntent", "replyPendingIntent", "replyRemoteInput", "Landroid/app/RemoteInput;", "markAsReadPendingIntentInSbn", "iconMap", "", "", "Landroidx/core/graphics/drawable/IconCompat;", "<init>", "(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/RemoteInput;Landroid/app/PendingIntent;Ljava/util/Map;)V", "getMarkAsReadPendingIntent", "()Landroid/app/PendingIntent;", "getMutePendingIntent", "getReplyPendingIntent", "getReplyRemoteInput", "()Landroid/app/RemoteInput;", "getMarkAsReadPendingIntentInSbn", "getIconCount", "", "getIcon", "key", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel_notification_info", "Landroid/annotation/TargetApi;", "value"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NotificationInfoParcelables implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables> CREATOR = new defpackage.tcb();
    private final android.app.PendingIntent a;
    private final android.app.PendingIntent b;
    private final android.app.PendingIntent c;
    private final android.app.RemoteInput d;
    private final android.app.PendingIntent e;
    private final java.util.Map f;

    public NotificationInfoParcelables(android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, android.app.PendingIntent pendingIntent3, android.app.RemoteInput remoteInput, android.app.PendingIntent pendingIntent4, java.util.Map map) {
        this.a = pendingIntent;
        this.b = pendingIntent2;
        this.c = pendingIntent3;
        this.d = remoteInput;
        this.e = pendingIntent4;
        this.f = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables)) {
            return false;
        }
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables notificationInfoParcelables = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables) obj;
        return defpackage.afga.f(this.a, notificationInfoParcelables.a) && defpackage.afga.f(this.b, notificationInfoParcelables.b) && defpackage.afga.f(this.c, notificationInfoParcelables.c) && defpackage.afga.f(this.d, notificationInfoParcelables.d) && defpackage.afga.f(this.e, notificationInfoParcelables.e) && defpackage.afga.f(this.f, notificationInfoParcelables.f);
    }

    public final int hashCode() {
        android.app.PendingIntent pendingIntent = this.a;
        int iHashCode = pendingIntent == null ? 0 : pendingIntent.hashCode();
        android.app.PendingIntent pendingIntent2 = this.b;
        int iHashCode2 = pendingIntent2 == null ? 0 : pendingIntent2.hashCode();
        int i = iHashCode * 31;
        android.app.PendingIntent pendingIntent3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 31;
        android.app.RemoteInput remoteInput = this.d;
        int iHashCode4 = (iHashCode3 + (remoteInput == null ? 0 : remoteInput.hashCode())) * 31;
        android.app.PendingIntent pendingIntent4 = this.e;
        return ((iHashCode4 + (pendingIntent4 != null ? pendingIntent4.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "NotificationInfoParcelables(markAsReadPendingIntent=" + this.a + ", mutePendingIntent=" + this.b + ", replyPendingIntent=" + this.c + ", replyRemoteInput=" + this.d + ", markAsReadPendingIntentInSbn=" + this.e + ", iconMap=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        java.util.Map map = this.f;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            androidx.core.graphics.drawable.IconCompat iconCompat = (androidx.core.graphics.drawable.IconCompat) entry.getValue();
            parcel.writeString(str);
            parcel.writeBundle(iconCompat.g());
        }
        parcel.writeParcelable(this.e, i);
    }
}
