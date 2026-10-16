package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ndk extends defpackage.ndi {
    private final android.content.ComponentName a;

    public ndk(android.content.ComponentName componentName) {
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
        return (obj instanceof defpackage.ndk) && defpackage.afga.f(this.a, ((defpackage.ndk) obj).a);
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        if (componentName == null) {
            return 0;
        }
        return componentName.hashCode();
    }

    public final java.lang.String toString() {
        return "WaitingForSuggestionsBackground(navComponent=" + this.a + ")";
    }
}
