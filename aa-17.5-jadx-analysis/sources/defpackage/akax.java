package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class akax implements Cloneable, akbc {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajpi) it.next()).a(ajphVar, akbaVar);
        }
    }

    @Override // defpackage.ajpl
    public final void b(ajpj ajpjVar, akba akbaVar) throws ajpd, IOException {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajpl) it.next()).b(ajpjVar, akbaVar);
        }
    }

    public final int c() {
        return this.a.size();
    }

    public final Object clone() throws CloneNotSupportedException {
        akax akaxVar = (akax) super.clone();
        List list = akaxVar.a;
        list.clear();
        list.addAll(this.a);
        List list2 = akaxVar.b;
        list2.clear();
        list2.addAll(this.b);
        return akaxVar;
    }

    public final int d() {
        return this.b.size();
    }

    public final ajpi e(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.a;
        if (i >= list.size()) {
            return null;
        }
        return (ajpi) list.get(i);
    }

    public final ajpl f(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.b;
        if (i >= list.size()) {
            return null;
        }
        return (ajpl) list.get(i);
    }

    public final void g(ajpi ajpiVar) {
        if (ajpiVar == null) {
            return;
        }
        this.a.add(ajpiVar);
    }

    public final void h(ajpl ajplVar) {
        if (ajplVar == null) {
            return;
        }
        this.b.add(ajplVar);
    }
}
