package defpackage;

/* loaded from: classes.dex */
public final class dhh {
    public final int a;

    public dhh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhh) && this.a == ((dhh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ")";
    }
}
