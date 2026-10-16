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
public final class FloatArrayNavType extends CollectionNavType<float[]> {
    public FloatArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public float[] get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return SavedStateReader.m13297getFloatArrayimpl(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "float[]";
    }

    @Override // androidx.navigation.NavType
    public float[] parseValue(String str, float[] fArr) {
        x.f(str, "value");
        if (fArr != null) {
            float[] value = parseValue(str);
            x.f(fArr, "<this>");
            x.f(value, "elements");
            int length = fArr.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
            System.arraycopy(value, 0, fArrCopyOf, length, 1);
            x.c(fArrCopyOf);
            if (fArrCopyOf != null) {
                return fArrCopyOf;
            }
        }
        return parseValue(str);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, float[] fArr) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (fArr != null) {
            SavedStateWriter.m13371putFloatArrayimpl(bundle, str, fArr);
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(float[] fArr) {
        List listU;
        if (fArr == null || (listU = c.U(fArr)) == null) {
            return i.h();
        }
        List list = listU;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(float[] fArr, float[] fArr2) {
        return c.g(fArr != null ? c.r(fArr) : null, fArr2 != null ? c.r(fArr2) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public float[] emptyCollection() {
        return new float[0];
    }

    @Override // androidx.navigation.NavType
    public float[] parseValue(String str) {
        x.f(str, "value");
        return new float[]{NavType.FloatType.parseValue(str).floatValue()};
    }
}
