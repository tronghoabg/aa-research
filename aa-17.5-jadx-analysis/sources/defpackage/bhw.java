package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bhw implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ bhw(djv djvVar, bia biaVar, dje djeVar, afec afecVar, afec afecVar2, int i) {
        this.f = i;
        this.a = djvVar;
        this.b = biaVar;
        this.c = djeVar;
        this.d = afecVar;
        this.e = afecVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, yig] */
    /* JADX WARN: Type inference failed for: r2v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [djn, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        cju cjuVar;
        ?? r3;
        Object obj2;
        int i = this.f;
        if (i == 0) {
            Object obj3 = this.a;
            bip bipVar = (bip) obj;
            bik bikVar = ((bim) this.b).b;
            bipVar.g = (djv) obj3;
            bipVar.h = (dje) this.c;
            bipVar.b = this.d;
            bipVar.c = this.e;
            bipVar.d = bikVar != null ? bikVar.b : null;
            bipVar.e = bikVar != null ? bikVar.c : null;
            bipVar.f = bikVar != null ? (dcc) bzi.x(bikVar, dbc.n) : null;
            return afak.a;
        }
        int i2 = 0;
        if (i != 1) {
            Iterator it = this.c.c(this.b).iterator();
            while (true) {
                r3 = this.a;
                obj2 = this.e;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                next.getClass();
                int iIntValue = ((Number) next).intValue();
                ((boolean[]) obj2)[iIntValue] = true;
                r3.set(iIntValue, obj);
            }
            boolean[] zArr = (boolean[]) obj2;
            int length = zArr.length;
            while (true) {
                if (i2 >= length) {
                    this.d.invoke(r3);
                    break;
                }
                if (!zArr[i2]) {
                    break;
                }
                i2++;
            }
            return afak.a;
        }
        cxd cxdVar = (cxd) obj;
        cxdVar.q();
        float fE = ((byb) ((jlb) this.c).b).e();
        if (fE != BitmapDescriptorFactory.HUE_RED) {
            Object obj4 = this.b;
            Object obj5 = this.e;
            ?? r9 = this.d;
            long j = dfv.a;
            int iA = r9.a((int) (((djv) obj5).b >> 32));
            bff bffVarD = ((bed) obj4).d();
            cjb cjbVarM = bffVarD != null ? bffVarD.a.m(iA) : new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            float fFloor = (float) Math.floor(cxdVar.eA(2.0f));
            if (fFloor < 1.0f) {
                fFloor = 1.0f;
            }
            float f = fFloor / 2.0f;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() >> 32)) - f;
            float f2 = cjbVarM.b + f;
            if (f2 <= fIntBitsToFloat) {
                fIntBitsToFloat = f2;
            }
            if (fIntBitsToFloat >= f) {
                f = fIntBitsToFloat;
            }
            double d = f;
            float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(d)) + 0.5f : (float) Math.rint(d);
            Object obj6 = this.a;
            float f3 = cjbVarM.c;
            long jFloatToRawIntBits = Float.floatToRawIntBits(fFloor2);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
            long j2 = jFloatToRawIntBits << 32;
            float f4 = cjbVarM.e;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fFloor2);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(f4);
            long j3 = jFloatToRawIntBits3 << 32;
            cmb cmbVar = cxdVar.a;
            cju cjuVar2 = cmbVar.a.c;
            cjk cjkVarQ = cmbVar.q();
            if (obj6 != null) {
                cjuVar = cjuVar2;
                ((cjs) obj6).a(cmbVar.b.a(), cjkVarQ, fE);
            } else {
                cjuVar = cjuVar2;
                if (cjkVarQ.a() != fE) {
                    cjkVarQ.h(fE);
                }
            }
            if (!affa.f(cjkVarQ.d, null)) {
                cjkVarQ.k(null);
            }
            if (cjkVarQ.b != 3) {
                cjkVarQ.i(3);
            }
            if (cjkVarQ.c() != fFloor) {
                cjkVarQ.q(fFloor);
            }
            if (cjkVarQ.b() != 4.0f) {
                cjkVarQ.p(4.0f);
            }
            if (cjkVarQ.e() != 0) {
                cjkVarQ.n(0);
            }
            if (cjkVarQ.f() != 0) {
                cjkVarQ.o(0);
            }
            if (cjkVarQ.d() != 1) {
                cjkVarQ.l(1);
            }
            cjuVar.k((jFloatToRawIntBits2 & 4294967295L) | j2, j3 | (jFloatToRawIntBits4 & 4294967295L), cjkVarQ);
        }
        return afak.a;
    }

    public /* synthetic */ bhw(eqj eqjVar, yig yigVar, boolean[] zArr, List list, afec afecVar, int i) {
        this.f = i;
        this.b = eqjVar;
        this.c = yigVar;
        this.e = zArr;
        this.a = list;
        this.d = afecVar;
    }

    public /* synthetic */ bhw(jlb jlbVar, djn djnVar, djv djvVar, bed bedVar, cjs cjsVar, int i) {
        this.f = i;
        this.c = jlbVar;
        this.d = djnVar;
        this.e = djvVar;
        this.b = bedVar;
        this.a = cjsVar;
    }
}
