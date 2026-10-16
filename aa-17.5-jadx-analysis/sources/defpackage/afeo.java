package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public class afeo implements Serializable, afew {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public afeo(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = 1 == (i2 & 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afeo)) {
            return false;
        }
        afeo afeoVar = (afeo) obj;
        return this.isTopLevel == afeoVar.isTopLevel && this.arity == afeoVar.arity && this.flags == afeoVar.flags && affa.f(this.receiver, afeoVar.receiver) && affa.f(this.owner, afeoVar.owner) && this.name.equals(afeoVar.name) && this.signature.equals(afeoVar.signature);
    }

    @Override // defpackage.afew
    public int getArity() {
        return this.arity;
    }

    public afhg getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? affw.c(cls) : affw.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Class cls = this.owner;
        return (((((((((((iHashCode * 31) + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (true != this.isTopLevel ? 1237 : 1231)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return affw.a(this);
    }

    public afeo(int i, Class cls, String str, String str2, int i2) {
        this(i, afeq.NO_RECEIVER, cls, str, str2, i2);
    }
}
