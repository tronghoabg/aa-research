package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
class wca extends wcd {
    private volatile long d;

    public wca(String str, String str2, wcr wcrVar) {
        super(str, str2, wcrVar);
    }

    @Override // defpackage.wbo
    protected final /* synthetic */ Object b(Object obj) throws IOException {
        return (Long) obj;
    }

    @Override // defpackage.wbo
    protected final /* bridge */ /* synthetic */ Object c(String str) throws IOException {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.wbr
    public final /* bridge */ /* synthetic */ Object d() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.wbr
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
