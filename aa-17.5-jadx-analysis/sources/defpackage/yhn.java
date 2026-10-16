package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class yhn extends yaq {
    final /* synthetic */ Iterator a;
    final /* synthetic */ xxj b;

    public yhn(Iterator it, xxj xxjVar) {
        this.a = it;
        this.b = xxjVar;
    }

    @Override // defpackage.yaq
    protected final Object a() {
        xxj xxjVar;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            xxjVar = this.b;
            next = it.next();
        } while (!xxjVar.a(next));
        return next;
    }
}
