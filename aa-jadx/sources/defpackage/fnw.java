package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fnw extends defpackage.eyt {
    @Override // defpackage.eyt
    protected final java.lang.String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.eyt
    public final /* bridge */ /* synthetic */ void b(defpackage.fbr fbrVar, java.lang.Object obj) {
        defpackage.fnu fnuVar = (defpackage.fnu) obj;
        fbrVar.h(1, fnuVar.a);
        fbrVar.f(2, fnuVar.b.longValue());
    }
}
