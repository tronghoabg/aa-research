package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akeq implements java.io.Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient defpackage.akdl a;

    public akeq(defpackage.akdl akdlVar) {
        this.a = akdlVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.a = (defpackage.akdl) objectInputStream.readObject();
    }

    private java.lang.Object readResolve() {
        return defpackage.aker.O(this.a);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(this.a);
    }
}
