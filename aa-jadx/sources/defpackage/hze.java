package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hze implements defpackage.hzd {
    private final /* synthetic */ int a;

    public hze(int i) {
        this.a = i;
    }

    @Override // defpackage.hzd
    public final java.lang.Class a() {
        return this.a != 0 ? android.os.ParcelFileDescriptor.class : java.io.InputStream.class;
    }

    @Override // defpackage.hzd
    public final /* synthetic */ java.lang.Object b(java.io.File file) throws java.io.FileNotFoundException {
        return this.a != 0 ? android.os.ParcelFileDescriptor.open(file, 268435456) : new java.io.FileInputStream(file);
    }

    @Override // defpackage.hzd
    public final /* synthetic */ void c(java.lang.Object obj) throws java.io.IOException {
        if (this.a != 0) {
            ((android.os.ParcelFileDescriptor) obj).close();
        } else {
            ((java.io.InputStream) obj).close();
        }
    }
}
