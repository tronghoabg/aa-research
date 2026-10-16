package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nqt {
    public final boolean a;
    public final android.content.ComponentName b;
    public final int c;

    public nqt(boolean z, int i, android.content.ComponentName componentName) {
        if (i == 0) {
            throw null;
        }
        this.a = z;
        this.c = i;
        this.b = componentName;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nqt)) {
            return false;
        }
        defpackage.nqt nqtVar = (defpackage.nqt) obj;
        return this.a == nqtVar.a && this.c == nqtVar.c && defpackage.afga.f(this.b, nqtVar.b);
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.b;
        return (((defpackage.a.e(this.a) * 31) + this.c) * 31) + (componentName == null ? 0 : componentName.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImmersiveState(useFullScreenImmersive=");
        sb.append(this.a);
        sb.append(", immersiveStateReason=");
        int i = this.c;
        if (i == 1) {
            str = "REQUESTED";
        } else if (i != 2) {
            str = i != 3 ? "NONE" : "UI_STATE";
        } else {
            str = "DISPLAY_STATE";
        }
        sb.append((java.lang.Object) str);
        sb.append(", impactfulComponent=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ nqt(boolean z, int i, int i2) {
        this(z, (i2 & 2) != 0 ? 4 : i, (android.content.ComponentName) null);
    }
}
