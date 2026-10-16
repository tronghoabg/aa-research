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
public final class BoolListNavType extends CollectionNavType<List<? extends Boolean>> {
    public BoolListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public List<Boolean> get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return c.Y(SavedStateReader.m13279getBooleanArrayimpl(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<Boolean>";
    }

    @Override // androidx.navigation.NavType
    public List<Boolean> parseValue(String str, List<Boolean> list) {
        x.f(str, "value");
        return list != null ? i.af(list, parseValue(str)) : parseValue(str);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, List<Boolean> list) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (list != null) {
            SavedStateWriter.m13362putBooleanArrayimpl(bundle, str, i.aC(list));
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Boolean> list) {
        if (list == null) {
            return i.h();
        }
        List<Boolean> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<Boolean> list, List<Boolean> list2) {
        return c.g(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends Boolean> emptyCollection() {
        return i.h();
    }

    @Override // androidx.navigation.NavType
    public List<Boolean> parseValue(String str) {
        x.f(str, "value");
        return i.d(NavType.BoolType.parseValue(str));
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Boolean> list) {
        return serializeAsValues2((List<Boolean>) list);
    }
}
