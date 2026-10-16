package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahu extends com.google.v.dm<ahw, ahu> implements com.google.v.fj {
    /* synthetic */ ahu(byte[] bArr) {
        super(ahw.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ahw) this.instance).setChangedFrom(str);
    }

    public final void b(fv fvVar) {
        copyOnWrite();
        ((ahw) this.instance).setChangedSource(fvVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ahw) this.instance).setChangedTo(str);
    }

    private ahu() {
        throw null;
    }
}
