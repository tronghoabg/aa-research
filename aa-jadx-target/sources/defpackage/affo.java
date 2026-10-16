package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class affo implements java.io.Serializable, defpackage.affw {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private final java.lang.String signature;

    public affo(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = 1 == (i2 & 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.affo)) {
            return false;
        }
        defpackage.affo affoVar = (defpackage.affo) obj;
        return this.isTopLevel == affoVar.isTopLevel && this.arity == affoVar.arity && this.flags == affoVar.flags && defpackage.afga.f(this.receiver, affoVar.receiver) && defpackage.afga.f(this.owner, affoVar.owner) && this.name.equals(affoVar.name) && this.signature.equals(affoVar.signature);
    }

    @Override // defpackage.affw
    public int getArity() {
        return this.arity;
    }

    public defpackage.afig getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? defpackage.afgw.c(cls) : defpackage.afgw.b(cls);
    }

    public int hashCode() {
        java.lang.Object obj = this.receiver;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Class cls = this.owner;
        return (((((((((((iHashCode * 31) + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (true != this.isTopLevel ? 1237 : 1231)) * 31) + this.arity) * 31) + this.flags;
    }

    public java.lang.String toString() {
        return defpackage.afgw.a(this);
    }

    public affo(int i, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this(i, defpackage.affq.NO_RECEIVER, cls, str, str2, i2);
    }
}
