package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ewk extends defpackage.evf {
    public java.lang.String a;

    @Override // defpackage.evf
    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super.a(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, defpackage.ewq.b);
        typedArrayObtainAttributes.getClass();
        java.lang.String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.a = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.evf
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof defpackage.ewk) && super.equals(obj) && defpackage.afga.f(this.a, ((defpackage.ewk) obj).a);
    }

    @Override // defpackage.evf
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        java.lang.String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.evf
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        java.lang.String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
