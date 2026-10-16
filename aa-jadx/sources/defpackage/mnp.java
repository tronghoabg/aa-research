package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnp implements defpackage.mno {
    private final java.util.List a;

    public mnp(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.mno
    public final java.lang.String a(int i) {
        java.lang.Object obj = this.a.get(i);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
