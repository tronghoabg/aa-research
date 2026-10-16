package defpackage;

import android.util.Base64;
import java.io.IOException;

/* loaded from: classes.dex */
class wbw extends wcd {
    private final wbs d;
    private volatile Object e;

    public wbw(String str, String str2, wcr wcrVar, wbs wbsVar) {
        super(str, str2, wcrVar);
        this.d = wbsVar;
    }

    @Override // defpackage.wbo
    protected final Object b(Object obj) throws IOException {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.wbo
    protected final Object c(String str) throws IOException {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.wbr
    public final Object d() {
        return this.e;
    }

    @Override // defpackage.wbr
    public final void g(Object obj) {
        this.e = obj;
    }
}
