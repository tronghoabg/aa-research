package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wgn extends wgz {
    public static final xyc a = wub.L(new rhy(14));
    private final woy b;

    public wgn(woy woyVar) {
        this.b = woyVar;
    }

    @Override // defpackage.wgz
    public final String a() {
        return "mmap";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [zgp] */
    @Override // defpackage.wgz
    public final /* synthetic */ wgy b(wgh wghVar, String str, Executor executor, nfh nfhVar) {
        whb whbVar = new whb(wghVar.b, wghVar.f ? abnj.a() : abnj.a);
        if (!(wghVar.e instanceof wgj)) {
            throw new IllegalArgumentException();
        }
        Uri uri = wghVar.a;
        return new wgp(str, uri == null ? zgl.a : new zgl(uri), whbVar, executor, nfhVar, wghVar.c, this.b);
    }
}
