package defpackage;

/* loaded from: classes3.dex */
public final class aiyq extends afde implements afeh {
    Object a;
    Object b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ long e;
    final /* synthetic */ aiyk f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiyq(long j, aiyk aiykVar, afck afckVar) {
        super(3, afckVar);
        this.e = j;
        this.f = aiykVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        aiyl aiylVar;
        aixx aixxVarC;
        Object affvVar;
        aixx aixxVarC2;
        ajdw ajdwVar;
        afcr afcrVar = afcr.a;
        if (this.c != 0) {
            Object obj2 = this.b;
            affvVar = this.a;
            aixxVarC = (aixx) this.d;
            aiylVar = (aiyl) this.g;
            woy.dF(obj);
            aixxVarC2 = obj2;
        } else {
            woy.dF(obj);
            aitx aitxVar = (aitx) this.g;
            aiylVar = (aiyl) this.d;
            aixxVarC = aimh.c(aitxVar, afcp.a, -1, 1, 1, new epm(this.f, (afck) null, 4, (byte[]) null));
            affvVar = new affv();
            aixxVarC2 = aimh.c(aitxVar, afcp.a, 0, 1, 1, new aiyo(this.e, null));
        }
        do {
            affv affvVar2 = (affv) affvVar;
            if (affvVar2.a == ajbb.c) {
                return afak.a;
            }
            hH();
            ajdwVar = new ajdw();
            ajdwVar.h(aixxVarC.C(), new aiyp(affvVar2, aixxVarC2, null));
            ajdwVar.h(((aixm) aixxVarC2).b.B(), new nkn(affvVar2, aiylVar, (afck) null, 19));
            this.g = aiylVar;
            this.d = aixxVarC;
            this.a = affvVar;
            this.b = aixxVarC2;
            this.c = 1;
        } while ((ajdwVar.a.a instanceof ajdt ? ajdwVar.c(this) : ajdwVar.d(this)) != afcrVar);
        return afcrVar;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        aiyq aiyqVar = new aiyq(this.e, this.f, (afck) obj3);
        aiyqVar.g = (aitx) obj;
        aiyqVar.d = (aiyl) obj2;
        return aiyqVar.hT(afak.a);
    }
}
