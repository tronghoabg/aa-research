package defpackage;

import android.os.Parcelable;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables;

/* loaded from: classes3.dex */
public final class szl {
    public static final ziz a;
    public static final ziz b;

    static {
        Parcelable.Creator<MessagingInfo> creator = MessagingInfo.CREATOR;
        creator.getClass();
        a = zkt.v("MessagingInfo", creator);
        b = zkt.v("NotificationInfo", NotificationInfoParcelables.CREATOR);
    }
}
