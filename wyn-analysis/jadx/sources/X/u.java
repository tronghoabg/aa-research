package X;

import B.F;
import E.C0421k;
import N.C0718d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3343n;
import x.C4422o;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3343n f15752a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15754c;

    /* renamed from: g, reason: collision with root package name */
    public S8.b f15758g;

    /* renamed from: h, reason: collision with root package name */
    public t f15759h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f15753b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0421k f15755d = new C0421k(this, 3);

    /* renamed from: e, reason: collision with root package name */
    public final F f15756e = new F(this, 10);

    /* renamed from: f, reason: collision with root package name */
    public final P.d f15757f = new P.d(new t[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f15760i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public u(tf.l lVar) {
        this.f15752a = (AbstractC3343n) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(u uVar) {
        boolean z2;
        Set set;
        synchronized (uVar.f15757f) {
            z2 = uVar.f15754c;
        }
        if (z2) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = uVar.f15753b;
            Object obj = atomicReference.get();
            Set set2 = null;
            listSubList = null;
            List listSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0718d.w("Unexpected notification");
                        throw null;
                    }
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        listSubList = list.get(1);
                    } else if (list.size() > 2) {
                        listSubList = list.subList(1, list.size());
                    }
                }
                List list2 = listSubList;
                while (!atomicReference.compareAndSet(obj, list2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z10;
            }
            synchronized (uVar.f15757f) {
                P.d dVar = uVar.f15757f;
                int i5 = dVar.f8972c;
                if (i5 > 0) {
                    Object[] objArr = dVar.f8970a;
                    int i10 = 0;
                    do {
                        z10 = ((t) objArr[i10]).b(set2) || z10;
                        i10++;
                    } while (i10 < i5);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f15757f) {
            P.d dVar = this.f15757f;
            int i5 = dVar.f8972c;
            if (i5 > 0) {
                Object[] objArr = dVar.f8970a;
                int i10 = 0;
                do {
                    t tVar = (t) objArr[i10];
                    ((C4422o) tVar.f15745e.f16739b).a();
                    tVar.f15746f.a();
                    ((C4422o) tVar.k.f16739b).a();
                    tVar.f15751l.clear();
                    i10++;
                } while (i10 < i5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000a, B:7:0x000d, B:13:0x001c, B:15:0x0020, B:10:0x0017), top: B:35:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r9, tf.l r10, tf.a r11) {
        /*
            r8 = this;
            P.d r0 = r8.f15757f
            monitor-enter(r0)
            P.d r1 = r8.f15757f     // Catch: java.lang.Throwable -> L89
            int r2 = r1.f8972c     // Catch: java.lang.Throwable -> L89
            r3 = 0
            if (r2 <= 0) goto L1b
            java.lang.Object[] r4 = r1.f8970a     // Catch: java.lang.Throwable -> L89
            r5 = 0
        Ld:
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L89
            r7 = r6
            X.t r7 = (X.t) r7     // Catch: java.lang.Throwable -> L89
            tf.l r7 = r7.f15741a     // Catch: java.lang.Throwable -> L89
            if (r7 != r10) goto L17
            goto L1c
        L17:
            int r5 = r5 + 1
            if (r5 < r2) goto Ld
        L1b:
            r6 = r3
        L1c:
            X.t r6 = (X.t) r6     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L31
            X.t r6 = new X.t     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            kotlin.jvm.internal.AbstractC3340k.c(r10, r2)     // Catch: java.lang.Throwable -> L89
            r2 = 1
            kotlin.jvm.internal.K.e(r2, r10)     // Catch: java.lang.Throwable -> L89
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L89
            r1.b(r6)     // Catch: java.lang.Throwable -> L89
        L31:
            monitor-exit(r0)
            X.t r10 = r8.f15759h
            long r0 = r8.f15760i
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L71
            long r4 = N.C0718d.y()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L45
            goto L71
        L45:
            java.lang.String r9 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            java.lang.String r10 = "), currentThread={id="
            java.lang.StringBuilder r9 = Va.M6.u(r0, r9, r10)
            long r10 = N.C0718d.y()
            r9.append(r10)
            java.lang.String r10 = ", name="
            r9.append(r10)
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            java.lang.String r10 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            N.C0718d.O(r9)
            throw r3
        L71:
            r8.f15759h = r6     // Catch: java.lang.Throwable -> L83
            long r2 = N.C0718d.y()     // Catch: java.lang.Throwable -> L83
            r8.f15760i = r2     // Catch: java.lang.Throwable -> L83
            B.F r2 = r8.f15756e     // Catch: java.lang.Throwable -> L83
            r6.a(r9, r2, r11)     // Catch: java.lang.Throwable -> L83
            r8.f15759h = r10
            r8.f15760i = r0
            return
        L83:
            r9 = move-exception
            r8.f15759h = r10
            r8.f15760i = r0
            throw r9
        L89:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.u.c(java.lang.Object, tf.l, tf.a):void");
    }

    public final void d() {
        C0421k c0421k = this.f15755d;
        Dd.c cVar = m.f15717a;
        m.f(l.k);
        synchronized (m.f15718b) {
            m.f15723g = ff.o.F0((Collection) m.f15723g, c0421k);
        }
        this.f15758g = new S8.b(c0421k);
    }
}
