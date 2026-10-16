package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class lat {
    public static final yph a = yph.c("GH.AlphaJumpControllerB");
    public final las b;
    public List c;
    public long e;
    private final oht g;
    public final Map d = new HashMap();
    public lar f = new laq();

    public lat(las lasVar, oht ohtVar) {
        this.b = lasVar;
        this.g = ohtVar;
    }

    public final void a() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3705)).u("animateHideKeyboardShowList");
        if (!d()) {
            ((ype) yphVar.l().ai((char) 3706)).u("keyboard already shown or showing; returning");
        } else {
            c(yzy.bA, Long.valueOf(SystemClock.elapsedRealtime() - this.e));
            this.b.b();
        }
    }

    public final void b() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3707)).u("animateHideListShowKeyboard");
        if (d()) {
            ((ype) yphVar.l().ai((char) 3708)).u("keyboard already hidden or hiding; returning");
            return;
        }
        c(yzy.by, null);
        this.e = SystemClock.elapsedRealtime();
        this.b.c();
    }

    public final void c(yzy yzyVar, Long l) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DRAWER, yzyVar);
        if (l != null) {
            rrbVarH.u(l.longValue());
        }
        this.g.F(rrbVarH.l());
    }

    public final boolean d() {
        return this.b.a().getVisibility() == 0;
    }
}
