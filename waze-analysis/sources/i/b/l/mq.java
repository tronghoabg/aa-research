package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mq extends com.google.v.dm<my, mq> implements com.google.v.fj {
    /* synthetic */ mq(byte[] bArr) {
        super(my.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((my) this.instance).addAllPermits(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((my) this.instance).addAllRoutingOptions(iterable);
    }

    public final void c(mw mwVar) {
        copyOnWrite();
        ((my) this.instance).addRouteDurationRequests(mwVar);
    }

    public final void d(on onVar) {
        copyOnWrite();
        ((my) this.instance).setEvData(onVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((my) this.instance).setLicensePlateSuffix(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((my) this.instance).setVehicleType(str);
    }

    private mq() {
        throw null;
    }
}
