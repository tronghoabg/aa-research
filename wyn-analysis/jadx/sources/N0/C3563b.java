package n0;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3563b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f40751a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3563b) {
            return AbstractC3340k.a(this.f40751a, ((C3563b) obj).f40751a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40751a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f40751a + ')';
    }
}
