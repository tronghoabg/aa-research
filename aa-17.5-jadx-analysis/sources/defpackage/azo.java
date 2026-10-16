package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class azo implements bym {
    private final int a;
    private final int b;
    private final bwq c;
    private int d;

    public azo(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new ParcelableSnapshotMutableState(afpt.m(Math.max(i4 - i3, 0), i4 + i2 + i3), bxp.c);
        this.d = i;
    }

    @Override // defpackage.bym
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final afha a() {
        return (afha) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = this.b;
            int i4 = (i / i2) * i2;
            this.c.b(afpt.m(Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }
}
