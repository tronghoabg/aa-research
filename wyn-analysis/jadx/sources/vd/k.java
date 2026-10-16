package vd;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import md.C3546n;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f47188a;

    /* renamed from: d, reason: collision with root package name */
    public Long f47191d;

    /* renamed from: e, reason: collision with root package name */
    public int f47192e;

    /* renamed from: b, reason: collision with root package name */
    public volatile t6.q f47189b = new t6.q();

    /* renamed from: c, reason: collision with root package name */
    public t6.q f47190c = new t6.q();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f47193f = new HashSet();

    public k(m mVar) {
        this.f47188a = mVar;
    }

    public final void a(q qVar) {
        if (d() && !qVar.f47211f) {
            qVar.t();
        } else if (!d() && qVar.f47211f) {
            qVar.f47211f = false;
            C3546n c3546n = qVar.f47212g;
            if (c3546n != null) {
                qVar.f47213h.a(c3546n);
                qVar.f47214i.h(2, "Subchannel unejected: {0}", qVar);
            }
        }
        qVar.f47210e = this;
        this.f47193f.add(qVar);
    }

    public final void b(long j8) {
        this.f47191d = Long.valueOf(j8);
        this.f47192e++;
        Iterator it = this.f47193f.iterator();
        while (it.hasNext()) {
            ((q) it.next()).t();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f47190c.f45907b).get() + ((AtomicLong) this.f47190c.f45906a).get();
    }

    public final boolean d() {
        return this.f47191d != null;
    }

    public final void e() {
        Fe.e.w("not currently ejected", this.f47191d != null);
        this.f47191d = null;
        Iterator it = this.f47193f.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            qVar.f47211f = false;
            C3546n c3546n = qVar.f47212g;
            if (c3546n != null) {
                qVar.f47213h.a(c3546n);
                qVar.f47214i.h(2, "Subchannel unejected: {0}", qVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f47193f + '}';
    }
}
