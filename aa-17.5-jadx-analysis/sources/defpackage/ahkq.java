package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ahkq extends ahkv {
    public static final ahkp Companion = new ahkp(null);
    public static final ahkq INSTANCE = new ahkq(1, 0, 7);
    public static final ahkq INVALID_VERSION = new ahkq(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahkq(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleTo(INSTANCE);
    }
}
