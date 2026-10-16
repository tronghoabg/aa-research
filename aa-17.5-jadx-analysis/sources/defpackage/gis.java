package defpackage;

/* loaded from: classes.dex */
public final class gis implements aiyl {
    final /* synthetic */ affv a;
    final /* synthetic */ aitx b;
    final /* synthetic */ git c;

    public gis(affv affvVar, aitx aitxVar, git gitVar) {
        this.a = affvVar;
        this.b = aitxVar;
        this.c = gitVar;
    }

    @Override // defpackage.aiyl
    public final /* bridge */ /* synthetic */ Object a(Object obj, afck afckVar) {
        asd asdVar = (asd) obj;
        if (asdVar instanceof asi) {
            affv affvVar = this.a;
            aitx aitxVar = this.b;
            git gitVar = this.c;
            affvVar.a = ahnc.d(aitxVar, null, 0, new dmx(gitVar, (afck) null, 8), 3);
            afdr afdrVar = gitVar.b;
            if (afdrVar != null) {
                afdrVar.invoke();
            }
        } else if (asdVar instanceof asj) {
            affv affvVar2 = this.a;
            aivh aivhVar = (aivh) affvVar2.a;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
            affvVar2.a = null;
            afdr afdrVar2 = this.c.c;
            if (afdrVar2 != null) {
                afdrVar2.invoke();
            }
        } else if (asdVar instanceof ash) {
            affv affvVar3 = this.a;
            aivh aivhVar2 = (aivh) affvVar3.a;
            if (aivhVar2 != null) {
                aivhVar2.s(null);
            }
            affvVar3.a = null;
            afdr afdrVar3 = this.c.d;
            if (afdrVar3 != null) {
                afdrVar3.invoke();
            }
        }
        return afak.a;
    }
}
