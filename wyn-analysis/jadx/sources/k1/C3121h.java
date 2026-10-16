package k1;

import android.view.DisplayCutout;
import j$.util.Objects;

/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3121h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f38831a;

    public C3121h(DisplayCutout displayCutout) {
        this.f38831a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3121h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38831a, ((C3121h) obj).f38831a);
    }

    public final int hashCode() {
        return this.f38831a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f38831a + "}";
    }
}
