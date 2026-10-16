package i.b.l;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aj extends com.google.v.dm<ao, aj> implements com.google.v.fj {
    /* synthetic */ aj(byte[] bArr) {
        super(ao.DEFAULT_INSTANCE);
    }

    public final void a(ak akVar) {
        copyOnWrite();
        ((ao) this.instance).addClientApi(akVar.build());
    }

    public final void b(ap apVar) {
        copyOnWrite();
        ((ao) this.instance).addDisplay(apVar.build());
    }

    public final void c(i.b.m mVar) {
        copyOnWrite();
        ((ao) this.instance).setAppFlavor(mVar);
    }

    public final void d(i.b.n nVar) {
        copyOnWrite();
        ((ao) this.instance).setAppType(nVar);
    }

    public final void e() {
        copyOnWrite();
        ((ao) this.instance).setClientVersion("5.20.90.901");
    }

    public final void f(long j2) {
        copyOnWrite();
        ((ao) this.instance).setCurrentTimeMillis(j2);
    }

    public final void g(i.b.al alVar) {
        copyOnWrite();
        ((ao) this.instance).setDebugOptions(alVar.build());
    }

    public final void h(String str) {
        copyOnWrite();
        ((ao) this.instance).setDeviceBrand(str);
    }

    public final void i(i.b.u uVar) {
        copyOnWrite();
        ((ao) this.instance).setDeviceType(uVar);
    }

    public final void j(String str) {
        copyOnWrite();
        ((ao) this.instance).setInstallationId(str);
    }

    public final void k(boolean z) {
        copyOnWrite();
        ((ao) this.instance).setIs24HourFormat(z);
    }

    public final void l(i.b.s sVar) {
        copyOnWrite();
        ((ao) this.instance).setLastPosition(sVar);
    }

    public final void m(String str) {
        copyOnWrite();
        ((ao) this.instance).setLocale(str);
    }

    public final void n(String str) {
        copyOnWrite();
        ((ao) this.instance).setManufactorer(str);
    }

    public final void o(String str) {
        copyOnWrite();
        ((ao) this.instance).setModel(str);
    }

    public final void p(String str) {
        copyOnWrite();
        ((ao) this.instance).setOsLanguageId(str);
    }

    public final void q(String str) {
        copyOnWrite();
        ((ao) this.instance).setOsVersion(str);
    }

    public final void r() {
        copyOnWrite();
        ((ao) this.instance).setProtocol(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_2);
    }

    public final void s(String str) {
        copyOnWrite();
        ((ao) this.instance).setSessionUuid(str);
    }

    public final void t(boolean z) {
        copyOnWrite();
        ((ao) this.instance).setSimulated(z);
    }

    public final void u(String str) {
        copyOnWrite();
        ((ao) this.instance).setUserAgent(str);
    }

    private aj() {
        throw null;
    }
}
