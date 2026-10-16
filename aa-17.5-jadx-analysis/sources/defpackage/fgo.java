package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fgo {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    public fgo(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgo)) {
            return false;
        }
        fgo fgoVar = (fgo) obj;
        return this.b == fgoVar.b && this.a.equals(fgoVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        Map map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    @Deprecated
    public fgo() {
    }
}
