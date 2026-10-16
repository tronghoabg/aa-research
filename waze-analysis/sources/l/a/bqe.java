package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqe extends com.google.v.dm<bqf, bqe> implements com.google.v.fj {
    /* synthetic */ bqe(byte[] bArr) {
        super(bqf.DEFAULT_INSTANCE);
    }

    public final void a(bqd bqdVar) {
        copyOnWrite();
        ((bqf) this.instance).setAction(bqdVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bqf) this.instance).setCustom(z);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bqf) this.instance).setVoiceId(str);
    }

    private bqe() {
        throw null;
    }
}
