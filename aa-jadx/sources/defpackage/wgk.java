package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wgk extends defpackage.wgn implements defpackage.wgb, defpackage.wga {
    public final java.io.FileOutputStream a;
    private final java.io.File b;

    public wgk(java.io.FileOutputStream fileOutputStream, java.io.File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.wga
    public final java.nio.channels.FileChannel a() {
        return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.wgb
    public final java.io.File b() {
        return this.b;
    }
}
