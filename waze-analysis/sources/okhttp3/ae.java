package okhttp3;

import androidx.autofill.HintConstants;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55830a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f55831b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f55832c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: d, reason: collision with root package name */
    private final String f55833d;

    /* renamed from: e, reason: collision with root package name */
    private final String f55834e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f55835f;

    public /* synthetic */ ae(String str, String str2, String[] strArr) {
        this.f55833d = str;
        this.f55834e = str2;
        this.f55835f = strArr;
    }

    public final String a() {
        return this.f55834e;
    }

    public final String d() {
        h.g.b.x.f("charset", HintConstants.AUTOFILL_HINT_NAME);
        String[] strArr = this.f55835f;
        int i2 = 0;
        int iD = h.e.b.d(0, strArr.length - 1, 2);
        if (iD < 0) {
            return null;
        }
        while (!h.n.o.m(strArr[i2], "charset", true)) {
            if (i2 == iD) {
                return null;
            }
            i2 += 2;
        }
        return strArr[i2 + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ae) && h.g.b.x.n(((ae) obj).f55833d, this.f55833d);
    }

    public final int hashCode() {
        return this.f55833d.hashCode();
    }

    public final String toString() {
        return this.f55833d;
    }
}
