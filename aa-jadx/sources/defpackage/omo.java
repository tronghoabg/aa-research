package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omo {
    public final java.lang.Integer a;
    public final android.content.ComponentName b;

    public omo(java.lang.Integer num, android.content.ComponentName componentName) {
        this.a = num;
        this.b = componentName;
    }

    public static defpackage.omo a() {
        return new defpackage.omo(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.drawable.ic_keyboard_arrow_down), null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.omo) {
            defpackage.omo omoVar = (defpackage.omo) obj;
            java.lang.Integer num = this.a;
            if (num != null ? num.equals(omoVar.a) : omoVar.a == null) {
                android.content.ComponentName componentName = this.b;
                if (componentName != null ? componentName.equals(omoVar.b) : omoVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        android.content.ComponentName componentName = this.b;
        return ((1000003 ^ iHashCode) * 583896283) ^ (componentName != null ? componentName.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "IconModel{drawableId=" + this.a + ", drawable=null, uri=null, appComponentName=" + java.lang.String.valueOf(this.b) + "}";
    }

    public omo() {
        throw null;
    }
}
