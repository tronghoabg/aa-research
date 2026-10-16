package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aho extends com.google.v.dm<ahq, aho> implements com.google.v.fj {
    /* synthetic */ aho(byte[] bArr) {
        super(ahq.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ahq) this.instance).addAllItemsWithBadges(iterable);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ahq) this.instance).setMoodIconAssetId(str);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((ahq) this.instance).setPortrait(z);
    }

    private aho() {
        throw null;
    }
}
