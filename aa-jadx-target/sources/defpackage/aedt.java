package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aedt implements adne {
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();
    public final defpackage.abpy a;
    private final abqe c;

    public aedt(defpackage.abpy abpyVar) {
        abpyVar.getClass();
        this.a = abpyVar;
        this.c = abpyVar.M();
    }

    public final /* bridge */ /* synthetic */ java.io.InputStream a(java.lang.Object obj) {
        return new defpackage.aeds((defpackage.abpy) obj, this.c);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object b(java.io.InputStream inputStream) {
        defpackage.abny abnyVarL;
        byte[] bArr;
        if (inputStream instanceof defpackage.aeds) {
            defpackage.aeds aedsVar = (defpackage.aeds) inputStream;
            if (aedsVar.b == this.c) {
                try {
                    defpackage.abpy abpyVar = aedsVar.a;
                    if (abpyVar != null) {
                        return abpyVar;
                    }
                    throw new java.lang.IllegalStateException("message not available");
                } catch (java.lang.IllegalStateException unused) {
                }
            }
        }
        try {
            if (inputStream instanceof adlv) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.a;
                    }
                    abnyVarL = null;
                } else {
                    java.lang.ThreadLocal threadLocal = b;
                    java.lang.ref.Reference reference = (java.lang.ref.Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new java.lang.ref.WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new java.lang.RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    abnyVarL = defpackage.abny.N(bArr, 0, iAvailable);
                }
            } else {
                abnyVarL = null;
            }
            if (abnyVarL == null) {
                abnyVarL = defpackage.abny.L(inputStream);
            }
            abnyVarL.j = Integer.MAX_VALUE;
            try {
                java.lang.Object objH = this.c.h(abnyVarL, defpackage.aedu.a);
                try {
                    abnyVarL.z(0);
                    return objH;
                } catch (defpackage.abpp e) {
                    throw e;
                }
            } catch (defpackage.abpp e2) {
                throw new defpackage.adou(defpackage.ador.l.e("Invalid protobuf byte sequence").d(e2), null);
            }
        } catch (java.io.IOException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
