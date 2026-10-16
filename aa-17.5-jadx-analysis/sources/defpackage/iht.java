package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public class iht extends ihv implements ihr {
    public Set h = null;
    public String i = null;
    public Set j = null;
    public Set k = null;
    public Set l = null;

    protected iht() {
    }

    @Override // defpackage.ihr
    public final String c() {
        return this.i;
    }

    @Override // defpackage.ihr
    public final Set d() {
        return this.h;
    }

    @Override // defpackage.ihr
    public final Set e() {
        return this.l;
    }

    @Override // defpackage.ihr
    public final Set f() {
        return this.k;
    }

    @Override // defpackage.ihr
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.ihr
    public final void h(String str) {
        this.i = str;
    }

    @Override // defpackage.ihr
    public final void i(Set set) {
        this.h = set;
    }

    @Override // defpackage.ihr
    public final void j(Set set) {
        this.l = set;
    }

    @Override // defpackage.ihr
    public final void k(Set set) {
        this.k = set;
    }

    @Override // defpackage.ihr
    public final void l(Set set) {
        this.j = set;
    }
}
