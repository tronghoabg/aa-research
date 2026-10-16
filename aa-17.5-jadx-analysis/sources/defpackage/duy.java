package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* loaded from: classes.dex */
final class duy {
    final Resources a;
    final Resources.Theme b;

    public duy(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            duy duyVar = (duy) obj;
            if (this.a.equals(duyVar.a) && Objects.equals(this.b, duyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
