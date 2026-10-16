package defpackage;

/* loaded from: classes3.dex */
public final class agmx extends agng {
    private final boolean value;

    public agmx(boolean z) {
        super(null);
        this.value = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agmx) && this.value == ((agmx) obj).value;
    }

    @Override // defpackage.agng
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return agmw.m(this.value);
    }
}
