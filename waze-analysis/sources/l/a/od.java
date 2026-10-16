package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class od extends com.google.v.dm<oe, od> implements com.google.v.fj {
    /* synthetic */ od(byte[] bArr) {
        super(oe.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((oe) this.instance).setAlertId(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((oe) this.instance).setReportId(str);
    }

    public final void c(boa boaVar) {
        copyOnWrite();
        ((oe) this.instance).setReportSubtype(boaVar);
    }

    private od() {
        throw null;
    }
}
