package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajzt implements defpackage.ajvp, defpackage.ajvq {
    private final defpackage.ajvo a = new defpackage.ajzs(null);

    @Override // defpackage.ajvp
    public final defpackage.ajvo a(defpackage.akbs akbsVar) {
        if (akbsVar == null) {
            return new defpackage.ajzs(null);
        }
        java.util.Collection collection = (java.util.Collection) akbsVar.a("http.protocol.cookie-datepatterns");
        return new defpackage.ajzs(collection != null ? (java.lang.String[]) collection.toArray(new java.lang.String[collection.size()]) : null);
    }

    @Override // defpackage.ajvq
    public final defpackage.ajvo b(defpackage.akca akcaVar) {
        return this.a;
    }
}
