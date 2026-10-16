package com.waze.car_lib.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.places.GenericPlaces;
import com.waze.navigate.location_preview.ay;
import com.waze.share.aa;
import com.waze.share.z;
import com.waze.sharedui.web.at;
import h.ab;
import h.g.b.x;
import i.b.l.ao;
import i.b.l.cc;
import i.b.l.lc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20298a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20299b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f20299b = i2;
        this.f20298a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v61, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v67, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        ?? r7;
        Object objD;
        switch (this.f20299b) {
            case 0:
                break;
            case 1:
                com.waze.av.b.n nVar = (com.waze.av.b.n) obj;
                x.f(nVar, "place");
                break;
            case 2:
                x.f((Context) obj, "it");
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:{".concat(String.valueOf(((ay) this.f20298a).A()))));
                intent.setFlags(268435456);
                break;
            case 3:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                x.f(componentActivity, "it");
                aa.e(componentActivity, z.f37756c, ((ay) this.f20298a).i());
                break;
            case 4:
                x.f((Context) obj, "it");
                Intent intentA = at.a((String) this.f20298a);
                x.e(intentA, "getOpenBrowserIntent(...)");
                break;
            case 5:
                Context context = (Context) obj;
                x.f(context, "it");
                break;
            case 6:
                ComponentActivity componentActivity2 = (ComponentActivity) obj;
                x.f(componentActivity2, "it");
                new CustomTabsIntent.Builder().build().launchUrl(componentActivity2, Uri.parse((String) this.f20298a));
                break;
            case 7:
                com.waze.ev.c cVar = (com.waze.ev.c) obj;
                x.f(cVar, "it");
                break;
            case 8:
                h.g.a.l lVar = (h.g.a.l) obj;
                x.f(lVar, "updater");
                do {
                    r7 = this.f20298a;
                    objD = r7.d();
                } while (!r7.f(objD, (ay) lVar.invoke((ay) objD)));
            case 9:
                com.waze.network.g.a aVar = (com.waze.network.g.a) obj;
                x.f(aVar, "msgRequest");
                break;
            case 10:
                com.waze.network.g.a aVar2 = (com.waze.network.g.a) obj;
                x.f(aVar2, "msgRequest");
                break;
            case 11:
                cc ccVar = (cc) obj;
                x.f(ccVar, "$this$batch");
                ccVar.g((ao) this.f20298a);
                break;
            case 12:
                cc ccVar2 = (cc) obj;
                x.f(ccVar2, "$this$batch");
                ccVar2.I((lc) this.f20298a);
                break;
            case 13:
                break;
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.f20298a;
                if (zBooleanValue) {
                    ((com.waze.parking.h) obj2).setResult(8);
                }
                ((com.waze.parking.h) obj2).finish();
                break;
            case 15:
                this.f20298a.a((GenericPlaces) obj);
                break;
            case 16:
                this.f20298a.a((GenericPlaces) obj);
                break;
            case 17:
                this.f20298a.a((GenericPlaces) obj);
                break;
            case 18:
                this.f20298a.a((Boolean) obj);
                break;
            case 19:
                this.f20298a.a((GenericPlace) obj);
                break;
            default:
                this.f20298a.a((GenericPlace) obj);
                break;
        }
        return ab.f48028a;
    }
}
