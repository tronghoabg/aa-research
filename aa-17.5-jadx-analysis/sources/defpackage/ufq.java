package defpackage;

/* loaded from: classes3.dex */
public final class ufq {
    public long a = 0;
    public ujk b;

    public ufq(ujk ujkVar) {
        this.b = ujkVar;
    }

    public final synchronized void a() {
        this.a++;
    }

    public final synchronized void b(ujk ujkVar) {
        this.b = ujkVar;
        a();
    }
}
