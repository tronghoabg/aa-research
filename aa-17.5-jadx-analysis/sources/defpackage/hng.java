package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class hng {
    public final hnh a;

    public hng(hnh hnhVar) {
        this.a = hnhVar;
    }

    public abstract void a(Bundle bundle);

    public final String toString() {
        return getClass().getSimpleName() + "(id=" + this.a + ", redacted...)";
    }
}
