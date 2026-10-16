package defpackage;

/* loaded from: classes3.dex */
public final class ahmm extends ahmn {
    private final String desc;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahmm(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.desc = str2;
    }

    @Override // defpackage.ahmn
    public String asString() {
        return String.valueOf(getName()).concat(String.valueOf(getDesc()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahmm)) {
            return false;
        }
        ahmm ahmmVar = (ahmm) obj;
        return affa.f(this.name, ahmmVar.name) && affa.f(this.desc, ahmmVar.desc);
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
