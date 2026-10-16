package s6;

import android.text.Layout;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class J {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f45114a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f45114a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f45114a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f45114a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
