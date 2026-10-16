package defpackage;

import android.content.Context;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes.dex */
public final class rob {
    public final Object a;

    public rob(Context context) {
        this.a = wub.L(new vks(context, 4));
    }

    public final boolean a() {
        return ((CarInfoInternal) this.a).o;
    }

    public final lds b() throws qrz {
        return new lds(((rdx) this.a).a(), (byte[]) null);
    }

    public rob(Object obj) {
        this.a = obj;
    }

    public rob(aezk aezkVar) {
        this.a = aezkVar;
    }
}
