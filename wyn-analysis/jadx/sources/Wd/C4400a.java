package wd;

import Ef.H;
import ef.C2515C;
import tf.l;

/* renamed from: wd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C4400a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47459a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4402c f47460b;

    public /* synthetic */ C4400a(C4402c c4402c) {
        this.f47460b = c4402c;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.f47459a) {
            case 0:
                if (th != null) {
                    H.j(this.f47460b.f47465a, null);
                }
                break;
            default:
                if (th != null) {
                    this.f47460b.f47474j.q(Hd.a.f5005e);
                }
                break;
        }
        return C2515C.f34653a;
    }

    public /* synthetic */ C4400a(C4402c c4402c, Gd.a aVar) {
        this.f47460b = c4402c;
    }
}
