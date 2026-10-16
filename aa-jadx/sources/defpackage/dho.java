package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dho {
    public final int a;

    public dho(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dho) && this.a == ((defpackage.dho) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ")";
    }
}
