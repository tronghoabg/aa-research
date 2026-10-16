package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ojo {
    public final android.content.Context a;
    public ojn b;
    public ojq c;
    private final java.util.concurrent.Executor d;

    public ojo(android.content.Context context, java.util.concurrent.Executor executor) {
        this.a = context;
        this.d = executor;
    }

    public static defpackage.ojo a() {
        return (defpackage.ojo) defpackage.mkp.a.i(defpackage.ojo.class);
    }

    public final ryb b() {
        return new ryb(this.a, this.d);
    }
}
