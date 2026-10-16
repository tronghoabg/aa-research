package l8;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class m0 extends AbstractC3419a {

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f40142c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f40143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f40144e;

    public m0(n0 n0Var) {
        this.f40144e = n0Var;
        this.f40142c = n0Var.f40146c.iterator();
        this.f40143d = n0Var.f40147d.iterator();
    }

    @Override // l8.AbstractC3419a
    public final Object a() {
        Object next;
        Iterator it = this.f40142c;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.f40143d;
            if (!it2.hasNext()) {
                this.f40079a = 3;
                return null;
            }
            next = it2.next();
        } while (this.f40144e.f40146c.contains(next));
        return next;
    }
}
