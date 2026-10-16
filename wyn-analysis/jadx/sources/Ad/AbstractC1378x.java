package ad;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* renamed from: ad.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1378x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17616a;

    static {
        int[] iArr = new int[AdapterStatus.State.values().length];
        f17616a = iArr;
        try {
            iArr[AdapterStatus.State.NOT_READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17616a[AdapterStatus.State.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
