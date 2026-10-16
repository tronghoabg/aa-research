package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ndg extends defpackage.ndi {
    private final android.content.ComponentName a;

    public ndg(android.content.ComponentName componentName) {
        this.a = componentName;
    }

    @Override // defpackage.ndl
    public final android.content.ComponentName a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ndg) && defpackage.afga.f(this.a, ((defpackage.ndg) obj).a);
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        if (componentName == null) {
            return 0;
        }
        return componentName.hashCode();
    }

    public final java.lang.String toString() {
        return "DismissedOrIgnoredByUser(navComponent=" + this.a + ")";
    }
}
