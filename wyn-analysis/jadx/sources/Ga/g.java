package ga;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import n7.AbstractC3598c;
import u1.C4212a;
import x1.C4449b;

/* loaded from: classes4.dex */
public final class g extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public static final g f35802i = new g(1);

    @Override // tf.l
    public final Object invoke(Object obj) {
        String strF;
        C4212a ex = (C4212a) obj;
        AbstractC3340k.e(ex, "ex");
        StringBuilder sb2 = new StringBuilder("CorruptionException in settings DataStore in ");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            strF = Process.myProcessName();
            AbstractC3340k.d(strF, "myProcessName()");
        } else if ((i5 < 28 || (strF = Application.getProcessName()) == null) && (strF = AbstractC3598c.f()) == null) {
            strF = "";
        }
        sb2.append(strF);
        sb2.append('.');
        Log.w("SessionsSettings", sb2.toString(), ex);
        return new C4449b(true);
    }
}
