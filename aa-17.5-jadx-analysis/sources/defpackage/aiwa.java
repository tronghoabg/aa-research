package defpackage;

/* loaded from: classes3.dex */
public final class aiwa implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public aiwa(adjj adjjVar, Throwable th, int i) {
        this.a = i;
        this.c = adjjVar;
        this.b = th;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aitf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ?? r1 = this.c;
        if (i != 0) {
            ((adjj) r1).j((Throwable) this.b);
        } else {
            r1.f((aitu) this.b, afak.a);
        }
    }

    public aiwa(aitu aituVar, aitf aitfVar, int i) {
        this.a = i;
        this.b = aituVar;
        this.c = aitfVar;
    }
}
