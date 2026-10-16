package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class btp extends cfx implements cwc, cwk, cws {
    private tt B;
    public final ase a;
    public final boolean b;
    public final afdr c;
    public float d;
    public boolean f;
    public asd i;
    private final float l;
    private final cjy m;
    private bti o;
    private btj p;
    public long e = 0;
    public final aag k = new aag(16);
    public final adu g = adv.a(BitmapDescriptorFactory.HUE_RED);
    public final List h = new ArrayList();
    public final adu j = adv.a(BitmapDescriptorFactory.HUE_RED);
    private final bwq n = new ParcelableSnapshotMutableState(false, bxp.c);

    public btp(ase aseVar, boolean z, float f, cjy cjyVar, afdr afdrVar) {
        this.a = aseVar;
        this.b = z;
        this.l = f;
        this.m = cjyVar;
        this.c = afdrVar;
    }

    private final void l(btj btjVar) {
        this.p = btjVar;
        cjn.w(this);
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) throws Throwable {
        long j;
        cxdVar.q();
        cju cjuVarB = cxdVar.r().b();
        btj btjVar = this.p;
        if (btjVar != null) {
            ty tyVar = ((btx) this.c.invoke()).c;
            btjVar.b(this.e, afgi.k(this.d), d(), tyVar instanceof btw ? ((btw) tyVar).b : 0.0f);
            Canvas canvas = cjf.a;
            cjuVarB.getClass();
            btjVar.draw(((cje) cjuVarB).a);
        }
        float fFloatValue = ((Number) this.g.d()).floatValue();
        if (fFloatValue > BitmapDescriptorFactory.HUE_RED) {
            long jA = this.m.a();
            float fD = cjv.d(jA);
            float fC = cjv.c(jA);
            float fB = cjv.b(jA);
            float[] fArr = clj.a;
            long j2 = cjn.j(fD, fC, fB, fFloatValue, clj.y[(int) (jA & 63)]);
            if (this.b) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L));
                cma cmaVarR = cxdVar.r();
                long jA2 = cmaVarR.a();
                cmaVarR.b().g();
                try {
                    cmaVarR.c.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    j = jA2;
                    try {
                        czz.aH(cxdVar, j2, this.d, 0L, null, 124);
                        cmaVarR.b().e();
                        cmaVarR.h(j);
                    } catch (Throwable th) {
                        th = th;
                        cmaVarR.b().e();
                        cmaVarR.h(j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jA2;
                }
            } else {
                czz.aH(cxdVar, j2, this.d, 0L, null, 124);
            }
        }
        if (((Number) this.j.d()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
            tt ttVar = this.B;
            if (ttVar == null) {
                ttVar = new tt(null);
            }
            this.B = ttVar;
            tv tvVar = ((btx) this.c.invoke()).d;
            if ((tvVar instanceof btr ? (btr) tvVar : null) == null) {
                return;
            }
            cxdVar.o();
            throw null;
        }
    }

    public final long d() {
        return this.m.a();
    }

    @Override // defpackage.cfx
    public final void er() {
        ahnc.d(N(), null, 0, new bto(this, (afck) null, 0), 3);
    }

    @Override // defpackage.cxs
    public final void et(long j) {
        float fEA;
        this.f = true;
        dlg dlgVar = bzi.q(this).r;
        this.e = dln.k(j);
        float f = this.l;
        if (Float.isNaN(f)) {
            boolean z = this.b;
            long j2 = this.e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            fEA = cja.a((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)) / 2.0f;
            if (z) {
                fEA += dlgVar.eA(10.0f);
            }
        } else {
            fEA = dlgVar.eA(f);
        }
        this.d = fEA;
        aag aagVar = this.k;
        Object[] objArr = aagVar.a;
        int i = aagVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            h((ask) objArr[i2]);
        }
        aagVar.k();
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    public final void h(ask askVar) {
        if (!(askVar instanceof asi)) {
            if (askVar instanceof asj) {
                asi asiVar = ((asj) askVar).a;
                k();
                return;
            } else {
                if (askVar instanceof ash) {
                    asi asiVar2 = ((ash) askVar).a;
                    k();
                    return;
                }
                return;
            }
        }
        asi asiVar3 = (asi) askVar;
        long j = this.e;
        float f = this.d;
        bti btiVar = this.o;
        if (btiVar == null) {
            Object obj = (View) bzi.x(this, daa.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(a.bm(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    bti btiVar2 = new bti(viewGroup.getContext());
                    viewGroup.addView(btiVar2);
                    btiVar = btiVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof bti) {
                        btiVar = (bti) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.o = btiVar;
            btiVar.getClass();
        }
        sx sxVar = btiVar.e;
        btj btjVarC = sxVar.c(this);
        if (btjVarC == null) {
            List list = btiVar.c;
            list.getClass();
            btjVarC = (btj) (list.isEmpty() ? null : list.remove(0));
            if (btjVarC == null) {
                int i2 = btiVar.d;
                List list2 = btiVar.b;
                if (i2 > woy.bh(list2)) {
                    btjVarC = new btj(btiVar.getContext());
                    btiVar.addView(btjVarC);
                    list2.add(btjVarC);
                } else {
                    btjVarC = (btj) list2.get(btiVar.d);
                    btp btpVar = (btp) sxVar.a.get(btjVarC);
                    if (btpVar != null) {
                        btpVar.l(null);
                        sxVar.d(btpVar);
                        btjVarC.a();
                    }
                }
                int i3 = btiVar.d;
                if (i3 < btiVar.a - 1) {
                    btiVar.d = i3 + 1;
                } else {
                    btiVar.d = 0;
                }
            }
            sxVar.b.put(this, btjVarC);
            sxVar.a.put(btjVarC, this);
        }
        ty tyVar = ((btx) this.c.invoke()).c;
        float f2 = tyVar instanceof btw ? ((btw) tyVar).b : BitmapDescriptorFactory.HUE_RED;
        boolean z = this.b;
        int iK = afgi.k(f);
        long jD = d();
        ahp ahpVar = new ahp(this, 13);
        if (btjVarC.b == null || !affa.f(Boolean.valueOf(z), btjVarC.c)) {
            bty btyVar = new bty(z);
            btjVarC.setBackground(btyVar);
            btjVarC.b = btyVar;
            btjVarC.c = Boolean.valueOf(z);
        }
        bty btyVar2 = btjVarC.b;
        btyVar2.getClass();
        btjVarC.e = ahpVar;
        btj btjVar = btjVarC;
        btjVar.b(j, iK, jD, f2);
        if (z) {
            long j2 = asiVar3.a;
            btyVar2.setHotspot(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            btyVar2.setHotspot(btyVar2.getBounds().centerX(), btyVar2.getBounds().centerY());
        }
        btjVar.c(true);
        l(btjVar);
    }

    public final void i(boolean z) {
        this.n.b(Boolean.valueOf(z));
    }

    public final boolean j() {
        return ((Boolean) this.n.a()).booleanValue();
    }

    public final void k() {
        btj btjVar = this.p;
        if (btjVar != null) {
            btjVar.c(false);
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        bti btiVar = this.o;
        if (btiVar != null) {
            l(null);
            sx sxVar = btiVar.e;
            btj btjVarC = sxVar.c(this);
            if (btjVarC != null) {
                btjVarC.a();
                sxVar.d(this);
                btiVar.c.add(btjVarC);
            }
        }
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cws
    public final /* synthetic */ void f(cst cstVar) {
    }
}
