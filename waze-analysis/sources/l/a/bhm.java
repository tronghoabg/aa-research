package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhm extends com.google.v.dm<bhn, bhm> implements com.google.v.fj {
    /* synthetic */ bhm(byte[] bArr) {
        super(bhn.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bhn) this.instance).addAllCategories(iterable);
    }

    public final void b(afx afxVar) {
        copyOnWrite();
        ((bhn) this.instance).setLocationCoordinates(afxVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bhn) this.instance).setVenueId(str);
    }

    private bhm() {
        throw null;
    }
}
