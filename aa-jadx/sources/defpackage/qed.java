package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qed {
    private final int a;

    public qed(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((defpackage.qed) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
