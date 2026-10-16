package f6;

import E5.C0446d0;
import E5.J0;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u6.AbstractC4256a;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2588a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f35022a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f35023b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final I5.f f35024c = new I5.f(1);

    /* renamed from: d, reason: collision with root package name */
    public final I5.f f35025d = new I5.f(0);

    /* renamed from: e, reason: collision with root package name */
    public Looper f35026e;

    /* renamed from: f, reason: collision with root package name */
    public J0 f35027f;

    /* renamed from: g, reason: collision with root package name */
    public F5.l f35028g;

    public abstract InterfaceC2610w a(C2613z c2613z, o2.e eVar, long j8);

    public final void b(InterfaceC2571A interfaceC2571A) {
        HashSet hashSet = this.f35023b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC2571A);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(InterfaceC2571A interfaceC2571A) {
        this.f35026e.getClass();
        HashSet hashSet = this.f35023b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC2571A);
        if (zIsEmpty) {
            e();
        }
    }

    public J0 f() {
        return null;
    }

    public abstract C0446d0 g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(InterfaceC2571A interfaceC2571A, t6.K k, F5.l lVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f35026e;
        AbstractC4256a.e(looper == null || looper == looperMyLooper);
        this.f35028g = lVar;
        J0 j02 = this.f35027f;
        this.f35022a.add(interfaceC2571A);
        if (this.f35026e == null) {
            this.f35026e = looperMyLooper;
            this.f35023b.add(interfaceC2571A);
            k(k);
        } else if (j02 != null) {
            d(interfaceC2571A);
            interfaceC2571A.a(this, j02);
        }
    }

    public abstract void k(t6.K k);

    public final void l(J0 j02) {
        this.f35027f = j02;
        Iterator it = this.f35022a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2571A) it.next()).a(this, j02);
        }
    }

    public abstract void m(InterfaceC2610w interfaceC2610w);

    public final void n(InterfaceC2571A interfaceC2571A) {
        ArrayList arrayList = this.f35022a;
        arrayList.remove(interfaceC2571A);
        if (!arrayList.isEmpty()) {
            b(interfaceC2571A);
            return;
        }
        this.f35026e = null;
        this.f35027f = null;
        this.f35028g = null;
        this.f35023b.clear();
        o();
    }

    public abstract void o();

    public final void p(I5.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f35025d.f5394c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            I5.e eVar = (I5.e) it.next();
            if (eVar.f5391a == gVar) {
                copyOnWriteArrayList.remove(eVar);
            }
        }
    }

    public final void q(InterfaceC2574D interfaceC2574D) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f35024c.f5394c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C2573C c2573c = (C2573C) it.next();
            if (c2573c.f34875b == interfaceC2574D) {
                copyOnWriteArrayList.remove(c2573c);
            }
        }
    }

    public void c() {
    }

    public void e() {
    }
}
