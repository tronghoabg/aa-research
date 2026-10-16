package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class akdq implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient akcl a;

    public akdq(akcl akclVar) {
        this.a = akclVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.a = (akcl) objectInputStream.readObject();
    }

    private Object readResolve() {
        return akdr.O(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
    }
}
