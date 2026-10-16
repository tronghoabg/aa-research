package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hoh extends hng {
    public static final hno b = new hno(2);
    private final hok c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoh(hok hokVar, boolean z) {
        super(hnh.j);
        hokVar.getClass();
        this.c = hokVar;
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
        if (!(obj instanceof hoh)) {
            return false;
        }
        hoh hohVar = (hoh) obj;
        return this.c == hohVar.c && this.d == hohVar.d;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + a.f(this.d);
    }
}
