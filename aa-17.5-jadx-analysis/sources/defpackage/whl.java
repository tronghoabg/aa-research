package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import j$.time.Instant;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class whl {
    public static final whl a;
    public static final AtomicBoolean b;
    public SurveyDataImpl d;
    public String e;
    public yfq f;
    public long g;
    public String i;
    public long j;
    public ajmd l;
    public final tmb h = new tme();
    public final String k = "com.google.android.libraries.surveys.internal.view.SurveyActivity";
    public final whm c = whm.a;

    static {
        Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations", "com.google.android.gms");
        a = new whl();
        b = new AtomicBoolean(false);
    }

    private whl() {
        vuf.h = new ykd(this, null);
        this.g = 0L;
        this.j = Instant.now().toEpochMilli();
    }

    public static void b() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
    }

    public static void c() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    public final wht a(whg whgVar, String str) {
        wht whtVarT = whj.a.c.t((Context) whgVar.b, (String) whgVar.c, "", str);
        whtVarT.e = (ldk) whgVar.e;
        return whtVarT;
    }

    public final void d(abvk abvkVar, wic wicVar, Context context) {
        String str = TextUtils.isEmpty(this.e) ? null : this.e;
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            wib wibVarA = wib.a();
            abnp abnpVarN = abvn.a.n();
            abnpVarN.t();
            abvn abvnVar = (abvn) abnpVarN.b;
            abvkVar.getClass();
            abvnVar.c = abvkVar;
            abvnVar.b = 4;
            wibVarA.c((abvn) abnpVarN.q(), wicVar.b(), wicVar.a(), context, str);
        }
    }

    public final void e(int i, SurveyDataImpl surveyDataImpl) {
        ajmd ajmdVar = this.l;
        if (ajmdVar != null) {
            ajmdVar.z(surveyDataImpl.a(), i);
        }
    }
}
