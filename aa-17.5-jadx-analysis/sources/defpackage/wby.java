package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
class wby extends wcd {
    private volatile double d;

    public wby(String str, String str2, wcr wcrVar) {
        super(str, str2, wcrVar);
    }

    @Override // defpackage.wbo
    protected final /* synthetic */ Object b(Object obj) throws IOException {
        return (Double) obj;
    }

    @Override // defpackage.wbo
    protected final /* bridge */ /* synthetic */ Object c(String str) throws IOException {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.wbr
    public final /* bridge */ /* synthetic */ Object d() {
        return Double.valueOf(this.d);
    }

    @Override // defpackage.wbr
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Double) obj).doubleValue();
    }
}
