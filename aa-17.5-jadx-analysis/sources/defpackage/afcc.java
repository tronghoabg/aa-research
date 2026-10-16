package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class afcc implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public afcc(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collectionF;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(a.bn(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(a.bn(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            afce afceVar = new afce(new afby(i2));
            while (i3 < i2) {
                afceVar.add(objectInput.readObject());
                i3++;
            }
            collectionF = woy.aN(afceVar);
        } else {
            afbt afbtVar = new afbt(i2);
            while (i3 < i2) {
                afbtVar.add(objectInput.readObject());
                i3++;
            }
            collectionF = afbtVar.f();
        }
        this.a = collectionF;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public afcc() {
        this(afbe.a, 0);
    }
}
