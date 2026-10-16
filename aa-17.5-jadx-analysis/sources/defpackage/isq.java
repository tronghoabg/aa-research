package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher.NativeNetworkTileFetchHandler;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final /* synthetic */ class isq implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ isq(NativeNetworkTileFetchHandler nativeNetworkTileFetchHandler, byte[] bArr, byte[] bArr2, boolean z, int i) {
        this.e = i;
        this.c = nativeNetworkTileFetchHandler;
        this.b = bArr;
        this.d = bArr2;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object, vip] */
    /* JADX WARN: Type inference failed for: r14v45, types: [java.lang.Object, vip] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, uoq] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        pmd pmdVar;
        boolean z = false;
        int i = 1;
        switch (this.e) {
            case 0:
                isr isrVar = (isr) this.b;
                int iA = isrVar.a();
                AtomicInteger atomicInteger = isrVar.f;
                int i2 = atomicInteger.get();
                ype ypeVar = (ype) ((ype) isr.a.f()).ai(1312);
                String strK = epq.k(iA);
                zjc zjcVar = zjc.a;
                zjd zjdVar = new zjd(zjcVar, strK);
                zjd zjdVar2 = new zjd(zjcVar, epq.k(i2));
                boolean z2 = this.a;
                ypeVar.S("maybeNotifyFocusStackChange: currentFocusGrant: %s, oldFocusGrant: %s, forceNotify: %s, mostRecentPackageName: %s", zjdVar, zjdVar2, new zjd(zjcVar, Boolean.valueOf(z2)), isrVar.g);
                if (z2 || iA != i2) {
                    int iA2 = isrVar.a();
                    atomicInteger.set(iA2);
                    if (iA2 == 0) {
                        isrVar.b.k();
                        return;
                    }
                    Object obj = this.d;
                    Object obj2 = this.c;
                    int iIntValue = ((Integer) ((Optional) obj).orElse(Integer.valueOf(iA2))).intValue();
                    ism ismVar = isrVar.b;
                    String str = isrVar.g;
                    iqw iqwVar = (iqw) ismVar;
                    iqwVar.i = str;
                    yph yphVar = iqw.a;
                    ((ype) yphVar.l().ai(1184)).R("onExternalAppGainAudioFocus externalAppFocusChange: %s, audioClientPackageName: %s audioAttributes: %s", new zjd(zjcVar, epq.k(iIntValue)), str, obj2);
                    iqwVar.h();
                    boolean zN = iqw.n(str, (AudioAttributes) obj2);
                    if (a.O() && zN) {
                        if (acmd.G()) {
                            Iterable$EL.forEach(iqwVar.s, new iju(str, 8));
                        } else {
                            iqwVar.t++;
                            iqwVar.j(str);
                        }
                    }
                    if (!a.O() || zN || iIntValue != 1) {
                        i = iIntValue;
                    } else if (acmd.G()) {
                        Iterable$EL.forEach(iqwVar.s, new nxt(i));
                    } else {
                        ((ype) yphVar.l().ai((char) 1185)).u("Any app gain, usageAssistantFocusGains: 0");
                        iqwVar.t = 0;
                        iqwVar.j(str);
                    }
                    iqwVar.m(i);
                    return;
                }
                return;
            case 1:
                ((gqb) this.d).b((MediaSessionCompat.Token) this.b, (ComponentName) this.c, this.a);
                return;
            case 2:
                yph yphVar2 = jim.a;
                ((jil) this.d).a.G(this.c, (jid) this.b, this.a);
                return;
            case 3:
                yph yphVar3 = jim.a;
                ((jil) this.d).a.F(this.c, (jid) this.b, this.a);
                return;
            case 4:
                ((MaterialRowView) this.d).g((geu) this.c, (him) this.b, this.a);
                return;
            case 5:
                ((MaterialRowView) this.d).g((geu) this.c, (him) this.b, this.a);
                return;
            case 6:
                ((RowView) this.d).h((geu) this.c, (him) this.b, this.a);
                return;
            case 7:
                ((RowView) this.d).h((geu) this.c, (him) this.b, this.a);
                return;
            case 8:
                yph yphVar4 = pbx.a;
                ((ype) ((ype) yphVar4.f()).ai((char) 6286)).w("Handoff success with %d services", this.d.size());
                ((ype) ((ype) yphVar4.f()).ai((char) 6283)).u("Starting transfer for handoff.");
                pbu pbuVar = (pbu) this.c;
                Context context = pbuVar.c;
                ols.Q(context.getApplicationContext(), rrx.a, 0);
                pbuVar.l = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("car_handoff_start_activities", true);
                bundle.putBoolean("car_handoff_user_authorized_projection", true);
                bundle.putInt("connection_tag", 0);
                pbuVar.i.f(pbuVar.d, bundle);
                Intent intentPutExtra = new Intent("com.google.android.gms.car.HANDOFF").setComponent((ComponentName) itx.a.gu()).putExtra("car_handoff_session_id", pbuVar.d).putExtra("car_handoff_component", pbuVar.k.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", true).putExtra("car_handoff_connection_type", 2).putExtra("connection_tag", 0);
                pbuVar.f.b(intentPutExtra);
                intentPutExtra.putExtra("car_handoff_analytics_session_id", (int) pbuVar.d);
                intentPutExtra.putExtra("car_handoff_use_gearhead_for_projection", true);
                intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", this.a);
                intentPutExtra.putExtra("connection_tear_down_helper", new BinderParcel(new pbt()));
                Bundle bundle2 = pbuVar.j;
                if (bundle2 != null) {
                    intentPutExtra.putExtra("car_handoff_starting_bluetooth_device", bundle2.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE"));
                }
                Object obj3 = this.b;
                Parcel parcelObtain = Parcel.obtain();
                sai.a((CarInfoInternal) obj3, parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                intentPutExtra.putExtra("car_handoff_car_info", bArrMarshall);
                intentPutExtra.putExtra("car_handoff_is_first_connection", false);
                context.startService(intentPutExtra);
                pbuVar.g.postDelayed(pbuVar.h, 5000L);
                return;
            case 9:
                Object obj4 = this.c;
                Object obj5 = this.b;
                Object obj6 = this.d;
                boolean z3 = this.a;
                try {
                    abgj abgjVar = (abgj) abnv.B(abgj.a, (byte[]) obj5, abnj.a());
                    pxj pxjVar = new pxj();
                    try {
                        pxjVar.a.w((abad) abnv.B(abad.a, (byte[]) obj6, abnj.a()));
                    } catch (abon e) {
                        ((ynz) ((ynz) ((ynz) NativeNetworkTileFetchHandler.a.h()).p(e)).ai((char) 9108)).u("Failed to parse tile fetching context");
                    }
                    synchronized (obj4) {
                        SystemClock.elapsedRealtime();
                        if (z3 && pxjVar.a()) {
                            ((pmc) ((NativeNetworkTileFetchHandler) obj4).b).b.l = pxjVar;
                        }
                        pmdVar = new pmd((pmc) ((NativeNetworkTileFetchHandler) obj4).b, 2, (char[]) null);
                    }
                    pmdVar.a(abgjVar, new tsf(), ((NativeNetworkTileFetchHandler) obj4).c);
                    return;
                } catch (abon e2) {
                    ((ynz) ((ynz) ((ynz) NativeNetworkTileFetchHandler.a.h()).p(e2)).ai((char) 9109)).u("Failed to parse request");
                    return;
                }
            case 10:
                uop uopVar = uop.OK;
                vaq.d();
                ?? r1 = this.d;
                Object obj7 = this.c;
                Object obj8 = this.b;
                uko ukoVarF = ((umx) obj8).d.f((ukp) obj7);
                if (ukoVarF == null) {
                    boolean zC = ((umx) obj8).e.c((ukp) obj7);
                    boolean z4 = this.a;
                    uop uopVar2 = (!z4 || zC) ? uop.NOT_FOUND_LOCALLY : uop.NOT_EXIST;
                    if (z4 && zC) {
                        z = true;
                    }
                    uopVar = uopVar2;
                }
                vaq.d();
                ((umx) obj8).e((ukp) obj7, r1, uop.a(uopVar, z), ukoVarF);
                vaq.d();
                if (z) {
                    rhj rhjVar = ((umx) obj8).i;
                    rhjVar.b.execute(new rdz(rhjVar, obj7, new whk(obj8, obj7, (Object) r1), 13, (char[]) null));
                    return;
                }
                return;
            case 11:
                Bitmap bitmap = (Bitmap) this.c;
                Canvas canvas = new Canvas(bitmap);
                Object obj9 = this.d;
                ((aaaq) obj9).a.draw(canvas);
                ((ztb) obj9).a(bitmap, this.a);
                aaaq.d(this.b, bitmap);
                return;
            default:
                aacu aacuVar = ((aact) this.d).d;
                boolean z5 = this.a;
                Bitmap bitmap2 = (Bitmap) this.c;
                aacuVar.a(bitmap2, z5);
                aacu.d(this.b, bitmap2);
                return;
        }
    }

    public /* synthetic */ isq(gqb gqbVar, MediaSessionCompat.Token token, ComponentName componentName, boolean z, int i) {
        this.e = i;
        this.d = gqbVar;
        this.b = token;
        this.c = componentName;
        this.a = z;
    }

    public /* synthetic */ isq(isr isrVar, boolean z, AudioAttributes audioAttributes, Optional optional, int i) {
        this.e = i;
        this.b = isrVar;
        this.a = z;
        this.c = audioAttributes;
        this.d = optional;
    }

    public /* synthetic */ isq(Object obj, Bitmap bitmap, boolean z, vip vipVar, int i) {
        this.e = i;
        this.d = obj;
        this.c = bitmap;
        this.a = z;
        this.b = vipVar;
    }

    public /* synthetic */ isq(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.e = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = z;
    }

    public /* synthetic */ isq(pbu pbuVar, List list, CarInfoInternal carInfoInternal, boolean z, int i) {
        this.e = i;
        this.c = pbuVar;
        this.d = list;
        this.b = carInfoInternal;
        this.a = z;
    }

    public isq(umx umxVar, ukp ukpVar, boolean z, uoq uoqVar, int i) {
        this.e = i;
        this.c = ukpVar;
        this.a = z;
        this.d = uoqVar;
        this.b = umxVar;
    }
}
