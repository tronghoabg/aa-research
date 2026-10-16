package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fy extends com.google.v.dm<fz, fy> implements com.google.v.fj {
    /* synthetic */ fy(byte[] bArr) {
        super(fz.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((fz) this.instance).setAudioDeviceName(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((fz) this.instance).setAudioDeviceType(str);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((fz) this.instance).setDetectionTimestampMs(j2);
    }

    private fy() {
        throw null;
    }
}
