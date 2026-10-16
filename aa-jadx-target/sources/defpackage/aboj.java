package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aboj {
    final defpackage.abpy a;
    public final java.lang.Object b;
    public final defpackage.abpy c;
    public final defpackage.abow d;

    public aboj(defpackage.abpy abpyVar, java.lang.Object obj, defpackage.abpy abpyVar2, defpackage.abow abowVar) {
        if (abpyVar == null) {
            throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (abowVar.c == defpackage.abrf.MESSAGE && abpyVar2 == null) {
            throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = abpyVar;
        this.b = obj;
        this.c = abpyVar2;
        this.d = abowVar;
    }

    public final int a() {
        return this.d.b;
    }

    public final defpackage.abrf b() {
        return this.d.c;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        defpackage.abow abowVar = this.d;
        if (!abowVar.d) {
            return d(obj);
        }
        if (abowVar.a() != defpackage.abrg.h) {
            return obj;
        }
        defpackage.abqh abqhVar = new defpackage.abqh(defpackage.abqh.a, 0, true);
        java.util.List list = (java.util.List) obj;
        abqhVar.e(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            abqhVar.add(d(it.next()));
        }
        abqhVar.b();
        return abqhVar;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        defpackage.abow abowVar = this.d;
        if (abowVar.a() != defpackage.abrg.h) {
            return obj;
        }
        return abowVar.a.a(((java.lang.Integer) obj).intValue());
    }

    public final java.lang.Object e(java.lang.Object obj) {
        return this.d.a() == defpackage.abrg.h ? java.lang.Integer.valueOf(((defpackage.abpb) obj).a()) : obj;
    }

    public final boolean f() {
        return this.d.d;
    }

    public aboj() {
        throw null;
    }
}
