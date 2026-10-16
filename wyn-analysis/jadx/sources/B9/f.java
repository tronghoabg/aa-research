package B9;

import A7.RunnableC0299w0;
import D9.i;
import D9.k;
import J9.C0651j;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.model.MessageType;
import df.InterfaceC2432a;
import java.util.Map;
import java.util.Set;
import z9.C4623B;
import z9.InterfaceC4626E;

/* loaded from: classes4.dex */
public final class f implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final C4623B f1627a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1628b;

    /* renamed from: c, reason: collision with root package name */
    public final D9.g f1629c;

    /* renamed from: d, reason: collision with root package name */
    public final Y9.c f1630d;

    /* renamed from: e, reason: collision with root package name */
    public final Y9.c f1631e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1632f;

    /* renamed from: g, reason: collision with root package name */
    public final D9.a f1633g;

    /* renamed from: h, reason: collision with root package name */
    public final Application f1634h;

    /* renamed from: i, reason: collision with root package name */
    public final D9.d f1635i;

    /* renamed from: j, reason: collision with root package name */
    public N9.h f1636j;
    public InterfaceC4626E k;

    /* renamed from: l, reason: collision with root package name */
    public String f1637l;

    public f(C4623B c4623b, Map map, D9.g gVar, Y9.c cVar, Y9.c cVar2, i iVar, Application application, D9.a aVar, D9.d dVar) {
        this.f1627a = c4623b;
        this.f1628b = map;
        this.f1629c = gVar;
        this.f1630d = cVar;
        this.f1631e = cVar2;
        this.f1632f = iVar;
        this.f1634h = application;
        this.f1633g = aVar;
        this.f1635i = dVar;
    }

    public final void a(Activity activity) {
        D9.e.a("Pausing activity: ".concat(activity.getClass().getName()));
    }

    public final void c(Activity activity) {
        D9.e.a("Resumed activity: ".concat(activity.getClass().getName()));
    }

    public final void e(Activity activity) {
        E9.c cVar = this.f1632f.f2577a;
        if (cVar == null ? false : cVar.j().isShown()) {
            D9.g gVar = this.f1629c;
            Class<?> cls = activity.getClass();
            gVar.getClass();
            String simpleName = cls.getSimpleName();
            synchronized (simpleName) {
                try {
                    if (gVar.f2573b.containsKey(simpleName)) {
                        for (V4.a aVar : (Set) gVar.f2573b.get(simpleName)) {
                            if (aVar != null) {
                                gVar.f2572a.c(aVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i iVar = this.f1632f;
            E9.c cVar2 = iVar.f2577a;
            if (cVar2 != null ? cVar2.j().isShown() : false) {
                ((WindowManager) activity.getSystemService("window")).removeViewImmediate(iVar.f2577a.j());
                iVar.f2577a = null;
            }
            Y9.c cVar3 = this.f1630d;
            CountDownTimer countDownTimer = (CountDownTimer) cVar3.f16739b;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                cVar3.f16739b = null;
            }
            Y9.c cVar4 = this.f1631e;
            CountDownTimer countDownTimer2 = (CountDownTimer) cVar4.f16739b;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                cVar4.f16739b = null;
            }
        }
    }

    public final void f(Activity activity) {
        Object obj;
        N9.h hVar = this.f1636j;
        if (hVar == null || this.f1627a.f48418e) {
            D9.e.d("No active message found to render");
            return;
        }
        if (hVar.f8622a.equals(MessageType.UNSUPPORTED)) {
            D9.e.d("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        MessageType messageType = this.f1636j.f8622a;
        String str = null;
        if (this.f1634h.getResources().getConfiguration().orientation == 1) {
            int i5 = G9.b.f4679a[messageType.ordinal()];
            if (i5 == 1) {
                str = "MODAL_PORTRAIT";
            } else if (i5 == 2) {
                str = "CARD_PORTRAIT";
            } else if (i5 == 3) {
                str = "IMAGE_ONLY_PORTRAIT";
            } else if (i5 == 4) {
                str = "BANNER_PORTRAIT";
            }
        } else {
            int i10 = G9.b.f4679a[messageType.ordinal()];
            if (i10 == 1) {
                str = "MODAL_LANDSCAPE";
            } else if (i10 == 2) {
                str = "CARD_LANDSCAPE";
            } else if (i10 == 3) {
                str = "IMAGE_ONLY_LANDSCAPE";
            } else if (i10 == 4) {
                str = "BANNER_LANDSCAPE";
            }
        }
        k kVar = (k) ((InterfaceC2432a) this.f1628b.get(str)).get();
        int i11 = e.f1626a[this.f1636j.f8622a.ordinal()];
        D9.a aVar = this.f1633g;
        if (i11 == 1) {
            N9.h hVar2 = this.f1636j;
            Y9.c cVar = new Y9.c(8, false);
            cVar.f16739b = new G9.e(hVar2, kVar, aVar.f2563a, 0);
            obj = (E9.a) ((InterfaceC2432a) cVar.c().f16189f).get();
        } else if (i11 == 2) {
            N9.h hVar3 = this.f1636j;
            Y9.c cVar2 = new Y9.c(8, false);
            cVar2.f16739b = new G9.e(hVar3, kVar, aVar.f2563a, 0);
            obj = (E9.g) ((InterfaceC2432a) cVar2.c().f16188e).get();
        } else if (i11 == 3) {
            N9.h hVar4 = this.f1636j;
            Y9.c cVar3 = new Y9.c(8, false);
            cVar3.f16739b = new G9.e(hVar4, kVar, aVar.f2563a, 0);
            obj = (E9.f) ((InterfaceC2432a) cVar3.c().f16187d).get();
        } else {
            if (i11 != 4) {
                D9.e.d("No bindings found for this message type");
                return;
            }
            N9.h hVar5 = this.f1636j;
            Y9.c cVar4 = new Y9.c(8, false);
            cVar4.f16739b = new G9.e(hVar5, kVar, aVar.f2563a, 0);
            obj = (E9.e) ((InterfaceC2432a) cVar4.c().f16190g).get();
        }
        activity.findViewById(R.id.content).post(new RunnableC0299w0(this, activity, obj, 9));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        D9.e.a("Created activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        D9.e.a("Destroyed activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str = this.f1637l;
        C4623B c4623b = this.f1627a;
        if (str != null && str.equals(activity.getLocalClassName())) {
            D9.e.e("Unbinding from activity: " + activity.getLocalClassName());
            c4623b.getClass();
            ic.d.F("Removing display event component");
            c4623b.f48419f = null;
            e(activity);
            this.f1637l = null;
        }
        C0651j c0651j = c4623b.f48416c;
        c0651j.f5939b.clear();
        c0651j.f5942e.clear();
        c0651j.f5941d.clear();
        c0651j.f5940c.clear();
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
        String str = this.f1637l;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            D9.e.e("Binding to activity: " + activity.getLocalClassName());
            A5.h hVar = new A5.h(1, this, activity);
            C4623B c4623b = this.f1627a;
            c4623b.getClass();
            ic.d.F("Setting display event component");
            c4623b.f48419f = hVar;
            this.f1637l = activity.getLocalClassName();
        }
        if (this.f1636j != null) {
            f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        D9.e.a("SavedInstance activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        D9.e.a("Started activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        D9.e.a("Stopped activity: ".concat(activity.getClass().getName()));
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public final void displayMessage(N9.h hVar, InterfaceC4626E interfaceC4626E) {
    }
}
