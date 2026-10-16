package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajrc implements defpackage.ajtl {
    private final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    @Override // defpackage.ajtl
    public final /* synthetic */ java.lang.Object a(java.lang.String str) {
        return new defpackage.ajrb(this, str);
    }

    public final void b(java.lang.String str, defpackage.ajqz ajqzVar) {
        this.a.put(str.toLowerCase(java.util.Locale.ENGLISH), ajqzVar);
    }

    public final defpackage.ajqy c(java.lang.String str) throws java.lang.IllegalStateException {
        defpackage.aguw.e(str, "Name");
        defpackage.ajqz ajqzVar = (defpackage.ajqz) this.a.get(str.toLowerCase(java.util.Locale.ENGLISH));
        if (ajqzVar != null) {
            return ajqzVar.a();
        }
        throw new java.lang.IllegalStateException("Unsupported authentication scheme: ".concat(java.lang.String.valueOf(str)));
    }
}
