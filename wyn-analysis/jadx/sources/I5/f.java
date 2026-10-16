package I5;

import U1.L;
import f6.C2573C;
import f6.C2603p;
import f6.C2608u;
import f6.C2613z;
import f6.RunnableC2572B;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u6.v;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f5392a;

    /* renamed from: b, reason: collision with root package name */
    public final C2613z f5393b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f5394c;

    public /* synthetic */ f(CopyOnWriteArrayList copyOnWriteArrayList, int i5, C2613z c2613z) {
        this.f5394c = copyOnWriteArrayList;
        this.f5392a = i5;
        this.f5393b = c2613z;
    }

    public long a(long j8) {
        long jF = v.F(j8);
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF;
    }

    public void b(C2608u c2608u) {
        Iterator it = this.f5394c.iterator();
        while (it.hasNext()) {
            C2573C c2573c = (C2573C) it.next();
            v.B(c2573c.f34874a, new com.applovin.impl.mediation.ads.f(this, c2573c.f34875b, c2608u, 17));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [f6.D, java.lang.Object] */
    public void c(C2603p c2603p, C2608u c2608u) {
        Iterator it = this.f5394c.iterator();
        while (it.hasNext()) {
            C2573C c2573c = (C2573C) it.next();
            C2603p c2603p2 = c2603p;
            v.B(c2573c.f34874a, new RunnableC2572B(this, c2573c.f34875b, c2603p2, c2608u, 1));
            c2603p = c2603p2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [f6.D, java.lang.Object] */
    public void d(C2603p c2603p, C2608u c2608u) {
        Iterator it = this.f5394c.iterator();
        while (it.hasNext()) {
            C2573C c2573c = (C2573C) it.next();
            C2603p c2603p2 = c2603p;
            v.B(c2573c.f34874a, new RunnableC2572B(this, c2573c.f34875b, c2603p2, c2608u, 0));
            c2603p = c2603p2;
        }
    }

    public void e(C2603p c2603p, C2608u c2608u, IOException iOException, boolean z2) {
        Iterator it = this.f5394c.iterator();
        while (it.hasNext()) {
            C2573C c2573c = (C2573C) it.next();
            C2603p c2603p2 = c2603p;
            v.B(c2573c.f34874a, new L(this, c2573c.f34875b, c2603p2, c2608u, iOException, z2, 1));
            c2603p = c2603p2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [f6.D, java.lang.Object] */
    public void f(C2603p c2603p, C2608u c2608u) {
        Iterator it = this.f5394c.iterator();
        while (it.hasNext()) {
            C2573C c2573c = (C2573C) it.next();
            C2603p c2603p2 = c2603p;
            v.B(c2573c.f34874a, new RunnableC2572B(this, c2573c.f34875b, c2603p2, c2608u, 2));
            c2603p = c2603p2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(int i5) {
        this(new CopyOnWriteArrayList(), 0, null);
        switch (i5) {
            case 1:
                this(new CopyOnWriteArrayList(), 0, null);
                break;
            default:
                break;
        }
    }
}
