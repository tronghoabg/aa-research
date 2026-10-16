package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ydg extends defpackage.ybx {
    private static final long serialVersionUID = 0;
    transient int c;

    public ydg(defpackage.ylx ylxVar) {
        this(ylxVar.x().size(), ((defpackage.ydg) ylxVar).c);
        B(ylxVar);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int i = objectInputStream.readInt();
        r(new defpackage.yed());
        defpackage.ytn.f(this, objectInputStream, i);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        defpackage.ytn.g(this, objectOutputStream);
    }

    @Override // defpackage.ybx, defpackage.ycs
    public final /* bridge */ /* synthetic */ java.util.Collection a() {
        return new java.util.ArrayList(this.c);
    }

    public ydg(int i, int i2) {
        super(new defpackage.yed(i));
        this.c = i2;
    }

    private ydg() {
        throw null;
    }
}
