package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class afhn extends defpackage.afhs {
    @Override // defpackage.afhs
    public final double a() {
        return e().nextDouble();
    }

    @Override // defpackage.afhs
    public final int b() {
        return e().nextInt();
    }

    @Override // defpackage.afhs
    public final int c(int i) {
        return e().nextInt(i);
    }

    @Override // defpackage.afhs
    public final long d() {
        return e().nextLong();
    }

    public abstract java.util.Random e();
}
