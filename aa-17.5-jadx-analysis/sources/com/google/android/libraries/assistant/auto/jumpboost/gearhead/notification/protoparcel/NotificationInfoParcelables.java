package com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.affa;
import defpackage.tbd;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001¨\u0006."}, d2 = {"Lcom/google/android/libraries/assistant/auto/jumpboost/gearhead/notification/protoparcel/NotificationInfoParcelables;", "Landroid/os/Parcelable;", "markAsReadPendingIntent", "Landroid/app/PendingIntent;", "mutePendingIntent", "replyPendingIntent", "replyRemoteInput", "Landroid/app/RemoteInput;", "markAsReadPendingIntentInSbn", "iconMap", "", "", "Landroidx/core/graphics/drawable/IconCompat;", "<init>", "(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/RemoteInput;Landroid/app/PendingIntent;Ljava/util/Map;)V", "getMarkAsReadPendingIntent", "()Landroid/app/PendingIntent;", "getMutePendingIntent", "getReplyPendingIntent", "getReplyRemoteInput", "()Landroid/app/RemoteInput;", "getMarkAsReadPendingIntentInSbn", "getIconCount", "", "getIcon", "key", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel_notification_info"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationInfoParcelables implements Parcelable {
    public static final Parcelable.Creator<NotificationInfoParcelables> CREATOR = new tbd();
    private final PendingIntent a;
    private final PendingIntent b;
    private final PendingIntent c;
    private final RemoteInput d;
    private final PendingIntent e;
    private final Map f;

    public NotificationInfoParcelables(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, RemoteInput remoteInput, PendingIntent pendingIntent4, Map map) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationInfoParcelables)) {
            return false;
        }
        NotificationInfoParcelables notificationInfoParcelables = (NotificationInfoParcelables) obj;
        return affa.f(this.a, notificationInfoParcelables.a) && affa.f(this.b, notificationInfoParcelables.b) && affa.f(this.c, notificationInfoParcelables.c) && affa.f(this.d, notificationInfoParcelables.d) && affa.f(this.e, notificationInfoParcelables.e) && affa.f(this.f, notificationInfoParcelables.f);
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.a;
        int iHashCode = pendingIntent == null ? 0 : pendingIntent.hashCode();
        PendingIntent pendingIntent2 = this.b;
        int iHashCode2 = pendingIntent2 == null ? 0 : pendingIntent2.hashCode();
        int i = iHashCode * 31;
        PendingIntent pendingIntent3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 31;
        RemoteInput remoteInput = this.d;
        int iHashCode4 = (iHashCode3 + (remoteInput == null ? 0 : remoteInput.hashCode())) * 31;
        PendingIntent pendingIntent4 = this.e;
        return ((iHashCode4 + (pendingIntent4 != null ? pendingIntent4.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "NotificationInfoParcelables(markAsReadPendingIntent=" + this.a + ", mutePendingIntent=" + this.b + ", replyPendingIntent=" + this.c + ", replyRemoteInput=" + this.d + ", markAsReadPendingIntentInSbn=" + this.e + ", iconMap=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        Map map = this.f;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            IconCompat iconCompat = (IconCompat) entry.getValue();
            parcel.writeString(str);
            parcel.writeBundle(iconCompat.g());
        }
        parcel.writeParcelable(this.e, i);
    }
}
