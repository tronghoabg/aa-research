package androidx.compose.ui.autofill;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i2) {
        this.androidAutofillType = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m7722boximpl(int i2) {
        return new AndroidContentDataType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7724equalsimpl(int i2, Object obj) {
        return (obj instanceof AndroidContentDataType) && i2 == ((AndroidContentDataType) obj).m7728unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7725equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7727toStringimpl(int i2) {
        return "AndroidContentDataType(androidAutofillType=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m7724equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return this.androidAutofillType;
    }

    public String toString() {
        return m7727toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7728unboximpl() {
        return this.androidAutofillType;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7723constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7726hashCodeimpl(int i2) {
        return i2;
    }
}
