package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sow {
    public final java.lang.String a;
    public final java.lang.String b;
    public final android.content.ComponentName c;
    public final int d;
    public final boolean e;
    public final android.os.UserHandle f;

    public sow(java.lang.String str, int i, boolean z) {
        defpackage.sqs.ax(str);
        this.a = str;
        defpackage.sqs.ax("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = i;
        this.e = z;
        this.f = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.sow)) {
            return false;
        }
        defpackage.sow sowVar = (defpackage.sow) obj;
        if (j$.util.Objects.equals(this.a, sowVar.a) && j$.util.Objects.equals(this.b, sowVar.b) && j$.util.Objects.equals(this.c, sowVar.c) && this.d == sowVar.d && this.e == sowVar.e) {
            android.os.UserHandle userHandle = sowVar.f;
            if (j$.util.Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.c, java.lang.Integer.valueOf(this.d), java.lang.Boolean.valueOf(this.e), null});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        if (str != null) {
            return str;
        }
        android.content.ComponentName componentName = this.c;
        defpackage.sqs.aA(componentName);
        return componentName.flattenToString();
    }

    public sow(android.content.ComponentName componentName) {
        this.a = null;
        this.b = null;
        defpackage.sqs.aA(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
        this.f = null;
    }
}
