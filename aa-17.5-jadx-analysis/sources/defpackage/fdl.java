package defpackage;

/* loaded from: classes.dex */
public class fdl implements AutoCloseable {
    public final fdj c;

    /* JADX WARN: Illegal instructions before constructor call */
    public fdl(fdl fdlVar) {
        fdj fdjVar = fdlVar.c;
        fcz.a.incrementAndGet();
        this(fdjVar);
        boolean z = this.c.e;
    }

    public fdl(fdj fdjVar) {
        this.c = fdjVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
