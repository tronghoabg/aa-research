package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class hzj implements huv, huu {
    private final List a;
    private final dzk b;
    private int c;
    private hsh d;
    private huu e;
    private List f;
    private boolean g;

    public hzj(List list, dzk dzkVar) {
        this.b = dzkVar;
        fxy.i(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            d(this.d, this.e);
        } else {
            a.al(this.f, "Argument must not be null");
            this.e.g(new hwt("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.huv
    public final Class a() {
        return ((huv) this.a.get(0)).a();
    }

    @Override // defpackage.huv
    public final void b() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((huv) it.next()).b();
        }
    }

    @Override // defpackage.huv
    public final void c() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((huv) it.next()).c();
        }
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        this.d = hshVar;
        this.e = huuVar;
        this.f = (List) this.b.a();
        ((huv) this.a.get(this.c)).d(hshVar, this);
        if (this.g) {
            b();
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return ((huv) this.a.get(0)).e();
    }

    @Override // defpackage.huu
    public final void f(Object obj) {
        if (obj != null) {
            this.e.f(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.huu
    public final void g(Exception exc) {
        List list = this.f;
        a.al(list, "Argument must not be null");
        list.add(exc);
        h();
    }
}
