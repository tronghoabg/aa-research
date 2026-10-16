package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zst {
    public static final defpackage.zst a = new defpackage.zst();

    /* JADX WARN: Type inference failed for: r3v2, types: [abpy, java.lang.Object] */
    public static final defpackage.abpy a(defpackage.abqe abqeVar, java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int i = dataInputStream.readInt();
        java.io.InputStream zshVar = new defpackage.zsh(dataInputStream, java.lang.Math.abs(i));
        if (i < 0) {
            zshVar = new java.util.zip.GZIPInputStream(zshVar);
        }
        try {
            return abqeVar.e(zshVar);
        } finally {
            zshVar.close();
        }
    }

    public static final void b(java.io.OutputStream outputStream, defpackage.abpy abpyVar) throws java.io.IOException {
        new java.io.DataOutputStream(outputStream).writeInt(abpyVar.m());
        abpyVar.g(outputStream);
    }
}
