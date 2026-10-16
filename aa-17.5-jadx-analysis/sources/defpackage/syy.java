package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.CarAssistantSetting;
import com.google.android.gearhead.sdk.assistant.ClientRegistrationConfig;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class syy {
    public static final yph a = yph.c("AssistantClientHelper");
    public final syq b;
    public qjd c;
    private final Context d;
    private final szh e;
    private syw f;
    private Intent g;
    private orl h;
    private boolean i;
    private boolean j;
    private qjc k;

    public syy(Context context, syq syqVar) {
        context.getClass();
        syqVar.getClass();
        szh szhVar = new szh(context, syqVar.d, syqVar.a, syqVar.c);
        this.d = context;
        this.e = szhVar;
        this.b = syqVar;
        abnp abnpVarN = orl.a.n();
        abnpVarN.getClass();
        abnv abnvVarQ = abnpVarN.q();
        abnvVarQ.getClass();
        this.h = (orl) abnvVarQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CarAssistantSetting p(int i, tar tarVar) {
        if (tarVar == null || tarVar.b.size() != 1) {
            ((ype) a.h()).y("Unexpected settings returned: %s", tarVar);
            return null;
        }
        tao taoVar = (tao) tarVar.b.get(0);
        taoVar.getClass();
        taq taqVarA = szi.a(i);
        taq taqVarB = taq.b(taoVar.d);
        if (taqVarB == null) {
            taqVarB = taq.KEY_UNKNOWN_SETTING;
        }
        if (taqVarA != taqVarB) {
            ype ypeVar = (ype) a.g();
            String strName = taqVarA.name();
            taq taqVarB2 = taq.b(taoVar.d);
            if (taqVarB2 == null) {
                taqVarB2 = taq.KEY_UNKNOWN_SETTING;
            }
            ypeVar.M("Incorrect key: %s != %s", strName, taqVarB2.name());
            throw new IllegalArgumentException("Incorrect SettingKey");
        }
        CarAssistantSetting carAssistantSetting = new CarAssistantSetting();
        carAssistantSetting.a = i;
        int i2 = taoVar.b;
        int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 3 : 2 : 1 : 4;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 0) {
            carAssistantSetting.b = i2 == 2 ? ((Boolean) taoVar.c).booleanValue() : false;
            return carAssistantSetting;
        }
        if (i4 == 1) {
            carAssistantSetting.c = i2 == 3 ? ((Integer) taoVar.c).intValue() : 0;
            return carAssistantSetting;
        }
        if (i4 == 2) {
            carAssistantSetting.d = i2 == 4 ? (String) taoVar.c : "";
            return carAssistantSetting;
        }
        ((ype) a.g()).u("Missing setting value");
        throw new IllegalArgumentException("Unsupported setting value");
    }

    private final CarAssistantSetting q(int i) {
        qjc qjcVar = this.k;
        if (qjcVar == null) {
            ((ype) a.h()).u("#getSetting called before assistant initiated");
            return null;
        }
        try {
            Parcel parcelGh = qjcVar.gh();
            parcelGh.writeInt(i);
            Parcel parcelGi = qjcVar.gi(3, parcelGh);
            CarAssistantSetting carAssistantSetting = (CarAssistantSetting) ijp.a(parcelGi, CarAssistantSetting.CREATOR);
            parcelGi.recycle();
            return carAssistantSetting;
        } catch (RemoteException e) {
            ((ype) ((ype) a.g()).p(e)).w("Failed to read setting : %s", i);
            return null;
        }
    }

    private final synchronized void r() {
        if (this.i && !this.b.c.o()) {
            ((ype) a.f()).y("Unbinding from service: %s", this.g);
            Context context = this.d;
            syw sywVar = this.f;
            if (sywVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            context.unbindService(sywVar);
            this.f = null;
            this.g = null;
            this.i = false;
            this.k = null;
            this.c = null;
        }
    }

    private final synchronized boolean s() {
        return this.h.e;
    }

    private static final void t(String str) {
        ((ype) a.h()).y("%s", str);
        lau.b(ywj.SERVICE_UNAVAILABLE);
    }

    public final synchronized void a() {
        szh szhVar = this.e;
        szhVar.d();
        if (!s()) {
            qjc qjcVar = this.k;
            if (qjcVar != null) {
                try {
                    qjcVar.gj(5, qjcVar.gh());
                    lau.b(ywj.SERVICE_CLOSED);
                } catch (RemoteException e) {
                    ((ype) ((ype) a.h()).p(e)).u("Failed to close the assistant");
                    lau.b(ywj.SERVICE_FAILED_TO_CLOSE);
                }
            }
        }
        szhVar.a();
        syr.a.b();
        abnp abnpVarN = orl.a.n();
        abnpVarN.getClass();
        abnv abnvVarQ = abnpVarN.q();
        abnvVarQ.getClass();
        this.h = (orl) abnvVarQ;
        r();
    }

    public final synchronized void b(szv szvVar) {
        admf admfVarA;
        szvVar.getClass();
        aecv aecvVar = (aecv) this.e.e.a();
        adix adixVar = aecvVar.a;
        szb szbVar = szh.c;
        admf admfVar = szp.g;
        if (admfVar == null) {
            synchronized (szp.class) {
                admfVarA = szp.g;
                if (admfVarA == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.a;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "FulfillDirectAction");
                    xhVarC.b();
                    szv szvVar2 = szv.a;
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(szvVar2);
                    xhVarC.c = new aect(szw.a);
                    admfVarA = xhVarC.a();
                    szp.g = admfVarA;
                }
            }
            admfVar = admfVarA;
        }
        aedi.d(adixVar.d(admfVar, aecvVar.b), szvVar, szbVar);
    }

    public final synchronized void c(int i, afec afecVar) {
        if (!s()) {
            afecVar.invoke(q(i));
            return;
        }
        szh szhVar = this.e;
        taq taqVarA = szi.a(i);
        aia aiaVar = new aia(afecVar, i, 19);
        aecv aecvVar = (aecv) szhVar.e.a();
        abnp abnpVarN = tas.b.n();
        abnpVarN.getClass();
        szp.e(abnpVarN);
        szp.d(taqVarA, abnpVarN);
        aedi.d(aecvVar.a.d(szp.a(), aecvVar.b), szp.c(abnpVarN), new szf(aiaVar, 1));
    }

    public final synchronized void d(List list, tau tauVar, afec afecVar) {
        admf admfVarA;
        tauVar.getClass();
        if (list.isEmpty()) {
            ((ype) a.h()).u("Empty messages passed in for smart actions");
            afecVar.invoke(null);
            return;
        }
        if (!this.h.k) {
            ((ype) a.h()).u("SmartActions gRPC is not enabled");
            afecVar.invoke(null);
            return;
        }
        aecv aecvVar = (aecv) this.e.e.a();
        taa taaVar = taa.a;
        abnp abnpVarN = taaVar.n();
        abnpVarN.getClass();
        DesugarCollections.unmodifiableList(((taa) abnpVarN.b).c).getClass();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(szk.a((MessagingInfo) it.next()).a);
        }
        abnpVarN.t();
        taa taaVar2 = (taa) abnpVarN.b;
        aboh abohVar = taaVar2.c;
        if (!abohVar.c()) {
            taaVar2.c = abnv.I(abohVar);
        }
        abmc.i(arrayList, taaVar2.c);
        abnpVarN.t();
        taa taaVar3 = (taa) abnpVarN.b;
        taaVar3.d = tauVar;
        taaVar3.b |= 1;
        abnv abnvVarQ = abnpVarN.q();
        abnvVarQ.getClass();
        taa taaVar4 = (taa) abnvVarQ;
        szf szfVar = new szf(afecVar, 0);
        adix adixVar = aecvVar.a;
        admf admfVar = szp.i;
        if (admfVar == null) {
            synchronized (szp.class) {
                admf admfVar2 = szp.i;
                if (admfVar2 == null) {
                    xh xhVarC = admf.c();
                    xhVarC.b = adme.a;
                    xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "GetSmartActions");
                    xhVarC.b();
                    abnj abnjVar = aecu.a;
                    xhVarC.e = new aect(taaVar);
                    xhVarC.c = new aect(tab.a);
                    admfVarA = xhVarC.a();
                    szp.i = admfVarA;
                } else {
                    admfVarA = admfVar2;
                }
            }
            admfVar = admfVarA;
        }
        aedi.d(adixVar.d(admfVar, aecvVar.b), taaVar4, szfVar);
    }

    public final synchronized void e() {
        boolean zQ = acpc.q();
        boolean z = this.h.h;
        if (!zQ || z) {
            return;
        }
        this.e.e();
    }

    public final synchronized void f(osw oswVar) {
        oswVar.getClass();
        qjc qjcVar = this.k;
        if (s()) {
            this.e.g(oswVar);
            return;
        }
        if (qjcVar == null) {
            ((ype) a.f()).u("assistant null");
            return;
        }
        try {
            byte[] bArrH = oswVar.h();
            Parcel parcelGh = qjcVar.gh();
            parcelGh.writeByteArray(bArrH);
            qjcVar.gj(6, parcelGh);
        } catch (RemoteException e) {
            ((ype) ((ype) a.h()).p(e)).u("Failed to send GearheadEvent");
            lau.b(ywj.SEND_GEARHEAD_EVENT_REMOTE_EXCEPTION);
        }
    }

    public final synchronized void g(osa osaVar) {
        this.e.i(osaVar);
    }

    public final synchronized void h(osb osbVar) {
        osbVar.getClass();
        this.e.j(osbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0348 A[Catch: all -> 0x0806, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0544, B:208:0x0700, B:210:0x070f, B:211:0x0711, B:215:0x0756, B:216:0x0766, B:228:0x0789, B:229:0x078b, B:240:0x07c5, B:242:0x07df, B:244:0x07eb, B:245:0x07f0, B:250:0x07fb, B:168:0x056b, B:170:0x059c, B:172:0x05a2, B:174:0x05b8, B:176:0x05d0, B:177:0x05d6, B:180:0x0605, B:181:0x0616, B:190:0x062c, B:192:0x0643, B:197:0x0670, B:198:0x06ac, B:200:0x06b2, B:202:0x06c6, B:204:0x06cc, B:206:0x06f0, B:207:0x06f6, B:193:0x0649, B:195:0x0658, B:196:0x065e, B:54:0x013f, B:56:0x0143, B:58:0x014b, B:64:0x018e, B:60:0x0159, B:63:0x0168, B:65:0x0192, B:67:0x0196, B:70:0x01a5, B:72:0x01b7, B:74:0x01bf, B:99:0x0340, B:101:0x0348, B:103:0x0354, B:104:0x0356, B:105:0x0367, B:107:0x036f, B:109:0x038d, B:75:0x01ef, B:77:0x01f9, B:78:0x0228, B:80:0x0230, B:84:0x0241, B:86:0x025a, B:88:0x0299, B:90:0x02bc, B:92:0x02c5, B:94:0x02cb, B:96:0x02d4, B:98:0x0325, B:112:0x03b1, B:114:0x03be, B:116:0x03c8, B:118:0x03ce, B:119:0x03dd, B:121:0x03e7, B:123:0x03ed, B:124:0x03fc, B:125:0x0411, B:131:0x0431, B:133:0x043e, B:135:0x0444, B:136:0x0453, B:144:0x0478, B:146:0x047c, B:148:0x0484, B:154:0x04b7, B:156:0x04e1, B:157:0x04e7, B:150:0x0492, B:153:0x0499, B:164:0x0514, B:212:0x072e, B:214:0x073d, B:252:0x07fd, B:230:0x078c, B:234:0x07af, B:238:0x07bf, B:239:0x07c4), top: B:262:0x0009, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036f A[Catch: all -> 0x0806, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0544, B:208:0x0700, B:210:0x070f, B:211:0x0711, B:215:0x0756, B:216:0x0766, B:228:0x0789, B:229:0x078b, B:240:0x07c5, B:242:0x07df, B:244:0x07eb, B:245:0x07f0, B:250:0x07fb, B:168:0x056b, B:170:0x059c, B:172:0x05a2, B:174:0x05b8, B:176:0x05d0, B:177:0x05d6, B:180:0x0605, B:181:0x0616, B:190:0x062c, B:192:0x0643, B:197:0x0670, B:198:0x06ac, B:200:0x06b2, B:202:0x06c6, B:204:0x06cc, B:206:0x06f0, B:207:0x06f6, B:193:0x0649, B:195:0x0658, B:196:0x065e, B:54:0x013f, B:56:0x0143, B:58:0x014b, B:64:0x018e, B:60:0x0159, B:63:0x0168, B:65:0x0192, B:67:0x0196, B:70:0x01a5, B:72:0x01b7, B:74:0x01bf, B:99:0x0340, B:101:0x0348, B:103:0x0354, B:104:0x0356, B:105:0x0367, B:107:0x036f, B:109:0x038d, B:75:0x01ef, B:77:0x01f9, B:78:0x0228, B:80:0x0230, B:84:0x0241, B:86:0x025a, B:88:0x0299, B:90:0x02bc, B:92:0x02c5, B:94:0x02cb, B:96:0x02d4, B:98:0x0325, B:112:0x03b1, B:114:0x03be, B:116:0x03c8, B:118:0x03ce, B:119:0x03dd, B:121:0x03e7, B:123:0x03ed, B:124:0x03fc, B:125:0x0411, B:131:0x0431, B:133:0x043e, B:135:0x0444, B:136:0x0453, B:144:0x0478, B:146:0x047c, B:148:0x0484, B:154:0x04b7, B:156:0x04e1, B:157:0x04e7, B:150:0x0492, B:153:0x0499, B:164:0x0514, B:212:0x072e, B:214:0x073d, B:252:0x07fd, B:230:0x078c, B:234:0x07af, B:238:0x07bf, B:239:0x07c4), top: B:262:0x0009, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e1 A[Catch: all -> 0x0806, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0544, B:208:0x0700, B:210:0x070f, B:211:0x0711, B:215:0x0756, B:216:0x0766, B:228:0x0789, B:229:0x078b, B:240:0x07c5, B:242:0x07df, B:244:0x07eb, B:245:0x07f0, B:250:0x07fb, B:168:0x056b, B:170:0x059c, B:172:0x05a2, B:174:0x05b8, B:176:0x05d0, B:177:0x05d6, B:180:0x0605, B:181:0x0616, B:190:0x062c, B:192:0x0643, B:197:0x0670, B:198:0x06ac, B:200:0x06b2, B:202:0x06c6, B:204:0x06cc, B:206:0x06f0, B:207:0x06f6, B:193:0x0649, B:195:0x0658, B:196:0x065e, B:54:0x013f, B:56:0x0143, B:58:0x014b, B:64:0x018e, B:60:0x0159, B:63:0x0168, B:65:0x0192, B:67:0x0196, B:70:0x01a5, B:72:0x01b7, B:74:0x01bf, B:99:0x0340, B:101:0x0348, B:103:0x0354, B:104:0x0356, B:105:0x0367, B:107:0x036f, B:109:0x038d, B:75:0x01ef, B:77:0x01f9, B:78:0x0228, B:80:0x0230, B:84:0x0241, B:86:0x025a, B:88:0x0299, B:90:0x02bc, B:92:0x02c5, B:94:0x02cb, B:96:0x02d4, B:98:0x0325, B:112:0x03b1, B:114:0x03be, B:116:0x03c8, B:118:0x03ce, B:119:0x03dd, B:121:0x03e7, B:123:0x03ed, B:124:0x03fc, B:125:0x0411, B:131:0x0431, B:133:0x043e, B:135:0x0444, B:136:0x0453, B:144:0x0478, B:146:0x047c, B:148:0x0484, B:154:0x04b7, B:156:0x04e1, B:157:0x04e7, B:150:0x0492, B:153:0x0499, B:164:0x0514, B:212:0x072e, B:214:0x073d, B:252:0x07fd, B:230:0x078c, B:234:0x07af, B:238:0x07bf, B:239:0x07c4), top: B:262:0x0009, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x056b A[Catch: all -> 0x0806, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0544, B:208:0x0700, B:210:0x070f, B:211:0x0711, B:215:0x0756, B:216:0x0766, B:228:0x0789, B:229:0x078b, B:240:0x07c5, B:242:0x07df, B:244:0x07eb, B:245:0x07f0, B:250:0x07fb, B:168:0x056b, B:170:0x059c, B:172:0x05a2, B:174:0x05b8, B:176:0x05d0, B:177:0x05d6, B:180:0x0605, B:181:0x0616, B:190:0x062c, B:192:0x0643, B:197:0x0670, B:198:0x06ac, B:200:0x06b2, B:202:0x06c6, B:204:0x06cc, B:206:0x06f0, B:207:0x06f6, B:193:0x0649, B:195:0x0658, B:196:0x065e, B:54:0x013f, B:56:0x0143, B:58:0x014b, B:64:0x018e, B:60:0x0159, B:63:0x0168, B:65:0x0192, B:67:0x0196, B:70:0x01a5, B:72:0x01b7, B:74:0x01bf, B:99:0x0340, B:101:0x0348, B:103:0x0354, B:104:0x0356, B:105:0x0367, B:107:0x036f, B:109:0x038d, B:75:0x01ef, B:77:0x01f9, B:78:0x0228, B:80:0x0230, B:84:0x0241, B:86:0x025a, B:88:0x0299, B:90:0x02bc, B:92:0x02c5, B:94:0x02cb, B:96:0x02d4, B:98:0x0325, B:112:0x03b1, B:114:0x03be, B:116:0x03c8, B:118:0x03ce, B:119:0x03dd, B:121:0x03e7, B:123:0x03ed, B:124:0x03fc, B:125:0x0411, B:131:0x0431, B:133:0x043e, B:135:0x0444, B:136:0x0453, B:144:0x0478, B:146:0x047c, B:148:0x0484, B:154:0x04b7, B:156:0x04e1, B:157:0x04e7, B:150:0x0492, B:153:0x0499, B:164:0x0514, B:212:0x072e, B:214:0x073d, B:252:0x07fd, B:230:0x078c, B:234:0x07af, B:238:0x07bf, B:239:0x07c4), top: B:262:0x0009, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x070f A[Catch: all -> 0x0806, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0544, B:208:0x0700, B:210:0x070f, B:211:0x0711, B:215:0x0756, B:216:0x0766, B:228:0x0789, B:229:0x078b, B:240:0x07c5, B:242:0x07df, B:244:0x07eb, B:245:0x07f0, B:250:0x07fb, B:168:0x056b, B:170:0x059c, B:172:0x05a2, B:174:0x05b8, B:176:0x05d0, B:177:0x05d6, B:180:0x0605, B:181:0x0616, B:190:0x062c, B:192:0x0643, B:197:0x0670, B:198:0x06ac, B:200:0x06b2, B:202:0x06c6, B:204:0x06cc, B:206:0x06f0, B:207:0x06f6, B:193:0x0649, B:195:0x0658, B:196:0x065e, B:54:0x013f, B:56:0x0143, B:58:0x014b, B:64:0x018e, B:60:0x0159, B:63:0x0168, B:65:0x0192, B:67:0x0196, B:70:0x01a5, B:72:0x01b7, B:74:0x01bf, B:99:0x0340, B:101:0x0348, B:103:0x0354, B:104:0x0356, B:105:0x0367, B:107:0x036f, B:109:0x038d, B:75:0x01ef, B:77:0x01f9, B:78:0x0228, B:80:0x0230, B:84:0x0241, B:86:0x025a, B:88:0x0299, B:90:0x02bc, B:92:0x02c5, B:94:0x02cb, B:96:0x02d4, B:98:0x0325, B:112:0x03b1, B:114:0x03be, B:116:0x03c8, B:118:0x03ce, B:119:0x03dd, B:121:0x03e7, B:123:0x03ed, B:124:0x03fc, B:125:0x0411, B:131:0x0431, B:133:0x043e, B:135:0x0444, B:136:0x0453, B:144:0x0478, B:146:0x047c, B:148:0x0484, B:154:0x04b7, B:156:0x04e1, B:157:0x04e7, B:150:0x0492, B:153:0x0499, B:164:0x0514, B:212:0x072e, B:214:0x073d, B:252:0x07fd, B:230:0x078c, B:234:0x07af, B:238:0x07bf, B:239:0x07c4), top: B:262:0x0009, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x078c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i(int r39, com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r40, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot r41, defpackage.qji r42, defpackage.qjb r43, final java.util.function.BiConsumer r44, java.lang.Runnable r45) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syy.i(int, com.google.android.gearhead.sdk.assistant.VoiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot, qji, qjb, java.util.function.BiConsumer, java.lang.Runnable):void");
    }

    public final synchronized boolean j(syp sypVar) {
        int i = 1;
        if (this.b.c.o()) {
            ((ype) a.f()).u("Starting assistant initial handshake");
            lau.b(ywj.SERVICE_CONNECTION_ATTEMPTED_DODGEBOOST);
            this.e.b(new syx(this, sypVar));
            return true;
        }
        lau.b(ywj.SERVICE_CONNECTION_ATTEMPTED);
        r();
        Context context = this.d;
        yph yphVar = szj.a;
        Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("com.google.android.car.category.CAR_ASSISTANT");
        intentAddCategory.getClass();
        List<ResolveInfo> listQueryIntentServices = context.getApplicationContext().getPackageManager().queryIntentServices(intentAddCategory, 0);
        listQueryIntentServices.getClass();
        Iterator<T> it = listQueryIntentServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (affa.f(RemoteApiConstants.NOW_PACKAGE, serviceInfo != null ? serviceInfo.packageName : null)) {
                ((ype) szj.a.f()).M("Found %s %s", resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                intentAddCategory.setComponent(new ComponentName(RemoteApiConstants.NOW_PACKAGE, resolveInfo.serviceInfo.name));
            }
        }
        if (intentAddCategory.getComponent() == null) {
            intentAddCategory = null;
        } else {
            intentAddCategory.setAction(null);
        }
        if (intentAddCategory == null) {
            t("Failed to bind to assistant. Intent null");
            return false;
        }
        syw sywVar = new syw(this, sypVar);
        if (true == acmd.w()) {
            i = 33;
        }
        ((ype) a.f()).y("Starting assistant: %s", intentAddCategory);
        boolean zBindService = context.bindService(intentAddCategory, sywVar, i);
        this.i = zBindService;
        if (zBindService) {
            this.g = intentAddCategory;
            this.f = sywVar;
        } else {
            t("failed to connect to assistant");
        }
        return this.i;
    }

    public final synchronized boolean k() {
        if (!s()) {
            if (this.k == null) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean l(ClientRegistrationConfig clientRegistrationConfig, orl orlVar) {
        qjc qjcVar;
        orlVar.getClass();
        this.h = orlVar;
        boolean z = true;
        if (!s()) {
            qjd qjdVar = this.c;
            if (qjdVar == null) {
                ((ype) a.h()).u("register called when service not connected");
                lau.b(ywj.SERVICE_UNAVAILABLE);
                return false;
            }
            try {
                qwr qwrVar = new qwr(this.b.d, 1);
                Parcel parcelGh = qjdVar.gh();
                ijp.i(parcelGh, qwrVar);
                ijp.g(parcelGh, clientRegistrationConfig);
                Parcel parcelGi = qjdVar.gi(3, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    qjcVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ICarAssistant");
                    qjcVar = iInterfaceQueryLocalInterface instanceof qjc ? (qjc) iInterfaceQueryLocalInterface : new qjc(strongBinder);
                }
                parcelGi.recycle();
                this.k = qjcVar;
            } catch (RemoteException e) {
                ((ype) ((ype) a.h()).p(e)).u("failed to handle assistant service connection");
                lau.b(ywj.SERVICE_UNAVAILABLE);
                z = false;
            }
            if (qjcVar == null) {
                throw new IllegalStateException("Car assistant registration failed");
            }
            lau.b(ywj.SERVICE_CONNECTED);
            return z;
        }
        int iNextInt = xxq.a.nextInt();
        syr.a.c(this.b.d, iNextInt);
        abnp abnpVarN = szq.a.n();
        abnpVarN.getClass();
        int i = clientRegistrationConfig.a;
        abnpVarN.t();
        szq szqVar = (szq) abnpVarN.b;
        szqVar.b |= 1;
        szqVar.c = i;
        DesugarCollections.unmodifiableList(szqVar.d).getClass();
        Iterable iterable = clientRegistrationConfig.c;
        if (iterable == null) {
            iterable = afbe.a;
        }
        abnpVarN.t();
        szq szqVar2 = (szq) abnpVarN.b;
        aboh abohVar = szqVar2.d;
        if (!abohVar.c()) {
            szqVar2.d = abnv.I(abohVar);
        }
        abmc.i(iterable, szqVar2.d);
        DesugarCollections.unmodifiableList(((szq) abnpVarN.b).e).getClass();
        Iterable iterable2 = clientRegistrationConfig.d;
        if (iterable2 == null) {
            iterable2 = afbe.a;
        }
        abnpVarN.t();
        szq szqVar3 = (szq) abnpVarN.b;
        aboh abohVar2 = szqVar3.e;
        if (!abohVar2.c()) {
            szqVar3.e = abnv.I(abohVar2);
        }
        abmc.i(iterable2, szqVar3.e);
        String str = clientRegistrationConfig.e;
        if (str == null) {
            str = "";
        }
        abnpVarN.t();
        szq szqVar4 = (szq) abnpVarN.b;
        szqVar4.b |= 2;
        szqVar4.f = str;
        String str2 = clientRegistrationConfig.f;
        if (str2 == null) {
            str2 = "";
        }
        abnpVarN.t();
        szq szqVar5 = (szq) abnpVarN.b;
        szqVar5.b |= 4;
        szqVar5.g = str2;
        orh orhVar = clientRegistrationConfig.g;
        orhVar.getClass();
        abnpVarN.t();
        szq szqVar6 = (szq) abnpVarN.b;
        szqVar6.h = orhVar;
        szqVar6.b |= 8;
        int i2 = clientRegistrationConfig.h;
        abnpVarN.t();
        szq szqVar7 = (szq) abnpVarN.b;
        szqVar7.b |= 16;
        szqVar7.j = i2;
        abnv abnvVarQ = abnpVarN.q();
        abnvVarQ.getClass();
        abnp abnpVarK = ((szq) abnvVarQ).K();
        abnpVarK.getClass();
        if (orlVar.h) {
            abnp abnpVarN2 = tan.a.n();
            abnpVarN2.getClass();
            abnp abnpVarN3 = tag.a.n();
            abnpVarN3.getClass();
            abnv abnvVarQ2 = abnpVarN3.q();
            abnvVarQ2.getClass();
            abnpVarN2.t();
            tan tanVar = (tan) abnpVarN2.b;
            tanVar.c = (tag) abnvVarQ2;
            tanVar.b = 1;
            abnv abnvVarQ3 = abnpVarN2.q();
            abnvVarQ3.getClass();
            tan tanVar2 = (tan) abnvVarQ3;
            abnpVarK.t();
            szq szqVar8 = (szq) abnpVarK.b;
            aboh abohVar3 = szqVar8.i;
            if (!abohVar3.c()) {
                szqVar8.i = abnv.I(abohVar3);
            }
            szqVar8.i.add(tanVar2);
        }
        szh szhVar = this.e;
        abnv abnvVarQ4 = abnpVarK.q();
        abnvVarQ4.getClass();
        szhVar.f((szq) abnvVarQ4, iNextInt);
        lau.b(ywj.SERVICE_CONNECTED_DODGEBOOST);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m(defpackage.ywk r12, final java.util.function.BiConsumer r13) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syy.m(ywk, java.util.function.BiConsumer):boolean");
    }

    public final synchronized CarAssistantSetting n() {
        CarAssistantSetting carAssistantSettingP;
        if (s()) {
            try {
                szh szhVar = this.e;
                taq taqVarA = szi.a(3);
                szo szoVar = (szo) szhVar.f.a();
                abnp abnpVarN = tas.b.n();
                abnpVarN.getClass();
                szp.e(abnpVarN);
                szp.d(taqVarA, abnpVarN);
                carAssistantSettingP = p(3, (tar) aedi.a(szoVar.a, szp.a(), szoVar.b, szp.c(abnpVarN)));
            } catch (Throwable th) {
                ((ype) ((ype) a.g()).p(th)).u("Error fetching settings");
                carAssistantSettingP = null;
            }
        } else {
            carAssistantSettingP = q(3);
        }
        return carAssistantSettingP;
    }

    public final void o() {
        this.k = null;
    }
}
