package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class xwu extends xww implements Serializable {
    public static final xwu a = new xwu();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.xww
    protected final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.xww
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
