package Ge;

import android.app.Application;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin$qonversionSandwich$2$1$1;
import ef.C2527k;
import ff.AbstractC2641B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4773a;

    /* renamed from: b, reason: collision with root package name */
    public final QonversionPlugin$qonversionSandwich$2$1$1 f4774b;

    /* renamed from: c, reason: collision with root package name */
    public final i f4775c;

    /* renamed from: d, reason: collision with root package name */
    public final QonversionError f4776d;

    public t(Application application, QonversionPlugin$qonversionSandwich$2$1$1 qonversionPlugin$qonversionSandwich$2$1$1, i qonversionEventsListener) {
        AbstractC3340k.e(application, "application");
        AbstractC3340k.e(qonversionEventsListener, "qonversionEventsListener");
        this.f4773a = application;
        this.f4774b = qonversionPlugin$qonversionSandwich$2$1$1;
        this.f4775c = qonversionEventsListener;
        this.f4776d = new QonversionError(QonversionErrorCode.PurchaseInvalid, "Current Android activity is null, cannot perform the action.", null, 4, null);
    }

    public static Map a(boolean z2) {
        return AbstractC2641B.E(new C2527k("success", Boolean.valueOf(z2)));
    }
}
