package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qn extends com.google.v.dm<qq, qn> implements com.google.v.fj {
    /* synthetic */ qn(byte[] bArr) {
        super(qq.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((qq) this.instance).setChipIndex(j2);
    }

    public final void b(qo qoVar) {
        copyOnWrite();
        ((qq) this.instance).setChipTrigger(qoVar);
    }

    public final void c(afx afxVar) {
        copyOnWrite();
        ((qq) this.instance).setDestinationCoordinates(afxVar);
    }

    public final void d(qp qpVar) {
        copyOnWrite();
        ((qq) this.instance).setDestinationType(qpVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((qq) this.instance).setVenueId(str);
    }

    private qn() {
        throw null;
    }
}
