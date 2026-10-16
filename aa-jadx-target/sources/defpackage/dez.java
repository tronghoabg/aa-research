package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dez implements java.lang.Appendable {
    public final java.lang.StringBuilder a;
    public final java.util.List b;
    public final java.util.List c;

    public dez() {
        this.a = new java.lang.StringBuilder(16);
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        new java.util.ArrayList();
    }

    public final int a(defpackage.dft dftVar) {
        defpackage.dey deyVar = new defpackage.dey(dftVar, this.a.length(), Integer.MIN_VALUE, "");
        java.util.List list = this.b;
        list.add(deyVar);
        this.c.add(deyVar);
        return list.size() - 1;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public final defpackage.dfb b() {
        java.lang.StringBuilder sb = this.a;
        java.lang.String string = sb.toString();
        java.util.List list = this.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((defpackage.dey) list.get(i)).a(sb.length()));
        }
        return new defpackage.dfb(string, arrayList);
    }

    public final void c(java.lang.String str, java.lang.String str2, int i, int i2) {
        this.c.add(new defpackage.dey(new defpackage.dfv(str2), i, i2, str));
    }

    public final void d(defpackage.dft dftVar, int i, int i2) {
        this.c.add(new defpackage.dey(dftVar, i, i2, ""));
    }

    public final void e(defpackage.dfb dfbVar) {
        java.lang.StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(dfbVar.b);
        java.util.List list = dfbVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.dfa dfaVar = (defpackage.dfa) list.get(i);
                this.c.add(new defpackage.dey(dfaVar.a, dfaVar.b + length, dfaVar.c + length, dfaVar.d));
            }
        }
    }

    public final void f(java.lang.String str) {
        this.a.append(str);
    }

    public final void g() {
        java.util.List list = this.b;
        if (list.isEmpty()) {
            defpackage.dki.d("Nothing to pop.");
        }
        ((defpackage.dey) list.remove(list.size() - 1)).a = this.a.length();
    }

    public final void h(int i) {
        java.util.List list = this.b;
        if (i >= list.size()) {
            defpackage.dki.d(i + " should be less than " + list.size());
        }
        while (list.size() - 1 >= i) {
            g();
        }
    }

    public final void i(java.lang.CharSequence charSequence) {
        if (charSequence instanceof defpackage.dfb) {
            e((defpackage.dfb) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    public final void j(java.lang.CharSequence charSequence, int i, int i2) {
        if (!(charSequence instanceof defpackage.dfb)) {
            this.a.append(charSequence, i, i2);
            return;
        }
        defpackage.dfb dfbVar = (defpackage.dfb) charSequence;
        java.lang.StringBuilder sb = this.a;
        java.lang.String str = dfbVar.b;
        int length = sb.length();
        sb.append((java.lang.CharSequence) str, i, i2);
        java.util.List listA = defpackage.dfc.a(dfbVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.dfa dfaVar = (defpackage.dfa) listA.get(i3);
                this.c.add(new defpackage.dey(dfaVar.a, dfaVar.b + length, dfaVar.c + length, dfaVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) {
        i(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) {
        j(charSequence, i, i2);
        return this;
    }

    public dez(defpackage.dfb dfbVar) {
        this();
        e(dfbVar);
    }
}
