package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class wag {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("[^A-Za-z0-9]");
    protected final ajht b;

    protected wag(ajht ajhtVar) {
        this.b = ajhtVar;
    }

    protected abstract void a(defpackage.rkq rkqVar);

    protected java.lang.String b() {
        ajht ajhtVar = this.b;
        return (ajhtVar.b & 4) != 0 ? ajhtVar.e : ajhtVar.d;
    }
}
