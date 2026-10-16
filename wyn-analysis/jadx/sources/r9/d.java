package R9;

import P9.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f10564d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f10565e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f10566a;

    /* renamed from: b, reason: collision with root package name */
    public long f10567b;

    /* renamed from: c, reason: collision with root package name */
    public int f10568c;

    public d() {
        if (ya.b.f48041b == null) {
            Pattern pattern = j.f9288c;
            ya.b.f48041b = new ya.b(26);
        }
        ya.b bVar = ya.b.f48041b;
        if (j.f9289d == null) {
            j.f9289d = new j(bVar);
        }
        this.f10566a = j.f9289d;
    }

    public final synchronized long a(int i5) {
        if (!(i5 == 429 || (i5 >= 500 && i5 < 600))) {
            return f10564d;
        }
        double dPow = Math.pow(2.0d, this.f10568c);
        this.f10566a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f10565e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f10568c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            P9.j r0 = r4.f10566a     // Catch: java.lang.Throwable -> L19
            ya.b r0 = r0.f9290a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f10567b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R9.d.b():boolean");
    }

    public final synchronized void c() {
        this.f10568c = 0;
    }

    public final synchronized void d(int i5) {
        if ((i5 >= 200 && i5 < 300) || i5 == 401 || i5 == 404) {
            c();
            return;
        }
        this.f10568c++;
        long jA = a(i5);
        this.f10566a.f9290a.getClass();
        this.f10567b = System.currentTimeMillis() + jA;
    }
}
