package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yfl extends yfe {
    public yfl(int i) {
        super(i);
    }

    @Override // defpackage.yfe, defpackage.yff
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    @Override // defpackage.yff
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final yfq g() {
        this.c = true;
        return yfq.l(this.a, this.b);
    }

    public final void i(Object obj) {
        super.b(obj);
    }

    public final void j(Object... objArr) {
        super.d(objArr);
    }

    public final void k(Iterable iterable) {
        super.e(iterable);
    }

    public final void l(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public yfl() {
        throw null;
    }
}
