package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class O2 extends G2 {

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f38055d;

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38055d = j8 >= 0 ? new ArrayList((int) j8) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        List.EL.sort(this.f38055d, this.f37994b);
        long size = this.f38055d.size();
        InterfaceC3011r2 interfaceC3011r2 = this.f38260a;
        interfaceC3011r2.l(size);
        if (!this.f37995c) {
            ArrayList arrayList = this.f38055d;
            Objects.requireNonNull(interfaceC3011r2);
            Collection.EL.a(arrayList, new C2924a(1, interfaceC3011r2));
        } else {
            Iterator it = this.f38055d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC3011r2.n()) {
                    break;
                } else {
                    interfaceC3011r2.accept((InterfaceC3011r2) next);
                }
            }
        }
        interfaceC3011r2.k();
        this.f38055d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38055d.add(obj);
    }
}
