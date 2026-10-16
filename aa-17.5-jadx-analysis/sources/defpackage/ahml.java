package defpackage;

/* loaded from: classes3.dex */
public final class ahml extends ahmn {
    private final String desc;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahml(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.desc = str2;
    }

    @Override // defpackage.ahmn
    public String asString() {
        return getName() + ':' + getDesc();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.desc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahml)) {
            return false;
        }
        ahml ahmlVar = (ahml) obj;
        return affa.f(this.name, ahmlVar.name) && affa.f(this.desc, ahmlVar.desc);
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.desc.hashCode();
    }
}
