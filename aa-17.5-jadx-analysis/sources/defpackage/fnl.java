package defpackage;

/* loaded from: classes2.dex */
public final class fnl extends eyn {
    @Override // defpackage.eyn
    protected final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.eyn
    public final /* bridge */ /* synthetic */ void b(fbk fbkVar, Object obj) {
        sx sxVar = (sx) obj;
        fbkVar.h(1, (String) sxVar.b);
        fbkVar.h(2, (String) sxVar.a);
    }
}
