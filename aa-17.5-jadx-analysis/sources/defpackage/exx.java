package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* loaded from: classes2.dex */
final class exx {
    final int a;
    final int b;
    final String c;

    public exx(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.E;
        this.b = preference.F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof exx)) {
            return false;
        }
        exx exxVar = (exx) obj;
        return this.a == exxVar.a && this.b == exxVar.b && TextUtils.equals(this.c, exxVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
