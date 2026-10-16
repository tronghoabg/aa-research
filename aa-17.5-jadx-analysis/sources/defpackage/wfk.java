package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class wfk extends wfn implements wfc, wfb {
    private final FileInputStream a;
    private final File b;

    public wfk(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
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
