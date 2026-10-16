package Bf;

import ef.C2527k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class b implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public int f1674a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1675b;

    /* renamed from: c, reason: collision with root package name */
    public int f1676c;

    /* renamed from: d, reason: collision with root package name */
    public zf.g f1677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Af.j f1678e;

    public b(Af.j jVar) {
        this.f1678e = jVar;
        jVar.getClass();
        int iS = android.support.v4.media.session.b.S(0, 0, ((CharSequence) jVar.f1311b).length());
        this.f1675b = iS;
        this.f1676c = iS;
    }

    public final void a() {
        C2527k c2527k;
        int i5 = this.f1676c;
        if (i5 < 0) {
            this.f1674a = 0;
            this.f1677d = null;
            return;
        }
        Af.j jVar = this.f1678e;
        jVar.getClass();
        CharSequence charSequence = (CharSequence) jVar.f1311b;
        if (i5 <= charSequence.length() && (c2527k = (C2527k) ((tf.p) jVar.f1312c).invoke(charSequence, Integer.valueOf(this.f1676c))) != null) {
            int iIntValue = ((Number) c2527k.f34671a).intValue();
            int iIntValue2 = ((Number) c2527k.f34672b).intValue();
            this.f1677d = android.support.v4.media.session.b.u0(this.f1675b, iIntValue);
            int i10 = iIntValue + iIntValue2;
            this.f1675b = i10;
            this.f1676c = i10 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f1677d = new zf.g(this.f1675b, k.s0(charSequence), 1);
            this.f1676c = -1;
        }
        this.f1674a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1674a == -1) {
            a();
        }
        return this.f1674a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1674a == -1) {
            a();
        }
        if (this.f1674a == 0) {
            throw new NoSuchElementException();
        }
        zf.g gVar = this.f1677d;
        AbstractC3340k.c(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f1677d = null;
        this.f1674a = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
