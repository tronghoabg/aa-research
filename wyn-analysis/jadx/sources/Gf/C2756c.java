package gf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* renamed from: gf.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2756c extends AbstractC2758e implements Iterator, InterfaceC4291a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f35886e;

    public C2756c(C2759f map, int i5) {
        this.f35886e = i5;
        AbstractC3340k.e(map, "map");
        this.f35893d = map;
        this.f35891b = -1;
        this.f35892c = map.f35902h;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35886e) {
            case 0:
                c();
                int i5 = this.f35890a;
                C2759f c2759f = (C2759f) this.f35893d;
                if (i5 >= c2759f.f35900f) {
                    throw new NoSuchElementException();
                }
                this.f35890a = i5 + 1;
                this.f35891b = i5;
                C2757d c2757d = new C2757d(c2759f, i5);
                f();
                return c2757d;
            case 1:
                c();
                int i10 = this.f35890a;
                C2759f c2759f2 = (C2759f) this.f35893d;
                if (i10 >= c2759f2.f35900f) {
                    throw new NoSuchElementException();
                }
                this.f35890a = i10 + 1;
                this.f35891b = i10;
                Object obj = c2759f2.f35895a[i10];
                f();
                return obj;
            default:
                c();
                int i11 = this.f35890a;
                C2759f c2759f3 = (C2759f) this.f35893d;
                if (i11 >= c2759f3.f35900f) {
                    throw new NoSuchElementException();
                }
                this.f35890a = i11 + 1;
                this.f35891b = i11;
                Object[] objArr = c2759f3.f35896b;
                AbstractC3340k.b(objArr);
                Object obj2 = objArr[this.f35891b];
                f();
                return obj2;
        }
    }
}
