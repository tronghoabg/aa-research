package defpackage;

/* loaded from: classes3.dex */
public final class syr {
    public static final syr a = new syr();
    private static Integer b;
    private static wyd c;

    public final synchronized aezu a() {
        return new aezu(c, b);
    }

    public final synchronized void b() {
        c = null;
        b = null;
    }

    public final synchronized void c(wyd wydVar, int i) {
        c = wydVar;
        b = Integer.valueOf(i);
    }
}
