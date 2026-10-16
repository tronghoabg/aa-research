package T2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f11365a;

    /* renamed from: b, reason: collision with root package name */
    public int f11366b;

    /* renamed from: c, reason: collision with root package name */
    public int f11367c;

    /* renamed from: d, reason: collision with root package name */
    public int f11368d;

    /* renamed from: e, reason: collision with root package name */
    public int f11369e;

    public /* synthetic */ a(int i5, int i10, int i11, int i12, int i13) {
        this.f11365a = i5;
        this.f11366b = i10;
        this.f11367c = i11;
        this.f11368d = i12;
        this.f11369e = i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T2.a b(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            Q1.k.c(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r3 = r2
        L1c:
            int r4 = r10.length
            if (r3 >= r4) goto L6d
            r4 = r10[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = A6.h.O(r4)
            r4.getClass()
            int r9 = r4.hashCode()
            switch(r9) {
                case 100571: goto L56;
                case 3556653: goto L4b;
                case 109757538: goto L40;
                case 109780401: goto L35;
                default: goto L33;
            }
        L33:
            r4 = r1
            goto L60
        L35:
            java.lang.String r9 = "style"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L3e
            goto L33
        L3e:
            r4 = 3
            goto L60
        L40:
            java.lang.String r9 = "start"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L49
            goto L33
        L49:
            r4 = 2
            goto L60
        L4b:
            java.lang.String r9 = "text"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L54
            goto L33
        L54:
            r4 = r0
            goto L60
        L56:
            java.lang.String r9 = "end"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L5f
            goto L33
        L5f:
            r4 = r2
        L60:
            switch(r4) {
                case 0: goto L6a;
                case 1: goto L68;
                case 2: goto L66;
                case 3: goto L64;
                default: goto L63;
            }
        L63:
            goto L6b
        L64:
            r7 = r3
            goto L6b
        L66:
            r5 = r3
            goto L6b
        L68:
            r8 = r3
            goto L6b
        L6a:
            r6 = r3
        L6b:
            int r3 = r3 + r0
            goto L1c
        L6d:
            if (r5 == r1) goto L7a
            if (r6 == r1) goto L7a
            if (r8 == r1) goto L7a
            T2.a r4 = new T2.a
            int r9 = r10.length
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L7a:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.a.b(java.lang.String):T2.a");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T2.a c(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            u6.AbstractC4256a.e(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r3 = r2
        L1c:
            int r4 = r10.length
            if (r3 >= r4) goto L6d
            r4 = r10[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = A6.h.O(r4)
            r4.getClass()
            int r9 = r4.hashCode()
            switch(r9) {
                case 100571: goto L56;
                case 3556653: goto L4b;
                case 109757538: goto L40;
                case 109780401: goto L35;
                default: goto L33;
            }
        L33:
            r4 = r1
            goto L60
        L35:
            java.lang.String r9 = "style"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L3e
            goto L33
        L3e:
            r4 = 3
            goto L60
        L40:
            java.lang.String r9 = "start"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L49
            goto L33
        L49:
            r4 = 2
            goto L60
        L4b:
            java.lang.String r9 = "text"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L54
            goto L33
        L54:
            r4 = r0
            goto L60
        L56:
            java.lang.String r9 = "end"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L5f
            goto L33
        L5f:
            r4 = r2
        L60:
            switch(r4) {
                case 0: goto L6a;
                case 1: goto L68;
                case 2: goto L66;
                case 3: goto L64;
                default: goto L63;
            }
        L63:
            goto L6b
        L64:
            r7 = r3
            goto L6b
        L66:
            r5 = r3
            goto L6b
        L68:
            r8 = r3
            goto L6b
        L6a:
            r6 = r3
        L6b:
            int r3 = r3 + r0
            goto L1c
        L6d:
            if (r5 == r1) goto L7a
            if (r6 == r1) goto L7a
            if (r8 == r1) goto L7a
            T2.a r4 = new T2.a
            int r9 = r10.length
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L7a:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.a.c(java.lang.String):T2.a");
    }

    public boolean a() {
        int i5 = this.f11365a;
        int i10 = 2;
        if ((i5 & 7) != 0) {
            int i11 = this.f11368d;
            int i12 = this.f11366b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 112) != 0) {
            int i13 = this.f11368d;
            int i14 = this.f11367c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 1792) != 0) {
            int i15 = this.f11369e;
            int i16 = this.f11366b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 28672) != 0) {
            int i17 = this.f11369e;
            int i18 = this.f11367c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i5 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
