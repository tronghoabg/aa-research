package defpackage;

/* loaded from: classes3.dex */
public final class ahfa extends ahfb {
    private final byte[] byteContent;
    private final ahfj kotlinJvmBinaryClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfa(ahfj ahfjVar, byte[] bArr) {
        super(null);
        ahfjVar.getClass();
        this.kotlinJvmBinaryClass = ahfjVar;
        this.byteContent = bArr;
    }

    public final ahfj getKotlinJvmBinaryClass() {
        return this.kotlinJvmBinaryClass;
    }

    public /* synthetic */ ahfa(ahfj ahfjVar, byte[] bArr, int i, afeu afeuVar) {
        this(ahfjVar, (i & 2) != 0 ? null : bArr);
    }
}
