package androidx.fragment.app;

import android.os.Bundle;
import android.support.v4.app.ar;
import android.support.v4.app.ch;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends ar> ch add(ch chVar, String str, Bundle bundle) {
        x.f(chVar, "<this>");
        x.f(str, "tag");
        x.i();
        chVar.E(ar.class, bundle, str);
        x.e(chVar, "add(...)");
        return chVar;
    }

    public static /* synthetic */ ch add$default(ch chVar, int i2, String str, Bundle bundle, int i3, Object obj) {
        x.f(chVar, "<this>");
        x.i();
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        chVar.C(i2, ar.class, bundle, str);
        x.e(chVar, "add(...)");
        return chVar;
    }

    public static final /* synthetic */ <F extends ar> ch replace(ch chVar, int i2, String str, Bundle bundle) {
        x.f(chVar, "<this>");
        x.i();
        chVar.G(i2, ar.class, bundle, str);
        x.e(chVar, "replace(...)");
        return chVar;
    }

    public static /* synthetic */ ch replace$default(ch chVar, int i2, String str, Bundle bundle, int i3, Object obj) {
        x.f(chVar, "<this>");
        x.i();
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        chVar.G(i2, ar.class, bundle, str);
        x.e(chVar, "replace(...)");
        return chVar;
    }

    public static final /* synthetic */ <F extends ar> ch add(ch chVar, int i2, String str, Bundle bundle) {
        x.f(chVar, "<this>");
        x.i();
        chVar.C(i2, ar.class, bundle, str);
        x.e(chVar, "add(...)");
        return chVar;
    }

    public static /* synthetic */ ch add$default(ch chVar, String str, Bundle bundle, int i2, Object obj) {
        x.f(chVar, "<this>");
        x.f(str, "tag");
        x.i();
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        chVar.E(ar.class, bundle, str);
        x.e(chVar, "add(...)");
        return chVar;
    }
}
