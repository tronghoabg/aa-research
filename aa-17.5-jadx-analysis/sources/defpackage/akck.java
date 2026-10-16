package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class akck implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    private transient String a;

    public akck(String str) {
        this.a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.a = objectInputStream.readUTF();
    }

    private Object readResolve() throws ObjectStreamException {
        return akcl.i(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.a);
    }
}
