package android.support.v4.app;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f363a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f364b;

    r(ab abVar, int i2) {
        this.f364b = i2;
        this.f363a = abVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f364b) {
            case 0:
                h.g.a.a aVar = (h.g.a.a) ((h.g.b.aq) this.f363a).f48105a;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 1:
                ci.c((List) this.f363a, 4);
                break;
            case 2:
                ab abVar = (ab) this.f363a;
                abVar.mOnDismissListener.onDismiss(abVar.mDialog);
                break;
            case 3:
                ((ar) this.f363a).m36lambda$performAttach$2$androidsupportv4appFragment();
                break;
            case 4:
                ((ar) this.f363a).m42lambda$performDestroyView$18$androidsupportv4appFragment();
                break;
            case 5:
                ((ar) this.f363a).onDestroyView();
                break;
            case 6:
                ((ar) this.f363a).onStart();
                break;
            case 7:
                ((ar) this.f363a).m49lambda$performStart$9$androidsupportv4appFragment();
                break;
            case 8:
                ((ar) this.f363a).m48lambda$performStart$10$androidsupportv4appFragment();
                break;
            case 9:
                ((ar) this.f363a).m39lambda$performCreateView$5$androidsupportv4appFragment();
                break;
            case 10:
                ((ar) this.f363a).m50lambda$performStop$16$androidsupportv4appFragment();
                break;
            case 11:
                ((ar) this.f363a).m51lambda$performStop$17$androidsupportv4appFragment();
                break;
            case 12:
                ((ar) this.f363a).onStop();
                break;
            case 13:
                ((ar) this.f363a).onDetach();
                break;
            case 14:
                ((ar) this.f363a).onResume();
                break;
            case 15:
                ((ar) this.f363a).m45lambda$performResume$11$androidsupportv4appFragment();
                break;
            case 16:
                ((ar) this.f363a).m46lambda$performResume$12$androidsupportv4appFragment();
                break;
            case 17:
                ((ar) this.f363a).m54lambda$restoreViewState$1$androidsupportv4appFragment();
                break;
            case 18:
                ((ar) this.f363a).m43lambda$performPause$14$androidsupportv4appFragment();
                break;
            case 19:
                ((ar) this.f363a).m44lambda$performPause$15$androidsupportv4appFragment();
                break;
            default:
                ((ar) this.f363a).onPause();
                break;
        }
    }

    public /* synthetic */ r(Object obj, int i2) {
        this.f364b = i2;
        this.f363a = obj;
    }
}
