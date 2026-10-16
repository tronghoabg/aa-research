package N6;

import A.e0;
import A7.CallableC0308z0;
import D6.C0395s;
import D6.v1;
import G6.L;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdvf;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ka.AbstractC3256n;
import org.json.JSONException;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import u.AbstractC4159a;

/* loaded from: classes3.dex */
public final class j extends zzces {

    /* renamed from: G, reason: collision with root package name */
    public static final ArrayList f8479G = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: H, reason: collision with root package name */
    public static final ArrayList f8480H = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: I, reason: collision with root package name */
    public static final ArrayList f8481I = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: J, reason: collision with root package name */
    public static final ArrayList f8482J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: D, reason: collision with root package name */
    public final zzbkc f8486D;

    /* renamed from: E, reason: collision with root package name */
    public final x f8487E;

    /* renamed from: F, reason: collision with root package name */
    public final C0777b f8488F;

    /* renamed from: a, reason: collision with root package name */
    public final zzcnq f8489a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8490b;

    /* renamed from: c, reason: collision with root package name */
    public final zzbaw f8491c;

    /* renamed from: d, reason: collision with root package name */
    public final zzflk f8492d;

    /* renamed from: e, reason: collision with root package name */
    public final zzfmf f8493e;

    /* renamed from: f, reason: collision with root package name */
    public final zzhcp f8494f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f8495g;

    /* renamed from: h, reason: collision with root package name */
    public zzcaa f8496h;
    public final zzdzy k;

    /* renamed from: l, reason: collision with root package name */
    public final zzfsm f8499l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8500m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8501n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8502o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8503p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8504q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8505r;

    /* renamed from: t, reason: collision with root package name */
    public final H6.a f8507t;

    /* renamed from: u, reason: collision with root package name */
    public String f8508u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8509v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f8510w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f8511x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f8512y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f8513z;

    /* renamed from: i, reason: collision with root package name */
    public Point f8497i = new Point();

    /* renamed from: j, reason: collision with root package name */
    public Point f8498j = new Point();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicInteger f8506s = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f8483A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f8484B = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f8485C = new AtomicInteger(0);

