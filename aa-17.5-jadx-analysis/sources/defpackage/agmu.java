package defpackage;

/* loaded from: classes3.dex */
public final class agmu extends agnp {
    private final int arrayDimensionCount;
    private final String className;
    private final String stringRepresentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmu(String str, int i) {
        super(null);
        str.getClass();
        this.className = str;
        this.arrayDimensionCount = i;
        if (i <= 0) {
            throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.className);
        int i3 = this.arrayDimensionCount;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.stringRepresentation = sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agmu)) {
            return false;
        }
        agmu agmuVar = (agmu) obj;
        return affa.f(this.className, agmuVar.className) && this.arrayDimensionCount == agmuVar.arrayDimensionCount;
    }

    public final int getArrayDimensionCount() {
        return this.arrayDimensionCount;
    }

    public final String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + this.arrayDimensionCount;
    }

    @Override // defpackage.agnp
    public String toString() {
        return this.stringRepresentation;
    }
}
