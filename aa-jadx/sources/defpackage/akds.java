package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akds extends defpackage.akew {
    private static final long serialVersionUID = -4481126543819298617L;
    public defpackage.akdt a;
    public defpackage.akdf b;

    public akds(defpackage.akdt akdtVar, defpackage.akdf akdfVar) {
        this.a = akdtVar;
        this.b = akdfVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.a = (defpackage.akdt) objectInputStream.readObject();
        this.b = ((defpackage.akdh) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }

    @Override // defpackage.akew
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.akew
    protected final defpackage.akdd b() {
        return this.a.b;
    }

    @Override // defpackage.akew
    public final defpackage.akdf c() {
        return this.b;
    }
}
