package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agrw extends defpackage.agrx {
    private int flags;
    private final boolean lenient;
    private final kotlin.Metadata original;
    private defpackage.agro version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agrw(kotlin.Metadata metadata, boolean z) {
        super(null);
        metadata.getClass();
        this.original = metadata;
        this.lenient = z;
        this.version = new defpackage.agro(metadata.mv());
        this.flags = metadata.xi();
    }
}
