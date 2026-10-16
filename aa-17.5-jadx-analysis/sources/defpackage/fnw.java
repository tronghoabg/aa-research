package defpackage;

/* loaded from: classes2.dex */
public final class fnw extends eyn {
    @Override // defpackage.eyn
    protected final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.eyn
    public final /* bridge */ /* synthetic */ void b(fbk fbkVar, Object obj) {
        fbkVar.h(1, ((fnt) obj).a);
        fbkVar.f(2, r4.b);
        fbkVar.f(3, r4.c);
    }
}
