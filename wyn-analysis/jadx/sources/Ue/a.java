package Ue;

import A7.CallableC0255h0;
import He.n;
import He.o;
import S3.c;
import S3.e;
import Se.i;
import Te.d;

/* loaded from: classes5.dex */
public final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12791a;

    /* renamed from: b, reason: collision with root package name */
    public final n f12792b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12793c;

    public /* synthetic */ a(n nVar, Object obj, int i5) {
        this.f12791a = i5;
        this.f12792b = nVar;
        this.f12793c = obj;
    }

    @Override // He.n
    public final void c(o oVar) {
        switch (this.f12791a) {
            case 0:
                ((d) this.f12792b).b(new c(26, this, oVar));
                break;
            case 1:
                this.f12792b.b(new e(21, this, oVar));
                break;
            default:
                this.f12792b.b(new i(3, oVar, (CallableC0255h0) this.f12793c));
                break;
        }
    }
}
