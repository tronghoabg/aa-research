package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ajhn {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String e;
    public final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final String n;

    public ajhn(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajhn)) {
            return false;
        }
        ajhn ajhnVar = (ajhn) obj;
        return affa.f(ajhnVar.e, this.e) && affa.f(ajhnVar.f, this.f) && ajhnVar.g == this.g && affa.f(ajhnVar.h, this.h) && affa.f(ajhnVar.i, this.i) && ajhnVar.j == this.j && ajhnVar.k == this.k && ajhnVar.l == this.l && ajhnVar.m == this.m && affa.f(ajhnVar.n, this.n);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.e.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + a.g(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        String str = this.n;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        boolean z = this.m;
        return (((((((((iHashCode * 31) + a.f(this.j)) * 31) + a.f(this.k)) * 31) + a.f(this.l)) * 31) + a.f(z)) * 31) + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            long j = this.g;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) ajka.a.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        String str2 = this.n;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
