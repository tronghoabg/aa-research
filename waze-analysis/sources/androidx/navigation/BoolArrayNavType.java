package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BoolArrayNavType extends CollectionNavType<boolean[]> {
    public BoolArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public boolean[] get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return SavedStateReader.m13279getBooleanArrayimpl(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "boolean[]";
    }

    @Override // androidx.navigation.NavType
    public boolean[] parseValue(String str, boolean[] zArr) {
        x.f(str, "value");
        if (zArr != null) {
            boolean[] value = parseValue(str);
            x.f(zArr, "<this>");
            x.f(value, "elements");
            int length = zArr.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
            System.arraycopy(value, 0, zArrCopyOf, length, 1);
            x.c(zArrCopyOf);
            if (zArrCopyOf != null) {
                return zArrCopyOf;
            }
        }
        return parseValue(str);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, boolean[] zArr) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (zArr != null) {
            SavedStateWriter.m13362putBooleanArrayimpl(bundle, str, zArr);
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(boolean[] zArr) {
        List listY;
        if (zArr == null || (listY = c.Y(zArr)) == null) {
            return i.h();
        }
        List list = listY;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(boolean[] zArr, boolean[] zArr2) {
        return c.g(zArr != null ? c.p(zArr) : null, zArr2 != null ? c.p(zArr2) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public boolean[] emptyCollection() {
        return new boolean[0];
    }

    @Override // androidx.navigation.NavType
    public boolean[] parseValue(String str) {
        x.f(str, "value");
        return new boolean[]{NavType.BoolType.parseValue(str).booleanValue()};
    }
}
