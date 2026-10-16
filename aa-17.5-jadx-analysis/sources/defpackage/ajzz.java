package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ajzz implements Iterator {
    private final akam a;
    private akbh b;
    private akao c;
    private final akaf d;
    private ajzy e;

    public ajzz(akaf akafVar) {
        akaa akaaVar = akaa.a;
        this.e = null;
        this.b = null;
        this.c = null;
        this.d = akafVar;
        this.a = akaaVar;
    }

    private final void b() throws ajpr, NoSuchElementException {
        ajzy ajzyVarA;
        loop0: while (true) {
            akaf akafVar = this.d;
            if (!akafVar.hasNext() && this.c == null) {
                return;
            }
            akao akaoVar = this.c;
            if (akaoVar == null || akaoVar.b()) {
                this.c = null;
                this.b = null;
                while (true) {
                    if (!akafVar.hasNext()) {
                        break;
                    }
                    ajoy ajoyVarB = akafVar.b();
                    if (ajoyVarB instanceof akak) {
                        akak akakVar = (akak) ajoyVarB;
                        this.b = akakVar.a;
                        akao akaoVar2 = new akao(0, this.b.b);
                        this.c = akaoVar2;
                        akaoVar2.a(akakVar.b);
                        break;
                    }
                    String strC = ajoyVarB.c();
                    if (strC != null) {
                        akbh akbhVar = new akbh(strC.length());
                        this.b = akbhVar;
                        akbhVar.f(strC);
                        this.c = new akao(0, this.b.b);
                        break;
                    }
                }
            }
            if (this.c != null) {
                while (!this.c.b()) {
                    ajzyVarA = this.a.a(this.b, this.c);
                    if (!ajzyVarA.a.isEmpty() || ajzyVarA.b != null) {
                        break loop0;
                    }
                }
                if (this.c.b()) {
                    this.c = null;
                    this.b = null;
                }
            }
        }
        this.e = ajzyVarA;
    }

    public final ajzy a() throws ajpr, NoSuchElementException {
        if (this.e == null) {
            b();
        }
        ajzy ajzyVar = this.e;
        if (ajzyVar == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        this.e = null;
        return ajzyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws ajpr, NoSuchElementException {
        if (this.e == null) {
            b();
        }
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return a();
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
