package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ynl extends ynk implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;
    private final Object c;

    public ynl(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.yni
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.yni
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.yni
    public final Object c() {
        return this.c;
    }
}
