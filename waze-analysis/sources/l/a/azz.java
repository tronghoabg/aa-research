package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azz extends com.google.v.dm<bab, azz> implements com.google.v.fj {
    /* synthetic */ azz(byte[] bArr) {
        super(bab.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bab) this.instance).addAllAlerterInfo(iterable);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bab) this.instance).setSegmentId(str);
    }

    public final void c(bae baeVar) {
        copyOnWrite();
        ((bab) this.instance).setSegmentInsightType(baeVar);
    }

    private azz() {
        throw null;
    }
}
