package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class yca extends yar {
    private static final long serialVersionUID = 0;
    transient int c;

    public yca(yks yksVar) {
        this(yksVar.x().size(), ((yca) yksVar).c);
        B(yksVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int i = objectInputStream.readInt();
        r(new ycx());
        ysi.f(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ysi.g(this, objectOutputStream);
    }

    @Override // defpackage.yar, defpackage.ybm
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }

    public yca(int i, int i2) {
        super(new ycx(i));
        this.c = i2;
    }

    private yca() {
        throw null;
    }
}
