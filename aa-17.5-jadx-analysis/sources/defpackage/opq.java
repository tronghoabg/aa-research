package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class opq {
    public final ComponentName a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public opq(ComponentName componentName, int i, int i2, int i3, int i4) {
        componentName.getClass();
        this.a = componentName;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opq)) {
            return false;
        }
        opq opqVar = (opq) obj;
        return affa.f(this.a, opqVar.a) && this.b == opqVar.b && this.c == opqVar.c && this.d == opqVar.d && this.e == opqVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "IncompatibleWidget(componentName=" + this.a + ", minWidthPx=" + this.b + ", minHeightPx=" + this.c + ", screenWidthPx=" + this.d + ", screenHeightPx=" + this.e + ")";
    }
}