    public j(zzcnq zzcnqVar, Context context, zzbaw zzbawVar, zzfmf zzfmfVar, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzdzy zzdzyVar, zzfsm zzfsmVar, H6.a aVar, zzbkc zzbkcVar, zzflk zzflkVar, x xVar, C0777b c0777b) {
        ArrayList arrayListZ;
        this.f8489a = zzcnqVar;
        this.f8490b = context;
        this.f8491c = zzbawVar;
        this.f8492d = zzflkVar;
        this.f8493e = zzfmfVar;
        this.f8494f = zzhcpVar;
        this.f8495g = scheduledExecutorService;
        this.k = zzdzyVar;
        this.f8499l = zzfsmVar;
        this.f8507t = aVar;
        this.f8486D = zzbkcVar;
        zzbio zzbioVar = zzbix.zziq;
        C0395s c0395s = C0395s.f2489e;
        this.f8500m = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbio zzbioVar2 = zzbix.zzip;
        zzbiv zzbivVar = c0395s.f2492c;
        this.f8501n = ((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue();
        this.f8502o = ((Boolean) zzbivVar.zzd(zzbix.zzis)).booleanValue();
        this.f8503p = ((Boolean) zzbivVar.zzd(zzbix.zziu)).booleanValue();
        this.f8504q = (String) zzbivVar.zzd(zzbix.zzit);
        this.f8505r = (String) zzbivVar.zzd(zzbix.zziv);
        this.f8509v = (String) zzbivVar.zzd(zzbix.zziw);
        this.f8487E = xVar;
        this.f8488F = c0777b;
        if (((Boolean) zzbivVar.zzd(zzbix.zzix)).booleanValue()) {
            this.f8510w = Z((String) zzbivVar.zzd(zzbix.zziy));
            this.f8511x = Z((String) zzbivVar.zzd(zzbix.zziz));
            this.f8512y = Z((String) zzbivVar.zzd(zzbix.zziA));
            arrayListZ = Z((String) zzbivVar.zzd(zzbix.zziB));
        } else {
            this.f8510w = f8479G;
            this.f8511x = f8480H;
            this.f8512y = f8481I;
            arrayListZ = f8482J;
        }
        this.f8513z = arrayListZ;
    }

    public static boolean V(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (path.contains((String) it.next())) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (host.endsWith((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final Uri Y(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i5 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i5));
        AbstractC3256n.p(sb2, str, "=", str2, "&");
        sb2.append(string.substring(i5));
        return Uri.parse(sb2.toString());
    }

    public static final ArrayList Z(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzgui.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static zzfqq a0(p8.p pVar, zzcex zzcexVar) {
        if (!zzfqt.zza() || !((Boolean) zzbkq.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfqq zzfqqVarZzb = ((G) zzhcf.zzs(pVar)).zzb();
            zzfqqVarZzb.zzb(new ArrayList(Collections.singletonList(zzcexVar.zzb)));
            v1 v1Var = zzcexVar.zzd;
            zzfqqVarZzb.zzc(v1Var == null ? "" : v1Var.f2518p);
            zzfqqVarZzb.zzd(v1Var.f2515m);
            return zzfqqVarZzb;
        } catch (ExecutionException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final void R(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar, boolean z2) {
        Map map;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziG)).booleanValue()) {
            try {
                zzbzxVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                int i5 = L.f4523b;
                H6.l.d("", e7);
                return;
            }
        }
        CallableC0308z0 callableC0308z0 = new CallableC0308z0(1, this, list, interfaceC3876a, false);
        zzhcp zzhcpVar = this.f8494f;
        p8.p pVarZzc = zzhcpVar.zzc(callableC0308z0);
        zzcaa zzcaaVar = this.f8496h;
        if (zzcaaVar == null || (map = zzcaaVar.zzb) == null || map.isEmpty()) {
            int i10 = L.f4523b;
            H6.l.e("Asset view map is empty.");
        } else {
            pVarZzc = zzhcf.zzj(pVarZzc, new C0780e(this, 0), zzhcpVar);
        }
        zzhcf.zzr(pVarZzc, new C0778c(this, zzbzxVar, z2, 1), this.f8489a.zzb());
    }

    public final void S(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        p8.p pVarZzc;
        Map map;
        int i5 = 1;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziG)).booleanValue()) {
            int i10 = L.f4523b;
            H6.l.f("The updating URL feature is not enabled.");
            try {
                zzbzxVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                H6.l.d("", e7);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f8511x;
            arrayList2 = this.f8510w;
            if (!zHasNext) {
                break;
            } else if (V((Uri) it.next(), arrayList2, arrayList)) {
                i11++;
            }
        }
        if (i11 > 1) {
            String strValueOf = String.valueOf(list);
            int i12 = L.f4523b;
            H6.l.f("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (V(uri, arrayList2, arrayList)) {
                CallableC0308z0 callableC0308z0 = new CallableC0308z0(2, this, uri, interfaceC3876a, false);
                zzhcp zzhcpVar = this.f8494f;
                pVarZzc = zzhcpVar.zzc(callableC0308z0);
                zzcaa zzcaaVar = this.f8496h;
                if (zzcaaVar == null || (map = zzcaaVar.zzb) == null || map.isEmpty()) {
                    int i13 = L.f4523b;
                    H6.l.e("Asset view map is empty.");
                } else {
                    pVarZzc = zzhcf.zzj(pVarZzc, new C0780e(this, i5), zzhcpVar);
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i14 = L.f4523b;
                H6.l.f("Not a Google URL: ".concat(strValueOf2));
                pVarZzc = zzhcf.zza(uri);
            }
            arrayList3.add(pVarZzc);
        }
        zzhcf.zzr(zzhcf.zzm(arrayList3), new C0778c(this, zzbzxVar, z2, 0), this.f8489a.zzb());
    }

    public final void T() {
        zzbio zzbioVar = zzbix.zzli;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzll)).booleanValue()) {
                return;
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzlp)).booleanValue() && this.f8483A.getAndSet(true)) {
                return;
            }
            U();
        }
    }

    public final void U() {
        j jVar;
        p8.p pVarZzc;
        if (((Boolean) zzblc.zze.zze()).booleanValue()) {
            x xVar = this.f8487E;
            synchronized (xVar) {
                xVar.c(true);
                xVar.c(false);
            }
            return;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmJ)).booleanValue()) {
            pVarZzc = zzhcf.zzf(new e0(this, 15), zzcfy.zza);
            jVar = this;
        } else {
            try {
                jVar = this;
                try {
                    pVarZzc = jVar.W(this.f8490b, null, "BANNER", null, null, new Bundle()).zza();
                } catch (NullPointerException e7) {
                    e = e7;
                    pVarZzc = zzhcf.zzc(e);
                    zzhcf.zzr(pVarZzc, new Y9.c(this), jVar.f8489a.zzb());
                }
            } catch (NullPointerException e10) {
                e = e10;
                jVar = this;
            }
        }
        zzhcf.zzr(pVarZzc, new Y9.c(this), jVar.f8489a.zzb());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N6.G W(android.content.Context r44, java.lang.String r45, java.lang.String r46, D6.x1 r47, D6.v1 r48, android.os.Bundle r49) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.j.W(android.content.Context, java.lang.String, java.lang.String, D6.x1, D6.v1, android.os.Bundle):N6.G");
    }

    public final zzhbx X(final String str) {
        final zzdvf[] zzdvfVarArr = new zzdvf[1];
        p8.p pVarZzb = this.f8493e.zzb();
        zzhbn zzhbnVar = new zzhbn() { // from class: N6.i
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) throws JSONException {
                zzdvf zzdvfVar = (zzdvf) obj;
                j jVar = this.f8476a;
                jVar.getClass();
                zzdvfVarArr[0] = zzdvfVar;
                Context context = jVar.f8490b;
                zzcaa zzcaaVar = jVar.f8496h;
                Map map = zzcaaVar.zzb;
                JSONObject jSONObjectS = Fe.g.S(context, map, map, zzcaaVar.zza, null);
                JSONObject jSONObjectP = Fe.g.P(jVar.f8490b, jVar.f8496h.zza);
                JSONObject jSONObjectQ = Fe.g.Q(jVar.f8496h.zza);
                JSONObject jSONObjectR = Fe.g.R(jVar.f8490b, jVar.f8496h.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectS);
                jSONObject.put("ad_view_signal", jSONObjectP);
                jSONObject.put("scroll_view_signal", jSONObjectQ);
                jSONObject.put("lock_screen_signal", jSONObjectR);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", Fe.g.T(null, jVar.f8490b, jVar.f8498j, jVar.f8497i));
                }
                return zzdvfVar.zzc(str2, jSONObject);
            }
        };
        zzhcp zzhcpVar = this.f8494f;
        p8.p pVarZzj = zzhcf.zzj(pVarZzb, zzhbnVar, zzhcpVar);
        pVarZzj.addListener(new L7.b(3, this, zzdvfVarArr), zzhcpVar);
        return (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzi(zzhbx.zzw(pVarZzj), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zziH)).intValue(), TimeUnit.MILLISECONDS, this.f8495g), h.f8473b, zzhcpVar), Exception.class, h.f8474c, zzhcpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    @Override // com.google.android.gms.internal.ads.zzcet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(q7.InterfaceC3876a r10, com.google.android.gms.internal.ads.zzcex r11, com.google.android.gms.internal.ads.zzceq r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.j.zze(q7.a, com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzceq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzf(InterfaceC3876a interfaceC3876a) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziG)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) BinderC3877b.S(interfaceC3876a);
            zzcaa zzcaaVar = this.f8496h;
            View view = zzcaaVar == null ? null : zzcaaVar.zza;
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            this.f8497i = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
            if (motionEvent.getAction() == 0) {
                this.f8498j = this.f8497i;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f8497i;
            motionEventObtain.setLocation(point.x, point.y);
            this.f8491c.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzg(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) {
        R(list, interfaceC3876a, zzbzxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzh(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) {
        S(list, interfaceC3876a, zzbzxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzi(zzcaa zzcaaVar) {
        this.f8496h = zzcaaVar;
        this.f8493e.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzj(InterfaceC3876a interfaceC3876a) throws JSONException {
        zzbio zzbioVar = zzbix.zzlh;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzbio zzbioVar2 = zzbix.zziE;
            zzbiv zzbivVar = c0395s.f2492c;
            if (!((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue()) {
                T();
            }
            WebView webView = (WebView) BinderC3877b.S(interfaceC3876a);
            if (webView == null) {
                int i5 = L.f4523b;
                H6.l.c("The webView cannot be null.");
                return;
            }
            zzhcp zzhcpVar = zzcfy.zzf;
            C0777b c0777b = this.f8488F;
            v vVar = new v(webView, c0777b, zzhcpVar);
            webView.addJavascriptInterface(new C0776a(webView, this.f8491c, this.k, this.f8499l, this.f8492d, this.f8487E, c0777b, vVar), "gmaSdk");
            if (((Boolean) zzbivVar.zzd(zzbix.zzlr)).booleanValue()) {
                C6.n.f1857D.f1868h.zzn();
            }
            if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
                c0777b.a(webView);
                if (((Boolean) zzblc.zzd.zze()).booleanValue()) {
                    vVar.f8554d = zzcfy.zzd.scheduleWithFixedDelay(new u(vVar, 1), 0L, ((Integer) zzbivVar.zzd(zzbix.zzls)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue()) {
                T();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzk(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) {
        R(list, interfaceC3876a, zzbzxVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzl(List list, InterfaceC3876a interfaceC3876a, zzbzx zzbzxVar) {
        S(list, interfaceC3876a, zzbzxVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final InterfaceC3876a zzm(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, String str, InterfaceC3876a interfaceC3876a3) throws JSONException {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlv)).booleanValue()) {
            return new BinderC3877b(null);
        }
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        u.g gVar = (u.g) BinderC3877b.S(interfaceC3876a2);
        AbstractC4159a abstractC4159a = (AbstractC4159a) BinderC3877b.S(interfaceC3876a3);
        zzbkc zzbkcVar = this.f8486D;
        zzbkcVar.zza(context, gVar, str, abstractC4159a);
        if (((Boolean) zzblc.zze.zze()).booleanValue()) {
            x xVar = this.f8487E;
            synchronized (xVar) {
                xVar.c(true);
                xVar.c(false);
            }
        }
        if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
            this.f8488F.a(null);
        }
        return new BinderC3877b(zzbkcVar.zzb());
    }
}
