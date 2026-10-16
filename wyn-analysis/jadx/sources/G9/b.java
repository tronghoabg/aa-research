package G9;

import com.google.firebase.inappmessaging.model.MessageType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4679a;

    static {
        int[] iArr = new int[MessageType.values().length];
        f4679a = iArr;
        try {
            iArr[MessageType.MODAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4679a[MessageType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4679a[MessageType.IMAGE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4679a[MessageType.BANNER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
