package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class nnm extends eql {
    public static final yph a = yph.c("GH.RailWidgetLD");
    public nuh i;
    public mqc j;
    public boolean k;
    public final Handler h = new Handler();
    private final ajmd o = new ajmd(this);
    public Runnable l = new ily(15);
    public boolean m = false;
    public boolean n = false;

    public nnm(eqj eqjVar, eqj eqjVar2, eqj eqjVar3, eqj eqjVar4) {
        r(eqjVar, new mmt(this, 13));
        r(eqjVar2, new mmt(this, 14));
        r(eqjVar3, new mmt(this, 15));
        r(eqjVar4, new mmt(this, 16));
    }

    private static nnk u(nnk nnkVar, yzy yzyVar, nuo nuoVar, ComponentName componentName) {
        GhIcon ghIcon;
        if (nnkVar == null || (ghIcon = nnkVar.a) == null) {
            return null;
        }
        return lxr.y(new nwv(ghIcon, nnkVar.c, new xx(yzyVar, componentName, nuoVar, nnkVar, 16)));
    }

    private static nnk v(nul nulVar) {
        if (nulVar == null) {
            return null;
        }
        return lxr.y(new nwu(nulVar.a, null, nulVar.c, nulVar.e));
    }

    private static nwt w(nur nurVar, ComponentName componentName) {
        GhIcon ghIconJ = nurVar.d;
        if (ghIconJ == null || ghIconJ.b == 8) {
            ghIconJ = nurVar.b;
        }
        if (ghIconJ == null) {
            ghIconJ = GhIcon.j(componentName);
        }
        return new nwu(ghIconJ, nurVar.c);
    }

    public final void a(nuh nuhVar) {
        if (!Objects.equals(nuhVar, this.i)) {
            ((ype) a.l().ai(5291)).P("updateOngoing inAlertMode=%b entry=%s", this.k, nuhVar);
        }
        if (!this.k || this.m) {
            b(nuhVar);
            this.i = nuhVar;
            return;
        }
        nuh nuhVar2 = this.i;
        boolean z = false;
        if (nuhVar2 != null && nuhVar2.c.x == nuo.b) {
            z = true;
        }
        this.i = nuhVar;
        if (nuhVar != null && nuhVar.c.x == nuo.e) {
            this.l.run();
        } else if (nuhVar == null && z) {
            ((ype) a.l().ai((char) 5290)).u("Hiding previous media because new entry is null.");
            this.l.run();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.nuh r33) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnm.b(nuh):void");
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        nva.a().e(this.o);
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        nva.a().e(null);
        this.k = false;
        this.h.removeCallbacks(this.l);
    }
}
