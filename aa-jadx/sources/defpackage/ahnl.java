package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahnl extends defpackage.ahnn {
    private final java.lang.String desc;
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnl(java.lang.String str, java.lang.String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.desc = str2;
    }

    @Override // defpackage.ahnn
    public java.lang.String asString() {
        return getName() + ':' + getDesc();
    }

    public final java.lang.String component1() {
        return this.name;
    }

    public final java.lang.String component2() {
        return this.desc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahnl)) {
            return false;
        }
        defpackage.ahnl ahnlVar = (defpackage.ahnl) obj;
        return defpackage.afga.f(this.name, ahnlVar.name) && defpackage.afga.f(this.desc, ahnlVar.desc);
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
