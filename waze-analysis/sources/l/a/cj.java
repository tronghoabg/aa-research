package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class cj extends com.google.v.dm<ck, cj> implements cl {
    /* synthetic */ cj(byte[] bArr) {
        super(ck.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((ck) this.instance).setAlertId(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ck) this.instance).setAlertUuid(str);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((ck) this.instance).setSubtype(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((ck) this.instance).setType(j2);
    }

    private cj() {
        throw null;
    }
}
