package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agov {
    private final java.lang.Object value;

    public agov(java.lang.Object obj) {
        this.value = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agov) && defpackage.afga.f(this.value, ((defpackage.agov) obj).value);
    }

    public int hashCode() {
        java.lang.Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "KmConstantValue(value=" + this.value + ')';
    }
}
