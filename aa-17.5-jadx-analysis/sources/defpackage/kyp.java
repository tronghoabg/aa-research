package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.CalendarContract;
import com.google.android.gearhead.sdk.assistant.ClientRegistrationConfig;
import com.google.android.gearhead.sdk.assistant.SupportedVersionInfo;
import com.google.android.gms.car.CarInfo;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class kyp implements syp {
    final /* synthetic */ kyw a;

    public kyp(kyw kywVar) {
        this.a = kywVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.syp
    public final void a(SupportedVersionInfo supportedVersionInfo) {
        wer.c();
        kyw kywVar = this.a;
        if (kywVar.C.o() && !lbh.d().gN()) {
            ((ype) ((ype) kyw.a.h()).ai((char) 3598)).u("handleServiceConnected: Lifetime component is not started");
            return;
        }
        yph yphVar = kyw.a;
        ((ype) yphVar.l().ai((char) 3590)).y("Version info %s", supportedVersionInfo);
        AtomicReference atomicReference = kywVar.h;
        atomicReference.set(supportedVersionInfo.c);
        int i = 0;
        kywVar.u.m(Boolean.valueOf(supportedVersionInfo.c.l && acxa.aj()));
        kywVar.v.m(Boolean.valueOf(supportedVersionInfo.c.m));
        abod abodVar = acmd.p().b;
        int i2 = supportedVersionInfo.b;
        while (true) {
            int i3 = 2;
            if (i2 < supportedVersionInfo.a) {
                throw new IllegalStateException(String.format(Locale.US, "CarAssistantProvider only supports versions %d..%d; need one of %s", Integer.valueOf(supportedVersionInfo.a), Integer.valueOf(supportedVersionInfo.b), abodVar));
            }
            if (abodVar.contains(Integer.valueOf(i2))) {
                kywVar.j = i2;
                int iH = (int) acmd.h();
                if (iH >= 0) {
                    ((ype) yphVar.l().ai(3596)).w("Version override %d", iH);
                    if (iH < supportedVersionInfo.a || iH > supportedVersionInfo.b) {
                        ((ype) yphVar.l().ai((char) 3597)).u("Version override invalid");
                    } else {
                        kywVar.j = iH;
                    }
                }
                ((ype) yphVar.l().ai(3591)).w("Registering with version %d", kywVar.j);
                int i4 = kywVar.j;
                yph yphVar2 = laj.a;
                ClientRegistrationConfig clientRegistrationConfig = new ClientRegistrationConfig();
                clientRegistrationConfig.b = 2;
                clientRegistrationConfig.a = i4;
                CarInfo carInfoB = juw.b().b();
                if (carInfoB != null) {
                    clientRegistrationConfig.e = carInfoB.a;
                    clientRegistrationConfig.f = carInfoB.b;
                }
                Context context = kywVar.d;
                ArrayList arrayList = new ArrayList();
                yno it = ((ygr) Collection.EL.stream(lem.a().e(kio.b().e(), nyj.a())).map(new koj(11)).filter(new kxo(i3)).map(new koj(12)).collect(ycm.b)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ComponentName componentName = (ComponentName) it.next();
                    if (!componentName.getPackageName().equals("com.google.android.projection.gearhead")) {
                        arrayList.add(componentName.getPackageName());
                    } else if (componentName.equals(mkn.p)) {
                        int i5 = jrj.a;
                        ComponentName componentNameA = jrj.a(context, new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI));
                        String packageName = componentNameA != null ? componentNameA.getPackageName() : null;
                        if (packageName != null) {
                            arrayList.add(packageName);
                        }
                    }
                }
                int i6 = jrj.a;
                ComponentName componentNameA2 = jrj.a(context, new Intent("android.intent.action.DIAL"));
                String packageName2 = componentNameA2 == null ? null : componentNameA2.getPackageName();
                if (packageName2 != null) {
                    arrayList.add(packageName2);
                }
                clientRegistrationConfig.c = arrayList;
                int iIntValue = -1;
                if (acmd.F() && Build.VERSION.SDK_INT >= 34) {
                    iIntValue = ((Integer) kgq.c(new kym(i), "GH.Assistant.Controller", yzz.ASSISTANT, yzy.yZ, true, "Error getting virtual device id", new Object[0])).intValue();
                }
                clientRegistrationConfig.h = iIntValue;
                clientRegistrationConfig.d = new ArrayList();
                String str = (String) aclg.a.gu();
                if (!str.isEmpty()) {
                    clientRegistrationConfig.d.add(str);
                }
                ((ype) ((ype) yphVar.f()).ai(3592)).R("Gearhead x Gemini flags: useAsr %s UseGeminiGhKs %s isGeminiEnabled %s", Boolean.valueOf(Build.VERSION.SDK_INT >= 30), Boolean.valueOf(acxa.aj()), Boolean.valueOf(supportedVersionInfo.c.l));
                abnp abnpVarN = orh.a.n();
                abnpVarN.t();
                orh orhVar = (orh) abnpVarN.b;
                orhVar.b |= 1;
                orhVar.c = true;
                boolean zB = lal.a().b();
                abnpVarN.t();
                orh orhVar2 = (orh) abnpVarN.b;
                orhVar2.b |= 2;
                orhVar2.d = zB;
                abnpVarN.t();
                orh orhVar3 = (orh) abnpVarN.b;
                orhVar3.b |= 4;
                orhVar3.e = true;
                boolean zG = acvb.g();
                abnpVarN.t();
                orh orhVar4 = (orh) abnpVarN.b;
                orhVar4.b |= 8;
                orhVar4.f = zG;
                abnpVarN.t();
                orh orhVar5 = (orh) abnpVarN.b;
                orhVar5.b |= 16;
                orhVar5.g = true;
                boolean zL = kfl.l();
                abnpVarN.t();
                orh orhVar6 = (orh) abnpVarN.b;
                orhVar6.b |= 32;
                orhVar6.h = zL;
                abnpVarN.t();
                orh orhVar7 = (orh) abnpVarN.b;
                orhVar7.b |= 64;
                orhVar7.i = true;
                boolean zB2 = leh.a().b();
                abnpVarN.t();
                orh orhVar8 = (orh) abnpVarN.b;
                orhVar8.b |= 128;
                orhVar8.j = zB2;
                boolean zC = acrz.c();
                abnpVarN.t();
                orh orhVar9 = (orh) abnpVarN.b;
                orhVar9.b |= 256;
                orhVar9.k = zC;
                boolean z = Build.VERSION.SDK_INT >= 30;
                abnpVarN.t();
                orh orhVar10 = (orh) abnpVarN.b;
                orhVar10.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                orhVar10.l = z;
                abnpVarN.t();
                orh orhVar11 = (orh) abnpVarN.b;
                orhVar11.b |= 1024;
                orhVar11.m = true;
                boolean zAj = acxa.aj();
                abnpVarN.t();
                orh orhVar12 = (orh) abnpVarN.b;
                orhVar12.b |= 2048;
                orhVar12.n = zAj;
                boolean zB3 = lef.a().b();
                abnpVarN.t();
                orh orhVar13 = (orh) abnpVarN.b;
                orhVar13.b |= 4096;
                orhVar13.o = zB3;
                boolean zC2 = lef.a().c();
                abnpVarN.t();
                orh orhVar14 = (orh) abnpVarN.b;
                orhVar14.b |= 8192;
                orhVar14.p = zC2;
                clientRegistrationConfig.g = (orh) abnpVarN.q();
                ((ype) yphVar.l().ai((char) 3593)).y("Registration config %s", clientRegistrationConfig);
                if (kywVar.f.l(clientRegistrationConfig, (orl) atomicReference.get())) {
                    if (kywVar.af() && !acpc.u()) {
                        kywVar.aa();
                    }
                    final kzc kzcVar = kywVar.e;
                    kzcVar.f(2, new kyz(kzcVar, 0), Boolean.class);
                    kzcVar.g(7, "AssistantRailInvokedMediaRecEnabled", kzcVar.f);
                    final boolean z2 = ((orl) atomicReference.get()).c;
                    final eqm eqmVar = kzcVar.g;
                    kzcVar.f(2, new kwx() { // from class: kza
                        public final /* synthetic */ String b = "AssistantCoolwalkSuggestionsEnabled";

                        @Override // defpackage.kwx
                        public final void a(Object obj) {
                            boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
                            kzc kzcVar2 = kzcVar;
                            eqm eqmVar2 = eqmVar;
                            if (zEquals) {
                                kzc.e(new kzb(kzcVar2, eqmVar2, 1), Boolean.valueOf(z2));
                            } else {
                                kzcVar2.a.edit().remove(this.b).apply();
                                kzc.h(eqmVar2, false);
                            }
                        }
                    }, Boolean.class);
                    kzcVar.g(8, "AssistantTranscriptionEnabled", kzcVar.h);
                    if (actj.o()) {
                        ((ype) ((ype) yphVar.f()).ai((char) 3595)).u("Refreshing autoplaymessages setting");
                        kzcVar.f(10, new kyz(kzcVar, 2), Boolean.class);
                    }
                    if (((orl) atomicReference.get()).n) {
                        ebf.j().F(olm.e(acai.Ng).l());
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.yY).l());
                    }
                    ((ype) ((ype) yphVar.f()).ai(3594)).w("Car assistant registration successful. Version=%d", kywVar.j);
                    kywVar.p.a = kywVar.j;
                    kywVar.ad(1);
                    if (((orl) atomicReference.get()).n && ((orl) atomicReference.get()).l) {
                        kywVar.k.edit().putBoolean("GEMINI_ENABLED_KEY", true).apply();
                    } else {
                        kywVar.k.edit().putBoolean("GEMINI_ENABLED_KEY", false).apply();
                    }
                    if (kywVar.l > 0) {
                        lah.a();
                        lah.e(ywj.SERVICE_RECONNECTED, null);
                        return;
                    }
                    return;
                }
                return;
            }
            i2--;
        }
    }

    @Override // defpackage.syp
    public final void b() {
        wer.c();
        kyw kywVar = this.a;
        rzk rzkVarN = rzk.n();
        kywVar.W(rzkVarN);
        kywVar.i.set(rzkVarN.toString());
        kywVar.j = -1;
        kywVar.p.a = -1;
        kywVar.ad(2);
        if (kywVar.ag() || kywVar.af()) {
            kzt.a().c();
        }
        kywVar.h.set(kyw.ai(kywVar.C));
        if (kywVar.l >= 5) {
            kywVar.T(null, ywj.SERVICE_REBIND_FAILED);
            lah.a();
            lah.e(ywj.SERVICE_PERMANENTLY_DISCONNECTED, null);
        } else {
            lah.a();
            lah.e(ywj.SERVICE_DISCONNECTED, null);
        }
        kywVar.l++;
    }
}
