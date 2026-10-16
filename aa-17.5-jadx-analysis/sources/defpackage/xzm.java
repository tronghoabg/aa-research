package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
final class xzm extends xzr implements xys {
    private static final long serialVersionUID = 1;
    transient xys a;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = c().b(this.k);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        return ((xzo) this.a).c(obj);
    }
}
