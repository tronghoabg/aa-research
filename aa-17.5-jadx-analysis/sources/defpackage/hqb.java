package defpackage;

import android.graphics.drawable.Icon;

/* loaded from: classes2.dex */
public final class hqb {
    private final Icon a;

    public hqb(Icon icon) {
        this.a = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqb) && affa.f(this.a, ((hqb) obj).a);
    }

    public final int hashCode() {
        Icon icon = this.a;
        if (icon == null) {
            return 0;
        }
        return icon.hashCode();
    }

    public final String toString() {
        return "InsightExtendedDetails(trailingIcon=" + this.a + ")";
    }
}
