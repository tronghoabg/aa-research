package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aab extends com.google.v.dm<aac, aab> implements com.google.v.fj {
    /* synthetic */ aab(byte[] bArr) {
        super(aac.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((aac) this.instance).setAndroidInvocationCode(str);
    }

    public final void b(aaj aajVar) {
        copyOnWrite();
        ((aac) this.instance).setSourceType(aajVar);
    }

    private aab() {
        throw null;
    }
}
