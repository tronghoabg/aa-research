package h.a.a;

import h.g.b.x;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private Collection f47961a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47962b;

    public m(Collection collection, int i2) {
        x.f(collection, "collection");
        this.f47961a = collection;
        this.f47962b = i2;
    }

    private final Object readResolve() {
        return this.f47961a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        List listA;
        x.f(objectInput, "input");
        byte b2 = objectInput.readByte();
        int i2 = b2 & 1;
        if ((b2 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2) + ".");
        }
        int i3 = objectInput.readInt();
        if (i3 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i3 + ".");
        }
        int i4 = 0;
        if (i2 != 0) {
            Set setN = e.c.d.a.n(i3);
            while (i4 < i3) {
                setN.add(objectInput.readObject());
                i4++;
            }
            listA = e.c.d.a.l(setN);
        } else {
            List listC = h.a.i.c(i3);
            while (i4 < i3) {
                listC.add(objectInput.readObject());
                i4++;
            }
            listA = h.a.i.a(listC);
        }
        this.f47961a = listA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        x.f(objectOutput, "output");
        objectOutput.writeByte(this.f47962b);
        objectOutput.writeInt(this.f47961a.size());
        Iterator it = this.f47961a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public m() {
        this(h.a.i.h(), 0);
    }
}
