package h.j;

import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class a extends f {
    @Override // h.j.f
    public final float a() {
        return f().nextFloat();
    }

    @Override // h.j.f
    public final int b(int i2) {
        return (f().nextInt() >>> (32 - i2)) & ((-i2) >> 31);
    }

    @Override // h.j.f
    public final int c() {
        return f().nextInt();
    }

    @Override // h.j.f
    public final int d(int i2) {
        return f().nextInt(i2);
    }

    @Override // h.j.f
    public final long e() {
        return f().nextLong();
    }

    public abstract Random f();
}
