package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.Objects;
import j$.util.Optional;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ptf implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/network/clientproperties/ClientPropertiesControllerImpl");
    public final pyh b;
    public final aezk c;
    public final ackk d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public String f = null;
    public final abnp g;
    public final aabf h;
    private final aezk i;
    private final plq j;
    private final sm k;

    public ptf(pyh pyhVar, plq plqVar, Context context, pzl pzlVar, acey aceyVar, plj pljVar, String str, aezk aezkVar, sm smVar, aabf aabfVar, aezk aezkVar2, ackk ackkVar) {
        String strK = lxr.K(pzlVar);
        String strL = lxr.L(context);
        this.b = pyhVar;
        long jA = pzlVar.a();
        Resources resources = context.getResources();
        abnp abnpVarN = acbv.a.n();
        String strK2 = pyhVar.k(pyk.ab, null);
        if (strK2 != null) {
            abnpVarN.t();
            acbv acbvVar = (acbv) abnpVarN.b;
            acbvVar.b |= 1;
            acbvVar.e = strK2;
        }
        String strC = plqVar.c();
        abnpVarN.t();
        acbv acbvVar2 = (acbv) abnpVarN.b;
        strC.getClass();
        acbvVar2.b |= 4;
        acbvVar2.f = strC;
        abnpVarN.t();
        acbv acbvVar3 = (acbv) abnpVarN.b;
        acbvVar3.b |= 256;
        acbvVar3.h = true;
        abnpVarN.t();
        acbv acbvVar4 = (acbv) abnpVarN.b;
        acbvVar4.b |= 16384;
        acbvVar4.l = true;
        abnpVarN.t();
        acbv acbvVar5 = (acbv) abnpVarN.b;
        acbvVar5.b |= 134217728;
        acbvVar5.t = false;
        boolean z = pljVar.b.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        abnpVarN.t();
        acbv acbvVar6 = (acbv) abnpVarN.b;
        acbvVar6.b |= 268435456;
        acbvVar6.u = z;
        boolean zA = pljVar.a();
        abnpVarN.t();
        acbv acbvVar7 = (acbv) abnpVarN.b;
        acbvVar7.b |= Integer.MIN_VALUE;
        acbvVar7.v = zA;
        boolean z2 = !pljVar.e();
        abnpVarN.t();
        acbv acbvVar8 = (acbv) abnpVarN.b;
        acbvVar8.c |= 1;
        acbvVar8.w = z2;
        abnp abnpVarN2 = acbq.a.n();
        int i = resources.getDisplayMetrics().densityDpi;
        abnpVarN2.t();
        acbq acbqVar = (acbq) abnpVarN2.b;
        acbqVar.b |= 1;
        acbqVar.c = i;
        abnpVarN.t();
        acbv acbvVar9 = (acbv) abnpVarN.b;
        acbq acbqVar2 = (acbq) abnpVarN2.q();
        acbqVar2.getClass();
        acbvVar9.q = acbqVar2;
        acbvVar9.b |= 4194304;
        int i2 = resources.getDisplayMetrics().densityDpi;
        int i3 = i2 > 300 ? 4 : i2 > 200 ? 3 : 1;
        abnpVarN.t();
        acbv acbvVar10 = (acbv) abnpVarN.b;
        acbvVar10.p = i3;
        acbvVar10.b |= 2097152;
        abnpVarN.t();
        acbv acbvVar11 = (acbv) abnpVarN.b;
        str.getClass();
        acbvVar11.b |= 1024;
        acbvVar11.i = str;
        abnpVarN.t();
        acbv acbvVar12 = (acbv) abnpVarN.b;
        acbvVar12.b |= 65536;
        acbvVar12.m = "SYSTEM";
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        abnpVarN.t();
        acbv acbvVar13 = (acbv) abnpVarN.b;
        strValueOf.getClass();
        acbvVar13.b |= 33554432;
        acbvVar13.s = strValueOf;
        sjv sjvVar = sjv.a;
        int iA = skm.a(context.getApplicationContext());
        abnpVarN.t();
        acbv acbvVar14 = (acbv) abnpVarN.b;
        acbvVar14.c |= 16384;
        acbvVar14.F = iA;
        abnpVarN.t();
        acbv acbvVar15 = (acbv) abnpVarN.b;
        acbvVar15.c |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        acbvVar15.B = jA;
        String strC2 = plqVar.c();
        abnpVarN.t();
        acbv acbvVar16 = (acbv) abnpVarN.b;
        strC2.getClass();
        acbvVar16.b |= 4;
        acbvVar16.f = strC2;
        pzlVar.e();
        abnpVarN.t();
        acbv acbvVar17 = (acbv) abnpVarN.b;
        acbvVar17.H = 3;
        acbvVar17.c |= 134217728;
        abnpVarN.t();
        acbv acbvVar18 = (acbv) abnpVarN.b;
        acbvVar18.D = aceyVar.g;
        acbvVar18.c |= 2048;
        Optional optionalI = pzlVar.c().i();
        mla mlaVar = new mla(abnpVarN, 18);
        if (true == optionalI.isPresent()) {
            Object obj = optionalI.get();
            Object obj2 = mlaVar.a;
            String string = ((pzk) obj).toString();
            abnp abnpVar = (abnp) obj2;
            abnpVar.t();
            acbv acbvVar19 = (acbv) abnpVar.b;
            acbvVar19.c |= 256;
            acbvVar19.A = string;
        }
        abnpVarN.t();
        acbv acbvVar20 = (acbv) abnpVarN.b;
        acbvVar20.c |= 64;
        acbvVar20.y = strL;
        abnpVarN.t();
        acbv acbvVar21 = (acbv) abnpVarN.b;
        acbvVar21.c |= 128;
        acbvVar21.z = strK;
        abnpVarN.t();
        acbv acbvVar22 = (acbv) abnpVarN.b;
        acbvVar22.b |= 131072;
        acbvVar22.n = "";
        this.g = abnpVarN;
        this.i = aezkVar;
        this.k = smVar;
        ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getClass();
        this.h = aabfVar;
        this.c = aezkVar2;
        this.d = ackkVar;
        this.j = plqVar;
    }

    public static void d(abow abowVar, accb accbVar, DataOutputStream dataOutputStream, pvn pvnVar) throws IOException {
        pvnVar.c(dataOutputStream.size());
        vaq.b(new pum(accbVar, 1));
        dataOutputStream.writeShort(accbVar.kt);
        lvl.af(dataOutputStream, abowVar);
        pvnVar.a(dataOutputStream.size(), true);
    }

    public final String a() {
        String str;
        abnp abnpVar = this.g;
        synchronized (abnpVar) {
            str = ((acbv) abnpVar.b).k;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, pmq] */
    public final void b(String str, String str2) {
        ?? r1;
        abrz abrzVarA;
        abnp abnpVarK;
        abnp abnpVar = this.g;
        synchronized (abnpVar) {
            String str3 = ((acbv) abnpVar.b).k;
            if (Objects.equals(str3, woy.al(str))) {
                ((ynz) ((ynz) a.d()).ai(6869)).M("zwieback cookie updated   new:%s  was:%s", str2, str3);
                if (str2 == null) {
                    abnpVar.t();
                    acbv acbvVar = (acbv) abnpVar.b;
                    acbvVar.b &= -4097;
                    acbvVar.k = acbv.a.k;
                } else {
                    abnpVar.t();
                    acbv acbvVar2 = (acbv) abnpVar.b;
                    acbvVar2.b |= 4096;
                    acbvVar2.k = str2;
                }
                GmmAccount.SignedOut signedOut = pmp.a;
                pmn pmnVar = lws.a;
                Object objA = pmnVar != null ? pmnVar.a() : null;
                pmo pmoVar = lws.b;
                if (pmoVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Account account = new Account(signedOut.c, "com.google.android.apps.maps");
                oct octVar = ((pjp) pmoVar).a;
                boolean z = false;
                if (affa.f(account.type, "com.google.android.apps.maps") && affa.f(account.name, "signedout@")) {
                    z = true;
                }
                woy.Z(z);
                do {
                    r1 = octVar.a;
                    abrzVarA = r1.a();
                    abry abryVar = abrzVarA.c;
                    if (abryVar == null) {
                        abryVar = abry.a;
                    }
                    if (!woy.al(abryVar.d).equals(woy.al((String) objA))) {
                        break;
                    }
                    abry abryVar2 = abrzVarA.c;
                    if (abryVar2 == null) {
                        abryVar2 = abry.a;
                    }
                    abnp abnpVarK2 = abryVar2.K();
                    if (str2 == null) {
                        abnpVarK2.t();
                        abry abryVar3 = (abry) abnpVarK2.b;
                        abryVar3.b &= -3;
                        abryVar3.d = abry.a.d;
                    } else {
                        abnpVarK2.t();
                        abry abryVar4 = (abry) abnpVarK2.b;
                        abryVar4.b |= 2;
                        abryVar4.d = str2;
                    }
                    abnpVarK = abrzVarA.K();
                    abnpVarK.t();
                    abrz abrzVar = (abrz) abnpVarK.b;
                    abry abryVar5 = (abry) abnpVarK2.q();
                    abryVar5.getClass();
                    abrzVar.c = abryVar5;
                    abrzVar.b |= 1;
                } while (!r1.b(xxh.h(abrzVarA), (abrz) abnpVarK.q()));
            } else {
                ((ynz) ((ynz) a.d()).ai(6868)).R("zwieback cookie rejected (already superseded)   current:%s  precondition:%s  rejected:%s", str3, str, str2);
            }
        }
    }

    public final void c() {
        abnp abnpVar = this.g;
        synchronized (abnpVar) {
            if (((acbv) abnpVar.b).j) {
                return;
            }
            abnpVar.t();
            acbv acbvVar = (acbv) abnpVar.b;
            acbvVar.b |= 2048;
            acbvVar.j = true;
            String strA = pmp.a.a();
            if (strA != null && !strA.isEmpty()) {
                abnpVar.t();
                acbv acbvVar2 = (acbv) abnpVar.b;
                acbvVar2.b |= 4096;
                acbvVar2.k = strA;
            }
        }
    }

    public final boolean e() {
        boolean z;
        abnp abnpVar = this.g;
        synchronized (abnpVar) {
            z = (((acbv) abnpVar.b).b & 4096) != 0;
        }
        return z;
    }

    public final abnp f() {
        abnp abnpVar = this.g;
        synchronized (abnpVar) {
        }
        return abnpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[Catch: all -> 0x0202, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0027, B:10:0x002d, B:11:0x0032, B:12:0x0056, B:18:0x007f, B:20:0x008e, B:21:0x0090, B:27:0x00a7, B:28:0x00a8, B:30:0x00bc, B:31:0x00c8, B:37:0x00dd, B:38:0x00de, B:40:0x00ec, B:41:0x00ee, B:47:0x0102, B:48:0x0103, B:49:0x0105, B:52:0x0117, B:54:0x0154, B:56:0x015c, B:58:0x0160, B:59:0x01a0, B:61:0x01a2, B:63:0x01a6, B:65:0x01c5, B:67:0x01ec, B:68:0x01f2, B:66:0x01d9, B:70:0x01f4, B:71:0x01fa, B:75:0x01fe, B:78:0x0201, B:42:0x00ef, B:43:0x00fe, B:22:0x0091, B:23:0x00a3, B:32:0x00c9, B:33:0x00d9, B:50:0x0106, B:51:0x0116, B:13:0x0057, B:15:0x0073, B:16:0x0079, B:17:0x007e), top: B:84:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: all -> 0x0202, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0027, B:10:0x002d, B:11:0x0032, B:12:0x0056, B:18:0x007f, B:20:0x008e, B:21:0x0090, B:27:0x00a7, B:28:0x00a8, B:30:0x00bc, B:31:0x00c8, B:37:0x00dd, B:38:0x00de, B:40:0x00ec, B:41:0x00ee, B:47:0x0102, B:48:0x0103, B:49:0x0105, B:52:0x0117, B:54:0x0154, B:56:0x015c, B:58:0x0160, B:59:0x01a0, B:61:0x01a2, B:63:0x01a6, B:65:0x01c5, B:67:0x01ec, B:68:0x01f2, B:66:0x01d9, B:70:0x01f4, B:71:0x01fa, B:75:0x01fe, B:78:0x0201, B:42:0x00ef, B:43:0x00fe, B:22:0x0091, B:23:0x00a3, B:32:0x00c9, B:33:0x00d9, B:50:0x0106, B:51:0x0116, B:13:0x0057, B:15:0x0073, B:16:0x0079, B:17:0x007e), top: B:84:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec A[Catch: all -> 0x0202, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0027, B:10:0x002d, B:11:0x0032, B:12:0x0056, B:18:0x007f, B:20:0x008e, B:21:0x0090, B:27:0x00a7, B:28:0x00a8, B:30:0x00bc, B:31:0x00c8, B:37:0x00dd, B:38:0x00de, B:40:0x00ec, B:41:0x00ee, B:47:0x0102, B:48:0x0103, B:49:0x0105, B:52:0x0117, B:54:0x0154, B:56:0x015c, B:58:0x0160, B:59:0x01a0, B:61:0x01a2, B:63:0x01a6, B:65:0x01c5, B:67:0x01ec, B:68:0x01f2, B:66:0x01d9, B:70:0x01f4, B:71:0x01fa, B:75:0x01fe, B:78:0x0201, B:42:0x00ef, B:43:0x00fe, B:22:0x0091, B:23:0x00a3, B:32:0x00c9, B:33:0x00d9, B:50:0x0106, B:51:0x0116, B:13:0x0057, B:15:0x0073, B:16:0x0079, B:17:0x007e), top: B:84:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x0202, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0027, B:10:0x002d, B:11:0x0032, B:12:0x0056, B:18:0x007f, B:20:0x008e, B:21:0x0090, B:27:0x00a7, B:28:0x00a8, B:30:0x00bc, B:31:0x00c8, B:37:0x00dd, B:38:0x00de, B:40:0x00ec, B:41:0x00ee, B:47:0x0102, B:48:0x0103, B:49:0x0105, B:52:0x0117, B:54:0x0154, B:56:0x015c, B:58:0x0160, B:59:0x01a0, B:61:0x01a2, B:63:0x01a6, B:65:0x01c5, B:67:0x01ec, B:68:0x01f2, B:66:0x01d9, B:70:0x01f4, B:71:0x01fa, B:75:0x01fe, B:78:0x0201, B:42:0x00ef, B:43:0x00fe, B:22:0x0091, B:23:0x00a3, B:32:0x00c9, B:33:0x00d9, B:50:0x0106, B:51:0x0116, B:13:0x0057, B:15:0x0073, B:16:0x0079, B:17:0x007e), top: B:84:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.acbv g(defpackage.pxh r7, defpackage.ygr r8) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptf.g(pxh, ygr):acbv");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
