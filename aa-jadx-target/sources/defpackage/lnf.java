package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lnf extends defpackage.mdl {
    final /* synthetic */ defpackage.lni a;

    public lnf(defpackage.lni lniVar) {
        this.a = lniVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("MediaKeyReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        android.view.KeyEvent keyEvent;
        com.google.android.gms.car.CarInfo carInfoB;
        int i;
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        defpackage.yqm yqmVar = defpackage.lni.a;
        ((defpackage.yqj) yqmVar.l().ai(4021)).w("Received media key %d", keyEvent.getKeyCode());
        if (defpackage.actz.A() && this.a.k && (((carInfoB = defpackage.kiv.a().b()) == null || (i = carInfoB.e) <= 0 || (i == 1 && carInfoB.f < 6)) && (keyEvent.getKeyCode() == 126 || keyEvent.getKeyCode() == 85))) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4024)).u("Ignoring media play key during startup timeout.");
            return;
        }
        boolean zE = defpackage.lmp.a().e();
        defpackage.lni lniVar = this.a;
        if (!zE) {
            lok lokVar = ((defpackage.lnb) lniVar.c).e;
            if (lokVar instanceof lok) {
                lokVar.i.h(defpackage.zbe.MEDIA_FACET).a(keyEvent);
                return;
            }
            return;
        }
        defpackage.ltn ltnVar = lniVar.j ? lniVar.e : lniVar.d;
        if (ltnVar == null || ltnVar.b() == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(4022)).K("%s or its transport controls null, DROPPING media key %d", true != lniVar.j ? "mediaViewModel" : "phoneMediaViewModel", keyEvent.getKeyCode());
        } else {
            ((defpackage.yqj) yqmVar.l().ai(4023)).D("Dispatching media key %d to %s media app", keyEvent.getKeyCode(), true != lniVar.j ? "current" : "phone");
            ltnVar.b().a(keyEvent);
        }
    }
}
