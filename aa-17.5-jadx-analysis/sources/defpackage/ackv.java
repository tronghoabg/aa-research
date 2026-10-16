package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ackv implements ackr {
    public static final ackr a = acks.b(Collections.EMPTY_SET);
    private final List b;
    private final List c;

    public ackv(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set a() {
        List list = this.b;
        int size = list.size();
        List list2 = this.c;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((acku) list2.get(i)).a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(woy.dJ(size));
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objA = ((acku) list.get(i2)).a();
            objA.getClass();
            hashSet.add(objA);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
