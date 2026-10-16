package defpackage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
class ynd implements Serializable {
    private static final long serialVersionUID = 0;
    final Object f;
    final Object g;

    public ynd(Object obj, Object obj2) {
        obj.getClass();
        this.f = obj;
        this.g = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        synchronized (this.g) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.g) {
            string = this.f.toString();
        }
        return string;
    }
}
