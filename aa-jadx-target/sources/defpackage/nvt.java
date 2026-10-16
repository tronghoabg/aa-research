package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nvt {
    public final android.content.ComponentName a;
    public final int b;

    public nvt(int i, defpackage.mqj mqjVar) {
        this(i, mqjVar != null ? mqjVar.a() : null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nvt)) {
            return false;
        }
        defpackage.nvt nvtVar = (defpackage.nvt) obj;
        return this.b == nvtVar.b && defpackage.afga.f(this.a, nvtVar.a);
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        return (this.b * 31) + (componentName == null ? 0 : componentName.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SuppressedNotificationData(type=");
        int i = this.b;
        if (i == 1) {
            str = "ALL";
        } else if (i != 2) {
            str = i != 3 ? "MEDIA" : "NAVIGATION";
        } else {
            str = "PHONE";
        }
        sb.append((java.lang.Object) str);
        sb.append(", componentName=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public nvt(int i, android.content.ComponentName componentName) {
        this.b = i;
        this.a = componentName;
    }
}
