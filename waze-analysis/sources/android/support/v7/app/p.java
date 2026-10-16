package android.support.v7.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.d.m.a.bd;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.waze.FreeMapAppActivity;
import com.waze.MainActivity;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f614a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f615b;

    public /* synthetic */ p(Object obj, int i2) {
        this.f615b = i2;
        this.f614a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v33, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, com.google.firebase.installations.e {
        switch (this.f615b) {
            case 0:
                t.k((Context) this.f614a);
                break;
            case 1:
                try {
                    bd.o(this.f614a);
                    break;
                } catch (Exception e2) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e2);
                        return;
                    }
                    return;
                }
            case 2:
                MaterialButton.b((MaterialButton) this.f614a);
                break;
            case 3:
                Object obj = this.f614a;
                View view = (View) obj;
                view.requestFocus();
                view.post(new com.google.android.material.internal.o(obj, 0));
                break;
            case 4:
                ((com.google.firebase.messaging.p) this.f614a.getKey()).a();
                break;
            case 5:
                com.google.firebase.installations.c.g((com.google.firebase.installations.c) this.f614a);
                break;
            case 6:
                ((com.google.firebase.installations.c) this.f614a).q();
                break;
            case 7:
                ((com.google.firebase.installations.c) this.f614a).q();
                break;
            case 8:
                FirebaseMessaging.l((FirebaseMessaging) this.f614a);
                break;
            case 9:
                FirebaseMessaging.k((FirebaseMessaging) this.f614a);
                break;
            case 10:
                AppStartTrace.d((AppStartTrace) this.f614a);
                break;
            case 11:
                AppStartTrace.f((AppStartTrace) this.f614a);
                break;
            case 12:
                AppStartTrace.e((AppStartTrace) this.f614a);
                break;
            case 13:
                AppStartTrace.h((AppStartTrace) this.f614a);
                break;
            case 14:
                com.google.firebase.perf.d.f fVar = (com.google.firebase.perf.d.f) this.f614a;
                fVar.n.b(fVar.s);
                break;
            case 15:
                com.google.firebase.perf.d.f.e((com.google.firebase.perf.d.f) this.f614a);
                break;
            case 16:
                this.f614a.invoke();
                break;
            case 17:
                this.f614a.a(h.ab.f48028a);
                break;
            case 18:
                int i2 = FreeMapAppActivity.f13551f;
                Object obj2 = this.f614a;
                if (obj2 != null) {
                    ((View) obj2).setVisibility(8);
                    break;
                }
                break;
            case 19:
                MainActivity.p((MainActivity) this.f614a);
                break;
            default:
                MainActivity.s((MainActivity) this.f614a);
                break;
        }
    }
}
