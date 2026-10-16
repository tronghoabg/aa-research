package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hov extends hng {
    public static final hno b = new hno(6);
    private final int c;

    public hov(int i) {
        super(hnh.a);
        this.c = i;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putInt("totalSpanCapacity", this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hov) && this.c == ((hov) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }
}
