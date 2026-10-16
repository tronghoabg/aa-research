package defpackage;

/* loaded from: classes3.dex */
public final class agqo implements Comparable<agqo> {
    private final int major;
    private final int minor;
    private final int patch;
    public static final agqn Companion = new agqn(null);
    public static final agqo LATEST_STABLE_SUPPORTED = new agqo(ahlc.INSTANCE.toArray());
    public static final agqo HIGHEST_ALLOWED_TO_WRITE = new agqo(ahlc.INSTANCE_NEXT.toArray());

    public agqo(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (i < 0) {
            throw new IllegalArgumentException("Major version should be not less than 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Minor version should be not less than 0");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Patch version should be not less than 0");
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(agqo agqoVar) {
        agqoVar.getClass();
        int iB = affa.b(this.major, agqoVar.major);
        if (iB != 0) {
            return iB;
        }
        int iB2 = affa.b(this.minor, agqoVar.minor);
        return iB2 != 0 ? iB2 : affa.b(this.patch, agqoVar.patch);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        agqo agqoVar = (agqo) obj;
        return this.major == agqoVar.major && this.minor == agqoVar.minor && this.patch == agqoVar.patch;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agqo(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
