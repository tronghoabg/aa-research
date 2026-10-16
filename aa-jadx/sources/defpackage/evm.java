package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evm extends defpackage.evs {
    public evm() {
        super(false);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        return java.lang.Integer.valueOf(defpackage.fbh.a(bundle, str));
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) {
        return defpackage.euf.a(str);
    }

    @Override // defpackage.evs
    public final java.lang.String e() {
        return "reference";
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ void f(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        bundle.putInt(str, ((java.lang.Number) obj).intValue());
    }
}
