package com.waze.sound.e;

import androidx.compose.material.ModalBottomSheetValue;
import androidx.core.app.NotificationCompat;
import androidx.sqlite.SQLiteConnection;
import com.waze.bw.c.d.ba;
import com.waze.bw.c.d.bi;
import com.waze.bw.c.d.bl;
import com.waze.bw.c.d.bo;
import com.waze.bw.c.d.bt;
import com.waze.bw.c.d.bu;
import com.waze.bw.c.d.cf;
import com.waze.modules.c.ar;
import com.waze.network.b.ay;
import com.waze.speech.w;
import com.waze.stats.aa;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.bw;
import com.waze.trip_overview.de;
import com.waze.trip_overview.eg;
import com.waze.trip_overview.eh;
import com.waze.trip_overview.ei;
import com.waze.trip_overview.ep;
import com.waze.uid.c.al;
import com.waze.z.a.d.ap;
import h.ab;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class i implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f39851a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39852b;

    public /* synthetic */ i(Object obj, int i2) {
        this.f39852b = i2;
        this.f39851a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlinx.coroutines.br] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.waze.bw.c.d.ce, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) throws IOException {
        bt btVar;
        String string;
        switch (this.f39852b) {
            case 0:
                return new j((m) this.f39851a, ((Boolean) obj).booleanValue());
            case 1:
                ModalBottomSheetValue modalBottomSheetValue = (ModalBottomSheetValue) obj;
                x.f(modalBottomSheetValue, "it");
                if (modalBottomSheetValue == ModalBottomSheetValue.Hidden) {
                    ((j) this.f39851a).c();
                }
                return true;
            case 2:
                return w.l((w) this.f39851a);
            case 3:
                cf cfVar = (cf) obj;
                x.f(cfVar, "it");
                return cf.i(cfVar, null, bo.f(cfVar.a(), this.f39851a != null, false, false, null, 30), null, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_1);
            case 4:
                cf cfVar2 = (cf) obj;
                x.f(cfVar2, "it");
                return cf.i(cfVar2, null, bo.f(cfVar2.a(), false, this.f39851a != null, false, null, 29), null, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_1);
            case 5:
                cf cfVar3 = (cf) obj;
                x.f(cfVar3, "it");
                return cf.i(cfVar3, null, null, null, null, false, false, false, !ay.e((ay) this.f39851a), 127);
            case 6:
                cf cfVar4 = (cf) obj;
                x.f(cfVar4, "it");
                return cf.i(cfVar4, null, null, null, this.f39851a, false, false, false, false, 247);
            case 7:
                cf cfVar5 = (cf) obj;
                x.f(cfVar5, "it");
                return cf.i(cfVar5, this.f39851a, null, null, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2);
            case 8:
                cf cfVar6 = (cf) obj;
                x.f(cfVar6, "it");
                return cf.i(cfVar6, null, null, this.f39851a, null, false, false, false, false, 251);
            case 9:
                cf cfVar7 = (cf) obj;
                x.f(cfVar7, "it");
                ap apVar = ap.f45939a;
                int iOrdinal = ((ap) this.f39851a).ordinal();
                if (iOrdinal == 0) {
                    btVar = bt.f18000b;
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    btVar = bt.f17999a;
                }
                return cf.i(cfVar7, new bu(btVar), null, null, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2);
            case 10:
                bl blVar = (bl) obj;
                int i2 = com.waze.bw.c.d.e.f18097a;
                x.f(blVar, NotificationCompat.CATEGORY_EVENT);
                if (blVar instanceof ba) {
                    string = "SearchFieldClicked";
                } else if (blVar instanceof bi) {
                    string = "VoiceSearchClicked(type = " + ((bi) blVar).a() + ")";
                } else {
                    string = blVar.toString();
                }
                this.f39851a.setValue(string);
                return ab.f48028a;
            case 11:
                return com.waze.sharedui.profile.c.g(this.f39851a, (String) obj);
            case 12:
                return com.waze.stats.storage.g.p((aa) this.f39851a, (SQLiteConnection) obj);
            case 13:
                com.waze.stats.storage.g.m((aa) this.f39851a, (SQLiteConnection) obj);
                return null;
            case 14:
                bw bwVar = (bw) obj;
                x.f(bwVar, "it");
                return bw.y(bwVar, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, 0L, this.f39851a, 0L, null, null, false, 16646143);
            case 15:
                ar arVar = (ar) obj;
                x.f(arVar, "route");
                ((de) this.f39851a).t(new eg(arVar.a()));
                return ab.f48028a;
            case 16:
                String str = (String) obj;
                x.f(str, "tag");
                ((de) this.f39851a).t(new eh(str));
                return ab.f48028a;
            case 17:
                String str2 = (String) obj;
                x.f(str2, "tag");
                ((de) this.f39851a).t(new ei(str2));
                return ab.f48028a;
            case 18:
                bw bwVar2 = (bw) obj;
                x.f(bwVar2, "it");
                bwVar2.k();
                return bw.y(bwVar2, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, com.waze.trip_overview.h.f(com.waze.trip_overview.g.f41464b, (com.waze.shared_infra.q.a) this.f39851a), null, false, 0L, null, 0L, null, null, false, 16769023);
            case 19:
                bw bwVar3 = (bw) obj;
                x.f(bwVar3, "it");
                return bw.y(bwVar3, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, (al) this.f39851a, false, 0L, null, 0L, null, null, false, 16760831);
            default:
                bw bwVar4 = (bw) obj;
                x.f(bwVar4, "it");
                return bw.y(bwVar4, ((ep) this.f39851a).a(), false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, 0L, null, 0L, null, null, false, 16777214);
        }
    }
}
