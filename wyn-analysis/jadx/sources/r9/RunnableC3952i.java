package r9;

import A7.C0295v;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import w9.AbstractC4397p;
import w9.InterfaceC4388g;

/* renamed from: r9.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3952i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3955l f44622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f44623c;

    public /* synthetic */ RunnableC3952i(C3955l c3955l, ArrayList arrayList, int i5) {
        this.f44621a = i5;
        this.f44622b = c3955l;
        this.f44623c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f44623c;
        C3955l c3955l = this.f44622b;
        final int i5 = 0;
        int i10 = 1;
        switch (this.f44621a) {
            case 0:
                Collection collectionR = c3955l.f44632b.r();
                q6.d dVar = s9.a.f45355f;
                final InterfaceC3949f interfaceC3949f = c3955l.f44632b;
                Objects.requireNonNull(interfaceC3949f);
                InterfaceC4388g interfaceC4388g = new InterfaceC4388g() { // from class: r9.j
                    @Override // w9.InterfaceC4388g
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                interfaceC3949f.e((s9.a) obj);
                                break;
                            default:
                                interfaceC3949f.c((s9.a) obj);
                                break;
                        }
                    }
                };
                final InterfaceC3949f interfaceC3949f2 = c3955l.f44632b;
                Objects.requireNonNull(interfaceC3949f2);
                final int i11 = 1;
                InterfaceC4388g interfaceC4388g2 = new InterfaceC4388g() { // from class: r9.j
                    @Override // w9.InterfaceC4388g
                    public final void accept(Object obj) {
                        switch (i11) {
                            case 0:
                                interfaceC3949f2.e((s9.a) obj);
                                break;
                            default:
                                interfaceC3949f2.c((s9.a) obj);
                                break;
                        }
                    }
                };
                m9.B b5 = AbstractC4397p.f47455a;
                ArrayList arrayList2 = new ArrayList(collectionR);
                Collections.sort(arrayList2, dVar);
                ArrayList arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3, dVar);
                AbstractC4397p.f(arrayList2.iterator(), arrayList3.iterator(), dVar, interfaceC4388g, interfaceC4388g2);
                break;
            default:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3956m c3956m = (C3956m) it.next();
                    int i12 = c3956m.f44643a;
                    c9.d dVar2 = c3956m.f44645c;
                    Y2.B b10 = c3955l.f44638h;
                    b10.getClass();
                    Iterator it2 = dVar2.iterator();
                    while (true) {
                        C0295v c0295v = (C0295v) it2;
                        if (((Iterator) c0295v.f1081b).hasNext()) {
                            C3946c c3946c = new C3946c((s9.h) c0295v.next(), i12);
                            b10.f16383b = ((c9.d) b10.f16383b).a(c3946c);
                            b10.f16384c = ((c9.d) b10.f16384c).a(c3946c);
                        } else {
                            c9.d dVar3 = c3956m.f44646d;
                            Iterator it3 = dVar3.iterator();
                            while (true) {
                                C0295v c0295v2 = (C0295v) it3;
                                if (((Iterator) c0295v2.f1081b).hasNext()) {
                                    c3955l.f44631a.D().g((s9.h) c0295v2.next());
                                } else {
                                    Iterator it4 = dVar3.iterator();
                                    while (true) {
                                        C0295v c0295v3 = (C0295v) it4;
                                        if (((Iterator) c0295v3.f1081b).hasNext()) {
                                            C3946c c3946c2 = new C3946c((s9.h) c0295v3.next(), i12);
                                            b10.f16383b = ((c9.d) b10.f16383b).c(c3946c2);
                                            b10.f16384c = ((c9.d) b10.f16384c).c(c3946c2);
                                        } else {
                                            if (!c3956m.f44644b) {
                                                SparseArray sparseArray = c3955l.k;
                                                S s10 = (S) sparseArray.get(i12);
                                                boolean z2 = s10 != null ? i10 : 0;
                                                Object[] objArr = new Object[i10];
                                                objArr[0] = Integer.valueOf(i12);
                                                A6.c.z(z2, "Can't set limbo-free snapshot version for unknown target: %s", objArr);
                                                s9.o oVar = s10.f44600e;
                                                S s11 = new S(s10.f44596a, s10.f44597b, s10.f44598c, s10.f44599d, oVar, oVar, s10.f44602g, s10.f44603h);
                                                sparseArray.put(i12, s11);
                                                if (C3955l.e(s10, s11, null)) {
                                                    c3955l.f44639i.b(s11);
                                                }
                                            }
                                            i10 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
