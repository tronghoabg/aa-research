package defpackage;

import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes.dex */
public final class dio {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List d = null;
    public final int c = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dio)) {
            return false;
        }
        dio dioVar = (dio) obj;
        if (!affa.f(this.a, dioVar.a) || !affa.f(this.b, dioVar.b)) {
            return false;
        }
        List list = dioVar.d;
        if (!affa.f(null, null)) {
            return false;
        }
        int i = dioVar.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
