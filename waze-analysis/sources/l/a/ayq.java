package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayq extends com.google.v.dm<ayr, ayq> implements ayv {
    /* synthetic */ ayq(byte[] bArr) {
        super(ayr.DEFAULT_INSTANCE);
    }

    public final void a(ayu ayuVar) {
        copyOnWrite();
        ((ayr) this.instance).setFilterField(ayuVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ayr) this.instance).setFilterValue(str);
    }

    private ayq() {
        throw null;
    }
}
