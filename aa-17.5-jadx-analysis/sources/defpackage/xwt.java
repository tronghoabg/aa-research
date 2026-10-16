package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class xwt extends xww implements Serializable {
    public static final xwt a = new xwt();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.xww
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.xww
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
