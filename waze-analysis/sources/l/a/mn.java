package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mn extends com.google.v.dm<mp, mn> implements com.google.v.fj {
    /* synthetic */ mn(byte[] bArr) {
        super(mp.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((mp) this.instance).setConversationId(str);
    }

    public final void b(mo moVar) {
        copyOnWrite();
        ((mp) this.instance).setService(moVar);
    }

    private mn() {
        throw null;
    }
}
