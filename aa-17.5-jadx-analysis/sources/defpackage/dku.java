package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dku {
    public static final dku a = new dku(0);
    public static final dku b = new dku(1);
    public static final dku c = new dku(2);
    public final int d;

    public dku(int i) {
        this.d = i;
    }

    public final boolean a(dku dkuVar) {
        int i = this.d;
        return (dkuVar.d | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dku) && this.d == ((dku) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() throws IOException {
        int i = this.d;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((b.d & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            Object obj = arrayList.get(0);
            Objects.toString(obj);
            return "TextDecoration.".concat(String.valueOf(obj));
        }
        return "TextDecoration[" + dlz.c(arrayList, ", ", null, null, null, 62) + "]";
    }
}
