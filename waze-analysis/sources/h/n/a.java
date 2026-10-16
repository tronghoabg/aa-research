package h.n;

import h.g.b.x;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f48220a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f48221b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile Charset f48222c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile Charset f48223d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        x.e(charsetForName, "forName(...)");
        f48221b = charsetForName;
        x.e(Charset.forName("UTF-16"), "forName(...)");
        x.e(Charset.forName("UTF-16BE"), "forName(...)");
        x.e(Charset.forName("UTF-16LE"), "forName(...)");
        x.e(Charset.forName("US-ASCII"), "forName(...)");
        x.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }

    private a() {
    }

    public final Charset a() {
        Charset charset = f48223d;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        x.e(charsetForName, "forName(...)");
        f48223d = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f48222c;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        x.e(charsetForName, "forName(...)");
        f48222c = charsetForName;
        return charsetForName;
    }
}
