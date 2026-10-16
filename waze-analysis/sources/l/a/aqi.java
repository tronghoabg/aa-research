package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqi extends com.google.v.dm<aqj, aqi> implements com.google.v.fj {
    /* synthetic */ aqi(byte[] bArr) {
        super(aqj.DEFAULT_INSTANCE);
    }

    public final void a(aqh aqhVar) {
        copyOnWrite();
        ((aqj) this.instance).setAction(aqhVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((aqj) this.instance).setPassType(str);
    }

    private aqi() {
        throw null;
    }
}
