package A7;

import com.google.android.gms.common.internal.AbstractC1732v;

/* renamed from: A7.s1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0288s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f1049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0291t1 f1050c;

    public /* synthetic */ RunnableC0288s1(ServiceConnectionC0291t1 serviceConnectionC0291t1, F f10, int i5) {
        this.f1048a = i5;
        this.f1049b = f10;
        this.f1050c = serviceConnectionC0291t1;
    }

    private final void a() {
        synchronized (this.f1050c) {
            try {
                this.f1050c.f1065a = false;
                if (!this.f1050c.f1067c.r0()) {
                    this.f1050c.f1067c.zzj().f612n.c("Connected to service");
                    C0271m1 c0271m1 = this.f1050c.f1067c;
                    F f10 = this.f1049b;
                    c0271m1.c0();
                    c0271m1.f954d = f10;
                    c0271m1.v0();
                    c0271m1.u0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1048a) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f1050c) {
                    try {
                        this.f1050c.f1065a = false;
                        if (!this.f1050c.f1067c.r0()) {
                            this.f1050c.f1067c.zzj().f611m.c("Connected to remote service");
                            C0271m1 c0271m1 = this.f1050c.f1067c;
                            F f10 = this.f1049b;
                            c0271m1.c0();
                            AbstractC1732v.i(f10);
                            c0271m1.f954d = f10;
                            c0271m1.v0();
                            c0271m1.u0();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
