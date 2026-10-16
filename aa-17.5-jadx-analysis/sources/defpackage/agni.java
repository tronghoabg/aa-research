package defpackage;

/* loaded from: classes3.dex */
public final class agni extends agng {
    private final long value;

    public agni(long j) {
        super(null);
        this.value = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agni) && this.value == ((agni) obj).value;
    }

    @Override // defpackage.agng
    public Long getValue() {
        return Long.valueOf(this.value);
    }

    public int hashCode() {
        return agnh.m(this.value);
    }
}
