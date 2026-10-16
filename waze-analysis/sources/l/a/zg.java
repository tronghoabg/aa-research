package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zg extends com.google.v.dm<zh, zg> implements com.google.v.fj {
    /* synthetic */ zg(byte[] bArr) {
        super(zh.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((zh) this.instance).setAdImpressionId(str);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((zh) this.instance).setIsTest(z);
    }

    public final void c(String str) {
        copyOnWrite();
        ((zh) this.instance).setPlaceId(str);
    }

    private zg() {
        throw null;
    }
}
