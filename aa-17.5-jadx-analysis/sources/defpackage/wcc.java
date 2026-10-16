package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
class wcc extends wcd {
    private volatile String d;

    public wcc(String str, String str2, wcr wcrVar) {
        super(str, str2, wcrVar);
    }

    @Override // defpackage.wbo
    protected final /* synthetic */ Object b(Object obj) throws IOException {
        return (String) obj;
    }

    @Override // defpackage.wbr
    public final /* synthetic */ Object d() {
        return this.d;
    }

    @Override // defpackage.wbr
    public final /* synthetic */ void g(Object obj) {
        this.d = (String) obj;
    }

    @Override // defpackage.wbo
    protected final /* bridge */ /* synthetic */ Object c(String str) throws IOException {
        return str;
    }
}
