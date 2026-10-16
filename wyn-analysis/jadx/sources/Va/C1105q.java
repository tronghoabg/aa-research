package Va;

import A7.C0237b0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import org.json.JSONException;

/* renamed from: Va.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1105q extends AbstractC0961eb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14516a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14517b;

    public /* synthetic */ C1105q(int i5) {
        this.f14516a = i5;
    }

    @Override // Va.AbstractC0961eb, Va.InterfaceC0948db
    public void b(Activity activity) {
        switch (this.f14516a) {
            case 0:
                C1194x.f14742s = (C1194x.f14741r + 53) % 128;
                C1194x c1194x = (C1194x) this.f14517b;
                c1194x.getClass();
                int i5 = C1194x.f14741r;
                C1194x.f14742s = (i5 + 75) % 128;
                if (c1194x.f14749g) {
                    int i10 = i5 + 117;
                    C1194x.f14742s = i10 % 128;
                    if (i10 % 2 == 0) {
                        c1194x.s();
                        throw null;
                    }
                    c1194x.s();
                    C1194x.f14741r = (C1194x.f14742s + 107) % 128;
                }
                c1194x.f14749g = false;
                int i11 = C1194x.f14742s + 59;
                C1194x.f14741r = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            case 3:
                Wa wa2 = new Wa(0);
                wa2.f13838d = this;
                Cb.j(wa2);
                return;
            default:
                return;
        }
    }

    @Override // Va.AbstractC0961eb, Va.InterfaceC0948db
    public void d(Activity activity) {
        switch (this.f14516a) {
            case 0:
                ((C1194x) this.f14517b).w();
                break;
            case 3:
                Wa wa2 = new Wa(1);
                wa2.f13838d = this;
                Cb.j(wa2);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f14516a) {
            case 4:
                ((Handler) ((C0237b0) this.f14517b).f814d).removeCallbacksAndMessages(null);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        switch (this.f14516a) {
            case 1:
                C1169v c1169v = new C1169v(4);
                c1169v.f14690d = this;
                Cb.e(c1169v);
                break;
            case 4:
                ((Handler) ((C0237b0) this.f14517b).f814d).removeCallbacksAndMessages(null);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) throws JSONException {
        switch (this.f14516a) {
            case 2:
                String str = AbstractC1141sa.f14592M;
                C1214y7 c1214y7 = (C1214y7) this.f14517b;
                c1214y7.o(str, C1214y7.B(c1214y7, activity));
                break;
            case 4:
                C0237b0 c0237b0 = (C0237b0) this.f14517b;
                Handler handler = (Handler) c0237b0.f814d;
                C1206y c1206y = new C1206y(21);
                c1206y.f14799e = c0237b0;
                c1206y.f14798d = activity;
                handler.postDelayed(c1206y, 500L);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) throws JSONException {
        switch (this.f14516a) {
            case 2:
                String str = AbstractC1141sa.f14593N;
                C1214y7 c1214y7 = (C1214y7) this.f14517b;
                c1214y7.o(str, C1214y7.B(c1214y7, activity));
                break;
            case 4:
                C0237b0 c0237b0 = (C0237b0) this.f14517b;
                if (c0237b0.f812b) {
                    c0237b0.f812b = false;
                    ((InterfaceC1026jb) c0237b0.f813c).d(activity);
                }
                ((Handler) c0237b0.f814d).removeCallbacksAndMessages(null);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f14516a) {
            case 4:
                ((Handler) ((C0237b0) this.f14517b).f814d).removeCallbacksAndMessages(null);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        switch (this.f14516a) {
            case 4:
                ((Handler) ((C0237b0) this.f14517b).f814d).removeCallbacksAndMessages(null);
                break;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        switch (this.f14516a) {
            case 4:
                ((Handler) ((C0237b0) this.f14517b).f814d).removeCallbacksAndMessages(null);
                break;
        }
    }

    public /* synthetic */ C1105q(Object obj, int i5) {
        this.f14516a = i5;
        this.f14517b = obj;
    }
}
