package defpackage;

/* loaded from: classes3.dex */
public final class szf implements aedp {
    private final afec a;
    private final /* synthetic */ int b;

    public szf(afec afecVar, int i) {
        this.b = i;
        this.a = afecVar;
    }

    @Override // defpackage.aedp
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ((ype) szh.a.e()).u("Fetched smart actions");
        } else if (i != 1) {
            ((ype) szh.a.e()).u("Stopped assistant session");
        } else {
            ((ype) szh.a.e()).u("Fetched setting");
        }
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        int i = this.b;
        if (i == 0) {
            ((ype) ((ype) szh.a.g()).p(th)).u("Error fetching smart actions");
            this.a.invoke(null);
        } else if (i != 1) {
            ((ype) ((ype) szh.a.g()).p(th)).u("Error stopping assistant session");
            this.a.invoke(th);
        } else {
            ((ype) ((ype) szh.a.g()).p(th)).u("Error fetching settings");
            this.a.invoke(null);
        }
    }

    @Override // defpackage.aedp
    public final /* synthetic */ void c(Object obj) {
        int i = this.b;
        if (i == 0) {
            tab tabVar = (tab) obj;
            tabVar.getClass();
            this.a.invoke(tabVar);
        } else {
            if (i != 1) {
                ((tay) obj).getClass();
                return;
            }
            tar tarVar = (tar) obj;
            tarVar.getClass();
            this.a.invoke(tarVar);
        }
    }
}
