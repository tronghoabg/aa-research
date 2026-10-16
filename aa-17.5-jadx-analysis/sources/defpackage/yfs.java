package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* loaded from: classes.dex */
public class yfs extends ygm implements yig {
    private static final long serialVersionUID = 0;
    private transient yfs a;

    public yfs(yfy yfyVar, int i) {
        super(yfyVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bp(i, "Invalid key count "));
        }
        yfu yfuVar = new yfu(4);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.bp(i4, "Invalid value count "));
            }
            int i5 = yfq.d;
            yfl yflVar = new yfl(4);
            for (int i6 = 0; i6 < i4; i6++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                yflVar.i(object2);
            }
            yfuVar.e(object, yflVar.g());
            i2 += i4;
        }
        try {
            this.a = new yfs(yfuVar.d(true), i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private Object readResolve() {
        yfs yfsVar = this.a;
        yfsVar.getClass();
        return yfsVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ysi.g(this, objectOutputStream);
    }

    @Override // defpackage.yig
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yfq c(Object obj) {
        yfq yfqVar = (yfq) this.map.get(obj);
        if (yfqVar != null) {
            return yfqVar;
        }
        int i = yfq.d;
        return yls.a;
    }

    @Override // defpackage.yig
    @Deprecated
    public final /* bridge */ /* synthetic */ List g(Object obj) {
        throw null;
    }
}
