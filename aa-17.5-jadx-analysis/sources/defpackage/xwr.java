package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class xwr extends xws implements Serializable {
    private static final long serialVersionUID = 0;
    final xws a;

    public xwr(xws xwsVar) {
        this.a = xwsVar;
    }

    @Override // defpackage.xws
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        abms abmsVarV = abms.v((byte[]) obj);
        abmsVarV.getClass();
        return abmsVarV;
    }

    @Override // defpackage.xws
    protected final Object c(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.xwx
    public final boolean equals(Object obj) {
        if (obj instanceof xwr) {
            return this.a.equals(((xwr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
