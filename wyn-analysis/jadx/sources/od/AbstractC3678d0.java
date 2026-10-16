package od;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.nio.charset.Charset;
import java.util.Locale;
import k8.AbstractC3198g;

/* renamed from: od.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3678d0 extends AbstractC3668a {

    /* renamed from: u, reason: collision with root package name */
    public static final md.Z f41935u = md.G.a(Header.RESPONSE_STATUS_UTF8, new Y1(12));

    /* renamed from: q, reason: collision with root package name */
    public md.k0 f41936q;

    /* renamed from: r, reason: collision with root package name */
    public md.b0 f41937r;

    /* renamed from: s, reason: collision with root package name */
    public Charset f41938s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f41939t;

    public static Charset i(md.b0 b0Var) {
        String str = (String) b0Var.c(AbstractC3669a0.f41893i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC3198g.f39301c;
    }

    public static md.k0 j(md.b0 b0Var) {
        char cCharAt;
        Integer num = (Integer) b0Var.c(f41935u);
        if (num == null) {
            return md.k0.f40681m.h("Missing HTTP status code");
        }
        String str = (String) b0Var.c(AbstractC3669a0.f41893i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return AbstractC3669a0.g(num.intValue()).b("invalid content-type: " + str);
    }
}
