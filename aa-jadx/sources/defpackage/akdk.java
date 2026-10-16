package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akdk implements java.io.Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    private transient java.lang.String a;

    public akdk(java.lang.String str) {
        this.a = str;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        this.a = objectInputStream.readUTF();
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return defpackage.akdl.i(this.a);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeUTF(this.a);
    }
}
