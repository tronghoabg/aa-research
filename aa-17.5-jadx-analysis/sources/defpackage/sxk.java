package defpackage;

/* loaded from: classes.dex */
public final class sxk extends Exception {
    public sxk(Throwable th) {
        super("ContentProvider query failed", th);
    }

    public sxk(String str) {
        super(str);
    }
}
