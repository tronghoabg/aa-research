package defpackage;

/* loaded from: classes.dex */
public final class bwv implements buo {
    private final afdr a;
    private final cco b = new cco();

    public bwv(afdr afdrVar) {
        this.a = afdrVar;
    }

    @Override // defpackage.buo
    public final void a() {
        if (this.b.compareAndSet(1, 1)) {
            return;
        }
        this.a.invoke();
    }
}
