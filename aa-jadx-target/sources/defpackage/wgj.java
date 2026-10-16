package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wgj extends defpackage.wgm implements defpackage.wgb, defpackage.wga {
    private final java.io.FileInputStream a;
    private final java.io.File b;

    public wgj(java.io.FileInputStream fileInputStream, java.io.File file) {
        super(fileInputStream);
        this.a = fileInputStream;
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
