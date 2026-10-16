package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hht implements defpackage.hhs {
    private final java.util.List a;

    public hht(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.hhs
    public final java.lang.String a(int i) {
        java.lang.Object obj = this.a.get(i);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
