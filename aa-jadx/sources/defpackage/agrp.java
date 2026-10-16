package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agrp extends defpackage.agrm {
    private final java.lang.String descriptor;
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agrp(java.lang.String str, java.lang.String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.descriptor = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.agrp)) {
            return false;
        }
        defpackage.agrp agrpVar = (defpackage.agrp) obj;
        return defpackage.afga.f(this.name, agrpVar.name) && defpackage.afga.f(this.descriptor, agrpVar.descriptor);
    }

    @Override // defpackage.agrm
    public java.lang.String getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.agrm
    public java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.descriptor.hashCode();
    }

    @Override // defpackage.agrm
    public java.lang.String toString() {
        return java.lang.String.valueOf(getName()).concat(java.lang.String.valueOf(getDescriptor()));
    }
}
