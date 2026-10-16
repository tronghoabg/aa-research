package N;

import Ef.C0502n;
import java.util.ArrayList;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import lf.AbstractC3464c;

/* renamed from: N.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724g implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final A0.p f7767a;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f7769c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7768b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7770d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f7771e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final C0720e f7772f = new C0720e(0);

    public C0724g(A0.p pVar) {
        this.f7767a = pVar;
    }

    public static final void a(C0724g c0724g, Throwable th) {
        synchronized (c0724g.f7768b) {
            try {
                if (c0724g.f7769c != null) {
                    return;
                }
                c0724g.f7769c = th;
                ArrayList arrayList = c0724g.f7770d;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((C0722f) arrayList.get(i5)).f7765b.resumeWith(Fe.e.z(th));
                }
                c0724g.f7770d.clear();
                c0724g.f7772f.set(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j8) {
        Object objZ;
        synchronized (this.f7768b) {
            try {
                ArrayList arrayList = this.f7770d;
                this.f7770d = this.f7771e;
                this.f7771e = arrayList;
                this.f7772f.set(0);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0722f c0722f = (C0722f) arrayList.get(i5);
                    c0722f.getClass();
                    try {
                        objZ = c0722f.f7764a.invoke(Long.valueOf(j8));
                    } catch (Throwable th) {
                        objZ = Fe.e.z(th);
                    }
                    c0722f.f7765b.resumeWith(objZ);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // N.Q
    public final Object d(tf.l lVar, AbstractC3464c abstractC3464c) {
        C0502n c0502n = new C0502n(1, A6.h.A(abstractC3464c));
        c0502n.t();
        C0722f c0722f = new C0722f(c0502n, lVar);
        synchronized (this.f7768b) {
            Throwable th = this.f7769c;
            if (th != null) {
                c0502n.resumeWith(Fe.e.z(th));
            } else {
                boolean zIsEmpty = this.f7770d.isEmpty();
                this.f7770d.add(c0722f);
                if (zIsEmpty) {
                    this.f7772f.set(1);
                }
                c0502n.v(new A.W(12, this, c0722f));
                if (zIsEmpty) {
                    try {
                        this.f7767a.invoke();
                    } catch (Throwable th2) {
                        a(this, th2);
                    }
                }
            }
        }
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return P.f7726b;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }
}
