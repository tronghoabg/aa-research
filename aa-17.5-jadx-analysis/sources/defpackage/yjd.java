package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* loaded from: classes3.dex */
final class yjd extends yir {
    private static final long serialVersionUID = 3;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        yip yipVar = new yip();
        int i2 = yipVar.b;
        woy.ab(i2 == -1, "initial capacity was already set to %s", i2);
        woy.N(i >= 0);
        yipVar.b = i;
        yipVar.g(this.a);
        yje yjeVar = yipVar.e;
        woy.ad(yjeVar == null, "Value strength was already set to %s", yjeVar);
        yje yjeVar2 = this.b;
        yipVar.e = yjeVar2;
        if (yjeVar2 != yje.a) {
            yipVar.a = true;
        }
        yipVar.f(this.c);
        int i3 = this.d;
        int i4 = yipVar.c;
        woy.ab(i4 == -1, "concurrency level was already set to %s", i4);
        woy.N(i3 > 0);
        yipVar.c = i3;
        this.e = yipVar.e();
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                this.e.put(object, objectInputStream.readObject());
            }
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
