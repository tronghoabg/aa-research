package B8;

import J8.AbstractC0640o;
import Pc.C0788d;
import Pc.N;
import Z9.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moloco.sdk.internal.publisher.H;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.UUID;
import s8.g;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1600c;

    public /* synthetic */ a(Tc.b bVar, g gVar, TaskCompletionSource taskCompletionSource) {
        this.f1598a = 3;
        this.f1599b = gVar;
        this.f1600c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N nJ0 = null;
        TaskCompletionSource taskCompletionSource = this.f1600c;
        g gVar = this.f1599b;
        switch (this.f1598a) {
            case 0:
                gVar.a();
                String strG = gVar.g();
                Context context = gVar.f45328a;
                AbstractC1732v.i(context);
                AbstractC1732v.f(strG);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.appcheck.debug.store." + strG, 0);
                String string = sharedPreferences.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    sharedPreferences.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", string).apply();
                }
                Log.d("B8.d", "Enter this debug secret into the allow list in the Firebase Console for your project: " + string);
                taskCompletionSource.setResult(string);
                break;
            case 1:
                HashMap map = C0788d.f9393i;
                try {
                    HashMap map2 = new HashMap();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVar);
                    AbstractC0640o abstractC0640o = firebaseAuth.f27288f;
                    String strA = firebaseAuth.a();
                    if (abstractC0640o != null) {
                        nJ0 = H.j0(abstractC0640o);
                    }
                    if (strA != null) {
                        map2.put("APP_LANGUAGE_CODE", strA);
                    }
                    if (nJ0 != null) {
                        map2.put("APP_CURRENT_USER", H.c0(nJ0));
                    }
                    taskCompletionSource.setResult(map2);
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 2:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(gVar, taskCompletionSource);
                break;
            case 3:
                try {
                    Z9.d dVarA = ((k) gVar.c(k.class)).a();
                    HashMap map3 = new HashMap(Tc.b.a(dVarA));
                    map3.put("parameters", Tc.b.b(dVarA.b()));
                    taskCompletionSource.setResult(map3);
                    break;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            default:
                try {
                    HashMap map4 = new HashMap();
                    gVar.a();
                    if (gVar.f45329b.equals("[DEFAULT]")) {
                        map4.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.c().f27364e.f()));
                    }
                    taskCompletionSource.setResult(map4);
                    break;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
        }
    }

    public /* synthetic */ a(g gVar, TaskCompletionSource taskCompletionSource, int i5) {
        this.f1598a = i5;
        this.f1599b = gVar;
        this.f1600c = taskCompletionSource;
    }
}
