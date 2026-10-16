package okhttp3;

import androidx.autofill.HintConstants;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private String f56323a;

    /* renamed from: b, reason: collision with root package name */
    private String f56324b;

    /* renamed from: c, reason: collision with root package name */
    private String f56325c;

    /* renamed from: d, reason: collision with root package name */
    private final String f56326d = DomExceptionUtils.SEPARATOR;

    public final p a(String str) {
        h.g.b.x.f(str, "domain");
        String strD = kotlinx.b.d.aa.d(str);
        if (strD == null) {
            throw new IllegalArgumentException("unexpected domain: ".concat(str));
        }
        this.f56325c = strD;
        return this;
    }

    public final p b(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        if (!h.g.b.x.n(h.n.o.v(str).toString(), str)) {
            throw new IllegalArgumentException("name is not trimmed");
        }
        this.f56323a = str;
        return this;
    }

    public final p c(String str) {
        h.g.b.x.f(str, "value");
        if (!h.g.b.x.n(h.n.o.v(str).toString(), str)) {
            throw new IllegalArgumentException("value is not trimmed");
        }
        this.f56324b = str;
        return this;
    }

    public final q d() {
        String str = this.f56323a;
        if (str == null) {
            throw new NullPointerException("builder.name == null");
        }
        String str2 = this.f56324b;
        if (str2 == null) {
            throw new NullPointerException("builder.value == null");
        }
        String str3 = this.f56325c;
        if (str3 != null) {
            return new q(str, str2, 253402300799999L, str3, this.f56326d, false, false, false, false);
        }
        throw new NullPointerException("builder.domain == null");
    }
}
