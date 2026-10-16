package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class dzz {
    public final DisplayCutout a;

    public dzz(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final dve a() {
        return Build.VERSION.SDK_INT >= 30 ? dve.f(this.a.getWaterfallInsets()) : dve.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((dzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
