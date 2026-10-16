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
public final class IntArrayNavType extends CollectionNavType<int[]> {
    public IntArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public int[] get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return SavedStateReader.m13301getIntArrayimpl(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "integer[]";
    }

    @Override // androidx.navigation.NavType
    public int[] parseValue(String str, int[] iArr) {
        int[] iArrO;
        x.f(str, "value");
        return (iArr == null || (iArrO = c.o(iArr, parseValue(str))) == null) ? parseValue(str) : iArrO;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, int[] iArr) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (iArr != null) {
            SavedStateWriter.m13373putIntArrayimpl(bundle, str, iArr);
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(int[] iArr) {
        List listV;
        if (iArr == null || (listV = c.V(iArr)) == null) {
            return i.h();
        }
        List list = listV;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(int[] iArr, int[] iArr2) {
        return c.g(iArr != null ? c.s(iArr) : null, iArr2 != null ? c.s(iArr2) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public int[] emptyCollection() {
        return new int[0];
    }

    @Override // androidx.navigation.NavType
    public int[] parseValue(String str) {
        x.f(str, "value");
        return new int[]{NavType.IntType.parseValue(str).intValue()};
    }
}
