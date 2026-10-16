package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kf extends com.google.v.dm<kg, kf> implements com.google.v.fj {
    /* synthetic */ kf(byte[] bArr) {
        super(kg.DEFAULT_INSTANCE);
    }

    public final void a(ke keVar) {
        copyOnWrite();
        ((kg) this.instance).setAlerterType(keVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((kg) this.instance).setTimeoutSeconds(j2);
    }

    private kf() {
        throw null;
    }
}
