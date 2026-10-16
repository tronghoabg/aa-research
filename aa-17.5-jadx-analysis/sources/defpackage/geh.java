package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class geh implements gdn {
    public final gnk a;
    private final gdn b;

    public geh(gnk gnkVar, gdn gdnVar) {
        this.b = gdnVar;
        this.a = gnkVar;
    }

    @Override // defpackage.gdn
    public final void a(Object obj, glf glfVar) throws RemoteException {
        this.b.a(obj, glfVar);
    }

    public final String toString() {
        return "[" + this.a.name() + "]";
    }
}
