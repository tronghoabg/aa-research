package android.support.v4.app;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f105a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f106b;

    public /* synthetic */ ae(Object obj, int i2) {
        this.f106b = i2;
        this.f105a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f106b) {
            case 0:
                ((ar) this.f105a).onDestroy();
                return;
            case 1:
                ((ar) this.f105a).m41lambda$performDestroy$19$androidsupportv4appFragment();
                return;
            case 2:
                ((ar) this.f105a).m38lambda$performCreate$4$androidsupportv4appFragment();
                return;
            case 3:
                ((ar) this.f105a).startPostponedEnterTransition();
                return;
            case 4:
                ((ar) this.f105a).callStartTransitionListener(false);
                return;
            case 5:
                da daVar = (da) this.f105a;
                if (daVar.r()) {
                    daVar.l();
                    return;
                }
                return;
            case 6:
                ArrayList arrayList = ((bv) this.f105a).f198d;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bq) arrayList.get(i2)).onBackStackChangeCancelled();
                }
                return;
            case 7:
                ((bv) this.f105a).be(true);
                return;
            case 8:
                ((Toolbar) this.f105a).invalidateMenu();
                return;
            case 9:
                com.airbnb.lottie.s.m((com.airbnb.lottie.s) this.f105a);
                return;
            case 10:
                com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.m) this.f105a;
                mVar.f4348d.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(mVar, 3));
                return;
            case 11:
                int i3 = com.google.android.gms.f.aa.f5207a;
                if (((com.google.android.gms.o.w) this.f105a).d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 12:
                com.google.android.gms.n.d.a((com.google.android.gms.n.d) this.f105a);
                return;
            case 13:
                ((com.google.android.libraries.phenotype.client.stable.q) this.f105a).q();
                return;
            case 14:
                com.google.android.libraries.phenotype.client.stable.q.l((com.google.android.libraries.phenotype.client.stable.q) this.f105a);
                return;
            case 15:
                com.google.android.libraries.phenotype.client.stable.q.g((com.google.android.libraries.phenotype.client.stable.q) this.f105a);
                return;
            case 16:
                com.google.android.libraries.phenotype.client.stable.q qVar = (com.google.android.libraries.phenotype.client.stable.q) this.f105a;
                qVar.f6149e.d().c(com.google.g.a.a.b.FILE, qVar.f6152h, new com.google.android.libraries.phenotype.client.stable.al());
                return;
            case 17:
                try {
                    com.google.d.m.a.bd.o(this.f105a);
                    return;
                } catch (ExecutionException e2) {
                    com.google.android.libraries.d.a.a.a(new ae(e2, 18));
                    return;
                }
            case 18:
                throw new RuntimeException(((ExecutionException) this.f105a).getCause());
            case 19:
                try {
                    com.google.d.m.a.bd.o(this.f105a);
                    return;
                } catch (Exception e3) {
                    Log.i("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            default:
                com.google.android.libraries.phenotype.client.stable.ak.b((com.google.android.libraries.phenotype.client.stable.ak) this.f105a);
                return;
        }
    }

    ae(Object obj, int i2, byte[] bArr) {
        this.f106b = i2;
        this.f105a = obj;
    }
}
