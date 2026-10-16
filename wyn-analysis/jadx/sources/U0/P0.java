package u0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class P0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f46166a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u0.M0 a(u0.AbstractC4162a r7, N.AbstractC0743q r8, V.d r9) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r7, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = u0.U.f46173a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L47
            r0 = -1
            r4 = 6
            Gf.e r0 = ic.d.a(r0, r4, r3)
            ef.p r4 = u0.B.f46080l
            java.lang.Object r4 = r4.getValue()
            jf.h r4 = (jf.InterfaceC3108h) r4
            Kd.a r4 = Ef.H.c(r4)
            u0.T r5 = new u0.T
            r5.<init>(r0, r3)
            r6 = 3
            Ef.H.D(r4, r3, r5, r6)
            B.F r4 = new B.F
            r5 = 20
            r4.<init>(r0, r5)
            java.lang.Object r0 = X.m.f15718b
            monitor-enter(r0)
            java.lang.Object r5 = X.m.f15724h     // Catch: java.lang.Throwable -> L44
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList r4 = ff.o.F0(r5, r4)     // Catch: java.lang.Throwable -> L44
            X.m.f15724h = r4     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            X.m.a()
            goto L47
        L44:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L47:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5a
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof u0.C4188n
            if (r1 == 0) goto L58
            u0.n r0 = (u0.C4188n) r0
            goto L5e
        L58:
            r0 = r3
            goto L5e
        L5a:
            r7.removeAllViews()
            goto L58
        L5e:
            if (r0 != 0) goto L77
            u0.n r0 = new u0.n
            android.content.Context r1 = r7.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r4)
            r0.<init>(r1)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = u0.P0.f46166a
            r7.addView(r1, r4)
        L77:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r7 < r1) goto Lae
            u0.O0 r7 = u0.O0.f46163a
            java.util.Map r7 = r7.a(r0)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Lae
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r1 = 2131362144(0x7f0a0160, float:1.834406E38)
            r0.setTag(r1, r7)
            java.lang.Class<u0.Y> r7 = u0.Y.class
            java.lang.String r1 = "isDebugInspectorInfoEnabled"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)     // Catch: java.lang.Exception -> La7
            r7.setAccessible(r2)     // Catch: java.lang.Exception -> La7
            r7.setBoolean(r3, r2)     // Catch: java.lang.Exception -> La7
            goto Lae
        La7:
            java.lang.String r7 = "Wrapper"
            java.lang.String r1 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r7, r1)
        Lae:
            t0.Q r7 = new t0.Q
            t0.t r1 = r0.getRoot()
            java.lang.String r2 = "root"
            kotlin.jvm.internal.AbstractC3340k.e(r1, r2)
            r7.<init>(r1)
            N.s r1 = new N.s
            r1.<init>(r8, r7)
            android.view.View r7 = r0.getView()
            r8 = 2131362515(0x7f0a02d3, float:1.8344813E38)
            java.lang.Object r7 = r7.getTag(r8)
            boolean r2 = r7 instanceof u0.M0
            if (r2 == 0) goto Ld3
            r3 = r7
            u0.M0 r3 = (u0.M0) r3
        Ld3:
            if (r3 != 0) goto Le1
            u0.M0 r3 = new u0.M0
            r3.<init>(r0, r1)
            android.view.View r7 = r0.getView()
            r7.setTag(r8, r3)
        Le1:
            r3.b(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.P0.a(u0.a, N.q, V.d):u0.M0");
    }
}
