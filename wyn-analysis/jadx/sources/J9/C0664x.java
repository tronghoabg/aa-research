package J9;

import A.AbstractC0213f;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import U1.C0840j;
import android.util.Log;
import ba.C1521a;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k8.InterfaceC3199h;
import q5.InterfaceC3871f;
import uc.InterfaceC4265b;

/* renamed from: J9.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0664x implements Le.d, Le.b, Le.c, G2.g, L8.f, O9.a, InterfaceC3871f, InterfaceC3199h, L8.e, com.vungle.ads.internal.util.m, OnFailureListener, b6.g, Q1.g, InterfaceC4265b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5990a;

    public /* synthetic */ C0664x(int i5) {
        this.f5990a = i5;
    }

    @Override // com.vungle.ads.internal.util.m
    public ObjectInputStream a(InputStream inputStream) {
        return com.vungle.ads.internal.util.n.a(inputStream);
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        switch (this.f5990a) {
            case 1:
                ic.d.E("Fetched from cache");
                break;
            case 2:
                ic.d.G("Cache read error: " + ((Throwable) obj).getMessage());
                break;
            default:
                ic.d.G("Impressions store read fail: " + ((Throwable) obj).getMessage());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f5  */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence] */
    @Override // Le.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J9.C0664x.apply(java.lang.Object):java.lang.Object");
    }

    @Override // L8.f
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        switch (this.f5990a) {
            case 27:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a((Uc.n) arrayList2.get(0), (List) arrayList2.get(1), new C0801q(arrayList, c1521a, 15), 13));
                break;
            case 28:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                Uc.n nVar = (Uc.n) arrayList4.get(0);
                String str = (String) arrayList4.get(1);
                Uc.t tVar = (Uc.t) arrayList4.get(2);
                FlutterFirebasePlugin.cachedThreadPool.execute(new Cb.a(nVar, str, new C0800p(arrayList3, c1521a, 16), tVar, 6));
                break;
            default:
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Mb.b((Uc.n) arrayList6.get(0), AbstractC0213f.g(3)[((Integer) arrayList6.get(1)).intValue()], new C0799o(arrayList5, c1521a, 16), 2));
                break;
        }
    }

    @Override // O9.a
    public void f(O9.b bVar) {
    }

    @Override // Q1.g
    public void invoke(Object obj) {
        N1.H h10 = (N1.H) obj;
        switch (this.f5990a) {
            case 25:
                h10.C(new C0840j(2, new E5.Q("Player release timed out.", 4), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                break;
            default:
                h10.getClass();
                break;
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        switch (this.f5990a) {
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f27314a.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.f27316c.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.f27315b.get();
            case 13:
                L8.p pVar = ExecutorsRegistrar.f27314a;
                return M8.k.f7564a;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(lVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // Le.d
    public boolean test(Object obj) {
        return !((Boolean) obj).booleanValue();
    }

    @Override // G2.g
    public boolean a(int i5, int i10, int i11, int i12, int i13) {
        switch (this.f5990a) {
            case 5:
                if ((i10 != 67 || i11 != 79 || i12 != 77 || (i13 != 77 && i5 != 2)) && (i10 != 77 || i11 != 76 || i12 != 76 || (i13 != 84 && i5 != 2))) {
                }
                break;
            default:
                if ((i10 != 67 || i11 != 79 || i12 != 77 || (i13 != 77 && i5 != 2)) && (i10 != 77 || i11 != 76 || i12 != 76 || (i13 != 84 && i5 != 2))) {
                }
                break;
        }
        return false;
    }
}
