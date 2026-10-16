package defpackage;

import android.view.KeyEvent;

@afdo
/* loaded from: classes2.dex */
public final class cpo {
    public final KeyEvent a;

    public static String a(KeyEvent keyEvent) {
        return a.bm(keyEvent, "KeyEvent(nativeKeyEvent=", ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cpo) && affa.f(this.a, ((cpo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
