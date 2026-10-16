package r9;

import A7.C0295v;
import java.util.HashMap;
import java.util.Iterator;
import p9.C3776A;

/* loaded from: classes4.dex */
public final class u implements Q {

    /* renamed from: c, reason: collision with root package name */
    public int f44673c;

    /* renamed from: f, reason: collision with root package name */
    public final t f44676f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f44671a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Y2.B f44672b = new Y2.B((byte) 0, 24);

    /* renamed from: d, reason: collision with root package name */
    public s9.o f44674d = s9.o.f45389b;

    /* renamed from: e, reason: collision with root package name */
    public long f44675e = 0;

    public u(t tVar) {
        this.f44676f = tVar;
    }

    @Override // r9.Q
    public final void a(c9.d dVar, int i5) {
        Y2.B b5 = this.f44672b;
        b5.getClass();
        Iterator it = dVar.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                break;
            }
            C3946c c3946c = new C3946c((s9.h) c0295v.next(), i5);
            b5.f16383b = ((c9.d) b5.f16383b).c(c3946c);
            b5.f16384c = ((c9.d) b5.f16384c).c(c3946c);
        }
        z zVar = this.f44676f.k;
        Iterator it2 = dVar.iterator();
        while (true) {
            C0295v c0295v2 = (C0295v) it2;
            if (!((Iterator) c0295v2.f1081b).hasNext()) {
                return;
            } else {
                zVar.g((s9.h) c0295v2.next());
            }
        }
    }

    @Override // r9.Q
    public final void b(S s10) {
        f(s10);
    }

    @Override // r9.Q
    public final void c(c9.d dVar, int i5) {
        Y2.B b5 = this.f44672b;
        b5.getClass();
        Iterator it = dVar.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                break;
            }
            C3946c c3946c = new C3946c((s9.h) c0295v.next(), i5);
            b5.f16383b = ((c9.d) b5.f16383b).a(c3946c);
            b5.f16384c = ((c9.d) b5.f16384c).a(c3946c);
        }
        z zVar = this.f44676f.k;
        Iterator it2 = dVar.iterator();
        while (true) {
            C0295v c0295v2 = (C0295v) it2;
            if (!((Iterator) c0295v2.f1081b).hasNext()) {
                return;
            } else {
                zVar.a((s9.h) c0295v2.next());
            }
        }
    }

    @Override // r9.Q
    public final S d(C3776A c3776a) {
        return (S) this.f44671a.get(c3776a);
    }

    @Override // r9.Q
    public final void e(s9.o oVar) {
        this.f44674d = oVar;
    }

    @Override // r9.Q
    public final void f(S s10) {
        this.f44671a.put(s10.f44596a, s10);
        int i5 = this.f44673c;
        int i10 = s10.f44597b;
        if (i10 > i5) {
            this.f44673c = i10;
        }
        long j8 = this.f44675e;
        long j10 = s10.f44598c;
        if (j10 > j8) {
            this.f44675e = j10;
        }
    }

    @Override // r9.Q
    public final int g() {
        return this.f44673c;
    }

    @Override // r9.Q
    public final c9.d h(int i5) {
        return this.f44672b.z(i5);
    }

    @Override // r9.Q
    public final s9.o i() {
        return this.f44674d;
    }

    @Override // r9.Q
    public final void j(int i5) {
        this.f44672b.C(i5);
    }
}
