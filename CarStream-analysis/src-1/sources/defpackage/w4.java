package defpackage;

/* loaded from: classes.dex */
public abstract class w4 {
    public static final z a = new z(2);

    public static byte[] a(String str) {
        try {
            return a.c(str.length(), str);
        } catch (Exception e) {
            h4 h4Var = new h4("exception decoding Hex string: " + e.getMessage(), 0);
            h4Var.b = e;
            throw h4Var;
        }
    }
}
