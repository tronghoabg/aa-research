package kotlin.jvm.internal;

import kotlin.reflect.KVariance;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class N {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f39749a;

    static {
        int[] iArr = new int[KVariance.values().length];
        try {
            iArr[KVariance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KVariance.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KVariance.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f39749a = iArr;
    }
}
