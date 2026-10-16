package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fod extends defpackage.eyt {
    @Override // defpackage.eyt
    protected final java.lang.String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.eyt
    public final /* bridge */ /* synthetic */ void b(defpackage.fbr fbrVar, java.lang.Object obj) {
        defpackage.foa foaVar = (defpackage.foa) obj;
        fbrVar.h(1, foaVar.a);
        fbrVar.f(2, foaVar.b);
        fbrVar.f(3, foaVar.c);
    }
}
