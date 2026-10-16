package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ylg extends yld implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final int b;

    public ylg(Object obj, int i) {
        this.a = obj;
        this.b = i;
        wub.G(i, "count");
    }

    @Override // defpackage.ylb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ylb
    public final Object b() {
        return this.a;
    }
}
