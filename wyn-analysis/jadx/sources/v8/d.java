package v8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f47033b;

    public /* synthetic */ d(FirebaseAnalytics firebaseAnalytics, int i5) {
        this.f47032a = i5;
        this.f47033b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f47032a) {
            case 0:
                return this.f47033b.f27279a.zzc();
            default:
                return this.f47033b.f27279a.zze();
        }
    }
}
