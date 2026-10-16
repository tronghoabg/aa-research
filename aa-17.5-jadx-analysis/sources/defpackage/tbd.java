package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class tbd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ClassLoader classLoader = PendingIntent.class.getClassLoader();
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(classLoader);
        PendingIntent pendingIntent2 = (PendingIntent) parcel.readParcelable(classLoader);
        PendingIntent pendingIntent3 = (PendingIntent) parcel.readParcelable(classLoader);
        RemoteInput remoteInput = (RemoteInput) parcel.readParcelable(RemoteInput.class.getClassLoader());
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i > 0) {
            String string = parcel.readString();
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Bundle bundle = parcel.readBundle();
            if (bundle == null) {
                throw new IllegalStateException("Required value was null.");
            }
            i--;
            IconCompat iconCompatH = IconCompat.h(bundle);
            if (iconCompatH != null) {
                linkedHashMap.put(string, iconCompatH);
            }
        }
        return new NotificationInfoParcelables(pendingIntent, pendingIntent2, pendingIntent3, remoteInput, (PendingIntent) parcel.readParcelable(classLoader), linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NotificationInfoParcelables[i];
    }
}
