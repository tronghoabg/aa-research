package t3;

import android.view.ViewGroup;
import android.view.WindowId;

/* renamed from: t3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4080D {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f45661a;

    public C4080D(ViewGroup viewGroup) {
        this.f45661a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4080D) && ((C4080D) obj).f45661a.equals(this.f45661a);
    }

    public final int hashCode() {
        return this.f45661a.hashCode();
    }
}
