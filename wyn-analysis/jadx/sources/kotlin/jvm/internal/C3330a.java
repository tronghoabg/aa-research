package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3330a implements InterfaceC3336g, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C3330a(Class cls, String str) {
        this(0, AbstractC3332c.NO_RECEIVER, cls, "<init>", str, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3330a)) {
            return false;
        }
        C3330a c3330a = (C3330a) obj;
        return this.isTopLevel == c3330a.isTopLevel && this.arity == c3330a.arity && this.flags == c3330a.flags && AbstractC3340k.a(this.receiver, c3330a.receiver) && AbstractC3340k.a(this.owner, c3330a.owner) && this.name.equals(c3330a.name) && this.signature.equals(c3330a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC3336g
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? H.f39741a.getOrCreateKotlinPackage(cls, "") : H.f39741a.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((N0.a.c(N0.a.c((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return H.f39741a.renderLambdaToString(this);
    }

    public C3330a(int i5, Object obj, Class cls, String str, String str2, int i10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i5;
        this.flags = i10 >> 1;
    }
}
