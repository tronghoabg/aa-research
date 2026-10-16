package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afeg extends defpackage.afbr implements java.util.RandomAccess, java.io.Serializable, j$.util.List, defpackage.afef {
    private final java.lang.Enum[] a;

    public afeg(java.lang.Enum[] enumArr) {
        this.a = enumArr;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return new afeh(this.a);
    }

    @Override // defpackage.afbm
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.afbm, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum r3 = (java.lang.Enum) obj;
        r3.getClass();
        return ((java.lang.Enum) defpackage.afga.bQ(this.a, r3.ordinal())) == r3;
    }

    @Override // defpackage.afbr, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Enum[] enumArr = this.a;
        defpackage.a.aF(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.afbr, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r3 = (java.lang.Enum) obj;
        r3.getClass();
        java.lang.Enum[] enumArr = this.a;
        int iOrdinal = r3.ordinal();
        if (((java.lang.Enum) defpackage.afga.bQ(enumArr, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.afbr, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r2 = (java.lang.Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
