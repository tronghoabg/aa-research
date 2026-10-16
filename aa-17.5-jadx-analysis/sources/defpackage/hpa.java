package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class hpa extends hng {
    public static final hno b = new hno(8);
    private final KeyEvent c;

    public hpa(KeyEvent keyEvent) {
        super(hnh.u);
        this.c = keyEvent;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putParcelable("key_event", this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpa) && affa.f(this.c, ((hpa) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
