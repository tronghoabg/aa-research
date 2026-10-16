package defpackage;

import android.graphics.Rect;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class rom {
    public static final yfy a;
    public final int b;
    public final Rect c;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(17, 66);
        yfuVar.e(66, 17);
        yfuVar.e(33, 130);
        yfuVar.e(130, 33);
        yfuVar.e(2, 1);
        yfuVar.e(1, 2);
        a = yfuVar.d(true);
    }

    public rom(int i, Rect rect) {
        this.b = i;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rom romVar = (rom) obj;
        if (this.b != romVar.b) {
            return false;
        }
        return Objects.equals(this.c, romVar.c);
    }

    public final int hashCode() {
        Rect rect = this.c;
        return (this.b * 31) + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        return "FocusInfo{direction=" + this.b + ", focusedRect=" + String.valueOf(this.c) + "}";
    }
}
