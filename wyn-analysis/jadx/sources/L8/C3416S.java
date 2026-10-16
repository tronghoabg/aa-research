package l8;

import java.util.Iterator;
import k8.InterfaceC3202k;

/* renamed from: l8.S, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3416S extends AbstractC3419a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40065c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f40066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40067e;

    public C3416S(Iterator it, InterfaceC3202k interfaceC3202k) {
        this.f40066d = it;
        this.f40067e = interfaceC3202k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l8.AbstractC3419a
    public final Object a() {
        Object next;
        Object next2;
        switch (this.f40065c) {
            case 0:
                do {
                    Iterator it = this.f40066d;
                    if (!it.hasNext()) {
                        this.f40079a = 3;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((InterfaceC3202k) this.f40067e).apply(next));
            default:
                do {
                    Iterator it2 = this.f40066d;
                    if (!it2.hasNext()) {
                        this.f40079a = 3;
                        break;
                    } else {
                        next2 = it2.next();
                    }
                } while (!((AbstractC3414P) ((n0) this.f40067e).f40147d).contains(next2));
        }
        return null;
    }

    public C3416S(n0 n0Var) {
        this.f40067e = n0Var;
        this.f40066d = ((AbstractC3414P) n0Var.f40146c).iterator();
    }
}
