package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import h.a.r;
import h.e;
import h.g.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import h.l.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
@a
/* loaded from: classes4.dex */
public final class SavedStateReader {
    private final Bundle source;

    private /* synthetic */ SavedStateReader(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m13268boximpl(Bundle bundle) {
        return new SavedStateReader(bundle);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m13269constructorimpl(Bundle bundle) {
        x.f(bundle, "source");
        return bundle;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m13270containsimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.containsKey(str);
    }

    /* renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m13271contentDeepEqualsimpl(Bundle bundle, Bundle bundle2) {
        x.f(bundle2, "other");
        return SavedStateReaderKt__SavedStateReader_androidKt.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, bundle2);
    }

    /* renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m13272contentDeepHashCodeimpl(Bundle bundle) {
        return SavedStateReaderKt__SavedStateReader_androidKt.contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(bundle);
    }

    /* renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m13273contentDeepToStringimpl(Bundle bundle) {
        StringBuilder sb = new StringBuilder((n.i(bundle.size(), 429496729) * 5) + 2);
        SavedStateReaderKt__SavedStateReader_androidKt.contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt(bundle, sb, new ArrayList());
        return sb.toString();
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13274equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && x.n(bundle, ((SavedStateReader) obj).m13352unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13275equalsimpl0(Bundle bundle, Bundle bundle2) {
        return x.n(bundle, bundle2);
    }

    /* renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m13276getBinderimpl(Bundle bundle, String str) {
        x.f(str, "key");
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m13277getBinderOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getBinder(str);
    }

    /* renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m13278getBooleanimpl(Bundle bundle, String str) {
        x.f(str, "key");
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return z;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m13279getBooleanArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m13280getBooleanArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getBooleanArray(str);
    }

    /* renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m13281getBooleanOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* renamed from: getChar-impl, reason: not valid java name */
    public static final char m13282getCharimpl(Bundle bundle, String str) {
        x.f(str, "key");
        char c2 = bundle.getChar(str, (char) 0);
        if (c2 != 0 || bundle.getChar(str, (char) 65535) != 65535) {
            return c2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m13283getCharArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        char[] charArray = bundle.getCharArray(str);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m13284getCharArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getCharArray(str);
    }

    /* renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m13285getCharOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        char c2 = bundle.getChar(str, (char) 0);
        if (c2 == 0 && bundle.getChar(str, (char) 65535) == 65535) {
            return null;
        }
        return Character.valueOf(c2);
    }

    /* renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m13286getCharSequenceimpl(Bundle bundle, String str) {
        x.f(str, "key");
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m13287getCharSequenceArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m13288getCharSequenceArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getCharSequenceArray(str);
    }

    /* renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m13289getCharSequenceListimpl(Bundle bundle, String str) {
        x.f(str, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m13290getCharSequenceListOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getCharSequenceArrayList(str);
    }

    /* renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m13291getCharSequenceOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getCharSequence(str);
    }

    /* renamed from: getDouble-impl, reason: not valid java name */
    public static final double m13292getDoubleimpl(Bundle bundle, String str) {
        x.f(str, "key");
        double d2 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m13293getDoubleArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        double[] doubleArray = bundle.getDoubleArray(str);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m13294getDoubleArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getDoubleArray(str);
    }

    /* renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m13295getDoubleOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        double d2 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d2 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d2);
    }

    /* renamed from: getFloat-impl, reason: not valid java name */
    public static final float m13296getFloatimpl(Bundle bundle, String str) {
        x.f(str, "key");
        float f2 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f2 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m13297getFloatArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m13298getFloatArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getFloatArray(str);
    }

    /* renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m13299getFloatOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        float f2 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f2);
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m13300getIntimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m13301getIntArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m13302getIntArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getIntArray(str);
    }

    /* renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m13303getIntListimpl(Bundle bundle, String str) {
        x.f(str, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m13304getIntListOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getIntegerArrayList(str);
    }

    /* renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m13305getIntOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m13307getJavaSerializableimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "serializableClass");
        T t = (T) BundleCompat.getSerializable(bundle, str, o.w(cVar));
        if (t != null) {
            return t;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m13308getJavaSerializableOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (T) m13309getJavaSerializableOrNullimpl(bundle, str, new m(Serializable.class));
    }

    /* renamed from: getLong-impl, reason: not valid java name */
    public static final long m13310getLongimpl(Bundle bundle, String str) {
        x.f(str, "key");
        long j2 = bundle.getLong(str, Long.MIN_VALUE);
        if (j2 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m13311getLongArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m13312getLongArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getLongArray(str);
    }

    /* renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m13313getLongOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        long j2 = bundle.getLong(str, Long.MIN_VALUE);
        if (j2 == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j2);
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m13315getParcelableimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        T t = (T) BundleCompat.getParcelable(bundle, str, o.w(cVar));
        if (t != null) {
            return t;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m13317getParcelableArrayimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        T[] tArr = (T[]) m13319getParcelableArrayOrNullimpl(bundle, str, cVar);
        if (tArr != null) {
            return tArr;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m13319getParcelableArrayOrNullimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        T[] tArr = (T[]) BundleCompat.getParcelableArray(bundle, str, o.w(cVar));
        if (tArr instanceof Parcelable[]) {
            return tArr;
        }
        return null;
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m13321getParcelableListimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, str, o.w(cVar));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m13322getParcelableListOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return m13323getParcelableListOrNullimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m13324getParcelableOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (T) m13325getParcelableOrNullimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m13326getSavedStateimpl(Bundle bundle, String str) {
        x.f(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m13327getSavedStateArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int i2 = ar.f48106a;
        return (Bundle[]) m13317getParcelableArrayimpl(bundle, str, new m(Bundle.class));
    }

    /* renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m13328getSavedStateArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int i2 = ar.f48106a;
        return (Bundle[]) m13319getParcelableArrayOrNullimpl(bundle, str, new m(Bundle.class));
    }

    /* renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m13329getSavedStateListimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int i2 = ar.f48106a;
        return m13321getParcelableListimpl(bundle, str, new m(Bundle.class));
    }

    /* renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m13330getSavedStateListOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        int i2 = ar.f48106a;
        return m13323getParcelableListOrNullimpl(bundle, str, new m(Bundle.class));
    }

    /* renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m13331getSavedStateOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getBundle(str);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final Size m13332getSizeimpl(Bundle bundle, String str) {
        x.f(str, "key");
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m13333getSizeFimpl(Bundle bundle, String str) {
        x.f(str, "key");
        SizeF sizeF = bundle.getSizeF(str);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m13334getSizeFOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getSizeF(str);
    }

    /* renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m13335getSizeOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getSize(str);
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m13337getSparseParcelableArrayimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        SparseArray<T> sparseArrayM13339getSparseParcelableArrayOrNullimpl = m13339getSparseParcelableArrayOrNullimpl(bundle, str, cVar);
        if (sparseArrayM13339getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM13339getSparseParcelableArrayOrNullimpl;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m13338getSparseParcelableArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return m13339getSparseParcelableArrayOrNullimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m13340getStringimpl(Bundle bundle, String str) {
        x.f(str, "key");
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m13341getStringArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m13342getStringArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getStringArray(str);
    }

    /* renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m13343getStringListimpl(Bundle bundle, String str) {
        x.f(str, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new e();
    }

    /* renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m13344getStringListOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getStringArrayList(str);
    }

    /* renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m13345getStringOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return bundle.getString(str);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13346hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m13347isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m13348isNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        return m13270containsimpl(bundle, str) && bundle.get(str) == null;
    }

    /* renamed from: size-impl, reason: not valid java name */
    public static final int m13349sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m13350toMapimpl(Bundle bundle) {
        Map mapD = r.d(bundle.size());
        for (String str : bundle.keySet()) {
            x.c(str);
            mapD.put(str, bundle.get(str));
        }
        return r.b(mapD);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13351toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ")";
    }

    public boolean equals(Object obj) {
        return m13274equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m13346hashCodeimpl(this.source);
    }

    public String toString() {
        return m13351toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m13352unboximpl() {
        return this.source;
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m13309getJavaSerializableOrNullimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "serializableClass");
        return (T) BundleCompat.getSerializable(bundle, str, o.w(cVar));
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m13323getParcelableListOrNullimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        return BundleCompat.getParcelableArrayList(bundle, str, o.w(cVar));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m13325getParcelableOrNullimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        return (T) BundleCompat.getParcelable(bundle, str, o.w(cVar));
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m13339getSparseParcelableArrayOrNullimpl(Bundle bundle, String str, c<T> cVar) {
        x.f(str, "key");
        x.f(cVar, "parcelableClass");
        return BundleCompat.getSparseParcelableArray(bundle, str, o.w(cVar));
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m13318getParcelableArrayOrNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (T[]) m13319getParcelableArrayOrNullimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m13316getParcelableArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (T[]) m13317getParcelableArrayimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m13336getSparseParcelableArrayimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return m13337getSparseParcelableArrayimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m13306getJavaSerializableimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (T) m13307getJavaSerializableimpl(bundle, str, new m(Serializable.class));
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m13314getParcelableimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (T) m13315getParcelableimpl(bundle, str, new m(Parcelable.class));
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m13320getParcelableListimpl(Bundle bundle, String str) {
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return m13321getParcelableListimpl(bundle, str, new m(Parcelable.class));
    }
}
