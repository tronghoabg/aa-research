package kotlinx.coroutines.e;

import java.util.ArrayList;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class t {
    public static final Object a(Object obj, Object obj2) {
        int i2 = kotlinx.coroutines.ai.f51347a;
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
