package com.bumptech.glide.load.c.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends t {
    @Override // com.bumptech.glide.load.c.a.t
    public final float a(int i2, int i3, int i4, int i5) {
        if (f3363h) {
            return Math.min(i4 / i2, i5 / i3);
        }
        if (Math.max(i3 / i5, i2 / i4) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r0);
    }

    @Override // com.bumptech.glide.load.c.a.t
    public final int b(int i2, int i3, int i4, int i5) {
        return f3363h ? 2 : 1;
    }
}
