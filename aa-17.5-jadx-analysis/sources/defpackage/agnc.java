package defpackage;

/* loaded from: classes3.dex */
public final class agnc extends agnp {
    private final String enumClassName;
    private final String enumEntryName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnc(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.enumClassName = str;
        this.enumEntryName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agnc)) {
            return false;
        }
        agnc agncVar = (agnc) obj;
        return affa.f(this.enumClassName, agncVar.enumClassName) && affa.f(this.enumEntryName, agncVar.enumEntryName);
    }

    public final String getEnumClassName() {
        return this.enumClassName;
    }

    public final String getEnumEntryName() {
        return this.enumEntryName;
    }

    public int hashCode() {
        return (this.enumClassName.hashCode() * 31) + this.enumEntryName.hashCode();
    }

    @Override // defpackage.agnp
    public String toString() {
        return "EnumValue(" + this.enumClassName + '.' + this.enumEntryName + ')';
    }
}
