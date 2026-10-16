package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ygf extends defpackage.yde {
    private static final long serialVersionUID = 0;
    transient int c;

    public ygf(byte[] bArr) {
        super(new defpackage.yed(12));
        this.c = 2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int i = objectInputStream.readInt();
        r(new defpackage.yed(12));
        defpackage.ytn.f(this, objectInputStream, i);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        defpackage.ytn.g(this, objectOutputStream);
    }

    @Override // defpackage.yde, defpackage.ycs
    public final /* bridge */ /* synthetic */ java.util.Collection a() {
        return new defpackage.yef(this.c);
    }

    private ygf() {
        throw null;
    }
}
