package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class hth extends cmw implements bxq {
    public final hsq a;
    public final eqa b;
    public final bwq c;
    public final bwq d;
    public final hdq e;
    private final bwq f;
    private final bwq g;
    private final bwq h;
    private final aitx i;
    private aivh j;

    public hth(hsq hsqVar, hdq hdqVar, aitx aitxVar, eqa eqaVar) {
        hsqVar.getClass();
        aitxVar.getClass();
        eqaVar.getClass();
        this.a = hsqVar;
        this.e = hdqVar;
        this.b = eqaVar;
        htx htxVar = htx.a;
        bxp bxpVar = bxp.c;
        this.c = new ParcelableSnapshotMutableState(htxVar, bxpVar);
        this.d = new ParcelableSnapshotMutableState(null, bxpVar);
        this.f = new ParcelableSnapshotMutableState(Float.valueOf(1.0f), bxpVar);
        this.g = new ParcelableSnapshotMutableState(null, bxpVar);
        this.h = new ParcelableSnapshotMutableState(null, bxpVar);
        aitx aitxVarD = ahni.d(aitxVar, new aiwh(affx.d(aitxVar.c())));
        aitu aituVar = aium.a;
        this.i = ahni.d(aitxVarD, ajct.a.i());
        ahnc.d(aitxVar, null, 0, new gfw(this, (afck) null, 14), 3);
    }

    @Override // defpackage.cmw
    public final long a() {
        cmw cmwVarG = g();
        if (cmwVarG != null) {
            return cmwVarG.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        cmw cmwVarG = g();
        if (cmwVarG != null) {
            cmwVarG.e(cmdVar, cmdVar.o(), ((Number) this.f.a()).floatValue(), (cjw) this.g.a());
        }
    }

    @Override // defpackage.cmw
    protected final boolean c(float f) {
        this.f.b(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.cmw
    protected final boolean d(cjw cjwVar) {
        this.g.b(cjwVar);
        return true;
    }

    @Override // defpackage.bxq
    public final void eW() {
        Object objG = g();
        bxq bxqVar = objG instanceof bxq ? (bxq) objG : null;
        if (bxqVar != null) {
            bxqVar.eW();
        }
    }

    @Override // defpackage.bxq
    public final void eX() {
        Object objG = g();
        bxq bxqVar = objG instanceof bxq ? (bxq) objG : null;
        if (bxqVar != null) {
            bxqVar.eX();
        }
        aivh aivhVar = this.j;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.j = null;
        this.d.b(null);
        i(null);
    }

    @Override // defpackage.bxq
    public final void eo() {
        Object obj;
        Object objG = g();
        bxq bxqVar = objG instanceof bxq ? (bxq) objG : null;
        if (bxqVar != null) {
            bxqVar.eo();
        }
        if (this.j == null) {
            this.j = ahnc.d(this.i, null, 0, new gfw(this, (afck) null, 15, (byte[]) null), 3);
        }
        if (this.b.getLifecycle().a().a(eps.d) || (obj = (Drawable) this.d.a()) == null || !(obj instanceof Animatable)) {
            return;
        }
        ((Animatable) obj).stop();
    }

    public final cmw g() {
        return (cmw) this.h.a();
    }

    public final htx h() {
        return (htx) this.c.a();
    }

    public final void i(cmw cmwVar) {
        this.h.b(cmwVar);
    }
}
