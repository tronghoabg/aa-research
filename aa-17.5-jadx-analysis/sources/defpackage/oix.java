package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class oix extends eqj {
    private final rxi a;
    private final Context h;
    private oct i;

    public oix(Context context, rxi rxiVar) {
        this.h = context;
        this.a = rxiVar;
    }

    public final oct a() {
        oct octVar;
        synchronized (this) {
            octVar = this.i;
            if (octVar == null) {
                octVar = new oct(this.h);
                this.i = octVar;
            }
        }
        return octVar;
    }

    @Override // defpackage.eqj
    protected final void c() {
        this.a.s(new oiw(this, 0));
        oct octVarA = a();
        ypf ypfVar = rxf.a;
        super.m(octVarA.c(rxi.r(this.h)));
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.t();
        super.m(null);
    }

    @Override // defpackage.eqj
    public final /* synthetic */ void m(Object obj) {
        super.m((yfq) obj);
    }
}
