package okhttp3;

import com.waze.strings.DisplayStrings;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56327a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f56328b = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f56329c = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f56330d = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f56331e = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: f, reason: collision with root package name */
    private final String f56332f;

    /* renamed from: g, reason: collision with root package name */
    private final String f56333g;

    /* renamed from: h, reason: collision with root package name */
    private final long f56334h;

    /* renamed from: i, reason: collision with root package name */
    private final String f56335i;

    /* renamed from: j, reason: collision with root package name */
    private final String f56336j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f56337k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f56338l;
    private final boolean m;
    private final boolean n;

    public /* synthetic */ q(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56332f = str;
        this.f56333g = str2;
        this.f56334h = j2;
        this.f56335i = str3;
        this.f56336j = str4;
        this.f56337k = z;
        this.f56338l = z2;
        this.m = z3;
        this.n = z4;
    }

    public final String a() {
        return this.f56332f;
    }

    public final String b(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56332f);
        sb.append('=');
        sb.append(this.f56333g);
        if (this.m) {
            long j2 = this.f56334h;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(okhttp3.internal.d.d.a(new Date(j2)));
            }
        }
        if (!this.n) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f56335i);
        }
        sb.append("; path=");
        sb.append(this.f56336j);
        if (this.f56337k) {
            sb.append("; secure");
        }
        if (this.f56338l) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        h.g.b.x.e(string, "toString(...)");
        return string;
    }

    public final String c() {
        return this.f56333g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.g.b.x.n(qVar.f56332f, this.f56332f) && h.g.b.x.n(qVar.f56333g, this.f56333g) && qVar.f56334h == this.f56334h && h.g.b.x.n(qVar.f56335i, this.f56335i) && h.g.b.x.n(qVar.f56336j, this.f56336j) && qVar.f56337k == this.f56337k && qVar.f56338l == this.f56338l && qVar.m == this.m && qVar.n == this.n;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f56332f.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.f56333g.hashCode()) * 31) + a.a.b(this.f56334h)) * 31) + this.f56335i.hashCode()) * 31) + this.f56336j.hashCode();
        boolean z = this.n;
        boolean z2 = this.m;
        return (((((((iHashCode * 31) + a.a.a(this.f56337k)) * 31) + a.a.a(this.f56338l)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return b(false);
    }
}
