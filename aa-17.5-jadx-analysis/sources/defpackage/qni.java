package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class qni extends qmf {
    protected String a;
    protected String c;
    protected boolean d;
    protected int e;
    public boolean f;
    public boolean g;

    @Override // defpackage.qmf
    protected final void b() throws PackageManager.NameNotFoundException {
        qni qniVar;
        ApplicationInfo applicationInfo;
        int i;
        Context contextF = f();
        try {
            applicationInfo = contextF.getPackageManager().getApplicationInfo(contextF.getPackageName(), 128);
            qniVar = this;
        } catch (PackageManager.NameNotFoundException e) {
            super.p(5, "PackageManager doesn't know about the app package", e, null, null);
            qniVar = this;
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            super.p(5, "Couldn't get ApplicationInfo to load global config", null, null, null);
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        qmh qmhVar = qniVar.b;
        qmz qmzVarBn = roc.bn(i, new rjg(qmhVar), new qme(qmhVar));
        if (qmzVarBn != null) {
            super.p(2, "Loading global XML config values", null, null, null);
            String str = qmzVarBn.a;
            if (str != null) {
                qniVar.c = str;
                super.p(3, "XML config - app name", str, null, null);
            }
            String str2 = qmzVarBn.b;
            if (str2 != null) {
                qniVar.a = str2;
                super.p(3, "XML config - app version", str2, null, null);
            }
            String str3 = qmzVarBn.c;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                int i2 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                if (i2 >= 0) {
                    super.p(2, "XML config - log level", Integer.valueOf(i2), null, null);
                }
            }
            int i3 = qmzVarBn.d;
            if (i3 >= 0) {
                qniVar.e = i3;
                qniVar.d = true;
                super.p(3, "XML config - dispatch period (sec)", Integer.valueOf(i3), null, null);
            }
            int i4 = qmzVarBn.e;
            if (i4 != -1) {
                boolean z = 1 == i4;
                qniVar.g = z;
                qniVar.f = true;
                super.p(3, "XML config - dry run", Boolean.valueOf(z), null, null);
            }
        }
    }
}
