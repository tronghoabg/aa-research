package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class airx implements airp, airi {
    public final airp a;
    public final int b;
    private final /* synthetic */ int c;

    public airx(airp airpVar, int i, int i2) {
        this.c = i2;
        this.a = airpVar;
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "startIndex should be non-negative, but is "));
        }
        if (i > 2) {
            throw new IllegalArgumentException(a.bo(i, 2, "endIndex should be not less than startIndex, but was ", " < "));
        }
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return this.c != 0 ? new airh(this, 0) : new aisa(this, 1);
    }

    @Override // defpackage.airi
    public final airp b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i2 == 0) {
            return i >= 2 - i3 ? airj.a : new airx(this.a, i3 + i, 0);
        }
        int i4 = i3 + i;
        return i4 < 0 ? new airx(this, i, 1, null) : new airx(this.a, i4, 1, null);
    }

    public airx(airp airpVar, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = airpVar;
        this.b = i;
    }
}
