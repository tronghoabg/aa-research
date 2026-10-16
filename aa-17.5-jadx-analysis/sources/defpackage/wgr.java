package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wgr extends wgz {
    public static final wgz a = new wgr();

    @Override // defpackage.wgz
    public final String a() {
        return "singleproc";
    }

    @Override // defpackage.wgz
    public final /* synthetic */ wgy b(wgh wghVar, String str, Executor executor, nfh nfhVar) {
        return new wgt(str, wub.Y(wghVar.a), new whb(wghVar.b, wghVar.f ? abnj.a() : abnj.a), executor, nfhVar, wghVar.c);
    }
}
