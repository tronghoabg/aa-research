package com.google.android.gms.internal.ads;

import A7.CallableC0255h0;
import D6.C0395s;
import D6.InterfaceC0358a;
import G6.U;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n7.InterfaceC3600e;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class zzclm extends WebViewClient implements zzcmz {
    public static final /* synthetic */ int zzc = 0;
    private zzdzt zzA;
    private zzdbv zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzekz zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzclb zza;
    protected zzcdu zzb;
    private final zzbhw zzd;
    private InterfaceC0358a zzg;
    private F6.o zzh;
    private zzcmx zzi;
    private zzcmy zzj;
    private zzbon zzk;
    private zzbop zzl;
    private zzdlg zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private F6.c zzw;
    private zzbym zzx;
    private C6.b zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbyh zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) C0395s.f2489e.f2492c.zzd(zzbix.zzgN)).split(",")));

    public zzclm(zzclb zzclbVar, zzbhw zzbhwVar, boolean z2, zzbym zzbymVar, zzbyh zzbyhVar, zzekz zzekzVar) {
        this.zzd = zzbhwVar;
        this.zza = zzclbVar;
        this.zzs = z2;
        this.zzx = zzbymVar;
        this.zzH = zzekzVar;
    }

    private final void zzac(final View view, final zzcdu zzcduVar, final int i5) {
        if (!zzcduVar.zzc() || i5 <= 0) {
            return;
        }
        zzcduVar.zzd(view);
        if (zzcduVar.zzc()) {
            U.f4562l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(view, zzcduVar, i5);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbA)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        r11 = r1.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012e, code lost:
    
        r1 = r1.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        if (r2 >= r1.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (r1[r2].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r3 = r1[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0155, code lost:
    
        if (r3.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0157, code lost:
    
        r5 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0160, code lost:
    
        r0 = r7.getHeaderFields();
        r15 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017b, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0197, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0199, code lost:
    
        r15.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01af, code lost:
    
        r0 = C6.n.f1857D.f1866f;
        r13 = r7.getResponseCode();
        r14 = r7.getResponseMessage();
        r16 = r7.getInputStream();
        r0.getClass();
        r10 = new android.webkit.WebResourceResponse(r11, r12, r13, r14, r15, r16);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzaf(java.lang.String r18, java.util.Map r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclm.zzaf(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (G6.L.m()) {
            G6.L.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                G6.L.k(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpx) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z2, long j8) {
        this.zza.zzu(z2, j8);
    }

    private static final boolean zzai(zzclb zzclbVar) {
        return zzclbVar.zzC() != null && zzclbVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z2, zzclb zzclbVar) {
        return (!z2 || zzclbVar.zzN().zzg() || zzclbVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz, D6.InterfaceC0358a
    public final void onAdClicked() {
        InterfaceC0358a interfaceC0358a = this.zzg;
        if (interfaceC0358a != null) {
            interfaceC0358a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        G6.L.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzQ(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.zzf) {
            try {
                zzclb zzclbVar = this.zza;
                if (zzclbVar.zzX()) {
                    G6.L.k("Blank page loaded, 1...");
                    zzclbVar.zzY();
                    return;
                }
                this.zzC = true;
                zzcmy zzcmyVar = this.zzj;
                if (zzcmyVar != null) {
                    zzcmyVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzclb zzclbVar2 = this.zza;
                if (zzclbVar2.zzL() != null) {
                    if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznD)).booleanValue() || (toolbar = zzclbVar2.zzL().f3991v) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        this.zzo = true;
        this.zzp = i5;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzL(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case EMPTY_TPAT_ERROR_VALUE:
                    case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        G6.L.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzQ(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                    InterfaceC0358a interfaceC0358a = this.zzg;
                    if (interfaceC0358a != null) {
                        interfaceC0358a.onAdClicked();
                        zzcdu zzcduVar = this.zzb;
                        if (zzcduVar != null) {
                            zzcduVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdlg zzdlgVar = this.zzm;
                    if (zzdlgVar != null) {
                        zzdlgVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzclb zzclbVar = this.zza;
            if (zzclbVar.zzD().willNotDraw()) {
                H6.l.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzbaw zzbawVarZzS = zzclbVar.zzS();
                    zzflk zzflkVarZzT = zzclbVar.zzT();
                    if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznH)).booleanValue() || zzflkVarZzT == null) {
                        if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                            uriZzd = zzbawVarZzS.zzd(uriZzd, zzclbVar.getContext(), (View) zzclbVar, zzclbVar.zzj());
                        }
                    } else if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                        uriZzd = zzflkVarZzT.zza(uriZzd, zzclbVar.getContext(), (View) zzclbVar, zzclbVar.zzj());
                    }
                } catch (zzbax unused) {
                    H6.l.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                C6.b bVar = this.zzy;
                if (bVar == null || bVar.a()) {
                    F6.e eVar = new F6.e("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzclb zzclbVar2 = this.zza;
                    zzv(eVar, true, false, zzclbVar2 != null ? zzclbVar2.zzn() : "");
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        F6.e eVar;
        zzbyh zzbyhVar = this.zzz;
        boolean zZzd = zzbyhVar != null ? zzbyhVar.zzd() : false;
        Xd.c cVar = C6.n.f1857D.f1862b;
        Xd.c.t(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            String str = adOverlayInfoParcel.f26318l;
            if (str == null && (eVar = adOverlayInfoParcel.f26308a) != null) {
                str = eVar.f3954b;
            }
            zzcduVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbpx zzbpxVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbpxVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzbpx zzbpxVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbpxVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, InterfaceC3600e interfaceC3600e) {
        synchronized (this.zzf) {
            try {
                List<zzbpx> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbpx zzbpxVar : list) {
                    if (interfaceC3600e.apply(zzbpxVar)) {
                        arrayList.add(zzbpxVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            zzcduVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbyh zzbyhVar = this.zzz;
                if (zzbyhVar != null) {
                    zzbyhVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzG(zzcmx zzcmxVar) {
        this.zzi = zzcmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzH(zzcmy zzcmyVar) {
        this.zzj = zzcmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final zzdzt zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzJ(zzdbv zzdbvVar) {
        this.zzB = zzdbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final zzdbv zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e7 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #14 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:31:0x00cf, B:34:0x00e2, B:79:0x01c3, B:51:0x0177, B:98:0x02d1, B:101:0x02e1, B:103:0x02e7, B:105:0x02f5, B:87:0x024c, B:88:0x0282, B:86:0x0217, B:50:0x0145, B:33:0x00d9, B:89:0x0283, B:91:0x028d, B:93:0x0293, B:95:0x02c6), top: B:113:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c A[Catch: all -> 0x01b6, TryCatch #6 {all -> 0x01b6, blocks: (B:72:0x019b, B:74:0x01ad, B:78:0x01b9, B:82:0x01fa, B:84:0x020c, B:85:0x0213), top: B:110:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #14 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:31:0x00cf, B:34:0x00e2, B:79:0x01c3, B:51:0x0177, B:98:0x02d1, B:101:0x02e1, B:103:0x02e7, B:105:0x02f5, B:87:0x024c, B:88:0x0282, B:86:0x0217, B:50:0x0145, B:33:0x00d9, B:89:0x0283, B:91:0x028d, B:93:0x0293, B:95:0x02c6), top: B:113:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzL(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclm.zzL(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzM(boolean z2) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcli
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzclb zzclbVar = this.zza.zza;
                    zzclbVar.zzah();
                    F6.l lVarZzL = zzclbVar.zzL();
                    if (lVarZzL != null) {
                        lVarZzL.k.removeView(lVarZzL.f3975e);
                        lVarZzL.zzr(true);
                    }
                }
            });
        }
    }

    public final void zzO(boolean z2) {
        this.zzF = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzP(int i5, int i10) {
        zzbyh zzbyhVar = this.zzz;
        if (zzbyhVar != null) {
            zzbyhVar.zze(i5, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzQ(Uri uri) {
        G6.L.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            G6.L.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhN)).booleanValue() || C6.n.f1857D.f1868h.zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i5 = zzclm.zzc;
                    C6.n.f1857D.f1868h.zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        zzbio zzbioVar = zzbix.zzgM;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) c0395s.f2492c.zzd(zzbix.zzgO)).intValue()) {
                G6.L.k("Parsing gmsg query params on BG thread: ".concat(path));
                U u10 = C6.n.f1857D.f1863c;
                u10.getClass();
                zzhcf.zzr(zzhcf.zzd(new CallableC0255h0(uri, 2), u10.k), new zzcld(this, list, path, uri), zzcfy.zzf);
                return;
            }
        }
        U u11 = C6.n.f1857D.f1863c;
        zzaa(U.o(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzR(boolean z2) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzS(boolean z2) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzT(boolean z2) {
        synchronized (this.zzf) {
            this.zzv = z2;
        }
    }

    public final /* synthetic */ void zzU(View view, zzcdu zzcduVar, int i5) {
        zzac(view, zzcduVar, i5 - 1);
    }

    public final /* synthetic */ void zzV(boolean z2, long j8) {
        zzY(true, j8);
    }

    public final /* synthetic */ void zzZ(View view, zzcdu zzcduVar, int i5) {
        zzac(view, zzcduVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zza(int i5, int i10, boolean z2) {
        zzbym zzbymVar = this.zzx;
        if (zzbymVar != null) {
            zzbymVar.zzb(i5, i10);
        }
        zzbyh zzbyhVar = this.zzz;
        if (zzbyhVar != null) {
            zzbyhVar.zzc(i5, i10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzab(InterfaceC0358a interfaceC0358a, zzbon zzbonVar, F6.o oVar, zzbop zzbopVar, F6.c cVar, boolean z2, zzbqa zzbqaVar, C6.b bVar, zzbyo zzbyoVar, zzcdu zzcduVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzbqs zzbqsVar, zzdlg zzdlgVar, zzbqr zzbqrVar, zzbql zzbqlVar, zzbpy zzbpyVar, zzctq zzctqVar, zzeaw zzeawVar, zzdca zzdcaVar, zzdbv zzdbvVar) {
        C6.b bVar2 = bVar == null ? new C6.b(this.zza.getContext(), zzcduVar) : bVar;
        zzclb zzclbVar = this.zza;
        this.zzz = new zzbyh(zzclbVar, zzbyoVar);
        this.zzb = zzcduVar;
        zzbio zzbioVar = zzbix.zzbJ;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzB("/adMetadata", new zzbom(zzbonVar));
        }
        if (zzbopVar != null) {
            zzB("/appEvent", new zzboo(zzbopVar));
        }
        zzB("/backButton", zzbpw.zzj);
        zzB("/refresh", zzbpw.zzk);
        zzB("/canOpenApp", zzbpw.zzb);
        zzB("/canOpenURLs", zzbpw.zza);
        zzB("/canOpenIntents", zzbpw.zzc);
        zzB("/close", zzbpw.zzd);
        zzB("/customClose", zzbpw.zze);
        zzB("/instrument", zzbpw.zzn);
        zzB("/delayPageLoaded", zzbpw.zzp);
        zzB("/delayPageClosed", zzbpw.zzq);
        zzB("/getLocationInfo", zzbpw.zzr);
        zzB("/log", zzbpw.zzg);
        zzB("/mraid", new zzbqe(bVar2, this.zzz, zzbyoVar));
        zzbym zzbymVar = this.zzx;
        if (zzbymVar != null) {
            zzB("/mraidLoaded", zzbymVar);
        }
        C6.b bVar3 = bVar2;
        zzB("/open", new zzbqk(bVar3, this.zzz, zzekoVar, zzdztVar, zzctqVar, zzdcaVar));
        zzB("/precache", new zzcji());
        zzB("/touch", zzbpw.zzi);
        zzB("/video", zzbpw.zzl);
        zzB("/videoMeta", zzbpw.zzm);
        if (zzekoVar == null || zzfsmVar == null) {
            zzB("/click", zzbpw.zzb(zzdlgVar, zzctqVar));
            zzB("/httpTrack", zzbpw.zzf);
        } else {
            zzB("/click", zzflr.zza(zzekoVar, zzfsmVar, zzctqVar, zzdlgVar));
            zzB("/httpTrack", zzflr.zzb(zzekoVar, zzfsmVar));
        }
        if (C6.n.f1857D.f1885z.zzb(zzclbVar.getContext())) {
            Map map = new HashMap();
            if (zzclbVar.zzC() != null) {
                map = zzclbVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbqd(zzclbVar.getContext(), map));
        }
        if (zzbqaVar != null) {
            zzB("/setInterstitialProperties", new zzbpz(zzbqaVar));
        }
        zzbiv zzbivVar = c0395s.f2492c;
        if (zzbqsVar != null && ((Boolean) zzbivVar.zzd(zzbix.zzkv)).booleanValue()) {
            zzB("/inspectorNetworkExtras", zzbqsVar);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzkO)).booleanValue() && zzbqrVar != null) {
            zzB("/shareSheet", zzbqrVar);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zziQ)).booleanValue() && zzeawVar != null) {
            zzB("/onDeviceStorageEvent", new zzbqf(zzeawVar));
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzkT)).booleanValue() && zzbqlVar != null) {
            zzB("/inspectorOutOfContextTest", zzbqlVar);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzkY)).booleanValue() && zzbpyVar != null) {
            zzB("/inspectorStorage", zzbpyVar);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzni)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbpw.zzu);
            zzB("/presentPlayStoreOverlay", zzbpw.zzv);
            zzB("/expandPlayStoreOverlay", zzbpw.zzw);
            zzB("/collapsePlayStoreOverlay", zzbpw.zzx);
            zzB("/closePlayStoreOverlay", zzbpw.zzy);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzeq)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbpw.zzA);
            zzB("/resetPAID", zzbpw.zzz);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zznC)).booleanValue() && zzclbVar.zzC() != null && zzclbVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbpw.zzB);
            zzB("/clearLocalStorageKeys", zzbpw.zzC);
        }
        this.zzg = interfaceC0358a;
        this.zzh = oVar;
        this.zzk = zzbonVar;
        this.zzl = zzbopVar;
        this.zzw = cVar;
        this.zzy = bVar3;
        this.zzm = zzdlgVar;
        this.zzA = zzdztVar;
        this.zzB = zzdbvVar;
        this.zzn = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzb(zzfkn zzfknVar) {
        zzclb zzclbVar = this.zza;
        if (C6.n.f1857D.f1885z.zzb(zzclbVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbqd(zzclbVar.getContext(), zzfknVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzc(zzctq zzctqVar) {
        zzD("/click");
        zzB("/click", zzbpw.zzb(this.zzm, zzctqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzd(zzctq zzctqVar, zzeko zzekoVar, zzfsm zzfsmVar) {
        zzD("/click");
        if (zzekoVar == null || zzfsmVar == null) {
            zzB("/click", zzbpw.zzb(this.zzm, zzctqVar));
        } else {
            zzB("/click", zzflr.zza(zzekoVar, zzfsmVar, zzctqVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzdlg zzdlgVar = this.zzm;
        if (zzdlgVar != null) {
            zzdlgVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzdlg zzdlgVar = this.zzm;
        if (zzdlgVar != null) {
            zzdlgVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zze(zzctq zzctqVar, zzeko zzekoVar, zzdzt zzdztVar) {
        zzD("/open");
        zzB("/open", new zzbqk(this.zzy, this.zzz, zzekoVar, zzdztVar, zzctqVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final C6.b zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzi(C6.b bVar) {
        this.zzy = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzj(zzcdu zzcduVar) {
        this.zzb = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final boolean zzk() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzs;
        }
        return z2;
    }

    public final boolean zzl() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzt;
        }
        return z2;
    }

    public final boolean zzm() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzu;
        }
        return z2;
    }

    public final boolean zzn() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzv;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzq() {
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            zzclb zzclbVar = this.zza;
            WebView webViewZzD = zzclbVar.zzD();
            WeakHashMap weakHashMap = k1.S.f38779a;
            if (webViewZzD.isAttachedToWindow()) {
                zzac(webViewZzD, zzcduVar, 10);
                return;
            }
            zzad();
            zzclc zzclcVar = new zzclc(this, zzcduVar);
            this.zzI = zzclcVar;
            ((View) zzclbVar).addOnAttachStateChangeListener(zzclcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzt() {
        zzbhw zzbhwVar = this.zzd;
        if (zzbhwVar != null) {
            zzbhwVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue()) {
                zzclb zzclbVar = this.zza;
                if (zzclbVar.zzq() != null) {
                    zzbje.zza(zzclbVar.zzq().zzc(), zzclbVar.zzi(), "awfllc");
                }
            }
            zzcmx zzcmxVar = this.zzi;
            boolean z2 = false;
            if (!this.zzD && !this.zzo) {
                z2 = true;
            }
            zzcmxVar.zza(z2, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(F6.e eVar, boolean z2, boolean z10, String str) {
        boolean z11;
        zzclb zzclbVar = this.zza;
        boolean zZzW = zzclbVar.zzW();
        boolean z12 = false;
        boolean z13 = zzaj(zZzW, zzclbVar) || z10;
        if (z13 || !z2) {
            z11 = zZzW;
            z12 = true;
        } else {
            z11 = zZzW;
        }
        zzA(new AdOverlayInfoParcel(eVar, z13 ? null : this.zzg, z11 ? null : this.zzh, this.zzw, zzclbVar.zzs(), zzclbVar, z12 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i5) {
        zzekz zzekzVar = this.zzH;
        zzclb zzclbVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzclbVar, zzclbVar.zzs(), str, str2, zzekzVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(boolean z2, int i5, boolean z10) {
        InterfaceC0358a interfaceC0358a;
        zzdlg zzdlgVar;
        zzekz zzekzVar;
        int i10;
        InterfaceC0358a interfaceC0358a2;
        boolean z11;
        zzclb zzclbVar = this.zza;
        boolean zZzaj = zzaj(zzclbVar.zzW(), zzclbVar);
        boolean z12 = true;
        if (!zZzaj && z10) {
            z12 = false;
        }
        if (zZzaj) {
            interfaceC0358a = null;
            zzdlgVar = null;
        } else {
            interfaceC0358a = this.zzg;
            zzdlgVar = null;
        }
        F6.o oVar = this.zzh;
        zzdlg zzdlgVar2 = zzdlgVar;
        F6.c cVar = this.zzw;
        H6.a aVarZzs = zzclbVar.zzs();
        zzdlg zzdlgVar3 = z12 ? zzdlgVar2 : this.zzm;
        if (zzai(zzclbVar)) {
            zzekzVar = this.zzH;
            z11 = z2;
            i10 = i5;
            interfaceC0358a2 = interfaceC0358a;
        } else {
            zzekzVar = zzdlgVar2;
            i10 = i5;
            interfaceC0358a2 = interfaceC0358a;
            z11 = z2;
        }
        zzA(new AdOverlayInfoParcel(interfaceC0358a2, oVar, cVar, zzclbVar, z11, i10, aVarZzs, zzdlgVar3, zzekzVar));
    }

    public final void zzy(boolean z2, int i5, String str, boolean z10, boolean z11) {
        zzclb zzclbVar = this.zza;
        boolean zZzW = zzclbVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzclbVar);
        boolean z12 = true;
        if (!zZzaj && z10) {
            z12 = false;
        }
        InterfaceC0358a interfaceC0358a = zZzaj ? null : this.zzg;
        zzcll zzcllVar = zZzW ? null : new zzcll(zzclbVar, this.zzh);
        zzbon zzbonVar = this.zzk;
        zzekz zzekzVar = null;
        zzbop zzbopVar = this.zzl;
        boolean z13 = z12;
        zzcll zzcllVar2 = zzcllVar;
        F6.c cVar = this.zzw;
        H6.a aVarZzs = zzclbVar.zzs();
        zzdlg zzdlgVar = z13 ? null : this.zzm;
        if (zzai(zzclbVar)) {
            zzekzVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(interfaceC0358a, zzcllVar2, zzbonVar, zzbopVar, cVar, zzclbVar, z2, i5, str, aVarZzs, zzdlgVar, zzekzVar, z11));
    }

    public final void zzz(boolean z2, int i5, String str, String str2, boolean z10) {
        zzclb zzclbVar = this.zza;
        boolean zZzW = zzclbVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzclbVar);
        boolean z11 = true;
        if (!zZzaj && z10) {
            z11 = false;
        }
        InterfaceC0358a interfaceC0358a = zZzaj ? null : this.zzg;
        zzcll zzcllVar = zZzW ? null : new zzcll(zzclbVar, this.zzh);
        zzbon zzbonVar = this.zzk;
        zzekz zzekzVar = null;
        zzbop zzbopVar = this.zzl;
        boolean z12 = z11;
        zzcll zzcllVar2 = zzcllVar;
        F6.c cVar = this.zzw;
        H6.a aVarZzs = zzclbVar.zzs();
        zzdlg zzdlgVar = z12 ? null : this.zzm;
        if (zzai(zzclbVar)) {
            zzekzVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(interfaceC0358a, zzcllVar2, zzbonVar, zzbopVar, cVar, zzclbVar, z2, i5, str, str2, aVarZzs, zzdlgVar, zzekzVar));
    }
}
