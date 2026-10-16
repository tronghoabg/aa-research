package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ymq extends yhe {
    final Object b;
    final Object c;
    final Object d;

    public ymq(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        this.b = obj;
        obj2.getClass();
        this.c = obj2;
        obj3.getClass();
        this.d = obj3;
    }

    @Override // defpackage.ybz
    public final /* bridge */ /* synthetic */ Collection b() {
        return new ymp(this.d);
    }

    @Override // defpackage.ybz
    public final /* bridge */ /* synthetic */ Set d() {
        return new ymp(o(this.b, this.c, this.d));
    }

    @Override // defpackage.ynj
    public final int f() {
        return 1;
    }

    @Override // defpackage.yhe
    public final yfy g() {
        return yfy.k(this.c, yfy.k(this.b, this.d));
    }

    @Override // defpackage.yhe, defpackage.ynj
    /* renamed from: h */
    public final yfy k() {
        return yfy.k(this.b, yfy.k(this.c, this.d));
    }

    @Override // defpackage.yhe
    Object writeReplace() {
        return yhd.a(this, new int[]{0}, new int[]{0});
    }
}
