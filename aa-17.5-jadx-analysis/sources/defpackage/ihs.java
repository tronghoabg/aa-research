package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public class ihs extends ihv implements ihu, ihr {
    public List i = new ArrayList();
    public Set j = null;
    public String k = null;
    public Set l = null;
    public Set m = null;

    protected ihs() {
    }

    @Override // defpackage.ihu
    public void b(ihy ihyVar) throws SAXException {
        this.i.add(ihyVar);
    }

    @Override // defpackage.ihr
    public final String c() {
        return this.k;
    }

    @Override // defpackage.ihr
    public final Set d() {
        return this.j;
    }

    @Override // defpackage.ihr
    public final Set e() {
        return this.m;
    }

    @Override // defpackage.ihr
    public final Set f() {
        return this.l;
    }

    @Override // defpackage.ihr
    public final Set g() {
        return null;
    }

    @Override // defpackage.ihr
    public final void h(String str) {
        this.k = str;
    }

    @Override // defpackage.ihr
    public final void i(Set set) {
        this.j = set;
    }

    @Override // defpackage.ihr
    public final void j(Set set) {
        this.m = set;
    }

    @Override // defpackage.ihr
    public final void k(Set set) {
        this.l = set;
    }

    @Override // defpackage.ihu
    public final List n() {
        return this.i;
    }

    @Override // defpackage.ihr
    public final void l(Set set) {
    }
}
