package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvm extends defpackage.hvc {
    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return android.content.res.AssetFileDescriptor.class;
    }

    @Override // defpackage.hvc
    protected final /* synthetic */ java.lang.Object f(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        return assetManager.openFd(str);
    }

    @Override // defpackage.hvc
    protected final /* synthetic */ void g(java.lang.Object obj) throws java.io.IOException {
        ((android.content.res.AssetFileDescriptor) obj).close();
    }
}
