package defpackage;

/* loaded from: classes3.dex */
public final class adlv extends adlx {
    public adlv(String str, adqs adqsVar) {
        super(str, false, adqsVar);
        woy.W(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        woy.O(str.length() > 4, "empty key name");
        adqsVar.getClass();
    }

    @Override // defpackage.adlx
    public final byte[] b(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.adlx
    public final Object a(byte[] bArr) {
        return bArr;
    }
}
