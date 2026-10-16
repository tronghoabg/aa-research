package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xd {
    public androidx.car.app.navigation.model.MapController a;
    public defpackage.wi b = new defpackage.xc();
    public androidx.car.app.model.ActionStrip c;

    public final androidx.car.app.navigation.model.MapWithContentTemplate a() {
        defpackage.xr.b.a(this.b);
        return new androidx.car.app.navigation.model.MapWithContentTemplate(this);
    }

    public final void b(androidx.car.app.model.ActionStrip actionStrip) {
        defpackage.wm.c.a(actionStrip.getActions());
        this.c = actionStrip;
    }
}
