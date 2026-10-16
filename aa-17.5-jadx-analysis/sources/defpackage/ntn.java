package defpackage;

import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ntn {
    public Object a;

    public ntn(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new WeakReference(null);
    }

    public final synchronized int a() {
        int i;
        i = 0;
        for (Object obj = this.a; ((jkf) obj).a != null; obj = ((jkf) obj).a) {
            i++;
        }
        return i;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized jkf b() {
        if (((jkf) this.a).a == null) {
            return null;
        }
        Object obj = this.a;
        this.a = ((jkf) obj).a;
        return (jkf) obj;
    }

    public final synchronized jkf c() {
        if (((jkf) this.a).a == null) {
            return null;
        }
        return (jkf) this.a;
    }

    public final synchronized void d() {
        while (((jkf) this.a).a != null) {
            this.a = ((jkf) this.a).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aixy r21, defpackage.afdr r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.a
            if (r2 != 0) goto Ld
            java.lang.String r2 = "Called runAndWatch on a manager that has been disposed of"
            defpackage.bxc.b(r2)
        Ld:
            java.lang.Object r2 = r0.a
            boolean r3 = r2 instanceof defpackage.bxx
            if (r3 == 0) goto L86
            bxx r2 = (defpackage.bxx) r2
            aixy r3 = r2.c
            if (r3 == 0) goto L86
            boolean r3 = defpackage.affa.f(r3, r1)
            if (r3 != 0) goto L86
            bwp r3 = new bwp
            r3.<init>()
            aixy r4 = r2.c
            if (r4 != 0) goto L2d
            java.lang.String r5 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            defpackage.bxc.b(r5)
        L2d:
            aap r5 = r2.d
            if (r5 != 0) goto L3a
            java.lang.Object r5 = r2.a
            r5.getClass()
            r3.f(r4, r5)
            goto L7e
        L3a:
            java.lang.Object[] r6 = r5.b
            long[] r5 = r5.a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
            r8 = 0
            r9 = r8
        L45:
            r10 = r5[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L79
            int r12 = r9 - r7
            r13 = r8
        L58:
            int r14 = ~r12
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L77
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L73
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r6[r14]
            r3.f(r4, r14)
        L73:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L58
        L77:
            if (r14 != r15) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L45
        L7e:
            r3.c()
            r2.d()
            r0.a = r3
        L86:
            java.lang.Object r0 = r0.a
            r0.getClass()
            bxz r0 = (defpackage.bxz) r0
            afec r2 = r0.a(r1)
            cec r3 = defpackage.cek.b()
            cec r2 = r3.b(r2)
            r0.b(r1)
            cec r1 = r2.w()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = r22.invoke()     // Catch: java.lang.Throwable -> Lae
            defpackage.cec.E(r1)     // Catch: java.lang.Throwable -> Lb3
            r2.d()
            r0.c()
            return r3
        Lae:
            r0 = move-exception
            defpackage.cec.E(r1)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            r2.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntn.e(aixy, afdr):java.lang.Object");
    }

    public final void f() {
        this.a = null;
    }

    public final boolean g() {
        UsageReportingOptInOptions usageReportingOptInOptions = ((sww) this.a).a;
        if (usageReportingOptInOptions != null) {
            return usageReportingOptInOptions.a == 1;
        }
        throw new NullPointerException("null reference");
    }

    public final Object h(xyc xycVar) {
        if (this.a == null) {
            this.a = xycVar.gu();
        }
        return j();
    }

    public final Object i(Object obj) {
        l(obj);
        return j();
    }

    public final Object j() {
        return k("None of the supplied values were non-null!", new Object[0]);
    }

    public final Object k(String str, Object... objArr) {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(wub.M(str, objArr));
    }

    public final void l(Object obj) {
        if (this.a == null) {
            this.a = obj;
        }
    }

    public ntn(Object obj) {
        this.a = obj;
    }

    public ntn(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ntn() {
    }

    public ntn(char[] cArr) {
        this.a = new bxx();
    }
}
