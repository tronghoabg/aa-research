package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ipf extends defpackage.ioi {
    public static final /* synthetic */ int f = 0;

    @Override // defpackage.ioi
    protected final defpackage.inn a(final defpackage.iof iofVar, final defpackage.ioh iohVar, int i, boolean z) {
        java.util.List list = this.e;
        if (!list.isEmpty()) {
            return (defpackage.inn) list.get(0);
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = iofVar.i;
        defpackage.jkr jkrVarJ = iohVar.j(carRegionId.h);
        final android.content.ComponentName componentName = iofVar.b;
        return new defpackage.iph(iohVar, this, i, jkrVarJ, carRegionId, iofVar, (componentName == null || android.os.Build.VERSION.SDK_INT < 33) ? defpackage.ipc.a : new defpackage.ipc() { // from class: ipe
            @Override // defpackage.ipc
            public final j$.util.Optional a() {
                int i2 = defpackage.ipf.f;
                defpackage.iof iofVar2 = iofVar;
                android.content.ComponentName component = iofVar2.c.getComponent();
                com.google.android.gms.car.display.CarDisplayId carDisplayId = iofVar2.i.h;
                defpackage.ioh iohVar2 = iohVar;
                int iD = iohVar2.j(carDisplayId).d();
                android.graphics.Rect rect = iofVar2.j;
                int iWidth = rect.width();
                int iHeight = rect.height();
                android.content.Context context = iohVar2.d;
                context.getClass();
                component.getClass();
                defpackage.jmp jmpVarF = defpackage.fzv.n(context).f(defpackage.ebm.n());
                java.util.Objects.toString(component);
                return j$.util.Optional.of(new defpackage.ipr(context, componentName, component, new defpackage.ipo(iWidth, iHeight, iD, 1, jmpVarF, false, "GhostActivityDisplay:".concat(component.toString()), false, null)));
            }
        }, new defpackage.ilu(iohVar, 7));
    }
}
