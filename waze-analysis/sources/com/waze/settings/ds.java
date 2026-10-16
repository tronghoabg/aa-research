package com.waze.settings;

import android.content.Context;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.hs;
import com.waze.jni.protos.settings.SearchByVoiceDataProto;
import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.jni.protos.settings.SettingsValueProto;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.navigate.DriveToNativeManager;
import com.waze.share.ShareNativeManager;
import com.waze.sharedui.profile.EmailVerifier;
import com.waze.sharedui.profile.UserProfile;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ds {
    private int A;
    private final LiveData B;
    private final LiveData C;
    private final LiveData D;
    private final kotlinx.coroutines.b.bm E;
    private final kotlinx.coroutines.b.bq F;
    private final bf G;

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sdk.ai f37062a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f37063b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.b.o f37064c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.uid.i f37065d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f37066e;

    /* renamed from: f, reason: collision with root package name */
    private final SettingsNativeManager f37067f;

    /* renamed from: g, reason: collision with root package name */
    private final DriveToNativeManager f37068g;

    /* renamed from: h, reason: collision with root package name */
    private final ShareNativeManager f37069h;

    /* renamed from: i, reason: collision with root package name */
    private final ConfigManager f37070i;

    /* renamed from: j, reason: collision with root package name */
    private final MyWazeNativeManager f37071j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f37072k;

    /* renamed from: l, reason: collision with root package name */
    private final NativeManager f37073l;
    private final com.waze.sound.a.c m;
    private final com.waze.sound.bs n;
    private final com.waze.sound.bl o;
    private final eb p;
    private final com.waze.alerters.a q;
    private final com.waze.reports_v2.c.bw r;
    private final com.waze.ab.a.ae s;
    private final com.waze.reports_v2.e t;
    private final com.waze.settings.e.a.e u;
    private final kotlinx.coroutines.af v;
    private final hs w;
    private final kotlinx.coroutines.b.bn x;
    private final LiveData y;
    private List z;

    public ds(com.waze.sdk.ai aiVar, com.waze.copilot.data.b.a aVar, com.waze.b.o oVar, com.waze.uid.i iVar, com.waze.shared_infra.o.a aVar2, com.waze.navigate.eo eoVar, SettingsNativeManager settingsNativeManager, DriveToNativeManager driveToNativeManager, ShareNativeManager shareNativeManager, ConfigManager configManager, MyWazeNativeManager myWazeNativeManager, com.waze.sharedui.profile.b bVar, NativeManager nativeManager, com.waze.sound.a.c cVar, com.waze.sound.bs bsVar, com.waze.sound.bl blVar, eb ebVar, com.waze.alerters.a aVar3, com.waze.reports_v2.c.bw bwVar, com.waze.ab.a.ae aeVar, com.waze.reports_v2.e eVar, com.waze.settings.e.a.e eVar2) {
        h.g.b.x.f(aiVar, "audioSdkPartnersRepository");
        h.g.b.x.f(aVar, "carsRepository");
        h.g.b.x.f(oVar, "ageRestrictionApi");
        h.g.b.x.f(iVar, "revokeCredentialsTokensRequestClient");
        h.g.b.x.f(aVar2, "stringsProvider");
        h.g.b.x.f(eoVar, "navigationStatusProvider");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(shareNativeManager, "shareNativeManager");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(myWazeNativeManager, "myWazeNativeManager");
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(blVar, "getSelectedVoiceNameUseCase");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(aVar3, "alerterConfigs");
        h.g.b.x.f(bwVar, "conversationalReportingUserConsent");
        h.g.b.x.f(aeVar, "userImageRepository");
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(eVar2, "hncSettingsDataSource");
        this.f37062a = aiVar;
        this.f37063b = aVar;
        this.f37064c = oVar;
        this.f37065d = iVar;
        this.f37066e = aVar2;
        this.f37067f = settingsNativeManager;
        this.f37068g = driveToNativeManager;
        this.f37069h = shareNativeManager;
        this.f37070i = configManager;
        this.f37071j = myWazeNativeManager;
        this.f37072k = bVar;
        this.f37073l = nativeManager;
        this.m = cVar;
        this.n = bsVar;
        this.o = blVar;
        this.p = ebVar;
        this.q = aVar3;
        this.r = bwVar;
        this.s = aeVar;
        this.t = eVar;
        this.u = eVar2;
        int i2 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c());
        this.v = afVarE;
        this.w = new hs() { // from class: com.waze.settings.df
            @Override // com.waze.hs
            public final void a(int i3, String str) {
                this.f37029a.aa(new com.waze.main_screen.p.m(str, i3, 7));
            }
        };
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(bs.f36900a);
        this.x = bnVarB;
        this.y = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(A(), 0)), (h.c.j) null, 0L, 3, (Object) null);
        this.z = h.a.i.h();
        this.B = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(bnVarB, 2)), (h.c.j) null, 0L, 3, (Object) null);
        this.C = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(bnVarB, 3)), (h.c.j) null, 0L, 3, (Object) null);
        this.D = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(bnVarB, 4)), (h.c.j) null, 0L, 3, (Object) null);
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.E = bmVarE;
        this.F = bmVarE;
        kotlinx.coroutines.b.k kVarB = com.waze.navigate.et.b(eoVar);
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_ROUTING_AVOID_TOLLS");
        com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES;
        h.g.b.x.e(bVar3, "CONFIG_VALUE_ROUTING_AVOID_PRIMARIES");
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TRAILS;
        h.g.b.x.e(dVar, "CONFIG_VALUE_ROUTING_AVOID_TRAILS");
        com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES;
        h.g.b.x.e(bVar4, "CONFIG_VALUE_ROUTING_AVOID_FERRIES");
        com.waze.config.b bVar5 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_DANGEROUS_TURNS;
        h.g.b.x.e(bVar5, "CONFIG_VALUE_ROUTING_AVOID_DANGEROUS_TURNS");
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS;
        h.g.b.x.e(dVar2, "CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS");
        com.waze.config.d dVar3 = ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX;
        h.g.b.x.e(dVar3, "CONFIG_VALUE_LICENSE_PLATE_SUFFIX");
        com.waze.config.b bVar6 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS;
        h.g.b.x.e(bVar6, "CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS");
        com.waze.config.d dVar4 = ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE;
        h.g.b.x.e(dVar4, "CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE");
        this.G = new bf(afVarE, kVarB, kotlinx.coroutines.b.ai.I(new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(bVar2)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(bVar3)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(dVar)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(bVar4)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(bVar5)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(dVar2)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(dVar3)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(bVar6)), 1), new dl(kotlinx.coroutines.b.ai.X(com.waze.n.ac.o(dVar4)), 1)));
    }

    public static final /* synthetic */ void C(ds dsVar, UserProfile userProfile) {
        com.waze.shared_infra.q.i iVar;
        Object objD;
        Long birthDateSec = userProfile.getBasicInfo().getBirthDateSec();
        if (birthDateSec != null) {
            long jLongValue = birthDateSec.longValue();
            int i2 = com.waze.shared_infra.q.i.f37938a;
            iVar = new com.waze.shared_infra.q.i(TimeUnit.SECONDS.toMillis(jLongValue));
        } else {
            iVar = null;
        }
        com.waze.shared_infra.q.i iVar2 = iVar;
        kotlinx.coroutines.b.bn bnVar = dsVar.x;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, userProfile.getBasicInfo().getPhone(), iVar2, userProfile.getBasicInfo().getEmail(), userProfile.getBasicInfo().getEmailVerified(), userProfile.getBasicInfo().getEmailVerifier(), userProfile.getBasicInfo().getEmailVerifier().getIconId(), false, null, null, null, null, null, null, null, null, false, null, 134153215)));
    }

    static final void K(ds dsVar, com.waze.mywaze.a aVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = dsVar.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, new he(aVar != null ? aVar.f30529c : null, aVar != null ? aVar.f30531e : null, aVar != null ? aVar.f30532f : null, aVar != null ? aVar.f30528b : null, aVar != null ? aVar.f30534h : null, aVar != null ? aVar.f30531e : null, aVar != null ? aVar.f30532f : null, aVar != null ? aVar.f30528b : null, null, 0, aVar != null ? aVar.f30534h : null), null, false, null, 125829119)));
    }

    static final h.ab w(ds dsVar, SearchByVoiceDataProto searchByVoiceDataProto) {
        Map<String, String> mapJ;
        Object objD;
        if (searchByVoiceDataProto == null || (mapJ = searchByVoiceDataProto.getSearchVoicesByKeyMap()) == null) {
            mapJ = h.a.r.j();
        }
        bg bgVar = new bg(mapJ);
        kotlinx.coroutines.b.bn bnVar = dsVar.x;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, bgVar, null, null, false, null, 130023423)));
        return h.ab.f48028a;
    }

    public final kotlinx.coroutines.b.ch A() {
        return this.x;
    }

    public final kotlinx.coroutines.b.ch B() {
        return this.s.a();
    }

    public final void F(Integer num) {
        Object objD;
        if (num.intValue() == 20002 && ((bs) A().d()).p() != null) {
            this.f37070i.setConfigValueString(ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX, ((bs) A().d()).p());
        }
        kotlinx.coroutines.b.bn bnVar = this.x;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 67108863)));
    }

    public final void G(final Context context) {
        h.g.b.x.f(context, "context");
        com.waze.sharedui.g.p pVar = new com.waze.sharedui.g.p(context);
        com.waze.shared_infra.o.a aVar = this.f37066e;
        pVar.h(aVar.c(R.string.DIALOG_TITLE_SIGN_OUT_FROM_AAOS, new Object[0]));
        pVar.e(aVar.c(R.string.DIALOG_BODY_SIGN_OUT_FROM_AAOS, new Object[0]));
        pVar.c(aVar.c(R.string.DIALOG_SIGN_OUT_FROM_AAOS_CONFIRM, new Object[0]), new View.OnClickListener() { // from class: com.waze.settings.dh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = kotlinx.coroutines.av.f51370a;
                kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c()), null, null, new di(this.f37031a, context, (h.c.e) null, 0), 3);
            }
        });
        pVar.g(aVar.c(R.string.DIALOG_SIGN_OUT_FROM_AAOS_CANCEL, new Object[0]), new com.waze.inbox.e(15));
        pVar.j();
        pVar.d();
        pVar.i();
    }

    public final void H() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bs bsVar;
        boolean z;
        do {
            bnVar = this.x;
            objD = bnVar.d();
            bsVar = (bs) objD;
            NativeManager nativeManager = this.f37073l;
            z = false;
            if (nativeManager.calendarAccessEnabled() && nativeManager.calendarAuthorized()) {
                z = true;
            }
        } while (!bnVar.f(objD, bs.B(bsVar, 0, false, false, false, false, z, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217695)));
    }

    public final void I() {
        ArrayList arrayListH;
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        List<SettingsValueProto> valuesList;
        this.f37071j.getMyWazeData(new com.waze.mywaze.s() { // from class: com.waze.settings.dg
            @Override // com.waze.mywaze.s
            public final void y(com.waze.mywaze.a aVar) {
                ds.K(this.f37030a, aVar);
            }
        });
        SettingsNativeManager settingsNativeManager = this.f37067f;
        SettingsValueListProto gasStations = settingsNativeManager.getGasStations();
        if (gasStations == null || (valuesList = gasStations.getValuesList()) == null) {
            arrayListH = h.a.i.h();
        } else {
            List<SettingsValueProto> list = valuesList;
            ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
            for (SettingsValueProto settingsValueProto : list) {
                h.g.b.x.c(settingsValueProto);
                arrayList.add(com.waze.network.f.ak.o(settingsValueProto));
            }
            arrayListH = arrayList;
        }
        h.g.b.x.f(arrayListH, "<set-?>");
        this.z = arrayListH;
        Iterator it = arrayListH.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((gw) it.next()).f37348a) {
                break;
            } else {
                i2++;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        this.A = numValueOf != null ? numValueOf.intValue() + 1 : 0;
        do {
            bnVar = this.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, settingsNativeManager.getCurrentSearchVoiceIsAuto(), settingsNativeManager.getFallbackLocale(), settingsNativeManager.getDefaultVoiceSearchLabel(), settingsNativeManager.getVoiceSearchLang(), settingsNativeManager.getCurrentVoiceSearchLabel(), null, null, null, null, false, null, 132186111)));
        settingsNativeManager.getSearchByVoiceData(new am(this, 7));
        kotlinx.coroutines.aj.z(this.v, null, null, new cz(this, (h.c.e) null, 2), 3);
        cr.getNotificationPreferences$default(settingsNativeManager, null, 1, null);
    }

    public final void J() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bs bsVar;
        do {
            bnVar = this.x;
            objD = bnVar.d();
            bsVar = (bs) objD;
        } while (!bnVar.f(objD, bs.B(bsVar, bsVar.a() + 1, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217726)));
    }

    public final void L() {
        aa(new com.waze.perf.p(8));
    }

    public final void M() {
        hg hgVarE = ((bs) A().d()).e();
        if (hgVarE instanceof he) {
            MyWazeNativeManager myWazeNativeManager = this.f37071j;
            he heVar = (he) hgVarE;
            String strC = heVar.c();
            if (true == h.g.b.x.n(strC, heVar.b())) {
                strC = null;
            }
            String strE = heVar.e();
            if (true == h.g.b.x.n(strE, heVar.d())) {
                strE = null;
            }
            String strI = heVar.i();
            if (true == h.g.b.x.n(strI, heVar.h())) {
                strI = null;
            }
            String strG = heVar.g();
            String str = true != h.g.b.x.n(strG, heVar.f()) ? strG : null;
            if (strC == null) {
                strC = "";
            }
            if (strE == null) {
                strE = "";
            }
            com.waze.mywaze.y.setNames$default(myWazeNativeManager, strC, strE, strI == null ? "" : strI, str == null ? "" : str, "", null, 32, null);
            aa(new com.waze.perf.p(9));
        }
    }

    public final void N(boolean z) {
        this.f37070i.setConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS, z);
    }

    public final void O(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, z, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217723)));
    }

    public final void P(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.x;
            objD = bnVar.d();
            cr.setNotificationPreferences$default(this.f37067f, "events", z, null, 4, null);
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, z, null, 100663295)));
    }

    public final void Q(int i2) {
        this.A = i2;
        cr.setPreferredStation$default(this.f37067f, i2, null, 2, null);
    }

    public final void R(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, z, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217725)));
    }

    public final void S(String str) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(str, "languageId");
        SettingsNativeManager settingsNativeManager = this.f37067f;
        cr.setSearchVoice$default(settingsNativeManager, str, null, 2, null);
        do {
            bnVar = this.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, settingsNativeManager.getVoiceSearchLang(), settingsNativeManager.getCurrentVoiceSearchLabel(), null, null, null, null, false, null, 132644863)));
    }

    public final void T(String str) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, (str == null || str.length() == 1) ? false : true, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, str, 67108861)));
    }

    public final void U() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS;
        h.g.b.x.e(bVar, "CONFIG_VALUE_START_STATE…INGS_ALLOW_TRIP_FORECASTS");
        kotlinx.coroutines.b.k kVarK = kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar), new dp(this, (h.c.e) null, 0));
        kotlinx.coroutines.af afVar = this.v;
        kotlinx.coroutines.b.ai.m(kVarK, afVar);
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_MAP_SHOW_SPEEDOMETER");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar2), new dp(this, (h.c.e) null, 2, (byte[]) null)), afVar);
        com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_ENABLED;
        h.g.b.x.e(bVar3, "CONFIG_VALUE_DRIVE_REMINDER_ENABLED");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar3), new dp(this, (h.c.e) null, 3, (char[]) null)), afVar);
        com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_AADC_EDIT_AGE_ENABLED;
        h.g.b.x.e(bVar4, "CONFIG_VALUE_AADC_EDIT_AGE_ENABLED");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar4), new dp(this, (h.c.e) null, 4, (short[]) null)), afVar);
        com.waze.config.b bVar5 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS;
        h.g.b.x.e(bVar5, "CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar5), new dp(this, (h.c.e) null, 5, (int[]) null)), afVar);
        com.waze.config.b bVar6 = ConfigValues.CONFIG_VALUE_DANGER_ZONE_ALERTS;
        h.g.b.x.e(bVar6, "CONFIG_VALUE_DANGER_ZONE_ALERTS");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar6), new dp(this, (h.c.e) null, 6, (boolean[]) null)), afVar);
        kotlinx.coroutines.aj.z(afVar, null, null, new u(this, (h.c.e) null, 6, (byte[]) null), 3);
        com.waze.sdk.ai aiVar = this.f37062a;
        kotlinx.coroutines.b.ch chVarB = aiVar.b();
        com.waze.config.b bVar7 = ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SDK_ON;
        h.g.b.x.e(bVar7, "CONFIG_VALUE_AUDIO_EXTENSION_SDK_ON");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.F(chVarB, com.waze.n.ac.o(bVar7), new dr(this, null)), new dp(this, (h.c.e) null, 8, (byte[][]) null)), afVar);
        H();
        this.f37073l.registerOnUserNameResultListener(this.w);
        kotlinx.coroutines.b.ch chVarF = this.f37072k.f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(chVarF, new dp(this, (h.c.e) null, 7, (float[]) null)), afVar);
        aiVar.d();
        kotlinx.coroutines.aj.z(afVar, null, null, new u(this, (h.c.e) null, 5), 3);
        I();
    }

    public final void V() {
        bs bsVar = (bs) A().d();
        String strI = bsVar.i();
        this.p.b(dy.f37101d, dt.f37082i, (strI == null || strI.length() == 0) ? du.f37086a : bsVar.z() ? du.f37088c : du.f37087b, Boolean.valueOf(bsVar.g() == EmailVerifier.GOOGLE), true);
        FlowType flowType = bsVar.z() ? FlowType.EDIT_ID : FlowType.ADD_ID;
        UidModel uidModelD = com.waze.uid.r.d(flowType, FlowContext.SETTINGS);
        uidModelD.setRequestCode(15002);
        String strI2 = bsVar.i();
        if (strI2 != null && strI2.length() != 0 && flowType != FlowType.EDIT_ID) {
            uidModelD.getEmailParameters().setEmailAddress(bsVar.i());
        }
        com.waze.uid.b.ab.f44136a.a().A(uidModelD);
    }

    public final void W() {
        this.f37073l.unregisterOnUserNameResultListener(this.w);
        this.f37062a.e();
        if (this.G.c()) {
            com.waze.navigate.bt.reroute$default(this.f37068g, false, null, 2, null);
        }
        kotlinx.coroutines.aj.h(this.v, null);
    }

    public final void X(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        hg hgVarE = ((bs) A().d()).e();
        he heVar = hgVarE instanceof he ? (he) hgVarE : null;
        if (heVar == null) {
            return;
        }
        if (h.g.b.x.n(str, "")) {
            aa(new com.waze.config.cv(str, 11));
        } else if (h.g.b.x.n(str, heVar.j()) || h.g.b.x.n(str, heVar.h())) {
            aa(new com.waze.config.cv(str, 12));
        } else {
            aa(new com.waze.config.cv(str, 13));
            this.f37073l.SuggestUserNameRequest(null, null, str);
        }
    }

    public final void Y(boolean z) {
        Object objD;
        NativeManager nativeManager = this.f37073l;
        if (z) {
            nativeManager.calendarRequestAccess();
        } else {
            nativeManager.disableCalendar();
        }
        kotlinx.coroutines.b.bn bnVar = this.x;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, z, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217695)));
    }

    public final void Z(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.x;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, z, null, null, null, null, null, null, null, null, false, null, 134152191)));
        if (z) {
            cr.setSearchVoiceAuto$default(this.f37067f, null, 1, null);
        } else {
            S(((bs) A().d()).j());
        }
    }

    public final int a() {
        return this.A;
    }

    public final void aa(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "action");
        hg hgVarE = ((bs) A().d()).e();
        if (hgVarE instanceof he) {
            this.x.e(bs.B((bs) A().d(), 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, (hg) lVar.invoke(hgVarE), null, false, null, 125829119));
        }
    }

    public final void ab() {
        kotlinx.coroutines.aj.z(this.v, null, null, new u(this, (h.c.e) null, 7, (char[]) null), 3);
    }

    public final boolean ac() {
        return this.f37069h.isMetricUnits();
    }

    public final void ad(q qVar) {
        h.g.b.x.f(qVar, "onResultCallback");
        kotlinx.coroutines.aj.z(this.v, null, null, new di(this, qVar, (h.c.e) null, 1), 3);
    }

    public final LiveData b() {
        return this.C;
    }

    public final LiveData c() {
        return this.D;
    }

    public final LiveData d() {
        return this.B;
    }

    public final LiveData e() {
        return this.y;
    }

    public final ConfigManager f() {
        return this.f37070i;
    }

    public final com.waze.alerters.a h() {
        return this.q;
    }

    public final com.waze.copilot.data.b.a i() {
        return this.f37063b;
    }

    public final com.waze.reports_v2.e j() {
        return this.t;
    }

    public final com.waze.reports_v2.c.bw k() {
        return this.r;
    }

    public final com.waze.settings.e.a.e m() {
        return this.u;
    }

    public final com.waze.sound.bs p() {
        return this.n;
    }

    public final String s() {
        return this.f37073l.speedUnit();
    }

    public final List t() {
        return this.z;
    }

    public final List u() {
        List<SettingsValueProto> valuesList;
        SettingsValueListProto gasTypes = this.f37067f.getGasTypes();
        if (gasTypes == null || (valuesList = gasTypes.getValuesList()) == null) {
            return h.a.i.h();
        }
        List<SettingsValueProto> list = valuesList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (SettingsValueProto settingsValueProto : list) {
            h.g.b.x.c(settingsValueProto);
            arrayList.add(com.waze.network.f.ak.o(settingsValueProto));
        }
        return arrayList;
    }

    public final List v() {
        return h.a.c.R(this.f37068g.configGetVehicleTypes());
    }

    public final kotlinx.coroutines.b.bq z() {
        return this.F;
    }
}
