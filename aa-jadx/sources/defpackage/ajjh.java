package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ajjh implements java.io.Closeable {
    public static final defpackage.ajjh c;

    static {
        defpackage.ajob ajobVar = defpackage.ajob.a;
        defpackage.ajny ajnyVar = new defpackage.ajny();
        ajnyVar.K(ajobVar);
        c = new defpackage.ajjg(ajobVar.c(), ajnyVar);
    }

    public abstract long a();

    public abstract defpackage.ajiy b();

    public abstract defpackage.ajoa c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        defpackage.ajoa ajoaVarC = c();
        int i = defpackage.ajjq.a;
        defpackage.a.d(ajoaVarC);
    }
}
