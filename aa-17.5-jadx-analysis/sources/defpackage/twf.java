package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class twf extends tvl implements tyv {
    private tza A;
    private final Set B;
    private final abde C;
    private final Set D;
    private final umi E;
    private final tpr F;
    private final Runnable G;
    private final Runnable H;
    private final txj I;
    public final umb d;
    public final umf e;
    public final ush f;
    public final float g;
    public boolean h;
    public final Object i;
    public boolean j;
    public final boolean k;
    public final boolean l;
    public final utf m;
    public final twe n;
    public float o;
    public float p;
    public float q;
    public int r;
    public float s;
    public boolean t;
    final yfq u;
    public final Runnable v;
    public final uvg w;
    public final usy x;
    public final gjv y;
    private static final yob z = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/ClientLinesImpl");
    public static int c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public twf(defpackage.txj r18, defpackage.ush r19, defpackage.uvg r20, defpackage.gjv r21, defpackage.usy r22, float r23, defpackage.abde r24, defpackage.tpr r25, defpackage.tza r26, defpackage.tof r27) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twf.<init>(txj, ush, uvg, gjv, usy, float, abde, tpr, tza, tof):void");
    }

    public static float b(float f) {
        return (float) (Math.floor(f / 0.25d) * 0.25d);
    }

    private final synchronized void z(tza tzaVar) {
        vaq.d();
        this.a = false;
        Set set = this.B;
        set.clear();
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            set.add(tzaVar.b(((Long) it.next()).longValue()));
        }
        if (set.isEmpty()) {
            m();
            return;
        }
        ajju ajjuVar = new ajju(set.size(), new tvv(this, 6));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((tqo) it2.next()).c(new tvv(ajjuVar, 7));
        }
    }

    @Override // defpackage.tpw
    public final int a() {
        umf umfVar = this.e;
        if (umfVar == null) {
            return -1;
        }
        return umfVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void c(List list) {
        int i = 0;
        while (true) {
            yfq yfqVar = this.u;
            if (i >= ((yls) yfqVar).c) {
                return;
            }
            list.add(((tyg) yfqVar.get(i)).e);
            i++;
        }
    }

    public final void d(boolean z2) {
        synchronized (this.i) {
            this.j = z2;
        }
        l(this.H);
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void e() {
        super.e();
        vaq.d();
        umb umbVar = this.d;
        if (umbVar != null) {
            umbVar.x = umi.a;
        }
    }

    @Override // defpackage.tpz
    public final void f() {
        Set set = this.I.e;
        synchronized (set) {
            set.remove(this);
        }
        v();
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void g(tqq tqqVar) {
        super.g(tqqVar);
        vaq.d();
        umb umbVar = this.d;
        if (umbVar == null) {
            ((ynz) ((ynz) z.h()).ai(9161)).u("Attempting to set pick handler on ClientLines with a null pick entity.");
            return;
        }
        umi umiVar = this.E;
        if (umiVar == null) {
            ((ynz) ((ynz) z.h()).ai(9160)).u("Attempting to set pick handler on ClientLines with a null pick state.");
        } else {
            umbVar.x = umiVar;
        }
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void h() {
        super.h();
        vaq.d();
        umb umbVar = this.d;
        if (umbVar == null) {
            ((ynz) ((ynz) z.h()).ai(9163)).u("Attempting to set pick handler on ClientLines with a null pick entity.");
            return;
        }
        umi umiVar = this.E;
        if (umiVar == null) {
            ((ynz) ((ynz) z.h()).ai(9162)).u("Attempting to set pick handler on ClientLines with a null pick state.");
        } else {
            umbVar.x = umiVar;
        }
    }

    @Override // defpackage.tpz
    public final void i() {
        Set set = this.I.e;
        synchronized (set) {
            set.add(this);
        }
        x();
    }

    @Override // defpackage.tqs
    public final /* synthetic */ abow j() {
        return this.C;
    }

    @Override // defpackage.tvl
    public final void o(tqd tqdVar) {
        p(tqdVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        float fE;
        usm usmVar;
        usm usmVar2;
        boolean z2;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        usm usmVar3;
        usm usmVar4;
        usm usmVar5;
        float f5;
        boolean z3;
        float f6;
        float f7;
        boolean z4;
        float fA;
        uvr uvrVar = uvr.a;
        vaq.d();
        urw urwVar = new urw();
        usm usmVarE = urwVar.e("client_line", 385);
        int i2 = 0;
        usm usmVarF = urw.f("client_line", 17, false, 0, null);
        if (this.l) {
            usy usyVar = new usy(this.x);
            fE = tsw.e(usyVar.o().l, usyVar.j(), usyVar.c(), usyVar.b());
        } else {
            fE = 1.0f;
        }
        float f8 = fE;
        ynp ynpVarListIterator = this.u.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            tyg tygVar = (tyg) ynpVarListIterator.next();
            int i3 = this.r;
            tygVar.l.getClass();
            boolean zE = tygVar.e();
            if (zE) {
                uke ukeVarF = tygVar.l.f(tyg.a(tygVar.l, i3), i2);
                f3 = ukeVarF.d;
                f4 = ukeVarF.l;
                f2 = ukeVarF.m;
                float f9 = f3 + f4;
                float f10 = BitmapDescriptorFactory.HUE_RED;
                for (uho uhoVar : tygVar.c) {
                    int i4 = i2;
                    float f11 = uhoVar.f;
                    if (f11 > BitmapDescriptorFactory.HUE_RED) {
                        usmVar4 = usmVarF;
                        usmVar5 = usmVarE;
                        f5 = f2;
                        z3 = zE;
                    } else {
                        for (uhp uhpVar : uhoVar.b) {
                            usm usmVar6 = usmVarF;
                            usm usmVar7 = usmVarE;
                            float f12 = uhoVar.f;
                            float f13 = uhpVar.h;
                            if (f13 <= BitmapDescriptorFactory.HUE_RED) {
                                f6 = f13;
                                int[] iArr = uhpVar.b;
                                f7 = f2;
                                int length = iArr.length;
                                if (length != 0) {
                                    float[] fArr = new float[length];
                                    z4 = zE;
                                    for (int i5 = i4; i5 < iArr.length; i5++) {
                                        fArr[i5] = iArr[i5];
                                    }
                                    fA = uhp.a(fArr);
                                    uhpVar.h = fA;
                                } else {
                                    z4 = zE;
                                    float[] fArr2 = uhpVar.c;
                                    if (fArr2.length != 0) {
                                        fA = uhp.a(fArr2);
                                        uhpVar.h = fA;
                                    }
                                }
                                uhoVar.f = f12 + fA;
                                usmVarE = usmVar7;
                                usmVarF = usmVar6;
                                f2 = f7;
                                zE = z4;
                            } else {
                                f6 = f13;
                                f7 = f2;
                                z4 = zE;
                            }
                            fA = f6;
                            uhoVar.f = f12 + fA;
                            usmVarE = usmVar7;
                            usmVarF = usmVar6;
                            f2 = f7;
                            zE = z4;
                        }
                        usmVar4 = usmVarF;
                        usmVar5 = usmVarE;
                        f5 = f2;
                        z3 = zE;
                        f11 = uhoVar.f;
                    }
                    f10 += f11;
                    i2 = i4;
                    usmVarE = usmVar5;
                    usmVarF = usmVar4;
                    f2 = f5;
                    zE = z3;
                }
                usmVar = usmVarF;
                usmVar2 = usmVarE;
                z2 = zE;
                i = i2;
                f = BitmapDescriptorFactory.HUE_RED;
                tygVar.i = urw.b(f10, f8, f9);
                usmVar3 = usmVar;
            } else {
                usmVar = usmVarF;
                usmVar2 = usmVarE;
                z2 = zE;
                i = i2;
                f = BitmapDescriptorFactory.HUE_RED;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
                usmVar3 = usmVar2;
            }
            usmVar3.g();
            float f14 = f2;
            tyf tyfVar = tygVar.a;
            float fA2 = tyfVar.a();
            if (fA2 != f) {
                usmVar3.h = 32767.0f / fA2;
            } else {
                usmVar3.h = 32767.0f;
            }
            usmVar3.m(tygVar.i);
            List list = tygVar.c;
            float f15 = f3;
            float[] fArr3 = new float[1];
            fArr3[i] = f15;
            float f16 = f4;
            float[] fArr4 = new float[1];
            fArr4[i] = f16;
            float[] fArr5 = new float[1];
            fArr5[i] = f14;
            tygVar.e.w(tyfVar.c(list, z2, fArr3, fArr4, fArr5, f8, urwVar, tygVar.l, usmVar3));
            i2 = i;
            usmVarE = usmVar2;
            usmVarF = usmVar;
        }
        usmVarE.k();
        usmVarF.k();
        this.s = b(this.q);
    }

    @Override // defpackage.tyw
    public final void u() {
        this.t = true;
        n(this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tyw
    public final synchronized void v() {
        if (!this.b) {
            vaq.d();
            this.y.o(this.v);
            this.b = true;
            k();
            if (this.h) {
                ynp ynpVarListIterator = this.u.listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    this.w.i(((tyg) ynpVarListIterator.next()).e);
                }
                umb umbVar = this.d;
                if (umbVar != null) {
                    this.w.i(umbVar);
                }
            }
        }
    }

    @Override // defpackage.tyw
    public final void w() {
        d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tyw
    public final synchronized void x() {
        if (this.b) {
            return;
        }
        if (!this.h) {
            this.h = true;
            yfq yfqVar = this.u;
            int i = ((yls) yfqVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                this.w.d(((tyg) yfqVar.get(i2)).e, null);
            }
            umb umbVar = this.d;
            if (umbVar != null) {
                tpr tprVar = this.F;
                uvg uvgVar = this.w;
                if (tprVar != null) {
                    uvgVar.d(umbVar, tprVar);
                } else {
                    uvgVar.d(umbVar, this);
                }
            }
        }
        d(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        uvr uvrVar = uvr.a;
        int i = 0;
        while (true) {
            yfq yfqVar = this.u;
            if (i >= ((yls) yfqVar).c) {
                return;
            }
            uvx uvxVar = ((tyg) yfqVar.get(i)).m;
            if (uvxVar instanceof uge) {
                uge ugeVar = (uge) uvxVar;
                ugeVar.d = this.o;
                twe tweVar = this.n;
                if (tweVar.a) {
                    float f = tweVar.b;
                    ugeVar.a = true;
                    ugeVar.b = f;
                } else {
                    ugeVar.a = false;
                }
                ugeVar.g = this.p;
                ugeVar.b(this.q, this.r, this.l);
            }
            i++;
        }
    }
}
