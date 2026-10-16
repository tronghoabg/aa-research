package Va;

import com.google.android.gms.ads.MobileAds;

/* loaded from: classes4.dex */
public final class V0 extends W0 {

    /* renamed from: V, reason: collision with root package name */
    public static final char[] f13784V = {44059, 58945, 14573, 29445, 34176, 55343, 4693, 42203, 65387, 12698, 17464};

    /* renamed from: W, reason: collision with root package name */
    public static int f13785W = 0;

    /* renamed from: X, reason: collision with root package name */
    public static int f13786X = 1;

    @Override // Va.W0, Va.Z0
    public final String t0() {
        int i5 = f13786X + 7;
        f13785W = i5 % 128;
        if (i5 % 2 != 0) {
            MobileAds.getVersion().toString();
            throw null;
        }
        String string = MobileAds.getVersion().toString();
        f13786X = (f13785W + 99) % 128;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // Va.W0, Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = Va.V0.f13785W
            int r0 = r0 + 57
            int r1 = r0 % 128
            Va.V0.f13786X = r1
            int r0 = r0 % 2
            r1 = -1938329210(0xffffffff8c777186, float:-1.906235E-31)
            r2 = 0
            if (r0 != 0) goto L1a
            int r0 = r13.hashCode()
            r3 = 47
            int r3 = r3 / r2
            if (r0 == r1) goto L21
            goto L7d
        L1a:
            int r0 = r13.hashCode()
            if (r0 == r1) goto L21
            goto L7d
        L21:
            r0 = 44109(0xac4d, float:6.181E-41)
            int r1 = android.graphics.Color.alpha(r2)
            int r1 = r1 + r0
            char r0 = (char) r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            long r3 = android.widget.ExpandableListView.getPackedPositionForChild(r2, r2)
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 10 - r3
            java.lang.Object r4 = Va.Ab.f13218u
            monitor-enter(r4)
            char[] r5 = new char[r3]     // Catch: java.lang.Throwable -> L5d
            Va.Ab.f13217t = r2     // Catch: java.lang.Throwable -> L5d
        L3f:
            int r2 = Va.Ab.f13217t     // Catch: java.lang.Throwable -> L5d
            if (r2 >= r3) goto L5f
            char[] r6 = Va.V0.f13784V     // Catch: java.lang.Throwable -> L5d
            int r7 = r1 + r2
            char r6 = r6[r7]     // Catch: java.lang.Throwable -> L5d
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L5d
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L5d
            r10 = -1830414170985248151(0xe69910026a954a69, double:-1.7038931876168145E186)
            long r8 = r8 * r10
            long r6 = r6 ^ r8
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L5d
            long r6 = r6 ^ r8
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L5d
            char r6 = (char) r6     // Catch: java.lang.Throwable -> L5d
            r5[r2] = r6     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 + 1
            Va.Ab.f13217t = r2     // Catch: java.lang.Throwable -> L5d
            goto L3f
        L5d:
            r13 = move-exception
            goto L85
        L5f:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.intern()
            boolean r0 = r13.equals(r0)
            r1 = 1
            if (r0 == r1) goto L71
            goto L7d
        L71:
            int r0 = Va.V0.f13786X
            int r0 = r0 + 3
            int r1 = r0 % 128
            Va.V0.f13785W = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L82
        L7d:
            java.lang.Class r13 = super.w0(r13)
            return r13
        L82:
            java.lang.Class<x6.u> r13 = x6.u.class
            return r13
        L85:
            monitor-exit(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V0.w0(java.lang.String):java.lang.Class");
    }
}
