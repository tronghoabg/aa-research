package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahga extends defpackage.ahgb {
    private final byte[] byteContent;
    private final defpackage.ahgj kotlinJvmBinaryClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahga(defpackage.ahgj ahgjVar, byte[] bArr) {
        super(null);
        ahgjVar.getClass();
        this.kotlinJvmBinaryClass = ahgjVar;
        this.byteContent = bArr;
    }

    public final defpackage.ahgj getKotlinJvmBinaryClass() {
        return this.kotlinJvmBinaryClass;
    }

    public /* synthetic */ ahga(defpackage.ahgj ahgjVar, byte[] bArr, int i, defpackage.affu affuVar) {
        this(ahgjVar, (i & 2) != 0 ? null : bArr);
    }
}
