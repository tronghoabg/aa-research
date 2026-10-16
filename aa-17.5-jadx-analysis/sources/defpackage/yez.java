package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* loaded from: classes.dex */
public final class yez extends yby {
    private static final long serialVersionUID = 0;
    transient int c;

    public yez(byte[] bArr) {
        super(new ycx(12));
        this.c = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int i = objectInputStream.readInt();
        r(new ycx(12));
        ysi.f(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ysi.g(this, objectOutputStream);
    }

    @Override // defpackage.yby, defpackage.ybm
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ycz(this.c);
    }

    private yez() {
        throw null;
    }
}
