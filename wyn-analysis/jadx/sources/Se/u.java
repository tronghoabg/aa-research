package Se;

import java.util.Iterator;
import java.util.List;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class u extends He.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11106a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11107b;

    public u(He.g gVar) {
        this.f11107b = gVar;
    }

    @Override // He.i
    public final void d(He.j jVar) {
        switch (this.f11106a) {
            case 0:
                ((He.g) this.f11107b).b(new t(jVar));
                break;
            default:
                Je.b bVar = Me.b.f7635a;
                try {
                    Iterator it = ((List) this.f11107b).iterator();
                    try {
                        if (!it.hasNext()) {
                            jVar.a(bVar);
                            jVar.onComplete();
                            break;
                        } else {
                            Te.m mVar = new Te.m(jVar, it);
                            jVar.a(mVar);
                            if (!mVar.f11889d) {
                                while (!mVar.f11888c) {
                                    try {
                                        Object next = mVar.f11887b.next();
                                        Ne.b.a(next, "The iterator returned a null value");
                                        mVar.f11886a.b(next);
                                        if (mVar.f11888c) {
                                            break;
                                        } else {
                                            try {
                                                if (!mVar.f11887b.hasNext()) {
                                                    if (!mVar.f11888c) {
                                                        mVar.f11886a.onComplete();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                AbstractC3772b.U(th);
                                                mVar.f11886a.onError(th);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        AbstractC3772b.U(th2);
                                        mVar.f11886a.onError(th2);
                                        return;
                                    }
                                }
                                break;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC3772b.U(th3);
                        jVar.a(bVar);
                        jVar.onError(th3);
                        return;
                    }
                } catch (Throwable th4) {
                    AbstractC3772b.U(th4);
                    jVar.a(bVar);
                    jVar.onError(th4);
                }
                break;
        }
    }

    public u(List list) {
        this.f11107b = list;
    }
}
