package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hpt extends hng {
    public static final hno b = new hno(17);
    private final hpu c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpt(hpu hpuVar, boolean z) {
        super(hnh.o);
        hpuVar.getClass();
        this.c = hpuVar;
        this.d = z;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putInt("TYPE_KEY", this.c.ordinal());
        bundle.putBoolean("DATA_KEY", this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpt)) {
            return false;
        }
        hpt hptVar = (hpt) obj;
        return this.c == hptVar.c && this.d == hptVar.d;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + a.f(this.d);
    }
}
