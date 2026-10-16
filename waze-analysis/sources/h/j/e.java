package h.j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends f implements Serializable {
    public /* synthetic */ e(byte[] bArr) {
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return d.f48135a;
    }

    @Override // h.j.f
    public final float a() {
        return f.f48137b.a();
    }

    @Override // h.j.f
    public final int b(int i2) {
        return f.f48137b.b(i2);
    }

    @Override // h.j.f
    public final int bI(int i2, int i3) {
        return f.f48137b.bI(i2, i3);
    }

    @Override // h.j.f
    public final int c() {
        return f.f48137b.c();
    }

    @Override // h.j.f
    public final int d(int i2) {
        return f.f48137b.d(i2);
    }

    @Override // h.j.f
    public final long e() {
        return f.f48137b.e();
    }

    @Override // h.j.f
    public final long g() {
        return f.f48137b.g();
    }

    private e() {
        throw null;
    }
}
