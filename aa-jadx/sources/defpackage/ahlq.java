package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahlq extends defpackage.ahlv {
    public static final defpackage.ahlp Companion = new defpackage.ahlp(null);
    public static final defpackage.ahlq INSTANCE = new defpackage.ahlq(1, 0, 7);
    public static final defpackage.ahlq INVALID_VERSION = new defpackage.ahlq(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahlq(int... iArr) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleTo(INSTANCE);
    }
}
