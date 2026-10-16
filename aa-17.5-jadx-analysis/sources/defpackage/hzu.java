package defpackage;

/* loaded from: classes2.dex */
public final class hzu implements hzh {
    public static final hul a = new hul("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, hul.a);
    private final gms b;

    public hzu(gms gmsVar) {
        this.b = gmsVar;
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ ncp b(Object obj, int i, int i2, hum humVar) {
        hyx hyxVar = (hyx) obj;
        hzg hzgVarB = hzg.b(hyxVar);
        ifu ifuVar = (ifu) this.b.a;
        Object objF = ifuVar.f(hzgVarB);
        hzgVarB.a();
        hyx hyxVar2 = (hyx) objF;
        if (hyxVar2 == null) {
            ifuVar.g(hzg.b(hyxVar), hyxVar);
        } else {
            hyxVar = hyxVar2;
        }
        return new ncp(hyxVar, new hve(hyxVar, ((Integer) humVar.b(a)).intValue()));
    }
}
