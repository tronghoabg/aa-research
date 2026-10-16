package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pqc implements Runnable {
    final GmmAccount a;
    final Locale b;
    final pxy c;
    final pqj d;
    final String e;
    final boolean f;
    final ppw g;
    public volatile boolean h = false;
    public final /* synthetic */ pqe i;
    public volatile ptq j;

    public pqc(pqe pqeVar, GmmAccount gmmAccount, Locale locale, pxy pxyVar, pqj pqjVar, String str, boolean z, ppw ppwVar) {
        this.i = pqeVar;
        this.a = gmmAccount;
        this.b = locale;
        this.c = pxyVar;
        this.d = pqjVar;
        this.e = str;
        this.f = z;
        this.g = ppwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [plz, pna] */
    public final void a(ppw ppwVar) {
        xuv xuvVar;
        ppw ppwVarC;
        xuv xuvVarB = xuw.b("updateViaGws");
        try {
            ((ynz) ((ynz) pqe.a.f()).ai(6819)).u("P/H: Running update task via GWS.");
            if (ppwVar == null) {
                pqe pqeVar = this.i;
                ppwVarC = pqeVar.w.c(pqeVar.k, pqu.b, this.c, this.d);
            } else {
                ppwVarC = ppwVar;
            }
            pqu pquVar = ppwVarC.b;
            pqu pquVar2 = pqu.b;
            if (pquVar != pquVar2) {
                ppwVarC.b = pquVar2;
            }
            ppwVarC.c();
            pqe pqeVar2 = this.i;
            qcd qcdVar = pqeVar2.l;
            if (qcdVar != null) {
                qcdVar.b();
            }
            ppu ppuVar = pqeVar2.e;
            GmmAccount gmmAccount = this.a;
            Locale locale = this.b;
            pqb pqbVar = new pqb(this, ppwVarC);
            String[] strArr = vaq.a;
            ackk ackkVar = ppuVar.b;
            ((pwr) ackkVar.a()).a().e = gmmAccount;
            Context context = ppuVar.f;
            ackk ackkVar2 = ppuVar.d;
            ackk ackkVar3 = ppuVar.e;
            ?? r9 = ppuVar.g;
            ackk ackkVar4 = ppuVar.i;
            abnp abnpVarN = acbt.a.n();
            List listI = ((pmy) r9).e(null).i();
            abnpVarN.t();
            acbt acbtVar = (acbt) abnpVarN.b;
            acbtVar.b();
            abmc.i(listI, acbtVar.c);
            abms abmsVarG = r9.g();
            abnpVarN.t();
            acbt acbtVar2 = (acbt) abnpVarN.b;
            abmsVarG.getClass();
            acbtVar2.b |= 4;
            acbtVar2.e = abmsVarG;
            int i = pll.a;
            vaq.d();
            abnp abnpVarN2 = acbs.a.n();
            abnpVarN2.t();
            acbs acbsVar = (acbs) abnpVarN2.b;
            acbsVar.b |= 1;
            acbsVar.c = true;
            boolean z = vak.a(context) >= 131072;
            abnpVarN2.t();
            acbs acbsVar2 = (acbs) abnpVarN2.b;
            acbsVar2.b |= 2;
            acbsVar2.d = z;
            boolean z2 = vak.a(context) >= 196608;
            abnpVarN2.t();
            acbs acbsVar3 = (acbs) abnpVarN2.b;
            acbsVar3.b |= 4;
            acbsVar3.e = z2;
            abnpVarN2.t();
            acbs acbsVar4 = (acbs) abnpVarN2.b;
            acbsVar4.b |= 8;
            acbsVar4.f = true;
            abnpVarN2.t();
            acbs acbsVar5 = (acbs) abnpVarN2.b;
            acbsVar5.b |= 16;
            acbsVar5.g = true;
            String str = true != woy.am(null) ? null : "";
            abnpVarN2.t();
            acbs acbsVar6 = (acbs) abnpVarN2.b;
            str.getClass();
            acbsVar6.b |= 64;
            acbsVar6.i = str;
            abnpVarN2.t();
            acbs acbsVar7 = (acbs) abnpVarN2.b;
            acbsVar7.b |= 256;
            acbsVar7.j = false;
            pxv pxvVar = (pxv) ackkVar2.a();
            abgi abgiVarAj = lvl.aj(r9);
            aauo aauoVarAi = lvl.ai(r9);
            aaun aaunVarAh = lvl.ah(r9);
            abft abftVar = abft.COMPACT_MULTIZOOM_STYLE_TABLE;
            xuvVar = xuvVarB;
            try {
                abnp abnpVarN3 = abgf.a.n();
                ackk ackkVar5 = pxvVar.e;
                String string = ((pzl) ackkVar5.a()).b().toString();
                abnpVarN3.t();
                abgf abgfVar = (abgf) abnpVarN3.b;
                abgfVar.b |= 64;
                abgfVar.h = string;
                String strA = pzf.a();
                abnpVarN3.t();
                abgf abgfVar2 = (abgf) abnpVarN3.b;
                abgfVar2.b |= 2;
                abgfVar2.d = strA;
                float f = pxvVar.b.density;
                abnpVarN3.t();
                abgf abgfVar3 = (abgf) abnpVarN3.b;
                abgfVar3.b |= 1024;
                abgfVar3.l = f;
                abnpVarN3.t();
                abgf abgfVar4 = (abgf) abnpVarN3.b;
                abgfVar4.b |= 4;
                abgfVar4.e = "prod";
                String language = locale.getLanguage();
                abnpVarN3.t();
                abgf abgfVar5 = (abgf) abnpVarN3.b;
                language.getClass();
                abgfVar5.b |= 1;
                abgfVar5.c = language;
                String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                abnpVarN3.t();
                abgf abgfVar6 = (abgf) abnpVarN3.b;
                strValueOf.getClass();
                abgfVar6.b |= 8;
                abgfVar6.f = strValueOf;
                abnpVarN3.t();
                abgf abgfVar7 = (abgf) abnpVarN3.b;
                abgfVar7.p = abftVar.d;
                abgfVar7.b |= 8192;
                abnpVarN3.t();
                abgf abgfVar8 = (abgf) abnpVarN3.b;
                abgfVar8.b |= 1048576;
                abgfVar8.s = true;
                int i2 = pxvVar.g - 1;
                abnpVarN3.t();
                abgf abgfVar9 = (abgf) abnpVarN3.b;
                abgfVar9.b |= 2097152;
                abgfVar9.t = i2;
                boolean z3 = aauoVarAi.b && aaunVarAh.b;
                abnpVarN3.t();
                abgf abgfVar10 = (abgf) abnpVarN3.b;
                abgfVar10.b |= 8388608;
                abgfVar10.v = z3;
                Context context2 = pxvVar.f;
                String packageName = context2.getPackageName();
                abnpVarN3.t();
                abgf abgfVar11 = (abgf) abnpVarN3.b;
                packageName.getClass();
                abgfVar11.b |= 16;
                abgfVar11.g = packageName;
                String strL = lxr.L(context2);
                abnpVarN3.t();
                abgf abgfVar12 = (abgf) abnpVarN3.b;
                abgfVar12.b |= 64;
                abgfVar12.h = strL;
                String string2 = ((pzk) ((xxm) ((pzl) ackkVar5.a()).c()).a).toString();
                abnpVarN3.t();
                abgf abgfVar13 = (abgf) abnpVarN3.b;
                abgfVar13.b |= 128;
                abgfVar13.i = string2;
                String strK = lxr.K((pzl) ackkVar5.a());
                abnpVarN3.t();
                abgf abgfVar14 = (abgf) abnpVarN3.b;
                abgfVar14.b |= 131072;
                abgfVar14.r = strK;
                String strC = ((plq) pxvVar.d.a()).c();
                if (!strC.isEmpty()) {
                    abnpVarN3.t();
                    abgf abgfVar15 = (abgf) abnpVarN3.b;
                    strC.getClass();
                    abgfVar15.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                    abgfVar15.k = strC;
                }
                abnp abnpVarN4 = abgv.a.n();
                abnpVarN4.t();
                abgv abgvVar = (abgv) abnpVarN4.b;
                abgvVar.b |= 1;
                abgvVar.c = 18;
                abnpVarN4.t();
                abgv abgvVar2 = (abgv) abnpVarN4.b;
                abgvVar2.b |= 2;
                abgvVar2.d = 1;
                abgw abgwVar = abgiVarAj.f;
                if (abgwVar == null) {
                    abgwVar = abgw.a;
                }
                int i3 = abgwVar.b;
                abnpVarN4.t();
                abgv abgvVar3 = (abgv) abnpVarN4.b;
                abgvVar3.b |= 4;
                abgvVar3.e = i3;
                abgv abgvVar4 = (abgv) abnpVarN4.q();
                abnpVarN3.t();
                abgf abgfVar16 = (abgf) abnpVarN3.b;
                abgvVar4.getClass();
                abgfVar16.o = abgvVar4;
                abgfVar16.b |= 4096;
                boolean z4 = aauoVarAi.b;
                abnpVarN3.t();
                abgf abgfVar17 = (abgf) abnpVarN3.b;
                abgfVar17.b |= 4194304;
                abgfVar17.u = z4;
                yob yobVar = pyg.a;
                ArrayList arrayList = new ArrayList();
                for (String str2 : "".split(",")) {
                    String strTrim = str2.trim();
                    if (!strTrim.isEmpty()) {
                        try {
                            yfq yfqVar = pyg.b;
                            if (((yls) yfqVar).c <= 0) {
                                arrayList.add(Integer.valueOf(Integer.parseInt(strTrim)));
                            } else {
                                try {
                                    Object obj = ((sm) yfqVar.get(0)).a;
                                    throw null;
                                } catch (NumberFormatException unused) {
                                    ((ynz) ((ynz) pyg.a.h()).ai((char) 6946)).y("Invalid experiment id: ' %s '", strTrim);
                                }
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    abnpVarN3.t();
                    abgf abgfVar18 = (abgf) abnpVarN3.b;
                    abod abodVar = abgfVar18.m;
                    if (!abodVar.c()) {
                        abgfVar18.m = abnv.G(abodVar);
                    }
                    abgfVar18.m.g(iIntValue);
                }
                ((ynz) ((ynz) pxv.a.f()).ai((char) 6945)).y("Requested experimentIds= %s", arrayList);
                abgf abgfVar19 = (abgf) abnpVarN3.q();
                abnpVarN2.t();
                acbs acbsVar8 = (acbs) abnpVarN2.b;
                abgfVar19.getClass();
                acbsVar8.h = abgfVar19;
                acbsVar8.b |= 32;
                String str3 = Build.DEVICE;
                abnpVarN2.t();
                acbs acbsVar9 = (acbs) abnpVarN2.b;
                str3.getClass();
                acbsVar9.b |= 1024;
                acbsVar9.l = str3;
                String str4 = Build.FINGERPRINT;
                abnpVarN2.t();
                acbs acbsVar10 = (acbs) abnpVarN2.b;
                str4.getClass();
                acbsVar10.b |= 2048;
                acbsVar10.m = str4;
                String str5 = Build.MANUFACTURER;
                abnpVarN2.t();
                acbs acbsVar11 = (acbs) abnpVarN2.b;
                str5.getClass();
                acbsVar11.b |= 4096;
                acbsVar11.n = str5;
                String str6 = Build.MODEL;
                abnpVarN2.t();
                acbs acbsVar12 = (acbs) abnpVarN2.b;
                str6.getClass();
                acbsVar12.b |= 8192;
                acbsVar12.o = str6;
                abnp abnpVarN5 = acbr.a.n();
                Iterator it2 = ((Set) ackkVar4.a()).iterator();
                while (it2.hasNext()) {
                    ((pql) it2.next()).a();
                }
                acbr acbrVar = (acbr) abnpVarN5.q();
                abnpVarN2.t();
                acbs acbsVar13 = (acbs) abnpVarN2.b;
                acbrVar.getClass();
                acbsVar13.p = acbrVar;
                acbsVar13.b |= 16384;
                acbs acbsVar14 = (acbs) abnpVarN2.q();
                abnpVarN.t();
                acbt acbtVar3 = (acbt) abnpVarN.b;
                acbsVar14.getClass();
                acbtVar3.d = acbsVar14;
                acbtVar3.b |= 1;
                acbt acbtVar4 = (acbt) abnpVarN.q();
                ((ynz) ((ynz) ppu.a.f()).ai(6803)).M("Fetching new client parameters: %s  %s", gmmAccount, locale);
                this.j = ((pwr) ackkVar.a()).b().a(acbtVar4, new ppt(pqbVar), ppuVar.h);
                xuvVar.close();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    xuvVar.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            xuvVar = xuvVarB;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        xuv xuvVarB;
        ackk ackkVar;
        if (this.h) {
            return;
        }
        yob yobVar = pqe.a;
        ((ynz) ((ynz) yobVar.f()).ai(6818)).M("P/H: Running update task for account %s , locale %s", this.a, this.b);
        pqe pqeVar = this.i;
        ackk ackkVar2 = pqeVar.f;
        if (ackkVar2 == null || (ackkVar = pqeVar.g) == null || !((pya) ackkVar.a()).a()) {
            if (ackkVar2 != null && lvl.ag(pqeVar.n).l) {
                xuvVarB = xuw.b("updateViaPhenotypeForDarkLaunch");
                try {
                    ((ynz) ((ynz) yobVar.f()).ai(6821)).u("P/H: Running update task via Phenotype for dark launch.");
                    pqeVar.i.execute(new pfp(ackkVar2, 16));
                    xuvVarB.close();
                } finally {
                }
            }
            a(this.g);
        } else {
            ppw ppwVarC = this.g;
            pqu pquVar = pqu.c;
            xuvVarB = xuw.b("updateViaPhenotype");
            try {
                ((ynz) ((ynz) yobVar.f()).ai(6820)).u("P/H: Running update task via Phenotype.");
                zhc zhcVar = new zhc();
                if (ppwVarC == null) {
                    ppwVarC = pqeVar.w.c(pqeVar.k, pquVar, this.c, this.d);
                }
                if (ppwVarC.b != pquVar) {
                    ppwVarC.b = pquVar;
                }
                pqeVar.i.execute(new oey(this, ppwVarC, ackkVar2, 20));
                wub.ah(zhcVar, new oyj(this, ppwVarC, 3, null), pqeVar.h);
                xuvVarB.close();
            } finally {
            }
        }
    }
}
