package androidx.lifecycle;

import Hf.InterfaceC0592c0;
import Hf.x0;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import ef.C2527k;
import ff.AbstractC2640A;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import n3.InterfaceC3591c;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f18627f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18628a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f18629b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18630c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f18631d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3591c f18632e;

    public T(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f18628a = linkedHashMap;
        this.f18629b = new LinkedHashMap();
        this.f18630c = new LinkedHashMap();
        this.f18631d = new LinkedHashMap();
        this.f18632e = new androidx.activity.d(this, 1);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(T this$0) {
        AbstractC3340k.e(this$0, "this$0");
        Iterator it = AbstractC2640A.Y(this$0.f18629b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f18628a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C2527k[] c2527kArr = {new C2527k("keys", arrayList), new C2527k("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    C2527k c2527k = c2527kArr[i5];
                    String str2 = (String) c2527k.f34671a;
                    Object obj = c2527k.f34672b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        AbstractC3340k.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) obj);
                    }
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleA = ((InterfaceC3591c) entry.getValue()).a();
            AbstractC3340k.e(key, "key");
            if (bundleA != null) {
                Class[] clsArr = f18627f;
                for (int i10 = 0; i10 < 29; i10++) {
                    Class cls = clsArr[i10];
                    AbstractC3340k.b(cls);
                    if (!cls.isInstance(bundleA)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj2 = this$0.f18630c.get(key);
            E e7 = obj2 instanceof E ? (E) obj2 : null;
            if (e7 != null) {
                e7.j(bundleA);
            } else {
                linkedHashMap.put(key, bundleA);
            }
            InterfaceC0592c0 interfaceC0592c0 = (InterfaceC0592c0) this$0.f18631d.get(key);
            if (interfaceC0592c0 != null) {
                ((x0) interfaceC0592c0).j(bundleA);
            }
        }
    }

    public T() {
        this.f18628a = new LinkedHashMap();
        this.f18629b = new LinkedHashMap();
        this.f18630c = new LinkedHashMap();
        this.f18631d = new LinkedHashMap();
        this.f18632e = new androidx.activity.d(this, 1);
    }
}
