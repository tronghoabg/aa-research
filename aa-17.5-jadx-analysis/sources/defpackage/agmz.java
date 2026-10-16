package defpackage;

/* loaded from: classes3.dex */
public final class agmz extends agng {
    private final char value;

    public agmz(char c) {
        super(null);
        this.value = c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agmz) && this.value == ((agmz) obj).value;
    }

    @Override // defpackage.agng
    public Character getValue() {
        return Character.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
