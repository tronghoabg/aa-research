package defpackage;

/* loaded from: classes2.dex */
public class hst implements Cloneable {
    public iff a = ifc.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hst clone() {
        try {
            return (hst) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hst)) {
            return false;
        }
        iff iffVar = this.a;
        iff iffVar2 = ((hst) obj).a;
        char[] cArr = ify.a;
        return a.ao(iffVar, iffVar2);
    }

    public final int hashCode() {
        iff iffVar = this.a;
        if (iffVar != null) {
            return iffVar.hashCode();
        }
        return 0;
    }
}
