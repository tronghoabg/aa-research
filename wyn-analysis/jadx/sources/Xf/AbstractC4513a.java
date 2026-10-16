package xf;

import java.util.Random;

/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4513a extends AbstractC4516d {
    @Override // xf.AbstractC4516d
    public final int a(int i5) {
        return ((-i5) >> 31) & (g().nextInt() >>> (32 - i5));
    }

    @Override // xf.AbstractC4516d
    public final int b() {
        return g().nextInt();
    }

    @Override // xf.AbstractC4516d
    public final long d() {
        return g().nextLong();
    }

    public abstract Random g();
}
