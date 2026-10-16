package defpackage;

/* loaded from: classes3.dex */
public final class agql extends agqm {
    private final String descriptor;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agql(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.descriptor = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agql)) {
            return false;
        }
        agql agqlVar = (agql) obj;
        return affa.f(this.name, agqlVar.name) && affa.f(this.descriptor, agqlVar.descriptor);
    }

    @Override // defpackage.agqm
    public String getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.agqm
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.descriptor.hashCode();
    }

    @Override // defpackage.agqm
    public String toString() {
        return getName() + ':' + getDescriptor();
    }
}
