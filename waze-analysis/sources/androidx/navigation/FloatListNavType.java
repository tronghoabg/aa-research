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
public final class FloatListNavType extends CollectionNavType<List<? extends Float>> {
    public FloatListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public List<Float> get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return c.U(SavedStateReader.m13297getFloatArrayimpl(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<Float>";
    }

    @Override // androidx.navigation.NavType
    public List<Float> parseValue(String str, List<Float> list) {
        x.f(str, "value");
        return list != null ? i.af(list, parseValue(str)) : parseValue(str);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, List<Float> list) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (list != null) {
            SavedStateWriter.m13371putFloatArrayimpl(bundle, str, i.az(list));
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Float> list) {
        if (list == null) {
            return i.h();
        }
        List<Float> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<Float> list, List<Float> list2) {
        return c.g(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends Float> emptyCollection() {
        return i.h();
    }

    @Override // androidx.navigation.NavType
    public List<Float> parseValue(String str) {
        x.f(str, "value");
        return i.d(NavType.FloatType.parseValue(str));
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Float> list) {
        return serializeAsValues2((List<Float>) list);
    }
}
