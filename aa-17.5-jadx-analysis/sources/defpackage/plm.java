package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.provider.Telephony;
import com.google.android.gms.carsetup.FirstActivityImpl;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class plm implements xyc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ plm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, zgs] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v34, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v45, types: [ackk, java.lang.Object] */
    @Override // defpackage.xyc
    public final Object gu() throws PackageManager.NameNotFoundException {
        boolean z = true;
        String strA = null;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                obj.getClass();
                return this.a.submit(new flt(obj, 10));
            case 1:
                if (lgv.c().w()) {
                    Context context = ((lwx) this.a).b;
                    mkc mkcVarB = mjv.b();
                    String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
                    if (defaultSmsPackage != null) {
                        qrn qrnVar = (qrn) this.b;
                        if (mkcVarB.d(qrnVar, defaultSmsPackage, qpi.g) && mkcVarB.d(qrnVar, defaultSmsPackage, qpi.b)) {
                            ((ype) ((ype) lwx.a.f()).ai((char) 4419)).y("SMS not enabled because the default SMS app <%s> says it will handle SMSs", defaultSmsPackage);
                            ebf.j().C(yyv.SMS_RECEIVER_DISABLED_DUE_TO_DEFAULT_SMS_APP_SUPPORT, defaultSmsPackage);
                            z = false;
                        }
                    }
                    ebf.j().C(yyv.SMS_RECEIVER_ENABLED, defaultSmsPackage);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return ((pyi) this.a).v(((pyk) this.b).Q, null, null);
            case 3:
                qar qarVar = new qar(((pyh) this.b.a()).a(), (sm) this.a);
                vaq.d();
                AtomicInteger atomicInteger = qarVar.b;
                SharedPreferences sharedPreferences = qarVar.a;
                atomicInteger.set(sharedPreferences.getInt("activationId", 1));
                qarVar.c.set(sharedPreferences.getInt("sequenceId", (int) (Math.random() * 1.073741824E9d)));
                qarVar.e = sharedPreferences.getString("previousClientEventId", null);
                qarVar.f = sharedPreferences.getString("baseEventId", qar.b());
                if (qaf.b(qarVar.f) == null) {
                    qarVar.f = qar.b();
                }
                vaq.d();
                qarVar.d.clear();
                sm smVar = qarVar.g;
                if (smVar != null) {
                    smVar.a.put(qarVar.getClass().getName(), new lxr());
                }
                return qarVar;
            case 4:
                return new spg((Context) this.a, (sou) this.b);
            case 5:
                FirstActivityImpl firstActivityImpl = (FirstActivityImpl) this.b;
                firstActivityImpl.q = firstActivityImpl.q();
                firstActivityImpl.q.c();
                firstActivityImpl.B(2);
                return new FirstActivityImpl.LocalBinder(firstActivityImpl, (Intent) this.a, new sky(firstActivityImpl.q));
            case 6:
                return new sii((sio) this.a, (String) this.b);
            case 7:
                sm smVar2 = (sm) this.a;
                if (smVar2.t(pyo.AGMM_ENABLE_MIGRATE_CLIENT_PARAMS_TO_START_UP_FLAGS)) {
                    return Boolean.valueOf(smVar2.t(pyo.ENABLE_GEOXP_MAPCORE));
                }
                return false;
            case 8:
                ygr ygrVar = txn.a;
                vaq.d();
                return ((Boolean) this.b.gu()).booleanValue() ? xxh.h(new uqd((Resources) this.a)) : xvy.a;
            case 9:
                yob yobVar = upm.a;
                return new plb(zwm.f().j, pkz.RESOURCE_MANAGER_RESOURCE, (pkx) this.a.a(), null);
            case 10:
                return ply.a.b((Context) this.a, ((zre) this.b).i());
            case 11:
                PackageManager packageManager = ((Context) this.a).getPackageManager();
                packageManager.getClass();
                String strI = ((zre) this.b).i();
                ply plyVar = ply.a;
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strI, 64);
                    if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                        strA = ply.a(packageInfo.signatures[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                strA.getClass();
                return strA;
            case 12:
                Object obj2 = this.a;
                synchronized (this.b) {
                    String strA2 = vqs.a();
                    String strBK = a.bK(strA2, ".trace");
                    File file = new File(((Context) obj2).getFilesDir(), a.bz(strA2, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((ynz) ((ynz) vlj.a.e()).ai(9807)).u("Could not create directory");
                        return xvy.a;
                    }
                    File file2 = new File(file, strBK);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (RuntimeException e) {
                        ((ynz) ((ynz) ((ynz) vlj.a.e()).p(e)).ai((char) 9806)).u("Exception when clearing trace file.");
                    }
                    return xxh.h(file2);
                }
            default:
                Object obj3 = this.b;
                String str = zyb.a;
                acbu acbuVar = acbu.a;
                return new zri((Context) this.a, "DATA_ServerControlledParametersManager.data.v1.".concat(String.valueOf(obj3)), abnv.L(acbu.class));
        }
    }

    public /* synthetic */ plm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
