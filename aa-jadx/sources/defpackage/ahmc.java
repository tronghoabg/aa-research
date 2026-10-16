package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmc extends defpackage.ahlv {
    public static final defpackage.ahmb Companion = new defpackage.ahmb(null);
    public static final defpackage.ahmc INSTANCE;
    public static final defpackage.ahmc INSTANCE_NEXT;
    public static final defpackage.ahmc INVALID_VERSION;
    private final boolean isStrictSemantics;

    static {
        defpackage.ahmc ahmcVar = new defpackage.ahmc(2, 4, 0);
        INSTANCE = ahmcVar;
        INSTANCE_NEXT = ahmcVar.next();
        INVALID_VERSION = new defpackage.ahmc(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahmc(int[] iArr, boolean z) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.isStrictSemantics = z;
    }

    private final boolean isCompatibleInternal(defpackage.ahmc ahmcVar) {
        return ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0 || newerThan(ahmcVar)) ? false : true;
    }

    private final boolean newerThan(defpackage.ahmc ahmcVar) {
        if (getMajor() > ahmcVar.getMajor()) {
            return true;
        }
        return getMajor() >= ahmcVar.getMajor() && getMinor() > ahmcVar.getMinor();
    }

    public final boolean isCompatible(defpackage.ahmc ahmcVar) {
        ahmcVar.getClass();
        return isCompatibleInternal(ahmcVar.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics));
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleInternal(this.isStrictSemantics ? INSTANCE : INSTANCE_NEXT);
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    public final defpackage.ahmc lastSupportedVersionWithThisLanguageVersion(boolean z) {
        defpackage.ahmc ahmcVar = z ? INSTANCE : INSTANCE_NEXT;
        return ahmcVar.newerThan(this) ? ahmcVar : this;
    }

    public final defpackage.ahmc next() {
        return (getMajor() == 1 && getMinor() == 9) ? new defpackage.ahmc(2, 0, 0) : new defpackage.ahmc(getMajor(), getMinor() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahmc(int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
