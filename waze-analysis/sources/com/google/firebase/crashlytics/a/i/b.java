package com.google.firebase.crashlytics.a.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f9769a;

    public b(int i2) {
        this.f9769a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // com.google.firebase.crashlytics.a.i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] r14) {
        /*
            r13 = this;
            int r13 = r13.f9769a
            r0 = 0
            if (r13 == 0) goto L19
            int r13 = r14.length
            r1 = 1024(0x400, float:1.435E-42)
            if (r13 > r1) goto Lc
            goto L7f
        Lc:
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 512(0x200, float:7.17E-43)
            java.lang.System.arraycopy(r14, r0, r1, r0, r2)
            int r13 = r13 + (-512)
            java.lang.System.arraycopy(r14, r13, r1, r2, r2)
            return r1
        L19:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            int r1 = r14.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = r0
            r4 = r3
            r5 = r2
        L25:
            int r6 = r14.length
            if (r3 >= r6) goto L77
            r7 = r14[r3]
            java.lang.Object r8 = r13.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L65
            int r9 = r8.intValue()
            int r10 = r3 - r9
            int r11 = r3 + r10
            if (r11 <= r6) goto L3d
            goto L65
        L3d:
            r6 = r0
        L3e:
            if (r6 >= r10) goto L51
            int r11 = r9 + r6
            r11 = r14[r11]
            int r12 = r3 + r6
            r12 = r14[r12]
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L65
            int r6 = r6 + 1
            goto L3e
        L51:
            int r6 = r8.intValue()
            int r6 = r3 - r6
            r8 = 10
            if (r5 >= r8) goto L61
            java.lang.System.arraycopy(r14, r3, r1, r4, r6)
            int r4 = r4 + r6
            int r5 = r5 + 1
        L61:
            int r6 = r6 + (-1)
            int r6 = r6 + r3
            goto L6d
        L65:
            r5 = r14[r3]
            r1[r4] = r5
            int r4 = r4 + 1
            r5 = r2
            r6 = r3
        L6d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.put(r7, r3)
            int r3 = r6 + 1
            goto L25
        L77:
            java.lang.StackTraceElement[] r13 = new java.lang.StackTraceElement[r4]
            java.lang.System.arraycopy(r1, r0, r13, r0, r4)
            if (r4 >= r6) goto L7f
            return r13
        L7f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.a.i.b.a(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }
}
