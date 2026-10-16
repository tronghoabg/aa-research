package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes2.dex */
public final class akcs extends akdw {
    private static final long serialVersionUID = -4481126543819298617L;
    public akct a;
    public akcf b;

    public akcs(akct akctVar, akcf akcfVar) {
        this.a = akctVar;
        this.b = akcfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.a = (akct) objectInputStream.readObject();
        this.b = ((akch) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }

    @Override // defpackage.akdw
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.akdw
    protected final akcd b() {
        return this.a.b;
    }

    @Override // defpackage.akdw
    public final akcf c() {
        return this.b;
    }
}
