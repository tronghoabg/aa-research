package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aeq extends com.google.v.dm<aet, aeq> implements com.google.v.fj {
    /* synthetic */ aeq(byte[] bArr) {
        super(aet.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((aet) this.instance).addAllAlerterInfo(iterable);
    }

    public final void b(String str) {
        copyOnWrite();
        ((aet) this.instance).setImpressionId(str);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((aet) this.instance).setIsPersonalizedSegment(z);
    }

    public final void d(String str) {
        copyOnWrite();
        ((aet) this.instance).setSegmentId(str);
    }

    public final void e(bae baeVar) {
        copyOnWrite();
        ((aet) this.instance).setSegmentInsightType(baeVar);
    }

    public final void f(aes aesVar) {
        copyOnWrite();
        ((aet) this.instance).setUserPosition(aesVar);
    }

    private aeq() {
        throw null;
    }
}
