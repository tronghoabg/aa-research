package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class ssu extends wef {
    private static final Function a;
    private static volatile Function b;
    public static final /* synthetic */ int c = 0;
    private final spu d;

    static {
        kqm kqmVar = new kqm(14);
        a = kqmVar;
        b = kqmVar;
    }

    public ssu() {
        sst sstVar = sst.a;
        this.d = sst.b;
    }

    public abstract void a(Intent intent);

    @Override // defpackage.wef
    protected final void b(wec wecVar) {
        wecVar.d = false;
        wecVar.e = false;
    }

    @Override // defpackage.wef
    protected final void c(Intent intent) {
        if (this.d != sst.b) {
            a(intent);
        } else {
            a(intent);
        }
    }

    @Override // defpackage.wef
    protected final spu d(Context context) {
        return (spu) b.apply(context);
    }

    public ssu(byte[] bArr) {
        sst sstVar = sst.a;
        this.d = sst.b;
    }
}
