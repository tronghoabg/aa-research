package defpackage;

/* loaded from: classes2.dex */
public final class mis {
    public final int a;
    public final Integer b;
    public final String c;

    public mis(int i, Integer num, String str) {
        this.a = i;
        this.b = num;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mis)) {
            return false;
        }
        mis misVar = (mis) obj;
        return this.a == misVar.a && affa.f(this.b, misVar.b) && affa.f(this.c, misVar.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = this.a;
        String str = this.c;
        return (((i * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PlaybackStateBaseData(state=" + this.a + ", errorCode=" + this.b + ", errorMessage=" + this.c + ")";
    }
}
