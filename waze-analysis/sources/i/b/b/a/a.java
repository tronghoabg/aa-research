package i.b.b.a;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends dm<b, a> implements c {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((b) this.instance).setAudioChannelName(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((b) this.instance).setAudioChannelType(str);
    }

    private a() {
        throw null;
    }
}
