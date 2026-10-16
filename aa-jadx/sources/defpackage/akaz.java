package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akaz implements java.util.Iterator {
    private final defpackage.akbm a;
    private defpackage.akch b;
    private defpackage.akbo c;
    private final defpackage.akbf d;
    private defpackage.akay e;

    public akaz(defpackage.akbf akbfVar) {
        defpackage.akba akbaVar = defpackage.akba.a;
        this.e = null;
        this.b = null;
        this.c = null;
        this.d = akbfVar;
        this.a = akbaVar;
    }

    private final void b() {
        while (true) {
            defpackage.akbf akbfVar = this.d;
            if (!akbfVar.hasNext() && this.c == null) {
                return;
            }
            defpackage.akbo akboVar = this.c;
            if (akboVar == null || akboVar.b()) {
                this.c = null;
                this.b = null;
                while (akbfVar.hasNext()) {
                    defpackage.ajpy ajpyVarB = akbfVar.b();
                    if (ajpyVarB instanceof defpackage.akbk) {
                        defpackage.akbk akbkVar = (defpackage.akbk) ajpyVarB;
                        this.b = akbkVar.a;
                        defpackage.akbo akboVar2 = new defpackage.akbo(0, this.b.b);
                        this.c = akboVar2;
                        akboVar2.a(akbkVar.b);
                        break;
                    }
                    java.lang.String strC = ajpyVarB.c();
                    if (strC != null) {
                        defpackage.akch akchVar = new defpackage.akch(strC.length());
                        this.b = akchVar;
                        akchVar.f(strC);
                        this.c = new defpackage.akbo(0, this.b.b);
                        break;
                    }
                }
            }
            if (this.c != null) {
                while (!this.c.b()) {
                    defpackage.akay akayVarA = this.a.a(this.b, this.c);
                    if (!akayVarA.a.isEmpty() || akayVarA.b != null) {
                        this.e = akayVarA;
                        return;
                    }
                }
                if (this.c.b()) {
                    this.c = null;
                    this.b = null;
                }
            }
        }
    }

    public final defpackage.akay a() throws java.util.NoSuchElementException {
        if (this.e == null) {
            b();
        }
        defpackage.akay akayVar = this.e;
        if (akayVar == null) {
            throw new java.util.NoSuchElementException("No more header elements available");
        }
        this.e = null;
        return akayVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == null) {
            b();
        }
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws java.util.NoSuchElementException {
        return a();
    }

    @Override // java.util.Iterator
    public final void remove() throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }
}
