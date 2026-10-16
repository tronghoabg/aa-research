package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yib {
    public int a;
    public Object b;
    public Object c;

    public yib(Notification notification) {
        String[] strArr;
        this.a = 0;
        dtc dtcVar = null;
        Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            this.b = (Bitmap) bundle.getParcelable("large_icon");
            this.a = bundle.getInt("app_color", 0);
            Bundle bundle2 = bundle.getBundle("car_conversation");
            if (bundle2 != null) {
                Parcelable[] parcelableArray = bundle2.getParcelableArray("messages");
                if (parcelableArray != null) {
                    int length = parcelableArray.length;
                    String[] strArr2 = new String[length];
                    for (int i = 0; i < length; i++) {
                        Parcelable parcelable = parcelableArray[i];
                        if (!(parcelable instanceof Bundle)) {
                            break;
                        }
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string == null) {
                            break;
                        }
                    }
                    strArr = strArr2;
                } else {
                    strArr = null;
                }
                PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable("on_read");
                PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable("on_reply");
                RemoteInput remoteInput = (RemoteInput) bundle2.getParcelable("remote_input");
                String[] stringArray = bundle2.getStringArray("participants");
                if (stringArray != null && stringArray.length == 1) {
                    dtcVar = new dtc(strArr, remoteInput != null ? new dum(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? dtb.a(remoteInput) : 0, remoteInput.getExtras(), null) : null, pendingIntent2, pendingIntent, stringArray, bundle2.getLong("timestamp"));
                }
            }
            this.c = dtcVar;
        }
    }

    public yib(yic yicVar) {
        this.b = yicVar;
        this.c = yicVar;
        yicVar.d = null;
        yicVar.c = null;
        this.a = 1;
    }
}
