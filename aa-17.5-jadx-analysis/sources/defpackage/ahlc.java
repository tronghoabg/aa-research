package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ahlc extends ahkv {
    public static final ahlb Companion = new ahlb(null);
    public static final ahlc INSTANCE;
    public static final ahlc INSTANCE_NEXT;
    public static final ahlc INVALID_VERSION;
    private final boolean isStrictSemantics;

    static {
        ahlc ahlcVar = new ahlc(2, 4, 0);
        INSTANCE = ahlcVar;
        INSTANCE_NEXT = ahlcVar.next();
        INVALID_VERSION = new ahlc(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahlc(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.isStrictSemantics = z;
    }

    private final boolean isCompatibleInternal(ahlc ahlcVar) {
        return ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0 || newerThan(ahlcVar)) ? false : true;
    }

    private final boolean newerThan(ahlc ahlcVar) {
        if (getMajor() > ahlcVar.getMajor()) {
            return true;
        }
        return getMajor() >= ahlcVar.getMajor() && getMinor() > ahlcVar.getMinor();
    }

    public final boolean isCompatible(ahlc ahlcVar) {
        ahlcVar.getClass();
        return isCompatibleInternal(ahlcVar.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics));
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleInternal(this.isStrictSemantics ? INSTANCE : INSTANCE_NEXT);
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    public final ahlc lastSupportedVersionWithThisLanguageVersion(boolean z) {
        ahlc ahlcVar = z ? INSTANCE : INSTANCE_NEXT;
        return ahlcVar.newerThan(this) ? ahlcVar : this;
    }

    public final ahlc next() {
        return (getMajor() == 1 && getMinor() == 9) ? new ahlc(2, 0, 0) : new ahlc(getMajor(), getMinor() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahlc(int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
