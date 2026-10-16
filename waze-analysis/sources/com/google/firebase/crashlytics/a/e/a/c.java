package com.google.firebase.crashlytics.a.e.a;

import android.util.Base64;
import android.util.JsonReader;
import androidx.autofill.HintConstants;
import androidx.car.app.CarContext;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.crashlytics.a.e.aa;
import com.google.firebase.crashlytics.a.e.bd;
import com.google.firebase.crashlytics.a.e.be;
import com.google.firebase.crashlytics.a.e.bf;
import com.google.firebase.crashlytics.a.e.bj;
import com.google.firebase.crashlytics.a.e.bm;
import com.google.firebase.crashlytics.a.e.bn;
import com.google.firebase.crashlytics.a.e.bp;
import com.google.firebase.crashlytics.a.e.bs;
import com.google.firebase.crashlytics.a.e.bt;
import com.google.firebase.crashlytics.a.e.bu;
import com.google.firebase.crashlytics.a.e.bv;
import com.google.firebase.crashlytics.a.e.bx;
import com.google.firebase.crashlytics.a.e.ca;
import com.google.firebase.crashlytics.a.e.cc;
import com.google.firebase.crashlytics.a.e.cd;
import com.google.firebase.crashlytics.a.e.cf;
import com.google.firebase.crashlytics.a.e.cg;
import com.google.firebase.crashlytics.a.e.ck;
import com.google.firebase.crashlytics.a.e.co;
import com.google.firebase.crashlytics.a.e.cp;
import com.google.firebase.crashlytics.a.e.cr;
import com.google.firebase.crashlytics.a.e.ct;
import com.google.firebase.crashlytics.a.e.cu;
import com.google.firebase.d.b.d;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9288a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.a f9289b;

    static {
        d dVar = new d();
        dVar.g(aa.f9290a);
        dVar.h();
        f9289b = dVar.b();
    }

    public static /* synthetic */ ca a(JsonReader jsonReader) throws IOException {
        bx bxVar = new bx();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1266514778) {
                if (iHashCode != 3373707) {
                    if (iHashCode == 2125650548 && strNextName.equals("importance")) {
                        bxVar.c(jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                    bxVar.d(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                }
            } else if (strNextName.equals("frames")) {
                bxVar.b(l(jsonReader, new a(1)));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return bxVar.a();
    }

    private static be h(JsonReader jsonReader) throws IOException {
        bd bdVar = new bd();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case -1516200806:
                    if (!strNextName.equals("buildIdMappingForArch")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.b(l(jsonReader, new a(0)));
                        break;
                    }
                case 110987:
                    if (!strNextName.equals("pid")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.d(jsonReader.nextInt());
                        break;
                    }
                case 111312:
                    if (!strNextName.equals("pss")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.f(jsonReader.nextLong());
                        break;
                    }
                case 113234:
                    if (!strNextName.equals("rss")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.h(jsonReader.nextLong());
                        break;
                    }
                case 55126294:
                    if (!strNextName.equals("timestamp")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.i(jsonReader.nextLong());
                        break;
                    }
                case 202325402:
                    if (!strNextName.equals("processName")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.e(jsonReader.nextString());
                        break;
                    }
                case 722137681:
                    if (!strNextName.equals("reasonCode")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.g(jsonReader.nextInt());
                        break;
                    }
                case 723857505:
                    if (!strNextName.equals("traceFile")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.j(jsonReader.nextString());
                        break;
                    }
                case 2125650548:
                    if (!strNextName.equals("importance")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bdVar.c(jsonReader.nextInt());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bdVar.a();
    }

    private static bu i(JsonReader jsonReader) throws IOException {
        bt btVar = new bt();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case -1266514778:
                    if (!strNextName.equals("frames")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        btVar.c(l(jsonReader, new a(1)));
                        break;
                    }
                case -934964668:
                    if (!strNextName.equals("reason")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        btVar.e(jsonReader.nextString());
                        break;
                    }
                case 3575610:
                    if (!strNextName.equals(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        btVar.f(jsonReader.nextString());
                        break;
                    }
                case 91997906:
                    if (!strNextName.equals("causedBy")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        btVar.b(i(jsonReader));
                        break;
                    }
                case 581754413:
                    if (!strNextName.equals("overflowCount")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        btVar.d(jsonReader.nextInt());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return btVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cd j(JsonReader jsonReader) throws IOException {
        cc ccVar = new cc();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case 110987:
                    if (!strNextName.equals("pid")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        ccVar.d(jsonReader.nextInt());
                        break;
                    }
                case 202325402:
                    if (!strNextName.equals("processName")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        ccVar.e(jsonReader.nextString());
                        break;
                    }
                case 1694598382:
                    if (!strNextName.equals("defaultProcess")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        ccVar.b(jsonReader.nextBoolean());
                        break;
                    }
                case 2125650548:
                    if (!strNextName.equals("importance")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        ccVar.c(jsonReader.nextInt());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ccVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static co k(JsonReader jsonReader) throws IOException {
        cf cfVar = new cf();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case -1335157162:
                    if (!strNextName.equals("device")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        cg cgVar = new cg();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            switch (strNextName2.hashCode()) {
                                case -1708606089:
                                    if (!strNextName2.equals("batteryLevel")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        cgVar.b(Double.valueOf(jsonReader.nextDouble()));
                                        break;
                                    }
                                case -1455558134:
                                    if (!strNextName2.equals("batteryVelocity")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        cgVar.c(jsonReader.nextInt());
                                        break;
                                    }
                                case -1439500848:
                                    if (!strNextName2.equals("orientation")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        cgVar.e(jsonReader.nextInt());
                                        break;
                                    }
                                case 279795450:
                                    if (!strNextName2.equals("diskUsed")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        cgVar.d(jsonReader.nextLong());
                                        break;
                                    }
                                case 976541947:
                                    if (!strNextName2.equals("ramUsed")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        cgVar.g(jsonReader.nextLong());
                                        break;
                                    }
                                case 1516795582:
                                    if (!strNextName2.equals("proximityOn")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        cgVar.f(jsonReader.nextBoolean());
                                        break;
                                    }
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                        jsonReader.endObject();
                        cfVar.c(cgVar.a());
                        break;
                    }
                case -259312414:
                    if (!strNextName.equals("rollouts")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        cr crVar = new cr();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            if (strNextName3.hashCode() == 1749373766 && strNextName3.equals("assignments")) {
                                crVar.d(l(jsonReader, new a(8)));
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        cfVar.e(crVar.c());
                        break;
                    }
                case 96801:
                    if (!strNextName.equals(CarContext.APP_SERVICE)) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        bp bpVar = new bp();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName4 = jsonReader.nextName();
                            int i2 = 2;
                            switch (strNextName4.hashCode()) {
                                case -1405314732:
                                    if (!strNextName4.equals("appProcessDetails")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bpVar.b(l(jsonReader, new a(3)));
                                        break;
                                    }
                                case -1332194002:
                                    if (!strNextName4.equals("background")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bpVar.c(Boolean.valueOf(jsonReader.nextBoolean()));
                                        break;
                                    }
                                case -1090974952:
                                    if (!strNextName4.equals("execution")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bs bsVar = new bs();
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String strNextName5 = jsonReader.nextName();
                                            switch (strNextName5.hashCode()) {
                                                case -1375141843:
                                                    if (!strNextName5.equals("appExitInfo")) {
                                                        jsonReader.skipValue();
                                                        break;
                                                    } else {
                                                        bsVar.b(h(jsonReader));
                                                        break;
                                                    }
                                                case -1337936983:
                                                    if (!strNextName5.equals("threads")) {
                                                        jsonReader.skipValue();
                                                        break;
                                                    } else {
                                                        bsVar.f(l(jsonReader, new a(5)));
                                                        break;
                                                    }
                                                case -902467928:
                                                    if (!strNextName5.equals("signal")) {
                                                        jsonReader.skipValue();
                                                        break;
                                                    } else {
                                                        bv bvVar = new bv();
                                                        jsonReader.beginObject();
                                                        while (jsonReader.hasNext()) {
                                                            String strNextName6 = jsonReader.nextName();
                                                            int iHashCode = strNextName6.hashCode();
                                                            if (iHashCode != -1147692044) {
                                                                if (iHashCode != 3059181) {
                                                                    if (iHashCode == 3373707 && strNextName6.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                                                                        bvVar.d(jsonReader.nextString());
                                                                    } else {
                                                                        jsonReader.skipValue();
                                                                    }
                                                                } else if (strNextName6.equals("code")) {
                                                                    bvVar.c(jsonReader.nextString());
                                                                } else {
                                                                    jsonReader.skipValue();
                                                                }
                                                            } else if (strNextName6.equals("address")) {
                                                                bvVar.b(jsonReader.nextLong());
                                                            } else {
                                                                jsonReader.skipValue();
                                                            }
                                                        }
                                                        jsonReader.endObject();
                                                        bsVar.e(bvVar.a());
                                                        break;
                                                    }
                                                    break;
                                                case 937615455:
                                                    if (!strNextName5.equals("binaries")) {
                                                        jsonReader.skipValue();
                                                        break;
                                                    } else {
                                                        bsVar.c(l(jsonReader, new a(6)));
                                                        break;
                                                    }
                                                case 1481625679:
                                                    if (!strNextName5.equals("exception")) {
                                                        jsonReader.skipValue();
                                                        break;
                                                    } else {
                                                        bsVar.d(i(jsonReader));
                                                        break;
                                                    }
                                                default:
                                                    jsonReader.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader.endObject();
                                        bpVar.f(bsVar.a());
                                        break;
                                    }
                                    break;
                                case -80231855:
                                    if (!strNextName4.equals("internalKeys")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bpVar.g(l(jsonReader, new a(i2)));
                                        break;
                                    }
                                case 555169704:
                                    if (!strNextName4.equals("customAttributes")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bpVar.e(l(jsonReader, new a(i2)));
                                        break;
                                    }
                                case 928737948:
                                    if (!strNextName4.equals("uiOrientation")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bpVar.h(jsonReader.nextInt());
                                        break;
                                    }
                                case 1847730860:
                                    if (!strNextName4.equals("currentProcessDetails")) {
                                        jsonReader.skipValue();
                                        break;
                                    } else {
                                        bpVar.d(j(jsonReader));
                                        break;
                                    }
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                        jsonReader.endObject();
                        cfVar.b(bpVar.a());
                        break;
                    }
                    break;
                case 107332:
                    if (!strNextName.equals("log")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        cr crVar2 = new cr();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if (jsonReader.nextName().equals("content")) {
                                crVar2.f(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        cfVar.d(crVar2.e());
                        break;
                    }
                case 3575610:
                    if (!strNextName.equals(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        cfVar.g(jsonReader.nextString());
                        break;
                    }
                case 55126294:
                    if (!strNextName.equals("timestamp")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        cfVar.f(jsonReader.nextLong());
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return cfVar.a();
    }

    private static List l(JsonReader jsonReader, b bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final co d(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                co coVarK = k(jsonReader);
                jsonReader.close();
                return coVarK;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public final cu e(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                int i2 = cu.f9544a;
                bf bfVar = new bf();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    switch (strNextName.hashCode()) {
                        case -2118372775:
                            if (!strNextName.equals("ndkPayload")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                ck ckVar = new ck();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName2 = jsonReader.nextName();
                                    int iHashCode = strNextName2.hashCode();
                                    if (iHashCode != 97434231) {
                                        if (iHashCode == 106008351 && strNextName2.equals("orgId")) {
                                            ckVar.i(jsonReader.nextString());
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName2.equals("files")) {
                                        ckVar.h(l(jsonReader, new a(7)));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                bfVar.j(ckVar.g());
                                break;
                            }
                            break;
                        case -1962630338:
                            if (!strNextName.equals("sdkVersion")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.l(jsonReader.nextString());
                                break;
                            }
                        case -1907185581:
                            if (!strNextName.equals("appQualitySessionId")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.c(jsonReader.nextString());
                                break;
                            }
                        case -1375141843:
                            if (!strNextName.equals("appExitInfo")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.b(h(jsonReader));
                                break;
                            }
                        case -911706486:
                            if (!strNextName.equals("buildVersion")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.d(jsonReader.nextString());
                                break;
                            }
                        case -401988390:
                            if (!strNextName.equals("firebaseAuthenticationToken")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.f(jsonReader.nextString());
                                break;
                            }
                        case 344431858:
                            if (!strNextName.equals("gmpAppId")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.h(jsonReader.nextString());
                                break;
                            }
                        case 719853845:
                            if (!strNextName.equals("installationUuid")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.i(jsonReader.nextString());
                                break;
                            }
                        case 1047652060:
                            if (!strNextName.equals("firebaseInstallationId")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.g(jsonReader.nextString());
                                break;
                            }
                        case 1874684019:
                            if (!strNextName.equals("platform")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.k(jsonReader.nextInt());
                                break;
                            }
                        case 1975623094:
                            if (!strNextName.equals("displayVersion")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bfVar.e(jsonReader.nextString());
                                break;
                            }
                        case 1984987798:
                            if (!strNextName.equals("session")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bm bmVarM = ct.m();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName3 = jsonReader.nextName();
                                    switch (strNextName3.hashCode()) {
                                        case -2128794476:
                                            if (!strNextName3.equals("startedAt")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.l(jsonReader.nextLong());
                                                break;
                                            }
                                        case -1907185581:
                                            if (!strNextName3.equals("appQualitySessionId")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.c(jsonReader.nextString());
                                                break;
                                            }
                                        case -1618432855:
                                            if (!strNextName3.equals("identifier")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.j(Base64.decode(jsonReader.nextString(), 2));
                                                break;
                                            }
                                        case -1606742899:
                                            if (!strNextName3.equals("endedAt")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.f(Long.valueOf(jsonReader.nextLong()));
                                                break;
                                            }
                                        case -1335157162:
                                            if (!strNextName3.equals("device")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bn bnVar = new bn();
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    String strNextName4 = jsonReader.nextName();
                                                    switch (strNextName4.hashCode()) {
                                                        case -1981332476:
                                                            if (!strNextName4.equals("simulator")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.i(jsonReader.nextBoolean());
                                                                break;
                                                            }
                                                        case -1969347631:
                                                            if (!strNextName4.equals("manufacturer")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.e(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 112670:
                                                            if (!strNextName4.equals("ram")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.h(jsonReader.nextLong());
                                                                break;
                                                            }
                                                        case 3002454:
                                                            if (!strNextName4.equals("arch")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.b(jsonReader.nextInt());
                                                                break;
                                                            }
                                                        case 81784169:
                                                            if (!strNextName4.equals("diskSpace")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.d(jsonReader.nextLong());
                                                                break;
                                                            }
                                                        case 94848180:
                                                            if (!strNextName4.equals("cores")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.c(jsonReader.nextInt());
                                                                break;
                                                            }
                                                        case 104069929:
                                                            if (!strNextName4.equals("model")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.f(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 109757585:
                                                            if (!strNextName4.equals("state")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.j(jsonReader.nextInt());
                                                                break;
                                                            }
                                                        case 2078953423:
                                                            if (!strNextName4.equals("modelClass")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bnVar.g(jsonReader.nextString());
                                                                break;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                bmVarM.e(bnVar.a());
                                                break;
                                            }
                                        case -1291329255:
                                            if (!strNextName3.equals("events")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.g(l(jsonReader, new a(4)));
                                                break;
                                            }
                                        case DisplayStrings.DS_CONVERSATIONAL_REPORTING_IN_CAR_ERROR_GENERIC_ALERTER_TITLE /* 3556 */:
                                            if (!strNextName3.equals("os")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                cp cpVar = new cp();
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    String strNextName5 = jsonReader.nextName();
                                                    switch (strNextName5.hashCode()) {
                                                        case -911706486:
                                                            if (!strNextName5.equals("buildVersion")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                cpVar.b(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case -293026577:
                                                            if (!strNextName5.equals("jailbroken")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                cpVar.c(jsonReader.nextBoolean());
                                                                break;
                                                            }
                                                        case 351608024:
                                                            if (!strNextName5.equals("version")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                cpVar.e(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 1874684019:
                                                            if (!strNextName5.equals("platform")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                cpVar.d(jsonReader.nextInt());
                                                                break;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                bmVarM.k(cpVar.a());
                                                break;
                                            }
                                        case 96801:
                                            if (!strNextName3.equals(CarContext.APP_SERVICE)) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bj bjVar = new bj();
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    String strNextName6 = jsonReader.nextName();
                                                    switch (strNextName6.hashCode()) {
                                                        case -1618432855:
                                                            if (!strNextName6.equals("identifier")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bjVar.e(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case -519438642:
                                                            if (!strNextName6.equals("developmentPlatform")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bjVar.b(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 213652010:
                                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bjVar.c(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 351608024:
                                                            if (!strNextName6.equals("version")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bjVar.g(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 719853845:
                                                            if (!strNextName6.equals("installationUuid")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bjVar.f(jsonReader.nextString());
                                                                break;
                                                            }
                                                        case 1975623094:
                                                            if (!strNextName6.equals("displayVersion")) {
                                                                jsonReader.skipValue();
                                                                break;
                                                            } else {
                                                                bjVar.d(jsonReader.nextString());
                                                                break;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                bmVarM.b(bjVar.a());
                                                break;
                                            }
                                        case 3599307:
                                            if (!strNextName3.equals("user")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                cr crVar = new cr();
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    if (jsonReader.nextName().equals("identifier")) {
                                                        crVar.b(jsonReader.nextString());
                                                    } else {
                                                        jsonReader.skipValue();
                                                    }
                                                }
                                                jsonReader.endObject();
                                                bmVarM.m(crVar.a());
                                                break;
                                            }
                                        case 286956243:
                                            if (!strNextName3.equals("generator")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.h(jsonReader.nextString());
                                                break;
                                            }
                                        case 1025385094:
                                            if (!strNextName3.equals("crashed")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.d(jsonReader.nextBoolean());
                                                break;
                                            }
                                        case 2047016109:
                                            if (!strNextName3.equals("generatorType")) {
                                                jsonReader.skipValue();
                                                break;
                                            } else {
                                                bmVarM.i(jsonReader.nextInt());
                                                break;
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bfVar.m(bmVarM.a());
                                break;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                cu cuVarA = bfVar.a();
                jsonReader.close();
                return cuVarA;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public final String f(co coVar) {
        return f9289b.a(coVar);
    }

    public final String g(cu cuVar) {
        return f9289b.a(cuVar);
    }
}
