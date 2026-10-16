package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nyj implements java.util.function.Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ nyj(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            ((defpackage.yqj) defpackage.nyk.a.l().ai(5564)).y("movingToState: %s", (defpackage.nyi) obj);
            return;
        }
        if (i == 1) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.iro.a.f()).ai((char) 1238)).u("clearUsageAssistantFocusLoss");
            defpackage.iro iroVar = (defpackage.iro) ((defpackage.izq) obj).a;
            iroVar.f = 0;
            iroVar.a(null);
            return;
        }
        if (i == 2) {
            return;
        }
        if (i == 3) {
        } else if (i != 4) {
            ((java.util.Map) obj).clear();
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.a;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 3) {
            return i != 4 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
