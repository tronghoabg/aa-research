package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class wfl extends wfo implements wfc, wfb {
    public final FileOutputStream a;
    private final File b;

    public wfl(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.wfb
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.wfc
    public final File b() {
        return this.b;
    }
}
