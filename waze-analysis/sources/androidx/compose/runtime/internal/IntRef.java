package androidx.compose.runtime.internal;

import h.g.b.o;
import h.g.b.x;
import h.m.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public /* synthetic */ IntRef(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i2) {
        this.element = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        int iHashCode = hashCode();
        k.y(16);
        String string = Integer.toString(iHashCode, 16);
        x.e(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }

    public IntRef(int i2) {
        this.element = i2;
    }

    public IntRef() {
        this(0, 1, null);
    }
}
