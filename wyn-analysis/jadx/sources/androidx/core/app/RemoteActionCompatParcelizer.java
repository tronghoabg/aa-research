package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import v3.AbstractC4298a;
import v3.b;
import v3.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC4298a abstractC4298a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarH = remoteActionCompat.f18061a;
        boolean z2 = true;
        if (abstractC4298a.e(1)) {
            cVarH = abstractC4298a.h();
        }
        remoteActionCompat.f18061a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f18062b;
        if (abstractC4298a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC4298a).f46803e);
        }
        remoteActionCompat.f18062b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f18063c;
        if (abstractC4298a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC4298a).f46803e);
        }
        remoteActionCompat.f18063c = charSequence2;
        remoteActionCompat.f18064d = (PendingIntent) abstractC4298a.g(remoteActionCompat.f18064d, 4);
        boolean z10 = remoteActionCompat.f18065e;
        if (abstractC4298a.e(5)) {
            z10 = ((b) abstractC4298a).f46803e.readInt() != 0;
        }
        remoteActionCompat.f18065e = z10;
        boolean z11 = remoteActionCompat.f18066f;
        if (!abstractC4298a.e(6)) {
            z2 = z11;
        } else if (((b) abstractC4298a).f46803e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f18066f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC4298a abstractC4298a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC4298a.getClass();
        IconCompat iconCompat = remoteActionCompat.f18061a;
        abstractC4298a.i(1);
        abstractC4298a.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f18062b;
        abstractC4298a.i(2);
        Parcel parcel = ((b) abstractC4298a).f46803e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f18063c;
        abstractC4298a.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC4298a.k(remoteActionCompat.f18064d, 4);
        boolean z2 = remoteActionCompat.f18065e;
        abstractC4298a.i(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = remoteActionCompat.f18066f;
        abstractC4298a.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
