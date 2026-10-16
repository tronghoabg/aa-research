package com.waze.car_lib.f;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.DangerZoneEod;
import com.waze.jni.protos.navigate.NavigationLaneList;
import com.waze.jni.protos.navigate.RoutingHeadingData;
import com.waze.jni.protos.navigate.RoutingRequestParamsResult;
import com.waze.main.navigate.LocationData;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.HistoryActivity;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19778a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19779b;

    public /* synthetic */ u(Object obj, int i2) {
        this.f19779b = i2;
        this.f19778a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f19779b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.f19778a;
                ((com.waze.shared_infra.coordinators.s) obj2).H(en.f19559a);
                if (zBooleanValue) {
                    ((ej) obj2).r();
                }
                return h.ab.f48028a;
            case 1:
                this.f19778a.a((RoutingRequestParamsResult) obj);
                return h.ab.f48028a;
            case 2:
                this.f19778a.a((Integer) obj);
                return h.ab.f48028a;
            case 3:
                Integer num = (Integer) obj;
                h.g.b.x.c(num);
                this.f19778a.a(num);
                return h.ab.f48028a;
            case 4:
                return com.waze.navbar.p.d((com.waze.navbar.p) this.f19778a, (LocationData) obj);
            case 5:
                return com.waze.navbar.p.e((com.waze.navbar.p) this.f19778a, (DangerZoneEod) obj);
            case 6:
                return com.waze.navbar.p.g((com.waze.navbar.p) this.f19778a, (DangerZoneEod) obj);
            case 7:
                return com.waze.navbar.p.f((com.waze.navbar.p) this.f19778a, (DriveToNativeManager.AddressItemAppData) obj);
            case 8:
                Bitmap bitmap = (Bitmap) obj;
                int i2 = com.waze.navbar.q.f30914a;
                h.g.b.x.f(bitmap, "bitmap");
                return new com.waze.navbar.a((Context) this.f19778a, bitmap);
            case 9:
                Bitmap bitmap2 = (Bitmap) obj;
                int i3 = com.waze.navbar.q.f30914a;
                h.g.b.x.f(bitmap2, "bitmap");
                return new com.waze.navbar.a((Context) this.f19778a, bitmap2);
            case 10:
                this.f19778a.a((String) obj);
                return h.ab.f48028a;
            case 11:
                this.f19778a.a((i.c.a.a.l) obj);
                return h.ab.f48028a;
            case 12:
                this.f19778a.a((LocationData) obj);
                return h.ab.f48028a;
            case 13:
                this.f19778a.a((RoutingHeadingData) obj);
                return h.ab.f48028a;
            case 14:
                return HistoryActivity.m((HistoryActivity) this.f19778a, (AddressItem[]) obj);
            case 15:
                this.f19778a.a((Position.IntArea) obj);
                return h.ab.f48028a;
            case 16:
                return ((NavigationInfoNativeManager) this.f19778a).lambda$onLanesGuidanceChanged$0((NavigationLaneList) obj);
            case 17:
                this.f19778a.a((Integer) obj);
                return h.ab.f48028a;
            case 18:
                this.f19778a.a((Integer) obj);
                return h.ab.f48028a;
            case 19:
                Context context = (Context) obj;
                h.g.b.x.f(context, "it");
                Intent intentZ = SimpleWebActivity.z(context, "My Ad Center", (String) this.f19778a);
                h.g.b.x.e(intentZ, "createSimpleWebActivityIntent(...)");
                return intentZ;
            default:
                h.g.b.x.f((Context) obj, "it");
                Intent intentA = com.waze.sharedui.web.at.a(((com.waze.navigate.location_preview.ay) this.f19778a).F());
                h.g.b.x.e(intentA, "getOpenBrowserIntent(...)");
                return intentA;
        }
    }
}
