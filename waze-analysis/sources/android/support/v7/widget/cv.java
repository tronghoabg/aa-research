package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    static final ThreadLocal f1288a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final Comparator f1289b = new cs();

    /* renamed from: d, reason: collision with root package name */
    long f1291d;

    /* renamed from: e, reason: collision with root package name */
    long f1292e;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f1290c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f1293f = new ArrayList();

    cv() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.support.v7.widget.fe b(android.support.v7.widget.RecyclerView r5, int r6, long r7) throws java.lang.Throwable {
        /*
            android.support.v7.widget.br r0 = r5.f940g
            int r0 = r0.b()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            android.support.v7.widget.br r3 = r5.f940g
            android.view.View r3 = r3.e(r2)
            android.support.v7.widget.fe r3 = android.support.v7.widget.RecyclerView.p(r3)
            int r4 = r3.mPosition
            if (r4 != r6) goto L20
            boolean r3 = r3.isInvalid()
            if (r3 != 0) goto L20
            r5 = 0
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            android.support.v7.widget.et r0 = r5.f937d
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L40
            boolean r2 = androidx.core.os.TraceCompat.isEnabled()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L40
            r2 = 1
            java.lang.String r3 = "RV Prefetch forced - needed next frame"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L3b
            goto L41
        L3b:
            r6 = move-exception
            goto L68
        L3d:
            r6 = move-exception
            r2 = r1
            goto L68
        L40:
            r2 = r1
        L41:
            r5.Y()     // Catch: java.lang.Throwable -> L3b
            android.support.v7.widget.fe r6 = r0.r(r6, r7)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L5f
            boolean r7 = r6.isBound()     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L5c
            boolean r7 = r6.isInvalid()     // Catch: java.lang.Throwable -> L3b
            if (r7 != 0) goto L5c
            android.view.View r7 = r6.itemView     // Catch: java.lang.Throwable -> L3b
            r0.l(r7)     // Catch: java.lang.Throwable -> L3b
            goto L5f
        L5c:
            r0.e(r6, r1)     // Catch: java.lang.Throwable -> L3b
        L5f:
            r5.aa(r1)
            if (r2 == 0) goto L67
            android.os.Trace.endSection()
        L67:
            return r6
        L68:
            r5.aa(r1)
            if (r2 == 0) goto L70
            android.os.Trace.endSection()
        L70:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cv.b(android.support.v7.widget.RecyclerView, int, long):android.support.v7.widget.fe");
    }

    final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.q && this.f1291d == 0) {
            this.f1291d = System.nanoTime();
            recyclerView.post(this);
        }
        ct ctVar = recyclerView.D;
        ctVar.f1279a = i2;
        ctVar.f1280b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cv.run():void");
    }
}
