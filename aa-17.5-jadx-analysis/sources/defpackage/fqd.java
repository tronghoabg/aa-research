package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class fqd extends cmw implements bxq {
    public static final afec a = new ewc(13);
    public afec b;
    public afec c;
    public csi d;
    public int e;
    public boolean f;
    public final bwq g;
    public final bwq h;
    public final ajab i;
    private aitx j;
    private final bwq k;
    private final bwq l;
    private final bwq m;
    private fpz n;
    private cmw o;
    private final bwq p;

    public fqd(fsy fsyVar, ugn ugnVar) {
        fsyVar.getClass();
        this.i = ajac.a(new cjd(0L));
        bxp bxpVar = bxp.c;
        this.k = new ParcelableSnapshotMutableState(null, bxpVar);
        this.l = new ParcelableSnapshotMutableState(Float.valueOf(1.0f), bxpVar);
        this.m = new ParcelableSnapshotMutableState(null, bxpVar);
        fpv fpvVar = fpv.a;
        this.n = fpvVar;
        this.b = a;
        this.d = csh.b;
        this.e = 1;
        this.p = new ParcelableSnapshotMutableState(fpvVar, bxpVar);
        this.g = new ParcelableSnapshotMutableState(fsyVar, bxpVar);
        this.h = new ParcelableSnapshotMutableState(ugnVar, bxpVar);
    }

    private final cmw j() {
        return (cmw) this.k.a();
    }

    private final void k() {
        aitx aitxVar = this.j;
        if (aitxVar != null) {
            ahni.e(aitxVar, null);
        }
        this.j = null;
    }

    @Override // defpackage.cmw
    public final long a() {
        cmw cmwVarJ = j();
        if (cmwVarJ != null) {
            return cmwVarJ.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        this.i.d(new cjd(cmdVar.o()));
        cmw cmwVarJ = j();
        if (cmwVarJ != null) {
            cmwVarJ.e(cmdVar, cmdVar.o(), ((Number) this.l.a()).floatValue(), (cjw) this.m.a());
        }
    }

    @Override // defpackage.cmw
    protected final boolean c(float f) {
        this.l.b(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.cmw
    protected final boolean d(cjw cjwVar) {
        this.m.b(cjwVar);
        return true;
    }

    @Override // defpackage.bxq
    public final void eW() {
        k();
        Object obj = this.o;
        bxq bxqVar = obj instanceof bxq ? (bxq) obj : null;
        if (bxqVar != null) {
            bxqVar.eW();
        }
    }

    @Override // defpackage.bxq
    public final void eX() {
        k();
        Object obj = this.o;
        bxq bxqVar = obj instanceof bxq ? (bxq) obj : null;
        if (bxqVar != null) {
            bxqVar.eX();
        }
    }

    @Override // defpackage.bxq
    public final void eo() {
        if (this.j == null) {
            aiwh aiwhVar = new aiwh(null);
            aitu aituVar = aium.a;
            aitx aitxVarB = ahni.b(affa.v(aiwhVar, ajct.a.i()));
            this.j = aitxVarB;
            Object obj = this.o;
            bxq bxqVar = obj instanceof bxq ? (bxq) obj : null;
            if (bxqVar != null) {
                bxqVar.eo();
            }
            if (!this.f) {
                ahnc.d(aitxVarB, null, 0, new btm(this, (afck) null, 20), 3);
                return;
            }
            fsw fswVarA = fsy.a(g());
            fswVarA.d((fss) i().b);
            fswVarA.a();
            fss fssVar = ftu.a;
            h(new fpx(null));
        }
    }

    public final fsy g() {
        return (fsy) this.g.a();
    }

    public final void h(fpz fpzVar) {
        fpz fpzVar2 = this.n;
        fpz fpzVar3 = (fpz) this.b.invoke(fpzVar);
        this.n = fpzVar3;
        this.p.b(fpzVar3);
        if (fpzVar3 instanceof fpy) {
            ftg ftgVar = ((fpy) fpzVar3).b;
        } else if (fpzVar3 instanceof fpw) {
            fsu fsuVar = ((fpw) fpzVar3).a;
        }
        cmw cmwVarA = fpzVar3.a();
        this.o = cmwVarA;
        this.k.b(cmwVarA);
        if (this.j != null && fpzVar2.a() != fpzVar3.a()) {
            Object objA = fpzVar2.a();
            bxq bxqVar = objA instanceof bxq ? (bxq) objA : null;
            if (bxqVar != null) {
                bxqVar.eX();
            }
            Object objA2 = fpzVar3.a();
            bxq bxqVar2 = objA2 instanceof bxq ? (bxq) objA2 : null;
            if (bxqVar2 != null) {
                bxqVar2.eo();
            }
        }
        afec afecVar = this.c;
        if (afecVar != null) {
            afecVar.invoke(fpzVar3);
        }
    }

    public final ugn i() {
        return (ugn) this.h.a();
    }
}
