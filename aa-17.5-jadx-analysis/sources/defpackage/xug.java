package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class xug {
    int a;
    final int b;
    xug c;
    final Map d = new HashMap(0);

    public xug(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        return "Node" + System.identityHashCode(this);
    }
}
