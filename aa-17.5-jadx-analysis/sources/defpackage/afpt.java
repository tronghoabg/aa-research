package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class afpt {
    private afpt() {
    }

    public static double a(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ".");
    }

    public static float b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float c(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static float d(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ".");
    }

    public static int e(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int f(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int g(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException(a.bB(i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
    }

    public static long h(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long i(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static long j(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable k(java.lang.Comparable r3, java.lang.Comparable r4, java.lang.Comparable r5) {
        /*
            if (r4 == 0) goto L28
            if (r5 == 0) goto L28
            int r0 = r4.compareTo(r5)
            if (r0 > 0) goto L18
            int r0 = r3.compareTo(r4)
            if (r0 >= 0) goto L11
            goto L30
        L11:
            int r4 = r3.compareTo(r5)
            if (r4 <= 0) goto L3a
            goto L39
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            java.lang.String r1 = " is less than minimum "
            java.lang.String r2 = "."
            java.lang.String r4 = defpackage.a.bw(r4, r5, r0, r1, r2)
            r3.<init>(r4)
            throw r3
        L28:
            if (r4 == 0) goto L31
            int r0 = r3.compareTo(r4)
            if (r0 >= 0) goto L31
        L30:
            return r4
        L31:
            if (r5 == 0) goto L3a
            int r4 = r3.compareTo(r5)
            if (r4 <= 0) goto L3a
        L39:
            return r5
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpt.k(java.lang.Comparable, java.lang.Comparable, java.lang.Comparable):java.lang.Comparable");
    }

    public static afgy l(afgy afgyVar, int i) {
        afgyVar.getClass();
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            throw new IllegalArgumentException(a.bm(numValueOf, "Step must be positive, was: ", "."));
        }
        if (afgyVar.c <= 0) {
            i = -i;
        }
        return new afgy(afgyVar.a, afgyVar.b, i);
    }

    public static afha m(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? afha.d : new afha(i, i2 - 1);
    }

    public static Comparable n(Comparable comparable, afgw afgwVar) {
        afgwVar.getClass();
        if (afgwVar.b()) {
            throw new IllegalArgumentException(a.bm(afgwVar, "Cannot coerce value to an empty range: ", "."));
        }
        return (!afgw.e(comparable, afgwVar.d()) || afgw.e(afgwVar.d(), comparable)) ? (!afgw.e(afgwVar.c(), comparable) || afgw.e(comparable, afgwVar.c())) ? comparable : afgwVar.c() : afgwVar.d();
    }

    public static double o(double d) {
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.aiyk r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.aizf
            if (r0 == 0) goto L13
            r0 = r6
            aizf r0 = (defpackage.aizf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aizf r0 = new aizf
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            jxy r5 = r0.d
            affv r1 = r0.c
            defpackage.woy.dF(r6)     // Catch: defpackage.ajag -> L2b
            goto L64
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.woy.dF(r6)
            affv r6 = new affv
            r6.<init>()
            ajcz r2 = defpackage.ajbb.a
            r6.a = r2
            jxy r2 = new jxy
            r4 = 5
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.ajag -> L56
            r0.d = r2     // Catch: defpackage.ajag -> L56
            r0.b = r3     // Catch: defpackage.ajag -> L56
            java.lang.Object r5 = r5.hR(r2, r0)     // Catch: defpackage.ajag -> L56
            if (r5 == r1) goto L55
            r1 = r6
            goto L64
        L55:
            return r1
        L56:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L5a:
            defpackage.aipt.a(r6, r5)
            afco r5 = r0.hH()
            defpackage.affx.f(r5)
        L64:
            java.lang.Object r5 = r1.a
            ajcz r6 = defpackage.ajbb.a
            if (r5 == r6) goto L6b
            return r5
        L6b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpt.p(aiyk, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.aiyk r4, defpackage.afeg r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.aizg
            if (r0 == 0) goto L13
            r0 = r6
            aizg r0 = (defpackage.aizg) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aizg r0 = new aizg
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aize r4 = r0.d
            affv r5 = r0.c
            defpackage.woy.dF(r6)     // Catch: defpackage.ajag -> L2b
            goto L63
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.woy.dF(r6)
            affv r6 = new affv
            r6.<init>()
            ajcz r2 = defpackage.ajbb.a
            r6.a = r2
            aize r2 = new aize
            r2.<init>(r5, r6)
            r0.c = r6     // Catch: defpackage.ajag -> L55
            r0.d = r2     // Catch: defpackage.ajag -> L55
            r0.b = r3     // Catch: defpackage.ajag -> L55
            java.lang.Object r4 = r4.hR(r2, r0)     // Catch: defpackage.ajag -> L55
            if (r4 == r1) goto L54
            r5 = r6
            goto L63
        L54:
            return r1
        L55:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L59:
            defpackage.aipt.a(r6, r4)
            afco r4 = r0.hH()
            defpackage.affx.f(r4)
        L63:
            java.lang.Object r4 = r5.a
            ajcz r5 = defpackage.ajbb.a
            if (r4 == r5) goto L6a
            return r4
        L6a:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpt.q(aiyk, afeg, afck):java.lang.Object");
    }

    public static /* synthetic */ aixl r(int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            return i2 == 1 ? new aixh(aixk.a) : new aixt(1, i2);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new aixh(i) : new aixt(i, i2) : new aixh(Alert.DURATION_SHOW_INDEFINITELY) : i2 == 1 ? new aixh(0) : new aixt(1, i2);
        }
        if (i2 == 1) {
            return new aixt(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public /* synthetic */ afpt(afeu afeuVar) {
        this();
    }
}
