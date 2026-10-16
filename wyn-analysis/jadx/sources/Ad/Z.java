package ad;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Locale;
import kd.C3308d;
import uc.C4286w;

/* loaded from: classes5.dex */
public final class Z extends io.flutter.plugin.platform.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17556a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17557b;

    public Z(C3308d c3308d) {
        super(C4286w.f46765a);
        this.f17557b = c3308d;
    }

    @Override // io.flutter.plugin.platform.f
    public final io.flutter.plugin.platform.e create(Context context, int i5, Object obj) {
        Object obj2 = this.f17557b;
        switch (this.f17556a) {
            case 0:
                if (obj == null) {
                    Log.e(Z.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", 0));
                    return new Y(context);
                }
                Integer num = (Integer) obj;
                AbstractC1364i abstractC1364i = (AbstractC1364i) ((HashMap) ((G9.e) obj2).f4686c).get(num);
                if (abstractC1364i != null && abstractC1364i.b() != null) {
                    return abstractC1364i.b();
                }
                Log.e(Z.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", num));
                return new Y(context);
            case 1:
                hd.h hVar = (hd.h) obj;
                Objects.requireNonNull(hVar);
                return new Y(context, ((hd.o) ((LongSparseArray) ((com.unity3d.services.core.webview.b) obj2).f32729b).get(hVar.f36408a.longValue())).f36424d);
            default:
                if (((Integer) obj) == null) {
                    throw new IllegalStateException("An identifier is required to retrieve a View instance.");
                }
                Object objE = ((C3308d) obj2).e(r6.intValue());
                if (objE instanceof io.flutter.plugin.platform.e) {
                    return (io.flutter.plugin.platform.e) objE;
                }
                if (objE instanceof View) {
                    return new N((View) objE, 1);
                }
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objE);
        }
    }

    public Z(com.unity3d.services.core.webview.b bVar) {
        super(hd.f.f36405d);
        this.f17557b = bVar;
    }

    public Z(G9.e eVar) {
        super(C4286w.f46765a);
        this.f17557b = eVar;
    }
}
