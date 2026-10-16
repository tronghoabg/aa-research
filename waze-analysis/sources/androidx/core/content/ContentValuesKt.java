package androidx.core.content;

import android.content.ContentValues;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(k<String, ? extends Object>... kVarArr) {
        x.f(kVarArr, "pairs");
        ContentValues contentValues = new ContentValues(kVarArr.length);
        for (k<String, ? extends Object> kVar : kVarArr) {
            String str = (String) kVar.a();
            Object objB = kVar.b();
            if (objB == null) {
                contentValues.putNull(str);
            } else if (objB instanceof String) {
                contentValues.put(str, (String) objB);
            } else if (objB instanceof Integer) {
                contentValues.put(str, (Integer) objB);
            } else if (objB instanceof Long) {
                contentValues.put(str, (Long) objB);
            } else if (objB instanceof Boolean) {
                contentValues.put(str, (Boolean) objB);
            } else if (objB instanceof Float) {
                contentValues.put(str, (Float) objB);
            } else if (objB instanceof Double) {
                contentValues.put(str, (Double) objB);
            } else if (objB instanceof byte[]) {
                contentValues.put(str, (byte[]) objB);
            } else if (objB instanceof Byte) {
                contentValues.put(str, (Byte) objB);
            } else {
                if (!(objB instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objB.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                contentValues.put(str, (Short) objB);
            }
        }
        return contentValues;
    }
}
