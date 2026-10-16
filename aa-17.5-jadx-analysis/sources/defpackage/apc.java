package defpackage;

import android.view.ViewConfiguration;
import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class apc extends ape implements apt {
    public final aixl a;
    public aivh b;
    private final /* synthetic */ apt h;
    private final afec i;
    private final kwp j;

    public apc(apt aptVar, aqk aqkVar, kwp kwpVar, afeg afegVar, dlg dlgVar, afec afecVar) {
        super(aqkVar, afegVar, dlgVar);
        this.h = aptVar;
        this.j = kwpVar;
        this.i = afecVar;
        this.a = afpt.r(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.apc r7, defpackage.affv r8, defpackage.affu r9, defpackage.affv r10, long r11, defpackage.afck r13) {
        /*
            boolean r0 = r13 instanceof defpackage.apb
            if (r0 == 0) goto L13
            r0 = r13
            apb r0 = (defpackage.apb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apb r0 = new apb
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            affv r10 = r0.f
            affu r9 = r0.e
            affv r8 = r0.d
            apc r7 = r0.c
            defpackage.woy.dF(r13)
            goto L67
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            defpackage.woy.dF(r13)
            r5 = 0
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 >= 0) goto L46
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L46:
            long r5 = defpackage.aisq.a
            aiss r13 = defpackage.aiss.c
            long r11 = defpackage.afzc.d(r11, r13)
            ada r13 = new ada
            r2 = 0
            r5 = 9
            r13.<init>(r7, r2, r5)
            r0.c = r7
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.b = r4
            java.lang.Object r13 = defpackage.aikc.c(r11, r13, r0)
            if (r13 != r1) goto L67
            return r1
        L67:
            aoy r13 = (defpackage.aoy) r13
            if (r13 == 0) goto L9a
            java.lang.Object r11 = r8.a
            aoy r11 = (defpackage.aoy) r11
            boolean r11 = r11.c
            long r11 = r13.b
            aoy r0 = new aoy
            long r1 = r13.a
            r0.<init>(r1, r11)
            r8.a = r0
            java.lang.Object r8 = r8.a
            aoy r8 = (defpackage.aoy) r8
            long r11 = r8.a
            long r11 = r7.b(r11)
            r9.a = r11
            r8 = 0
            aed r8 = defpackage.ca.B(r8, r8)
            r10.a = r8
            r7.e(r13)
            long r7 = r9.a
            boolean r7 = h(r7)
            r3 = r7 ^ 1
        L9a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.d(apc, affv, affu, affv, long, afck):java.lang.Object");
    }

    public static final aoy g(aixl aixlVar) {
        aoy aoyVarA = null;
        Iterator itA = new afbb(new apg(new alg(aixlVar, 8), null), 3).a();
        while (itA.hasNext()) {
            aoy aoyVar = (aoy) itA.next();
            aoyVarA = aoyVarA == null ? aoyVar : aoyVarA.a(aoyVar);
        }
        return aoyVarA;
    }

    public static final boolean h(long j) {
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) < 0.5f;
    }

    public static final long i(long j, long j2) {
        return Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final long k(long j, long j2) {
        return Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // defpackage.apt
    public final long a(long j) {
        throw null;
    }

    @Override // defpackage.apt
    public final long b(long j) {
        return this.h.b(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
    
        if (r0.invoke(r1, r8) != r9) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aoy r16, float r17, float r18, defpackage.afck r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.c(aoy, float, float, afck):java.lang.Object");
    }

    public final void e(aoy aoyVar) {
        this.g.p(aoyVar.b, aoyVar.a);
    }

    @Override // defpackage.ape
    protected final boolean f(cql cqlVar) {
        return cqlVar.e == 6;
    }

    @Override // defpackage.ape
    protected final boolean j(cql cqlVar) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.j.a;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        cja cjaVar = new cja(0L);
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cjaVar = new cja(a.ai(cjaVar.a, ((cqu) list.get(i)).j));
        }
        long j = cjaVar.a;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        return ((Boolean) this.i.invoke(new aps(b(jFloatToRawIntBits)))).booleanValue() ? aixp.c(this.a.j(new aoy(jFloatToRawIntBits, ((cqu) woy.bF(list)).b))) : this.e;
    }

    public final long l(izj izjVar, long j) {
        return b(izjVar.p(this.h.a(j)));
    }
}
