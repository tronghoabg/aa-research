package defpackage;

import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public final class lfe {
    public static final yph a = yph.c("GH.WifiPreflight");
    public final mdk b;
    public final mdp c;
    private final List d;

    public lfe() {
        mdq mdqVar = (mdq) mki.a.i(mdq.class);
        this.d = yfq.r(mdqVar.a(), mdqVar.c());
        this.b = lgv.c();
        this.c = mdqVar.b();
    }

    public final mdp a() {
        ynp ynpVarListIterator = ((yfq) this.d).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            mdp mdpVar = (mdp) ynpVarListIterator.next();
            if (!mdpVar.d()) {
                return mdpVar;
            }
        }
        return null;
    }

    public final boolean b() {
        if (this.c.d()) {
            ((ype) a.l().ai((char) 3861)).u("Location Permission granted");
            return false;
        }
        ((ype) ((ype) a.h()).ai((char) 3860)).u("Location Permission Needed");
        return true;
    }

    public final boolean c() {
        if (a() == null) {
            return false;
        }
        Log.i("GH.WifiPreflight", "At least one setting change required");
        return true;
    }

    public final boolean d() {
        return b() || c();
    }
}
