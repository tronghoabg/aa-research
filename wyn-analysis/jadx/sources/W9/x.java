package W9;

import A7.AbstractC0279p0;
import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15402d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f15403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15405c;

    public x(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f15402d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f15403a = strSubstring;
        this.f15404b = str;
        this.f15405c = N0.a.g(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f15403a.equals(xVar.f15403a) && this.f15404b.equals(xVar.f15404b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15404b, this.f15403a});
    }
}
