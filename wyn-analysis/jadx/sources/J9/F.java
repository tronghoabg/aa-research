package J9;

import com.google.firebase.inappmessaging.model.MessageType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class F {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5874a;

    static {
        int[] iArr = new int[MessageType.values().length];
        f5874a = iArr;
        try {
            iArr[MessageType.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5874a[MessageType.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5874a[MessageType.BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5874a[MessageType.IMAGE_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
