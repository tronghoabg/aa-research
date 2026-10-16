package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mqi {
    public static final defpackage.mpr c = new defpackage.mpr();
    public final android.content.ComponentName a;
    public final defpackage.mqh b;

    public mqi(android.content.ComponentName componentName, defpackage.mqh mqhVar) {
        mqhVar.getClass();
        this.a = componentName;
        this.b = mqhVar;
    }

    public static final defpackage.mqi b(android.content.Intent intent) {
        return defpackage.mpr.d(intent);
    }

    public final android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent();
        d(intent);
        return intent;
    }

    public final java.lang.String c() {
        java.lang.String strFlattenToString;
        defpackage.mqh mqhVar = this.b;
        defpackage.mqh mqhVar2 = defpackage.mqh.b;
        android.content.ComponentName componentName = this.a;
        if (mqhVar == mqhVar2) {
            strFlattenToString = componentName.flattenToString();
        } else {
            strFlattenToString = componentName.flattenToString() + ":" + mqhVar.name();
        }
        strFlattenToString.getClass();
        return strFlattenToString;
    }

    public final void d(android.content.Intent intent) {
        intent.getClass();
        intent.setComponent(this.a);
        intent.putExtra("AppKey", c());
    }

    public final boolean e() {
        return this.b == defpackage.mqh.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.mqi)) {
            return false;
        }
        defpackage.mqi mqiVar = (defpackage.mqi) obj;
        return defpackage.afga.f(this.a, mqiVar.a) && this.b == mqiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AppKey(componentName=" + this.a + ", profileType=" + this.b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqi(android.content.ComponentName componentName) {
        this(componentName, (byte[]) null);
        componentName.getClass();
    }

    public /* synthetic */ mqi(android.content.ComponentName componentName, byte[] bArr) {
        this(componentName, defpackage.mqh.b);
    }
}
