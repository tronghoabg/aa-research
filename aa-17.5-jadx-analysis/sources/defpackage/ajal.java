package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class ajal implements ajay {
    public final afco a;
    public final int b;
    public final int c;

    public ajal(afco afcoVar, int i, int i2) {
        this.a = afcoVar;
        this.b = i;
        this.c = i2;
        boolean z = aitz.a;
    }

    public static /* synthetic */ Object h(ajal ajalVar, aiyl aiylVar, afck afckVar) {
        Object objA = ahni.a(new ajak(aiylVar, ajalVar, (afck) null, 0), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    public abstract Object b(aixv aixvVar, afck afckVar);

    protected abstract ajal c(afco afcoVar, int i, int i2);

    protected String d() {
        return null;
    }

    public aixx e(aitx aitxVar) {
        epm epmVar = new epm(this, (afck) null, 5);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return aimh.c(aitxVar, this.a, i, i2, 3, epmVar);
    }

    public aiyk f() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r5
  0x0019: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:7:0x0011, B:11:0x0017, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ajay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aiyk hQ(defpackage.afco r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = defpackage.aitz.a
            afco r0 = r2.a
            afco r3 = r3.plus(r0)
            r1 = 1
            if (r5 != r1) goto L23
            int r5 = r2.b
            r1 = -3
            if (r5 != r1) goto L11
            goto L21
        L11:
            if (r4 != r1) goto L14
            goto L19
        L14:
            r1 = -2
            if (r5 == r1) goto L21
            if (r4 != r1) goto L1b
        L19:
            r4 = r5
            goto L21
        L1b:
            int r5 = r5 + r4
            if (r5 >= 0) goto L19
            r4 = 2147483647(0x7fffffff, float:NaN)
        L21:
            int r5 = r2.c
        L23:
            boolean r0 = defpackage.affa.f(r3, r0)
            if (r0 == 0) goto L32
            int r0 = r2.b
            if (r4 != r0) goto L32
            int r0 = r2.c
            if (r5 != r0) goto L32
            return r2
        L32:
            ajal r2 = r2.c(r3, r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajal.hQ(afco, int, int):aiyk");
    }

    @Override // defpackage.aiyk
    public Object hR(aiyl aiylVar, afck afckVar) {
        return h(this, aiylVar, afckVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        afco afcoVar = this.a;
        if (afcoVar != afcp.a) {
            Objects.toString(afcoVar);
            arrayList.add("context=".concat(String.valueOf(afcoVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.bp(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(affz.n(i2));
            arrayList.add("onBufferOverflow=".concat(affz.n(i2)));
        }
        return aiua.a(this) + "[" + woy.cu(arrayList, ", ", null, null, null, 62) + "]";
    }
}
