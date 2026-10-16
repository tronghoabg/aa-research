package defpackage;

/* loaded from: classes3.dex */
public final class ahlk {
    public static final ahlj Companion = new ahlj(null);
    public static final ahlk INFINITY = new ahlk(256, 256, 256);
    private final int major;
    private final int minor;
    private final int patch;

    public ahlk(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    public final String asString() {
        StringBuilder sb;
        int i;
        int i2 = this.patch;
        int i3 = this.major;
        if (i2 == 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            i = this.minor;
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(this.minor);
            sb.append('.');
            i = this.patch;
        }
        sb.append(i);
        return sb.toString();
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.patch;
    }

    public final void encode(afec<? super Integer, afak> afecVar, afec<? super Integer, afak> afecVar2) {
        int i;
        int i2;
        afecVar.getClass();
        afecVar2.getClass();
        if (affa.f(this, INFINITY)) {
            return;
        }
        int i3 = this.major;
        if (i3 <= 7 && (i = this.minor) <= 15 && (i2 = this.patch) <= 127) {
            afecVar.invoke(Integer.valueOf((i << 3) | i3 | (i2 << 7)));
        } else {
            afecVar2.invoke(Integer.valueOf((this.patch << 16) | (this.minor << 8) | i3));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahlk)) {
            return false;
        }
        ahlk ahlkVar = (ahlk) obj;
        return this.major == ahlkVar.major && this.minor == ahlkVar.minor && this.patch == ahlkVar.patch;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        return asString();
    }
}
