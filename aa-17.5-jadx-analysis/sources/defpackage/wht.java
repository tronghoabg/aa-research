package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class wht {
    protected final Context a;
    public final String b;
    protected final String c;
    protected final String d;
    public ldk e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private adlm g;
    private String h;
    private final ykd i;

    public wht(Context context, String str, String str2, String str3, ykd ykdVar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.i = ykdVar;
    }

    static adlx i() {
        adlu adluVar = admc.b;
        int i = adlx.d;
        return new adlt("Cookie", adluVar);
    }

    public final SurveyData a(abxk abxkVar) {
        String str = abxkVar.g;
        abyn abynVar = abxkVar.d;
        if (abynVar == null) {
            abynVar = abyn.a;
        }
        abyn abynVar2 = abynVar;
        String str2 = this.b;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        if (abynVar2 == null) {
            throw new IllegalArgumentException("Payload is null.");
        }
        abzc abzcVar = abxkVar.c;
        if (abzcVar == null) {
            abzcVar = abzc.a;
        }
        abzc abzcVar2 = abzcVar;
        String str3 = abxkVar.e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        yfq yfqVarO = yfq.o(abxkVar.f);
        if (jCurrentTimeMillis != 0) {
            return new SurveyDataImpl(str2, str, jCurrentTimeMillis, abzcVar2, abynVar2, str3, yfqVarO);
        }
        throw new IllegalStateException("Trigger time is not set");
    }

    public final void b(abxj abxjVar, abxk abxkVar, wic wicVar) {
        wht whtVar;
        abxk abxkVar2;
        Runnable jorVar;
        if (abxkVar == null) {
            Log.e("SurveyNetworkConnection", "Survey trigger response was null for trigger id: ".concat(String.valueOf(this.b)));
            c(whf.b);
            return;
        }
        abyn abynVar = abxkVar.d;
        if (abynVar == null) {
            abynVar = abyn.a;
        }
        if (abynVar.g.size() == 0) {
            c(whf.c);
            return;
        }
        long j = wid.a;
        if (this.e == null) {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
            return;
        }
        abyn abynVar2 = abxkVar.d;
        if (abynVar2 == null) {
            abynVar2 = abyn.a;
        }
        abxx abxxVar = abynVar2.e;
        if (abxxVar == null) {
            abxxVar = abxx.b;
        }
        abxv abxvVar = abxxVar.d;
        if (abxvVar == null) {
            abxvVar = abxv.a;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        abnf abnfVar = abxvVar.b;
        if (abnfVar == null) {
            abnfVar = abnf.a;
        }
        long millis = timeUnit.toMillis(abnfVar.b);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        abnf abnfVar2 = abxvVar.b;
        if (abnfVar2 == null) {
            abnfVar2 = abnf.a;
        }
        long j2 = millis + (abnfVar2.c / 1000000);
        Handler handler = this.f;
        if (j2 < 100) {
            jorVar = new unj(this, abxkVar, 16);
            whtVar = this;
            abxkVar2 = abxkVar;
        } else {
            whtVar = this;
            abxkVar2 = abxkVar;
            jorVar = new jor(whtVar, j2, abxkVar2, 5);
        }
        handler.post(jorVar);
        Context context = whtVar.a;
        String str = whtVar.c;
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        vuf.A(abxjVar, abxkVar2, wicVar, context, str);
    }

    public final void c(whf whfVar) {
        if (this.e != null) {
            this.f.post(new unj(this, whfVar, 17, null));
        } else {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0385 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v16, types: [whh] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v92, types: [whh] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r19v12, types: [xvs] */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xvs d() throws defpackage.qoe, java.io.IOException {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wht.d():xvs");
    }

    public final adix e(xvs xvsVar) {
        String strE;
        htm htmVar;
        try {
            long j = wid.a;
            if (TextUtils.isEmpty(this.h) && (htmVar = whj.a.d) != null) {
                this.h = htmVar.u();
            }
            this.g = adqw.c(whj.a.a(), 443, (CronetEngine) this.i.a).a();
            String str = this.h;
            admc admcVar = new admc();
            wox woxVar = wia.c;
            Context context = wia.b;
            if (!wia.b(true)) {
                admcVar.f(i(), str);
            } else if (xvsVar == null && !TextUtils.isEmpty(str)) {
                admcVar.f(i(), str);
            }
            String str2 = this.d;
            if (!TextUtils.isEmpty(str2)) {
                adlu adluVar = admc.b;
                int i = adlx.d;
                admcVar.f(new adlt("X-Goog-Api-Key", adluVar), str2);
            }
            Context context2 = this.a;
            try {
                strE = wid.e(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 64));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SurveyUtils", "Package not found.", e);
                strE = null;
            }
            if (!TextUtils.isEmpty(strE)) {
                adlu adluVar2 = admc.b;
                int i2 = adlx.d;
                admcVar.f(new adlt("X-Android-Cert", adluVar2), strE);
            }
            String packageName = this.a.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                adlu adluVar3 = admc.b;
                int i3 = adlx.d;
                admcVar.f(new adlt("X-Android-Package", adluVar3), packageName);
            }
            adlu adluVar4 = admc.b;
            int i4 = adlx.d;
            admcVar.f(new adlt("Authority", adluVar4), whj.a.a());
            return adqq.F(this.g, new aedl(admcVar));
        } catch (Exception e2) {
            Log.e("NetworkCallerGrpc", "Could not get managed channel.", e2);
            this.g();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void f(defpackage.abxj r10, defpackage.wic r11) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wht.f(abxj, wic):void");
    }

    public final void g() {
        adlm adlmVar = this.g;
        if (adlmVar != null) {
            adlmVar.c();
        }
    }

    public final /* synthetic */ void h(ackx ackxVar, whk whkVar) {
        admf admfVarA;
        try {
            xvs xvsVarD = d();
            whj whjVar = whj.a;
            boolean z = whjVar.b;
            whjVar.b = true;
            adix adixVarE = e(xvsVarD);
            whjVar.b = z;
            if (adixVarE == null) {
                Log.e("NetworkCallerGrpc", "Could not get channel for survey startup config.");
                whjVar.b = false;
                return;
            }
            acle acleVarA = aclf.a(adixVarE);
            adix adixVar = acleVarA.a;
            admf admfVar = aclf.e;
            if (admfVar == null) {
                synchronized (aclf.class) {
                    admfVarA = aclf.e;
                    if (admfVarA == null) {
                        xh xhVarC = admf.c();
                        xhVarC.b = adme.a;
                        xhVarC.d = admf.b("google.internal.feedback.v1.SurveyService", "GetSurveyStartupConfig");
                        xhVarC.b();
                        ackx ackxVar2 = ackx.a;
                        abnj abnjVar = aecu.a;
                        xhVarC.e = new aect(ackxVar2);
                        xhVarC.c = new aect(acky.a);
                        admfVarA = xhVarC.a();
                        aclf.e = admfVarA;
                    }
                }
                admfVar = admfVarA;
            }
            wub.ah(aedi.b(adixVar.d(admfVar, acleVarA.b), ackxVar), new oyj(this, whkVar, 6, null), whq.a());
        } catch (UnsupportedOperationException e) {
            Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
            c(whf.e);
        }
    }

    public final void j(abxh abxhVar, wic wicVar) {
        long j = wid.a;
        String str = this.c;
        String str2 = true == TextUtils.isEmpty(str) ? null : str;
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            abnp abnpVarN = abwe.a.n();
            char c = 2;
            if ((abxhVar.b & 1) != 0) {
                abyi abyiVar = abxhVar.c;
                if (abyiVar == null) {
                    abyiVar = abyi.a;
                }
                abnp abnpVarN2 = abve.a.n();
                if ((abyiVar.b & 1) != 0) {
                    abnf abnfVar = abyiVar.e;
                    if (abnfVar == null) {
                        abnfVar = abnf.a;
                    }
                    abnpVarN2.t();
                    abve abveVar = (abve) abnpVarN2.b;
                    abnfVar.getClass();
                    abveVar.e = abnfVar;
                    abveVar.b |= 1;
                }
                int i = abyiVar.c;
                int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    abvd abvdVar = abvd.a;
                    abnpVarN2.t();
                    abve abveVar2 = (abve) abnpVarN2.b;
                    abvdVar.getClass();
                    abveVar2.d = abvdVar;
                    abveVar2.c = 2;
                } else if (i3 == 1) {
                    abyf abyfVar = i == 3 ? (abyf) abyiVar.d : abyf.a;
                    abnp abnpVarN3 = abvb.a.n();
                    if ((abyfVar.b & 2) != 0) {
                        abyr abyrVar = abyfVar.c;
                        if (abyrVar == null) {
                            abyrVar = abyr.a;
                        }
                        abnp abnpVarN4 = abvt.a.n();
                        String str3 = abyrVar.d;
                        abnpVarN4.t();
                        abvt abvtVar = (abvt) abnpVarN4.b;
                        str3.getClass();
                        abvtVar.d = str3;
                        if ((abyrVar.b & 1) != 0) {
                            abnp abnpVarN5 = abvs.a.n();
                            abyq abyqVar = abyrVar.c;
                            if (abyqVar == null) {
                                abyqVar = abyq.a;
                            }
                            aboh abohVar = abyqVar.c;
                            abnpVarN5.t();
                            abvs abvsVar = (abvs) abnpVarN5.b;
                            aboh abohVar2 = abvsVar.b;
                            if (!abohVar2.c()) {
                                abvsVar.b = abnv.I(abohVar2);
                            }
                            abmc.i(abohVar, abvsVar.b);
                            abnpVarN4.t();
                            abvt abvtVar2 = (abvt) abnpVarN4.b;
                            abvs abvsVar2 = (abvs) abnpVarN5.q();
                            abvsVar2.getClass();
                            abvtVar2.c = abvsVar2;
                            abvtVar2.b |= 1;
                        }
                        abnpVarN3.t();
                        abvb abvbVar = (abvb) abnpVarN3.b;
                        abvt abvtVar3 = (abvt) abnpVarN4.q();
                        abvtVar3.getClass();
                        abvbVar.c = abvtVar3;
                        abvbVar.b |= 1;
                    }
                    if ((abyfVar.b & 4) != 0) {
                        abzb abzbVar = abyfVar.d;
                        if (abzbVar == null) {
                            abzbVar = abzb.a;
                        }
                        abnp abnpVarN6 = abwb.a.n();
                        if ((abzbVar.b & 1) != 0) {
                            abza abzaVar = abzbVar.c;
                            if (abzaVar == null) {
                                abzaVar = abza.a;
                            }
                            abnp abnpVarN7 = abwa.a.n();
                            if ((abzaVar.b & 2) != 0) {
                                abyz abyzVar = abzaVar.c;
                                if (abyzVar == null) {
                                    abyzVar = abyz.a;
                                }
                                abnp abnpVarN8 = abvz.a.n();
                                if ((abyzVar.b & 1) != 0) {
                                    abyy abyyVar = abyzVar.c;
                                    if (abyyVar == null) {
                                        abyyVar = abyy.a;
                                    }
                                    abnp abnpVarN9 = abvy.a.n();
                                    String str4 = abyyVar.b;
                                    abnpVarN9.t();
                                    abvy abvyVar = (abvy) abnpVarN9.b;
                                    str4.getClass();
                                    abvyVar.b = str4;
                                    String str5 = abyyVar.c;
                                    abnpVarN9.t();
                                    abvy abvyVar2 = (abvy) abnpVarN9.b;
                                    str5.getClass();
                                    abvyVar2.c = str5;
                                    String str6 = abyyVar.d;
                                    abnpVarN9.t();
                                    abvy abvyVar3 = (abvy) abnpVarN9.b;
                                    str6.getClass();
                                    abvyVar3.d = str6;
                                    String str7 = abyyVar.e;
                                    abnpVarN9.t();
                                    abvy abvyVar4 = (abvy) abnpVarN9.b;
                                    str7.getClass();
                                    abvyVar4.e = str7;
                                    String str8 = abyyVar.f;
                                    abnpVarN9.t();
                                    abvy abvyVar5 = (abvy) abnpVarN9.b;
                                    str8.getClass();
                                    abvyVar5.f = str8;
                                    abvy abvyVar6 = (abvy) abnpVarN9.q();
                                    abnpVarN8.t();
                                    abvz abvzVar = (abvz) abnpVarN8.b;
                                    abvyVar6.getClass();
                                    abvzVar.c = abvyVar6;
                                    abvzVar.b |= 1;
                                }
                                if ((abyzVar.b & 2) != 0) {
                                    abyx abyxVar = abyzVar.d;
                                    if (abyxVar == null) {
                                        abyxVar = abyx.a;
                                    }
                                    abnp abnpVarN10 = abvx.a.n();
                                    if (abyxVar.b.size() > 0) {
                                        for (abyw abywVar : abyxVar.b) {
                                            abnp abnpVarN11 = abvw.a.n();
                                            String str9 = abywVar.b;
                                            abnpVarN11.t();
                                            char c2 = c;
                                            abvw abvwVar = (abvw) abnpVarN11.b;
                                            str9.getClass();
                                            abvwVar.b = str9;
                                            String str10 = abywVar.c;
                                            abnpVarN11.t();
                                            abvw abvwVar2 = (abvw) abnpVarN11.b;
                                            str10.getClass();
                                            abvwVar2.c = str10;
                                            abvw abvwVar3 = (abvw) abnpVarN11.q();
                                            abnpVarN10.t();
                                            abvx abvxVar = (abvx) abnpVarN10.b;
                                            abvwVar3.getClass();
                                            aboh abohVar3 = abvxVar.b;
                                            if (!abohVar3.c()) {
                                                abvxVar.b = abnv.I(abohVar3);
                                            }
                                            abvxVar.b.add(abvwVar3);
                                            c = c2;
                                        }
                                    }
                                    abnpVarN8.t();
                                    abvz abvzVar2 = (abvz) abnpVarN8.b;
                                    abvx abvxVar2 = (abvx) abnpVarN10.q();
                                    abvxVar2.getClass();
                                    abvzVar2.d = abvxVar2;
                                    abvzVar2.b |= 2;
                                }
                                abnpVarN7.t();
                                abwa abwaVar = (abwa) abnpVarN7.b;
                                abvz abvzVar3 = (abvz) abnpVarN8.q();
                                abvzVar3.getClass();
                                abwaVar.c = abvzVar3;
                                abwaVar.b |= 2;
                            }
                            abnpVarN6.t();
                            abwb abwbVar = (abwb) abnpVarN6.b;
                            abwa abwaVar2 = (abwa) abnpVarN7.q();
                            abwaVar2.getClass();
                            abwbVar.c = abwaVar2;
                            abwbVar.b |= 1;
                        }
                        abnpVarN3.t();
                        abvb abvbVar2 = (abvb) abnpVarN3.b;
                        abwb abwbVar2 = (abwb) abnpVarN6.q();
                        abwbVar2.getClass();
                        abvbVar2.d = abwbVar2;
                        abvbVar2.b |= 2;
                    }
                    abnpVarN2.t();
                    abve abveVar3 = (abve) abnpVarN2.b;
                    abvb abvbVar3 = (abvb) abnpVarN3.q();
                    abvbVar3.getClass();
                    abveVar3.d = abvbVar3;
                    abveVar3.c = 3;
                } else if (i3 == 2) {
                    abnp abnpVarN12 = abuu.a.n();
                    boolean z = (abyiVar.c == 4 ? (abxy) abyiVar.d : abxy.a).b;
                    abnpVarN12.t();
                    ((abuu) abnpVarN12.b).b = z;
                    abnpVarN2.t();
                    abve abveVar4 = (abve) abnpVarN2.b;
                    abuu abuuVar = (abuu) abnpVarN12.q();
                    abuuVar.getClass();
                    abveVar4.d = abuuVar;
                    abveVar4.c = 4;
                } else if (i3 == 3) {
                    abye abyeVar = i == 5 ? (abye) abyiVar.d : abye.a;
                    abnp abnpVarN13 = abva.a.n();
                    int i4 = abyeVar.d;
                    abnpVarN13.t();
                    ((abva) abnpVarN13.b).d = i4;
                    int i5 = abyeVar.b;
                    int iAc = wox.ac(i5);
                    int i6 = iAc - 1;
                    if (iAc == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        abyd abydVar = i5 == 2 ? (abyd) abyeVar.c : abyd.a;
                        abnp abnpVarN14 = abuz.a.n();
                        if ((abydVar.b & 1) != 0) {
                            abyc abycVar = abydVar.c;
                            if (abycVar == null) {
                                abycVar = abyc.a;
                            }
                            abuy abuyVarZ = vuf.z(abycVar);
                            abnpVarN14.t();
                            abuz abuzVar = (abuz) abnpVarN14.b;
                            abuyVarZ.getClass();
                            abuzVar.c = abuyVarZ;
                            abuzVar.b |= 1;
                        }
                        abnpVarN13.t();
                        abva abvaVar = (abva) abnpVarN13.b;
                        abuz abuzVar2 = (abuz) abnpVarN14.q();
                        abuzVar2.getClass();
                        abvaVar.c = abuzVar2;
                        abvaVar.b = 2;
                    } else if (i6 == 1) {
                        abxz abxzVar = i5 == 3 ? (abxz) abyeVar.c : abxz.a;
                        abnp abnpVarN15 = abuv.a.n();
                        if (abxzVar.b.size() > 0) {
                            Iterator<E> it = abxzVar.b.iterator();
                            while (it.hasNext()) {
                                abuy abuyVarZ2 = vuf.z((abyc) it.next());
                                abnpVarN15.t();
                                abuv abuvVar = (abuv) abnpVarN15.b;
                                abuyVarZ2.getClass();
                                aboh abohVar4 = abuvVar.b;
                                if (!abohVar4.c()) {
                                    abuvVar.b = abnv.I(abohVar4);
                                }
                                abuvVar.b.add(abuyVarZ2);
                            }
                        }
                        abnpVarN13.t();
                        abva abvaVar2 = (abva) abnpVarN13.b;
                        abuv abuvVar2 = (abuv) abnpVarN15.q();
                        abuvVar2.getClass();
                        abvaVar2.c = abuvVar2;
                        abvaVar2.b = 3;
                    } else if (i6 == 2) {
                        abyb abybVar = i5 == 4 ? (abyb) abyeVar.c : abyb.a;
                        abnp abnpVarN16 = abux.a.n();
                        if ((abybVar.b & 1) != 0) {
                            abyc abycVar2 = abybVar.c;
                            if (abycVar2 == null) {
                                abycVar2 = abyc.a;
                            }
                            abuy abuyVarZ3 = vuf.z(abycVar2);
                            abnpVarN16.t();
                            abux abuxVar = (abux) abnpVarN16.b;
                            abuyVarZ3.getClass();
                            abuxVar.c = abuyVarZ3;
                            abuxVar.b |= 1;
                        }
                        abnpVarN13.t();
                        abva abvaVar3 = (abva) abnpVarN13.b;
                        abux abuxVar2 = (abux) abnpVarN16.q();
                        abuxVar2.getClass();
                        abvaVar3.c = abuxVar2;
                        abvaVar3.b = 4;
                    } else if (i6 == 3) {
                        abnp abnpVarN17 = abuw.a.n();
                        String str11 = (abyeVar.b == 5 ? (abya) abyeVar.c : abya.a).b;
                        abnpVarN17.t();
                        abuw abuwVar = (abuw) abnpVarN17.b;
                        str11.getClass();
                        abuwVar.b = str11;
                        abnpVarN13.t();
                        abva abvaVar4 = (abva) abnpVarN13.b;
                        abuw abuwVar2 = (abuw) abnpVarN17.q();
                        abuwVar2.getClass();
                        abvaVar4.c = abuwVar2;
                        abvaVar4.b = 5;
                    }
                    abnpVarN2.t();
                    abve abveVar5 = (abve) abnpVarN2.b;
                    abva abvaVar5 = (abva) abnpVarN13.q();
                    abvaVar5.getClass();
                    abveVar5.d = abvaVar5;
                    abveVar5.c = 5;
                } else if (i3 == 4) {
                    abvc abvcVar = abvc.a;
                    abnpVarN2.t();
                    abve abveVar6 = (abve) abnpVarN2.b;
                    abvcVar.getClass();
                    abveVar6.d = abvcVar;
                    abveVar6.c = 6;
                }
                abnpVarN.t();
                abwe abweVar = (abwe) abnpVarN.b;
                abve abveVar7 = (abve) abnpVarN2.q();
                abveVar7.getClass();
                abweVar.c = abveVar7;
                abweVar.b |= 1;
            }
            if ((abxhVar.b & 2) != 0) {
                abnp abnpVarN18 = abwc.a.n();
                abzc abzcVar = abxhVar.d;
                if (abzcVar == null) {
                    abzcVar = abzc.a;
                }
                String str12 = abzcVar.b;
                abnpVarN18.t();
                abwc abwcVar = (abwc) abnpVarN18.b;
                str12.getClass();
                abwcVar.b = str12;
                abzc abzcVar2 = abxhVar.d;
                if (abzcVar2 == null) {
                    abzcVar2 = abzc.a;
                }
                abms abmsVar = abzcVar2.c;
                abnpVarN18.t();
                abwc abwcVar2 = (abwc) abnpVarN18.b;
                abmsVar.getClass();
                abwcVar2.c = abmsVar;
                abwc abwcVar3 = (abwc) abnpVarN18.q();
                abnpVarN.t();
                abwe abweVar2 = (abwe) abnpVarN.b;
                abwcVar3.getClass();
                abweVar2.d = abwcVar3;
                abweVar2.b |= 2;
            }
            Context context = this.a;
            wib wibVarA = wib.a();
            abnp abnpVarN19 = abvf.a.n();
            abnpVarN19.t();
            abvf abvfVar = (abvf) abnpVarN19.b;
            abwe abweVar3 = (abwe) abnpVarN.q();
            abweVar3.getClass();
            abvfVar.c = abweVar3;
            abvfVar.b = 3;
            abwf abwfVar = abwf.a;
            abnpVarN19.t();
            abvf abvfVar2 = (abvf) abnpVarN19.b;
            abwfVar.getClass();
            abvfVar2.e = abwfVar;
            abvfVar2.d = 5;
            wibVarA.b((abvf) abnpVarN19.q(), wicVar.b(), wicVar.a(), context, str2);
        }
    }

    public final void k(whk whkVar) {
        this.f.post(new wil(whkVar, 1));
    }
}
