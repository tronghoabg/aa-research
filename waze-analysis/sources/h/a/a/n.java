package h.a.a;

import h.a.r;
import h.g.b.x;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private Map f47963a;

    public n(Map map) {
        x.f(map, "map");
        this.f47963a = map;
    }

    private final Object readResolve() {
        return this.f47963a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        x.f(objectInput, "input");
        byte b2 = objectInput.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + ".");
        }
        Map mapD = r.d(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            mapD.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f47963a = r.b(mapD);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        x.f(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f47963a.size());
        for (Map.Entry entry : this.f47963a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public n() {
        this(r.j());
    }
}
