package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hnn extends hng {
    public static final hno b = new hno(1);
    private final String c;

    public hnn(String str) {
        super(hnh.c);
        this.c = str;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("client_session_id", this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnn) && affa.f(this.c, ((hnn) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
