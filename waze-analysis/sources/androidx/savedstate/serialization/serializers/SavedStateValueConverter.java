package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.c;
import h.a.r;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class SavedStateValueConverter {
    public static final SavedStateValueConverter INSTANCE = new SavedStateValueConverter();

    private SavedStateValueConverter() {
    }

    private final Object unwrap(SerializableValue serializableValue) {
        if (serializableValue instanceof BooleanValue) {
            return Boolean.valueOf(((BooleanValue) serializableValue).getValue());
        }
        if (serializableValue instanceof CharValue) {
            return Character.valueOf(((CharValue) serializableValue).getValue());
        }
        if (serializableValue instanceof DoubleValue) {
            return Double.valueOf(((DoubleValue) serializableValue).getValue());
        }
        if (serializableValue instanceof FloatValue) {
            return Float.valueOf(((FloatValue) serializableValue).getValue());
        }
        if (serializableValue instanceof IntValue) {
            return Integer.valueOf(((IntValue) serializableValue).getValue());
        }
        if (serializableValue instanceof LongValue) {
            return Long.valueOf(((LongValue) serializableValue).getValue());
        }
        if (x.n(serializableValue, NullValue.INSTANCE)) {
            return null;
        }
        if (serializableValue instanceof StringValue) {
            return ((StringValue) serializableValue).getValue();
        }
        if (serializableValue instanceof CharSequenceValue) {
            return ((CharSequenceValue) serializableValue).getValue();
        }
        if (serializableValue instanceof BooleanArrayValue) {
            return ((BooleanArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof CharArrayValue) {
            return ((CharArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof DoubleArrayValue) {
            return ((DoubleArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof FloatArrayValue) {
            return ((FloatArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof IntArrayValue) {
            return ((IntArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof LongArrayValue) {
            return ((LongArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof StringArrayValue) {
            return ((StringArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof CharSequenceArrayValue) {
            return ((CharSequenceArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof SavedStateArrayValue) {
            return ((SavedStateArrayValue) serializableValue).getValue();
        }
        if (serializableValue instanceof IntListValue) {
            return ((IntListValue) serializableValue).getValue();
        }
        if (serializableValue instanceof StringListValue) {
            return ((StringListValue) serializableValue).getValue();
        }
        if (serializableValue instanceof CharSequenceListValue) {
            return ((CharSequenceListValue) serializableValue).getValue();
        }
        if (serializableValue instanceof SavedStateListValue) {
            return ((SavedStateListValue) serializableValue).getValue();
        }
        if (serializableValue instanceof SavedStateValue) {
            return ((SavedStateValue) serializableValue).getValue();
        }
        throw new i();
    }

    private final SerializableValue wrap(Object obj) {
        if (obj == null) {
            return NullValue.INSTANCE;
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof CharSequence) {
            return new CharSequenceValue(obj.toString());
        }
        if (obj instanceof boolean[]) {
            return new BooleanArrayValue((boolean[]) obj);
        }
        if (obj instanceof char[]) {
            return new CharArrayValue((char[]) obj);
        }
        if (obj instanceof double[]) {
            return new DoubleArrayValue((double[]) obj);
        }
        if (obj instanceof float[]) {
            return new FloatArrayValue((float[]) obj);
        }
        if (obj instanceof int[]) {
            return new IntArrayValue((int[]) obj);
        }
        if (obj instanceof long[]) {
            return new LongArrayValue((long[]) obj);
        }
        if (obj instanceof Object[]) {
            return wrapArray((Object[]) obj);
        }
        if (obj instanceof List) {
            return wrapList((List) obj);
        }
        if (obj instanceof Bundle) {
            return new SavedStateValue((Bundle) obj);
        }
        Class<?> cls = obj.getClass();
        int i2 = ar.f48106a;
        m mVar = new m(cls);
        mVar.toString();
        throw new IllegalArgumentException("Unsupported type in SavedState: ".concat(mVar.toString()));
    }

    private final SerializableValue wrapArray(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return new StringArrayValue(new String[0]);
        }
        Object objM = c.M(objArr);
        if (objM instanceof Integer) {
            x.d(objArr, "null cannot be cast to non-null type kotlin.IntArray");
            return new IntArrayValue((int[]) objArr);
        }
        if (objM instanceof String) {
            x.d(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            return new StringArrayValue((String[]) objArr);
        }
        if (objM instanceof CharSequence) {
            ArrayList arrayList = new ArrayList(length);
            for (Object obj : objArr) {
                arrayList.add(String.valueOf(obj));
            }
            return new CharSequenceListValue(arrayList);
        }
        if (objM instanceof Bundle) {
            x.d(objArr, "null cannot be cast to non-null type kotlin.collections.List<android.os.Bundle>");
            return new SavedStateListValue((List) objArr);
        }
        x.c(objM);
        Class<?> cls = objM.getClass();
        int i2 = ar.f48106a;
        m mVar = new m(cls);
        mVar.toString();
        throw new IllegalArgumentException("Unsupported Array type: ".concat(mVar.toString()));
    }

    private final SerializableValue wrapList(List<?> list) {
        if (list.isEmpty()) {
            return new StringListValue(h.a.i.h());
        }
        Object objP = h.a.i.P(list);
        if (objP instanceof Integer) {
            x.d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            return new IntListValue(list);
        }
        if (objP instanceof String) {
            x.d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new StringListValue(list);
        }
        if (objP instanceof CharSequence) {
            x.d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            List<?> list2 = list;
            ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CharSequence) it.next()).toString());
            }
            return new CharSequenceListValue(arrayList);
        }
        if (objP instanceof Bundle) {
            x.d(list, "null cannot be cast to non-null type kotlin.collections.List<android.os.Bundle>");
            return new SavedStateListValue(list);
        }
        x.c(objP);
        Class<?> cls = objP.getClass();
        int i2 = ar.f48106a;
        m mVar = new m(cls);
        mVar.toString();
        throw new IllegalArgumentException("Unsupported List type: ".concat(mVar.toString()));
    }

    public final Map<String, Object> unwrapMap(Map<String, ? extends SerializableValue> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        Map mapD = r.d(map.size());
        for (Map.Entry<String, ? extends SerializableValue> entry : map.entrySet()) {
            mapD.put(entry.getKey(), INSTANCE.unwrap(entry.getValue()));
        }
        return r.b(mapD);
    }

    public final Map<String, SerializableValue> wrapMap(Map<String, ? extends Object> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        Map mapD = r.d(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            mapD.put(entry.getKey(), INSTANCE.wrap(entry.getValue()));
        }
        return r.b(mapD);
    }
}
