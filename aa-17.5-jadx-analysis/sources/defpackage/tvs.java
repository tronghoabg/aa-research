package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tvs extends tvr implements tpu {
    private static final yob m = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/ClientAreaScreenSpaceImpl");
    private static final uwx n = new uwx(null);
    private final tpt o;
    private boolean p;

    public tvs(abax abaxVar, tod todVar, tza tzaVar, ukq ukqVar, tqo tqoVar, typ typVar, zyq zyqVar, uvg uvgVar, usy usyVar, gjv gjvVar, tvm tvmVar, boolean z) {
        super(abaxVar, todVar, tzaVar, ukqVar, tqoVar, typVar, zyqVar, uvgVar, usyVar, gjvVar, tvmVar, z);
        tpt tptVar = new tpt();
        this.o = tptVar;
        this.p = true;
        tptVar.b(this.g);
        tptVar.c(BitmapDescriptorFactory.HUE_RED, this.g);
        tptVar.d(1.0f, tps.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tvr
    protected final twf C(tvr tvrVar, zyq zyqVar, tza tzaVar, tod todVar, uip uipVar, abax abaxVar, tqo tqoVar) {
        abdx abdxVar = abaxVar.c;
        if (abdxVar == null) {
            abdxVar = abdx.a;
        }
        List listA = A(abdxVar, todVar);
        int i = uipVar.c;
        int i2 = abaxVar.l;
        int iAp = a.ap(abaxVar.f);
        int i3 = iAp == 0 ? 1 : iAp;
        abnr abnrVar = (abnr) abde.a.n();
        ynp ynpVarListIterator = ((yfq) listA).listIterator(0);
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        while (ynpVarListIterator.hasNext()) {
            abms abmsVar = (abms) ynpVarListIterator.next();
            int iB = todVar.b(abmsVar);
            B(abnrVar, iB, abmsVar, tqoVar, i, i2, i3);
            int i4 = iB + iB;
            float[] fArr = new float[i4];
            todVar.h(abmsVar, 0, fArr);
            for (int i5 = 0; i5 < i4 - 1; i5 += 2) {
                fMin = Math.min(fArr[i5], fMin);
                fMin2 = Math.min(fArr[i5 + 1], fMin2);
            }
        }
        tpw tpwVarA = zyqVar.a(tvrVar, tzaVar, todVar, (abde) abnrVar.q());
        if (tpwVarA == txj.b) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        twf twfVar = (twf) tpwVarA;
        twfVar.c(arrayList);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            umb umbVar = (umb) arrayList.get(i6);
            if (umbVar.r) {
                uvr uvrVar = uvr.a;
            }
            float[] fArr2 = umbVar.f;
            fArr2[0] = fMin;
            fArr2[1] = fMin2;
            fArr2[2] = 0.0f;
            umbVar.o = true;
        }
        return twfVar;
    }

    @Override // defpackage.tpu
    public final tpt c() {
        tpt tptVar = new tpt();
        synchronized (this) {
            tptVar.a(this.o);
        }
        return tptVar;
    }

    @Override // defpackage.tpu
    public final void d(tpt tptVar) {
        synchronized (this) {
            tpt tptVar2 = this.o;
            boolean zEquals = tptVar2.a.equals(tptVar.a);
            boolean z = (tptVar2.b.equals(tptVar.b) && tptVar2.c == tptVar.c) ? false : true;
            boolean z2 = (tptVar2.d == tptVar.d && tptVar2.e.equals(tptVar.e)) ? false : true;
            tptVar2.a(tptVar);
            if (!zEquals || z2 || z) {
                this.p = true;
                this.l.l();
            }
        }
    }

    @Override // defpackage.tvr
    public final synchronized void z() {
        too tooVarM;
        twf twfVar;
        uvr uvrVar = uvr.a;
        if (this.a) {
            super.z();
            if (this.p) {
                this.p = false;
                tpt tptVar = this.o;
                too tooVarI = too.i(tptVar.a);
                float f = -tptVar.d;
                too tooVarI2 = too.i(tptVar.e);
                tpf tpfVar = tptVar.b;
                float f2 = tpfVar.b;
                float f3 = tpfVar.c;
                too tooVar = this.g;
                tps tpsVar = tptVar.c;
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    tooVarM = tooVarI.m(tooVarI2);
                    tooVarM.z(Math.toRadians(f));
                    tooVarM.y(tooVarI2);
                } else {
                    tooVarM = tooVarI;
                }
                tvq tvqVar = this.e;
                tvqVar.l(tooVarM);
                Iterator it = t().iterator();
                while (it.hasNext()) {
                    ((umb) it.next()).l(tooVarM);
                }
                tvqVar.k(f);
                Iterator it2 = t().iterator();
                while (it2.hasNext()) {
                    ((umb) it2.next()).k(f);
                }
                if (tpsVar == tps.a) {
                    tvqVar.n(f2, f3);
                    Iterator it3 = t().iterator();
                    while (it3.hasNext()) {
                        ((umb) it3.next()).n(f2, f3);
                    }
                    twf twfVar2 = this.f;
                    if (twfVar2 != null) {
                        if (f2 != f3) {
                            ((ynz) ((ynz) m.h()).ai((char) 9156)).u("ClientArea non-uniform scaling of stroked areas not fully supported.");
                        }
                        twe tweVar = twfVar2.n;
                        tweVar.a = true;
                        tweVar.b = (1.0f / f2) * twfVar2.g;
                        twfVar2.y();
                    }
                } else {
                    if (tpsVar != tps.b) {
                        throw new UnsupportedOperationException("This scale type is not supported yet.");
                    }
                    tvqVar.m(f2);
                    Iterator it4 = t().iterator();
                    while (it4.hasNext()) {
                        ((umb) it4.next()).m(f2);
                    }
                    if (f2 != BitmapDescriptorFactory.HUE_RED && (twfVar = this.f) != null) {
                        twfVar.o = 1.0f / f2;
                        twe tweVar2 = twfVar.n;
                        tweVar2.a = false;
                        tweVar2.b = 1.0f;
                        twfVar.y();
                    }
                }
                uww uwwVar = new uww();
                uwwVar.g(tooVar.a - tooVarI.a, tooVar.b - tooVarI.b, BitmapDescriptorFactory.HUE_RED);
                uwwVar.g(tooVarI2.a, tooVarI2.b, BitmapDescriptorFactory.HUE_RED);
                uwwVar.b(n, -f);
                uwwVar.g(-tooVarI2.a, -tooVarI2.b, BitmapDescriptorFactory.HUE_RED);
                ume umeVar = this.d;
                if (umeVar != null) {
                    if (tpsVar == tps.b) {
                        umeVar.c(uwwVar, f2);
                    } else {
                        umeVar.b(uwwVar, f2, f3);
                    }
                }
            }
        }
    }
}
