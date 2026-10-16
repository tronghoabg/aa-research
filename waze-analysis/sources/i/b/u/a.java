package i.b.u;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((b) this.instance).setEmailToken(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((b) this.instance).setPinCode(str);
    }

    public final void c() {
        copyOnWrite();
        ((b) this.instance).setUseNewErrorScheme(true);
    }

    public final void d(String str) {
        copyOnWrite();
        ((b) this.instance).setVerificationToken(str);
    }

    private a() {
        throw null;
    }
}
