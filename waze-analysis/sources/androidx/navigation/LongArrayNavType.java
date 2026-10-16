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
public final class LongArrayNavType extends CollectionNavType<long[]> {
    public LongArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public long[] get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return SavedStateReader.m13311getLongArrayimpl(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "long[]";
    }

    @Override // androidx.navigation.NavType
    public long[] parseValue(String str, long[] jArr) {
        x.f(str, "value");
        if (jArr != null) {
            long[] value = parseValue(str);
            x.f(jArr, "<this>");
            x.f(value, "elements");
            int length = jArr.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
            System.arraycopy(value, 0, jArrCopyOf, length, 1);
            x.c(jArrCopyOf);
            if (jArrCopyOf != null) {
                return jArrCopyOf;
            }
        }
        return parseValue(str);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, long[] jArr) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (jArr != null) {
            SavedStateWriter.m13377putLongArrayimpl(bundle, str, jArr);
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(long[] jArr) {
        List listW;
        if (jArr == null || (listW = c.W(jArr)) == null) {
            return i.h();
        }
        List list = listW;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(long[] jArr, long[] jArr2) {
        return c.g(jArr != null ? c.t(jArr) : null, jArr2 != null ? c.t(jArr2) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public long[] emptyCollection() {
        return new long[0];
    }

    @Override // androidx.navigation.NavType
    public long[] parseValue(String str) {
        x.f(str, "value");
        return new long[]{NavType.LongType.parseValue(str).longValue()};
    }
}
