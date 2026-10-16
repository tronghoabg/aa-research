package h.p;

import h.g.b.x;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private long f48290a;

    /* renamed from: b, reason: collision with root package name */
    private long f48291b;

    public b(long j2, long j3) {
        this.f48290a = j2;
        this.f48291b = j3;
    }

    private final Object readResolve() {
        return h.d.b.e(this.f48290a, this.f48291b);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        x.f(objectInput, "input");
        this.f48290a = objectInput.readLong();
        this.f48291b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        x.f(objectOutput, "output");
        objectOutput.writeLong(this.f48290a);
        objectOutput.writeLong(this.f48291b);
    }

    public b() {
        this(0L, 0L);
    }
}
