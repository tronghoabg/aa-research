package A7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: A7.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0284r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1036a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ P0 f1037b;

    public /* synthetic */ RunnableC0284r0(int i5) {
        this.f1036a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1036a) {
            case 0:
                this.f1037b.B0();
                break;
            case 1:
                P0 p02 = this.f1037b;
                p02.c0();
                if (p02.a0().f780u.d()) {
                    p02.zzj().f611m.c("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    long jD = p02.a0().f781v.d();
                    p02.a0().f781v.f(1 + jD);
                    if (jD >= 5) {
                        p02.zzj().f608i.c("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        p02.a0().f780u.c(true);
                        break;
                    } else {
                        if (p02.f665s == null) {
                            p02.f665s = new X0(p02, (C0273n0) p02.f421a, 2);
                        }
                        p02.f665s.b(0L);
                        break;
                    }
                }
            case 2:
                Y9.c cVar = this.f1037b.f663q;
                C0273n0 c0273n0 = (C0273n0) cVar.f16739b;
                C0264k0 c0264k0 = c0273n0.f982j;
                C0273n0.d(c0264k0);
                c0264k0.c0();
                if (cVar.v()) {
                    boolean zW = cVar.w();
                    P0 p03 = c0273n0.f987p;
                    Z z2 = c0273n0.f980h;
                    if (zW) {
                        C0273n0.c(z2);
                        z2.f783x.v(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C0273n0.b(p03);
                        p03.H0("auto", "_cmpx", bundle);
                    } else {
                        C0273n0.c(z2);
                        String strU = z2.f783x.u();
                        if (TextUtils.isEmpty(strU)) {
                            N n10 = c0273n0.f981i;
                            C0273n0.d(n10);
                            n10.f606g.c("Cache still valid but referrer not found");
                        } else {
                            C0273n0.c(z2);
                            long jD2 = ((z2.f784y.d() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strU);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jD2);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C0273n0.b(p03);
                            p03.H0(str2, "_cmp", (Bundle) pair.second);
                        }
                        C0273n0.c(z2);
                        z2.f783x.v(null);
                    }
                    C0273n0.c(z2);
                    z2.f784y.f(0L);
                    break;
                }
                break;
            default:
                this.f1037b.B0();
                break;
        }
    }

    public RunnableC0284r0(P0 p02) {
        this.f1036a = 2;
        this.f1037b = p02;
    }
}
