package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acl extends com.google.v.dm<acn, acl> implements com.google.v.fj {
    /* synthetic */ acl(byte[] bArr) {
        super(acn.DEFAULT_INSTANCE);
    }

    public final void a(acq acqVar) {
        copyOnWrite();
        ((acn) this.instance).setButtonSection(acqVar);
    }

    public final void b(ack ackVar) {
        copyOnWrite();
        ((acn) this.instance).setClickedButton(ackVar);
    }

    public final void c(acm acmVar) {
        copyOnWrite();
        ((acn) this.instance).setInCarScreenMode(acmVar);
    }

    private acl() {
        throw null;
    }
}
