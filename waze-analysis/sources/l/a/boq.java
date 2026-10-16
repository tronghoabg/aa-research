package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class boq extends com.google.v.dm<bor, boq> implements com.google.v.fj {
    /* synthetic */ boq(byte[] bArr) {
        super(bor.DEFAULT_INSTANCE);
    }

    public final void a(bop bopVar) {
        copyOnWrite();
        ((bor) this.instance).setAction(bopVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bor) this.instance).setBirthdateTimestampSeconds(j2);
    }

    private boq() {
        throw null;
    }
}
