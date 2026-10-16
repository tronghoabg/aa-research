package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zdv extends yln {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Map b;

    public zdv(Comparator comparator, Map map) {
        this.a = comparator;
        this.b = map;
    }

    @Override // defpackage.yln, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = this.b;
        Object obj3 = map.get(obj);
        obj3.getClass();
        Object obj4 = map.get(obj2);
        obj4.getClass();
        return this.a.compare(obj3, obj4);
    }
}
