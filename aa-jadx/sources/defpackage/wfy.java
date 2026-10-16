package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wfy implements defpackage.wgu {
    public final defpackage.wgf a;

    public wfy(defpackage.wgf wgfVar) {
        this.a = wgfVar;
    }

    @Override // defpackage.wgu
    public final java.io.File c(android.net.Uri uri) throws java.io.IOException {
        return defpackage.sqs.bG(uri);
    }

    @Override // defpackage.wgu
    public final java.io.InputStream d(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileBG = defpackage.sqs.bG(uri);
        return new defpackage.wgj(new java.io.FileInputStream(fileBG), fileBG);
    }

    @Override // defpackage.wgu
    public final java.lang.String e() {
        return "file";
    }

    @Override // defpackage.wgu
    public final boolean f(android.net.Uri uri) throws java.io.IOException {
        return defpackage.sqs.bG(uri).exists();
    }

    @Override // defpackage.wgu
    public final void g(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileBG = defpackage.sqs.bG(uri);
        if (fileBG.isDirectory()) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s is a directory", uri));
        }
        if (fileBG.delete()) {
            return;
        }
        if (!fileBG.exists()) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s does not exist", uri));
        }
        throw new java.io.IOException(java.lang.String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.wgu
    public final void h(android.net.Uri uri, android.net.Uri uri2) throws java.io.IOException {
        java.io.File fileBG = defpackage.sqs.bG(uri);
        java.io.File fileBG2 = defpackage.sqs.bG(uri2);
        defpackage.ysr.h(fileBG2);
        if (!fileBG.renameTo(fileBG2)) {
            throw new java.io.IOException(java.lang.String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.wgu
    public final defpackage.wgf k() throws java.io.IOException {
        return this.a;
    }

    @Override // defpackage.wgu
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.io.OutputStream l(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileBG = defpackage.sqs.bG(uri);
        defpackage.ysr.h(fileBG);
        return new defpackage.wgk(new java.io.FileOutputStream(fileBG), fileBG);
    }
}
