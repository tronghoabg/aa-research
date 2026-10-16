package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class pzi {
    private static final Pattern c = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)([^\\+]*)?(?:\\+.*)?$");
    public final pzk a;
    public final String b;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public pzi(int i, int i2, int i3, String str, pzk pzkVar, String str2) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.a = pzkVar;
        this.b = str2;
    }

    public static pzi a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        woy.ad(matcher.matches(), "Wrong format of version string: %s. Expected the string contains at least three number parts '<major>.<minor>.<point>' with optional '<suffix>' part. Presence of '+<metadata>' is allowed but ignored.", str);
        int i = Integer.parseInt(woy.al(matcher.group(1)));
        int i2 = Integer.parseInt(woy.al(matcher.group(2)));
        int i3 = Integer.parseInt(woy.al(matcher.group(3)));
        String strAl = woy.al(matcher.group(4));
        pzk pzkVar = new pzk(i, i2, i3);
        return new pzi(i, i2, i3, strAl, pzkVar, woy.am(strAl) ? pzkVar.toString() : pzkVar.toString().concat(strAl));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pzi) {
            pzi pziVar = (pzi) obj;
            if (this.d == pziVar.d && this.e == pziVar.e && this.f == pziVar.f && this.g.equals(pziVar.g) && this.a.equals(pziVar.a) && this.b.equals(pziVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.d ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.a.hashCode();
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.a.toString() + ", " + this.b + "}";
    }

    public pzi() {
        throw null;
    }
}
