package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
final class jgg implements jgf {
    final /* synthetic */ jgi a;
    private final rrc b;
    private final rrc c;
    private final rrc d;
    private final rrc e;
    private final rrc f;
    private final rrc g;
    private final rrc h;

    public jgg(jgi jgiVar, yzy yzyVar, yzy yzyVar2, yzy yzyVar3, yzy yzyVar4, yzy yzyVar5, yzy yzyVar6, yzy yzyVar7) {
        this.a = jgiVar;
        yxy yxyVar = yxy.CAR_SERVICE;
        yzz yzzVar = yzz.PROJECTION_WINDOW_MANAGER;
        this.b = (rrc) rrc.h(yxyVar, yzzVar, yzyVar).l();
        this.c = (rrc) rrc.h(yxyVar, yzzVar, yzyVar2).l();
        this.d = (rrc) rrc.h(yxyVar, yzzVar, yzyVar3).l();
        this.e = (rrc) rrc.h(yxyVar, yzzVar, yzyVar4).l();
        this.f = (rrc) rrc.h(yxyVar, yzzVar, yzyVar5).l();
        this.g = (rrc) rrc.h(yxyVar, yzzVar, yzyVar6).l();
        this.h = (rrc) rrc.h(yxyVar, yzzVar, yzyVar7).l();
    }

    @Override // defpackage.jgf
    public final void a(Duration duration) {
        long seconds = duration.toSeconds();
        if (seconds >= 21) {
            jgi jgiVar = this.a;
            jgiVar.g.c(this.h, 1);
            return;
        }
        if (seconds >= 13) {
            jgi jgiVar2 = this.a;
            jgiVar2.g.c(this.g, 1);
            return;
        }
        if (seconds >= 8) {
            jgi jgiVar3 = this.a;
            jgiVar3.g.c(this.f, 1);
            return;
        }
        if (seconds >= 5) {
            jgi jgiVar4 = this.a;
            jgiVar4.g.c(this.e, 1);
            return;
        }
        if (seconds >= 3) {
            jgi jgiVar5 = this.a;
            jgiVar5.g.c(this.d, 1);
        } else if (seconds >= 2) {
            jgi jgiVar6 = this.a;
            jgiVar6.g.c(this.c, 1);
        } else if (seconds >= 1) {
            jgi jgiVar7 = this.a;
            jgiVar7.g.c(this.b, 1);
        }
    }
}
