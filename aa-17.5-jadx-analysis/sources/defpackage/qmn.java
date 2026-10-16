package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
public final class qmn extends qmf {
    public final qln a;

    public qmn(qmh qmhVar) {
        super(qmhVar);
        this.a = new qln();
    }

    @Override // defpackage.qmf
    protected final void b() {
        qlk qlkVarG = g();
        if (qlkVarG.e == null) {
            synchronized (qlkVarG) {
                if (qlkVarG.e == null) {
                    qln qlnVar = new qln();
                    Context context = qlkVarG.b;
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    qlnVar.c = packageName;
                    qlnVar.d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("GAv4", a.bz(packageName, "Error retrieving package info: appName set to "));
                    }
                    qlnVar.a = packageName;
                    qlnVar.b = str;
                    qlkVarG.e = qlnVar;
                }
            }
        }
        qln qlnVar2 = this.a;
        qlkVarG.e.b(qlnVar2);
        qni qniVarN = n();
        qniVarN.s();
        String str2 = qniVarN.c;
        if (str2 != null) {
            qlnVar2.a = str2;
        }
        qniVarN.s();
        String str3 = qniVarN.a;
        if (str3 != null) {
            qlnVar2.b = str3;
        }
    }
}
