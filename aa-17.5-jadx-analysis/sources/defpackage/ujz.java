package defpackage;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
final class ujz {
    public static final Comparator a = new tui(6);
    public static final Comparator b = new tui(7);

    public static final void a(int i, int i2, int i3, boolean z, List list) {
        List list2 = (List) list.get(i);
        list2.add(i2, Integer.valueOf(i3));
        list2.add(i2, Integer.valueOf(z ? uka.b : -uka.b));
    }
}
