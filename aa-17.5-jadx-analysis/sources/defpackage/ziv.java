package defpackage;

/* loaded from: classes3.dex */
public final class ziv {
    public static final /* synthetic */ int c = 0;
    public final yfq a;
    public final yfq b;
    private final String d;

    static {
        new ziv(new ajds("DEFAULT"));
    }

    public ziv(ajds ajdsVar) {
        this.d = (String) ajdsVar.b;
        this.a = ((yfl) ajdsVar.a).g();
        this.b = ((yfl) ajdsVar.c).g();
    }

    public final String toString() {
        return this.d + "@" + Integer.toHexString(hashCode());
    }
}
