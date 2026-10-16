package defpackage;

/* loaded from: classes.dex */
public final class adkz extends adlg {
    private final adlc a;

    public adkz(adlc adlcVar) {
        adlcVar.getClass();
        this.a = adlcVar;
    }

    @Override // defpackage.adlg
    public final adlc a(adld adldVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adkz) {
            return this.a.equals(((adkz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
