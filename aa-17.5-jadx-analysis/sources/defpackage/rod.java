package defpackage;

import android.net.Uri;
import com.google.android.gms.car.CarInfo;
import java.util.Random;

/* loaded from: classes.dex */
public final class rod {
    public final Object a;

    public rod(aezk aezkVar) {
        this.a = aezkVar;
    }

    public final String a(Uri uri, String str, String str2) {
        aat aatVar;
        if (uri != null) {
            aatVar = (aat) ((aat) this.a).get(uri.toString());
        } else {
            aatVar = null;
        }
        if (aatVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(String.valueOf(str2));
        }
        return (String) aatVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aezk, java.lang.Object] */
    public final vya b(float f) {
        Random random = (Random) this.a.a();
        random.getClass();
        return new vya(random, f);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rce] */
    public final erb c() throws qrz {
        CarInfo carInfoC = this.a.c();
        carInfoC.getClass();
        return new erb(carInfoC);
    }

    public rod(Object obj) {
        this.a = obj;
    }
}
