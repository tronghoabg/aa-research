package defpackage;

/* loaded from: classes2.dex */
public final class fnp extends eyn {
    @Override // defpackage.eyn
    protected final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.eyn
    public final /* bridge */ /* synthetic */ void b(fbk fbkVar, Object obj) {
        fnn fnnVar = (fnn) obj;
        fbkVar.h(1, fnnVar.a);
        fbkVar.f(2, fnnVar.b.longValue());
    }
}
