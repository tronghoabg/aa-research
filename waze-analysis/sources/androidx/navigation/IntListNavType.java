package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IntListNavType extends CollectionNavType<List<? extends Integer>> {
    public IntListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public List<Integer> get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return c.V(SavedStateReader.m13301getIntArrayimpl(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<Int>";
    }

    @Override // androidx.navigation.NavType
    public List<Integer> parseValue(String str, List<Integer> list) {
        x.f(str, "value");
        return list != null ? i.af(list, parseValue(str)) : parseValue(str);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, List<Integer> list) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        if (list != null) {
            SavedStateWriter.m13355constructorimpl(bundle);
            SavedStateWriter.m13373putIntArrayimpl(bundle, str, i.aA(list));
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Integer> list) {
        if (list == null) {
            return i.h();
        }
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<Integer> list, List<Integer> list2) {
        return c.g(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends Integer> emptyCollection() {
        return i.h();
    }

    @Override // androidx.navigation.NavType
    public List<Integer> parseValue(String str) {
        x.f(str, "value");
        return i.d(NavType.IntType.parseValue(str));
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Integer> list) {
        return serializeAsValues2((List<Integer>) list);
    }
}
