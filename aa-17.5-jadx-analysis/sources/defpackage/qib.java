package defpackage;

import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qib implements lbl {
    @Override // defpackage.lbl
    public final void a(Context context, String str) {
        if (c()) {
            yph yphVar = qie.a;
            qie.c(context, str, ((jri) mki.a.i(jri.class)).name(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, xyc] */
    @Override // defpackage.lbl
    public final void b(Activity activity) throws PackageManager.NameNotFoundException {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        new ApplicationErrorReport();
        FeedbackOptions feedbackOptionsX = thg.x(suz.b(activity), bundle, null, null, arrayList, null, null, thg.n());
        GoogleHelp googleHelp = new GoogleHelp(23, "main", null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
        googleHelp.q = Uri.parse("https://support.google.com/androidauto/topic/6106806");
        File cacheDir = activity.getCacheDir();
        googleHelp.R = feedbackOptionsX.u;
        googleHelp.v = new ErrorReport(feedbackOptionsX, cacheDir);
        googleHelp.v.X = "GoogleHelp";
        Intent intentPutExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        rjg rjgVarG = lau.a().g(activity);
        if (!intentPutExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intentPutExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        Object obj = rjgVarG.a;
        Context context = (Context) obj;
        int iB = skm.b(context, 11925000);
        if (iB == 0) {
            ((ssc) rjgVarG.b.gu()).a(intentPutExtra);
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intentPutExtra.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (iB == 7) {
            iB = 7;
        } else if (!((Activity) obj).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new sss(Looper.getMainLooper()).post(new sbj(rjgVarG, data, 9, (byte[]) null));
            return;
        }
        if (iB == 1 && true == skm.e(context)) {
            iB = 18;
        }
        sjv.a.h((Activity) obj, iB, 0, null);
    }

    @Override // defpackage.lbl
    public final boolean c() {
        return acqa.c();
    }

    @Override // defpackage.lbl
    public final void d(Context context, String str, Bundle bundle) {
        if (c()) {
            yph yphVar = qie.a;
            qie.c(context, str, "PROJECTED", bundle);
        }
    }

    @Override // defpackage.lbl
    public final Intent e() {
        if (!c()) {
            return null;
        }
        yph yphVar = qie.a;
        return qie.b();
    }
}
