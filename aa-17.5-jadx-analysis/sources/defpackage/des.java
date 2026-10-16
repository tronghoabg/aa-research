package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class des implements Appendable {
    public final StringBuilder a;
    public final List b;
    public final List c;

    public des() {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final int a(dfm dfmVar) {
        der derVar = new der(dfmVar, this.a.length(), Integer.MIN_VALUE, "");
        this.b.add(derVar);
        this.c.add(derVar);
        return r5.size() - 1;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public final deu b() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        List list = this.c;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((der) list.get(i)).a(sb.length()));
        }
        return new deu(string, arrayList);
    }

    public final void c(String str, String str2, int i, int i2) {
        this.c.add(new der(new dfo(str2), i, i2, str));
    }

    public final void d(dfm dfmVar, int i, int i2) {
        this.c.add(new der(dfmVar, i, i2, ""));
    }

    public final void e(deu deuVar) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(deuVar.b);
        List list = deuVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                det detVar = (det) list.get(i);
                this.c.add(new der(detVar.a, detVar.b + length, detVar.c + length, detVar.d));
            }
        }
    }

    public final void f(String str) {
        this.a.append(str);
    }

    public final void g() {
        List list = this.b;
        if (list.isEmpty()) {
            dka.d("Nothing to pop.");
        }
        ((der) list.remove(list.size() - 1)).a = this.a.length();
    }

    public final void h(int i) {
        List list = this.b;
        if (i >= list.size()) {
            dka.d(i + " should be less than " + list.size());
        }
        while (list.size() - 1 >= i) {
            g();
        }
    }

    public final void i(CharSequence charSequence) {
        if (charSequence instanceof deu) {
            e((deu) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    public final void j(CharSequence charSequence, int i, int i2) {
        if (!(charSequence instanceof deu)) {
            this.a.append(charSequence, i, i2);
            return;
        }
        deu deuVar = (deu) charSequence;
        StringBuilder sb = this.a;
        String str = deuVar.b;
        int length = sb.length();
        sb.append((CharSequence) str, i, i2);
        List listA = dev.a(deuVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                det detVar = (det) listA.get(i3);
                this.c.add(new der(detVar.a, detVar.b + length, detVar.c + length, detVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        i(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        j(charSequence, i, i2);
        return this;
    }

    public des(deu deuVar) {
        this();
        e(deuVar);
    }
}
