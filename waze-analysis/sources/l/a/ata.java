package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ata extends com.google.v.dm<atc, ata> implements com.google.v.fj {
    /* synthetic */ ata(byte[] bArr) {
        super(atc.DEFAULT_INSTANCE);
    }

    public final void a(aso asoVar) {
        copyOnWrite();
        ((atc) this.instance).setPushMessageButtonClicked(asoVar.build());
    }

    public final void b(asq asqVar) {
        copyOnWrite();
        ((atc) this.instance).setPushMessageDismissed(asqVar.build());
    }

    public final void c(asu asuVar) {
        copyOnWrite();
        ((atc) this.instance).setPushMessageLaunched(asuVar.build());
    }

    public final void d(asx asxVar) {
        copyOnWrite();
        ((atc) this.instance).setPushMessageReceivedWhileNotRunning(asxVar);
    }

    public final void e(asz aszVar) {
        copyOnWrite();
        ((atc) this.instance).setPushMessageReceivedWhileRunning(aszVar);
    }

    private ata() {
        throw null;
    }
}
