package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahnm extends defpackage.ahnn {
    private final java.lang.String desc;
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnm(java.lang.String str, java.lang.String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.desc = str2;
    }

    @Override // defpackage.ahnn
    public java.lang.String asString() {
        return java.lang.String.valueOf(getName()).concat(java.lang.String.valueOf(getDesc()));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahnm)) {
            return false;
        }
        defpackage.ahnm ahnmVar = (defpackage.ahnm) obj;
        return defpackage.afga.f(this.name, ahnmVar.name) && defpackage.afga.f(this.desc, ahnmVar.desc);
    }

    public java.lang.String getDesc() {
        return this.desc;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.desc.hashCode();
    }
}
