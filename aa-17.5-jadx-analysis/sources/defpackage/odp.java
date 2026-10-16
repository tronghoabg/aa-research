package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes.dex */
public interface odp extends lhg {
    ComponentName a(Context context, String str);

    ComponentName b(CarCall carCall);

    Bitmap e(PackageManager packageManager, String str);

    Uri f(CarCall carCall);

    PhoneAccountHandle g(String str, String str2);

    Integer h(CarCall carCall);

    String i(PackageManager packageManager, String str);

    String j(CarCall carCall);

    String k(String str);

    String l(String str);

    String m(String str);

    String n(Context context, Integer num, String str);

    void o(Context context, long j, yzz yzzVar, String str);

    void p(Context context, ComponentName componentName);

    boolean q(String str);

    boolean r(Context context, String str);

    boolean s(Context context, String str);

    boolean t(CarCall carCall);

    boolean u();
}
