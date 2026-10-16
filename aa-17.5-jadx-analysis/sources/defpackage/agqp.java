package defpackage;

/* loaded from: classes3.dex */
public final class agqp extends agqm {
    private final String descriptor;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqp(String str, String str2) {
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
        if (!(obj instanceof agqp)) {
            return false;
        }
        agqp agqpVar = (agqp) obj;
        return affa.f(this.name, agqpVar.name) && affa.f(this.descriptor, agqpVar.descriptor);
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
        return String.valueOf(getName()).concat(String.valueOf(getDescriptor()));
    }
}
