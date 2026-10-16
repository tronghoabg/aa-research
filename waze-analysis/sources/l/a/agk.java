package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agk extends com.google.v.dm<agl, agk> implements agm {
    /* synthetic */ agk(byte[] bArr) {
        super(agl.DEFAULT_INSTANCE);
    }

    public final void a(afx afxVar) {
        copyOnWrite();
        ((agl) this.instance).setCoordinates(afxVar);
    }

    public final void b(agz agzVar) {
        copyOnWrite();
        ((agl) this.instance).setLocationProvider(agzVar);
    }

    public final void c(aha ahaVar) {
        copyOnWrite();
        ((agl) this.instance).setLocationSource(ahaVar);
    }

    private agk() {
        throw null;
    }
}
