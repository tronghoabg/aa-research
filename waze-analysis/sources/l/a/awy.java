package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awy extends com.google.v.dm<awz, awy> implements com.google.v.fj {
    /* synthetic */ awy(byte[] bArr) {
        super(awz.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((awz) this.instance).setEtaShown(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((awz) this.instance).setLeaveArriveShown(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((awz) this.instance).setRtTrafficShown(z);
    }

    private awy() {
        throw null;
    }
}
