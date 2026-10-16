package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bew {
    public final defpackage.beg a;
    public final defpackage.blw b;
    public final defpackage.dkd c;
    public final boolean d = true;
    public final boolean e;
    public final defpackage.djv f;
    public final defpackage.bfo g;
    public final defpackage.affc h;
    public final int i;
    public final defpackage.nub j;
    public final defpackage.nub k;
    public final defpackage.asq l;

    public bew(defpackage.beg begVar, defpackage.blw blwVar, defpackage.dkd dkdVar, boolean z, defpackage.nub nubVar, defpackage.djv djvVar, defpackage.bfo bfoVar, defpackage.nub nubVar2, defpackage.asq asqVar, defpackage.affc affcVar, int i) {
        this.a = begVar;
        this.b = blwVar;
        this.c = dkdVar;
        this.e = z;
        this.j = nubVar;
        this.f = djvVar;
        this.g = bfoVar;
        this.k = nubVar2;
        this.l = asqVar;
        this.h = affcVar;
        this.i = i;
    }

    public final void a(defpackage.djg djgVar) {
        java.util.List listSingletonList = java.util.Collections.singletonList(djgVar);
        listSingletonList.getClass();
        b(listSingletonList);
    }

    public final void b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add(0, new defpackage.dji());
        this.h.invoke(this.a.s.b(arrayList));
    }
}
