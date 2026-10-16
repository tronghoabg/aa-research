package defpackage;

import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agqw extends agqx {
    private int flags;
    private final boolean lenient;
    private final Metadata original;
    private agqo version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqw(Metadata metadata, boolean z) {
        super(null);
        metadata.getClass();
        this.original = metadata;
        this.lenient = z;
        this.version = new agqo(metadata.mv());
        this.flags = metadata.xi();
    }
}
