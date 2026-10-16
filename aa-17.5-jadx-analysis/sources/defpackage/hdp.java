package defpackage;

/* loaded from: classes2.dex */
public final class hdp extends hdy {
    public final String a;

    public hdp(String str) {
        super(false);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdp) && affa.f(this.a, ((hdp) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "RowTrailingBadgeUiModel(badgeText=" + this.a + ")";
    }

    public hdp() {
        this(null);
    }
}
