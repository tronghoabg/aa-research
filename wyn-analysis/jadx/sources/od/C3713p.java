package od;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.AbstractC3537e;
import md.C3549q;
import me.C3558a;

/* renamed from: od.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3713p extends T3.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42055c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3713p(I0 i02, C3549q c3549q) {
        super(c3549q, 1);
        this.f42056d = i02;
    }

    @Override // T3.d
    public final void c() {
        List list;
        switch (this.f42055c) {
            case 0:
                C3558a c3558a = (C3558a) this.f42056d;
                Xd.b.c();
                try {
                    Xd.c cVar = ((C3716q) c3558a.f40738c).f42061b;
                    Xd.b.a();
                    Xd.b.f16226a.getClass();
                    if (((md.k0) c3558a.f40737b) == null) {
                        try {
                            ((AbstractC3537e) c3558a.f40736a).m();
                        } catch (Throwable th) {
                            md.k0 k0VarH = md.k0.f40675f.g(th).h("Failed to call onReady.");
                            c3558a.f40737b = k0VarH;
                            ((C3716q) c3558a.f40738c).f42069j.g(k0VarH);
                        }
                    }
                    Xd.b.f16226a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        Xd.b.f16226a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 1:
                ((I0) this.f42056d).h();
                return;
            default:
                E e7 = (E) this.f42056d;
                e7.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (e7) {
                        try {
                            if (e7.f41547f.isEmpty()) {
                                e7.f41547f = null;
                                e7.f41546e = true;
                                return;
                            } else {
                                list = e7.f41547f;
                                e7.f41547f = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3713p(I0 i02, E e7) {
        super(i02.f41591c, 1);
        this.f42056d = e7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3713p(C3558a c3558a) {
        super(((C3716q) c3558a.f40738c).f42065f, 1);
        this.f42056d = c3558a;
    }
}
