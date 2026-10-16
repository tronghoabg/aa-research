package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StringArrayNavType extends CollectionNavType<String[]> {
    public StringArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String[] get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return SavedStateReader.m13341getStringArrayimpl(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "string[]";
    }

    @Override // androidx.navigation.NavType
    public String[] parseValue(String str, String[] strArr) {
        String[] strArr2;
        x.f(str, "value");
        return (strArr == null || (strArr2 = (String[]) c.w(strArr, parseValue(str))) == null) ? parseValue(str) : strArr2;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, String[] strArr) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (strArr != null) {
            SavedStateWriter.m13389putStringArrayimpl(bundle, str, strArr);
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(String[] strArr) {
        if (strArr == null) {
            return i.h();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.CollectionNavType
    public String[] emptyCollection() {
        return new String[0];
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(String[] strArr, String[] strArr2) {
        return c.g(strArr, strArr2);
    }

    @Override // androidx.navigation.NavType
    public String[] parseValue(String str) {
        x.f(str, "value");
        return new String[]{str};
    }
}
