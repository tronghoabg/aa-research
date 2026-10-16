package L8;

import A.e0;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Random;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements O9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7000a;

    public /* synthetic */ g(int i5) {
        this.f7000a = i5;
    }

    @Override // O9.b
    public final Object get() {
        switch (this.f7000a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                p pVar = ExecutorsRegistrar.f27314a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i5 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i5 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                break;
            case 3:
                p pVar2 = ExecutorsRegistrar.f27314a;
                break;
            case 4:
                p pVar3 = ExecutorsRegistrar.f27314a;
                break;
            case 5:
                p pVar4 = ExecutorsRegistrar.f27314a;
                break;
            case 6:
                e0 e0Var = FirebaseMessaging.f27357l;
                break;
            default:
                Random random = Z9.k.f17064j;
                break;
        }
        return null;
    }
}
