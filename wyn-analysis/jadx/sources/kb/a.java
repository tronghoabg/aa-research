package Kb;

import android.window.OnBackInvokedCallback;
import com.vungle.ads.internal.ui.l;
import io.flutter.embedding.android.FlutterActivity;
import j.w;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6716b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f6715a = i5;
        this.f6716b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f6715a) {
            case 0:
                l.b((l) this.f6716b);
                break;
            case 1:
                tf.a onBackInvoked = (tf.a) this.f6716b;
                AbstractC3340k.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 2:
                ((w) this.f6716b).E();
                break;
            case 3:
                ((FlutterActivity) this.f6716b).onBackPressed();
                break;
            default:
                ((Runnable) this.f6716b).run();
                break;
        }
    }
}
