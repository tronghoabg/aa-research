package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.a;
import h.g.b.x;
import java.io.Serializable;
import java.util.List;

/* compiled from: WazeSource */
@a
/* loaded from: classes4.dex */
public final class SavedStateWriter {
    private final Bundle source;

    private /* synthetic */ SavedStateWriter(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateWriter m13353boximpl(Bundle bundle) {
        return new SavedStateWriter(bundle);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m13354clearimpl(Bundle bundle) {
        bundle.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m13355constructorimpl(Bundle bundle) {
        x.f(bundle, "source");
        return bundle;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13356equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && x.n(bundle, ((SavedStateWriter) obj).m13393unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13357equalsimpl0(Bundle bundle, Bundle bundle2) {
        return x.n(bundle, bundle2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13358hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m13359putAllimpl(Bundle bundle, Bundle bundle2) {
        x.f(bundle2, TypedValues.TransitionType.S_FROM);
        bundle.putAll(bundle2);
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m13360putBinderimpl(Bundle bundle, String str, IBinder iBinder) {
        x.f(str, "key");
        x.f(iBinder, "value");
        bundle.putBinder(str, iBinder);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m13361putBooleanimpl(Bundle bundle, String str, boolean z) {
        x.f(str, "key");
        bundle.putBoolean(str, z);
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m13362putBooleanArrayimpl(Bundle bundle, String str, boolean[] zArr) {
        x.f(str, "key");
        x.f(zArr, "value");
        bundle.putBooleanArray(str, zArr);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m13363putCharimpl(Bundle bundle, String str, char c2) {
        x.f(str, "key");
        bundle.putChar(str, c2);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m13364putCharArrayimpl(Bundle bundle, String str, char[] cArr) {
        x.f(str, "key");
        x.f(cArr, "value");
        bundle.putCharArray(str, cArr);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m13365putCharSequenceimpl(Bundle bundle, String str, CharSequence charSequence) {
        x.f(str, "key");
        x.f(charSequence, "value");
        bundle.putCharSequence(str, charSequence);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m13366putCharSequenceArrayimpl(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        x.f(str, "key");
        x.f(charSequenceArr, "value");
        bundle.putCharSequenceArray(str, charSequenceArr);
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m13367putCharSequenceListimpl(Bundle bundle, String str, List<? extends CharSequence> list) {
        x.f(str, "key");
        x.f(list, "value");
        bundle.putCharSequenceArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m13368putDoubleimpl(Bundle bundle, String str, double d2) {
        x.f(str, "key");
        bundle.putDouble(str, d2);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m13369putDoubleArrayimpl(Bundle bundle, String str, double[] dArr) {
        x.f(str, "key");
        x.f(dArr, "value");
        bundle.putDoubleArray(str, dArr);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m13370putFloatimpl(Bundle bundle, String str, float f2) {
        x.f(str, "key");
        bundle.putFloat(str, f2);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m13371putFloatArrayimpl(Bundle bundle, String str, float[] fArr) {
        x.f(str, "key");
        x.f(fArr, "value");
        bundle.putFloatArray(str, fArr);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m13372putIntimpl(Bundle bundle, String str, int i2) {
        x.f(str, "key");
        bundle.putInt(str, i2);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m13373putIntArrayimpl(Bundle bundle, String str, int[] iArr) {
        x.f(str, "key");
        x.f(iArr, "value");
        bundle.putIntArray(str, iArr);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m13374putIntListimpl(Bundle bundle, String str, List<Integer> list) {
        x.f(str, "key");
        x.f(list, "value");
        bundle.putIntegerArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m13375putJavaSerializableimpl(Bundle bundle, String str, T t) {
        x.f(str, "key");
        x.f(t, "value");
        bundle.putSerializable(str, t);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m13376putLongimpl(Bundle bundle, String str, long j2) {
        x.f(str, "key");
        bundle.putLong(str, j2);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m13377putLongArrayimpl(Bundle bundle, String str, long[] jArr) {
        x.f(str, "key");
        x.f(jArr, "value");
        bundle.putLongArray(str, jArr);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m13378putNullimpl(Bundle bundle, String str) {
        x.f(str, "key");
        bundle.putString(str, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13379putParcelableimpl(Bundle bundle, String str, T t) {
        x.f(str, "key");
        x.f(t, "value");
        bundle.putParcelable(str, t);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13380putParcelableArrayimpl(Bundle bundle, String str, T[] tArr) {
        x.f(str, "key");
        x.f(tArr, "value");
        bundle.putParcelableArray(str, tArr);
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13381putParcelableListimpl(Bundle bundle, String str, List<? extends T> list) {
        x.f(str, "key");
        x.f(list, "value");
        bundle.putParcelableArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m13382putSavedStateimpl(Bundle bundle, String str, Bundle bundle2) {
        x.f(str, "key");
        x.f(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    /* renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m13383putSavedStateArrayimpl(Bundle bundle, String str, Bundle[] bundleArr) {
        x.f(str, "key");
        x.f(bundleArr, "value");
        m13380putParcelableArrayimpl(bundle, str, bundleArr);
    }

    /* renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m13384putSavedStateListimpl(Bundle bundle, String str, List<Bundle> list) {
        x.f(str, "key");
        x.f(list, "value");
        m13381putParcelableListimpl(bundle, str, list);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m13385putSizeimpl(Bundle bundle, String str, Size size) {
        x.f(str, "key");
        x.f(size, "value");
        bundle.putSize(str, size);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m13386putSizeFimpl(Bundle bundle, String str, SizeF sizeF) {
        x.f(str, "key");
        x.f(sizeF, "value");
        bundle.putSizeF(str, sizeF);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13387putSparseParcelableArrayimpl(Bundle bundle, String str, SparseArray<T> sparseArray) {
        x.f(str, "key");
        x.f(sparseArray, "value");
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m13388putStringimpl(Bundle bundle, String str, String str2) {
        x.f(str, "key");
        x.f(str2, "value");
        bundle.putString(str, str2);
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m13389putStringArrayimpl(Bundle bundle, String str, String[] strArr) {
        x.f(str, "key");
        x.f(strArr, "value");
        bundle.putStringArray(str, strArr);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m13390putStringListimpl(Bundle bundle, String str, List<String> list) {
        x.f(str, "key");
        x.f(list, "value");
        bundle.putStringArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m13391removeimpl(Bundle bundle, String str) {
        x.f(str, "key");
        bundle.remove(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13392toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ")";
    }

    public boolean equals(Object obj) {
        return m13356equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m13358hashCodeimpl(this.source);
    }

    public String toString() {
        return m13392toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m13393unboximpl() {
        return this.source;
    }
}
