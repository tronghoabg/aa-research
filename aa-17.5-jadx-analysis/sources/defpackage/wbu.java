package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
class wbu extends wcd {
    private volatile boolean d;

    public wbu(String str, String str2, wcr wcrVar) {
        super(str, str2, wcrVar);
    }

    @Override // defpackage.wbo
    protected final /* synthetic */ Object b(Object obj) throws IOException {
        return (Boolean) obj;
    }

    @Override // defpackage.wbo
    protected final /* bridge */ /* synthetic */ Object c(String str) throws IOException {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.wbr
    public final /* bridge */ /* synthetic */ Object d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.wbr
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
