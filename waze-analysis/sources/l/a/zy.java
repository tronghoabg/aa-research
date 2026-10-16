package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zy extends com.google.v.dm<aaa, zy> implements com.google.v.fj {
    /* synthetic */ zy(byte[] bArr) {
        super(aaa.DEFAULT_INSTANCE);
    }

    public final void a(zw zwVar) {
        copyOnWrite();
        ((aaa) this.instance).setAction(zwVar);
    }

    public final void b(zx zxVar) {
        copyOnWrite();
        ((aaa) this.instance).setActionSubtype(zxVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((aaa) this.instance).setAndroidInvocationCode(str);
    }

    public final void d(zz zzVar) {
        copyOnWrite();
        ((aaa) this.instance).setDirection(zzVar);
    }

    public final void e(boa boaVar) {
        copyOnWrite();
        ((aaa) this.instance).setGaReportSubtype(boaVar);
    }

    public final void f(bob bobVar) {
        copyOnWrite();
        ((aaa) this.instance).setGaReportType(bobVar);
    }

    public final void g(aaj aajVar) {
        copyOnWrite();
        ((aaa) this.instance).setSourceType(aajVar);
    }

    public final void h(boolean z) {
        copyOnWrite();
        ((aaa) this.instance).setSuccessful(z);
    }

    private zy() {
        throw null;
    }
}
