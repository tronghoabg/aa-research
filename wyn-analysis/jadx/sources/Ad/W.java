package ad;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class W implements OnInitializationCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final tc.g f17545a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17546b = false;

    public W(tc.g gVar) {
        this.f17545a = gVar;
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f17546b) {
            return;
        }
        try {
            Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, "Flutter-GMA-5.3.1");
        } catch (Exception unused) {
        }
        this.f17545a.a(new C1352F(initializationStatus));
        this.f17546b = true;
    }
}
