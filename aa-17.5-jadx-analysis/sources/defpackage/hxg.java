package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class hxg {
    final Object a;
    public List b;
    hxg c;
    hxg d;

    public hxg(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }

    hxg() {
        throw null;
    }
}
