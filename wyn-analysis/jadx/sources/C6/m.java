package C6;

import D6.A0;
import D6.A1;
import D6.B;
import D6.C0369e0;
import D6.H0;
import D6.InterfaceC0362b0;
import D6.InterfaceC0373g0;
import D6.InterfaceC0401v;
import D6.InterfaceC0407y;
import D6.K;
import D6.L0;
import D6.O;
import D6.O0;
import D6.q1;
import D6.r1;
import D6.v1;
import D6.x1;
import Va.M6;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzccc;
import java.util.Iterator;
import java.util.TreeMap;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class m extends K {

    /* renamed from: a, reason: collision with root package name */
    public final H6.a f1850a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f1851b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1852c;

    /* renamed from: d, reason: collision with root package name */
    public final l f1853d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f1854e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0407y f1855f;

    /* renamed from: g, reason: collision with root package name */
    public AsyncTask f1856g;

    public m(Context context, x1 x1Var, String str, H6.a aVar) {
        this.f1852c = context;
        this.f1850a = aVar;
        this.f1851b = x1Var;
        this.f1854e = new WebView(context);
        this.f1853d = new l(context, str);
        R(0);
        this.f1854e.setVerticalScrollBarEnabled(false);
        this.f1854e.getSettings().setJavaScriptEnabled(true);
        this.f1854e.setWebViewClient(new i(this));
        this.f1854e.setOnTouchListener(new j(0));
    }

    public final void R(int i5) {
        if (this.f1854e == null) {
            return;
        }
        this.f1854e.setLayoutParams(new ViewGroup.LayoutParams(-1, i5));
    }

    public final String S() {
        String str = (String) this.f1853d.f1847d;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) zzbkj.zzd.zze();
        return M6.t(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // D6.L
    public final boolean zzA() {
        return false;
    }

    @Override // D6.L
    public final boolean zzB() {
        return false;
    }

    @Override // D6.L
    public final void zzC(zzccc zzcccVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzD(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzE(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final L0 zzF() {
        return null;
    }

    @Override // D6.L
    public final void zzG(r1 r1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzH(O0 o02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzI(A1 a12) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzJ(zzbgt zzbgtVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzK(boolean z2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final long zzU() {
        return 0L;
    }

    @Override // D6.L
    public final void zzY(C0369e0 c0369e0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final InterfaceC3876a zzb() {
        AbstractC1732v.e("getAdFrame must be called on the main UI thread.");
        return new BinderC3877b(this.f1854e);
    }

    @Override // D6.L
    public final void zzc() {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        this.f1856g.cancel(true);
        this.f1854e.destroy();
        this.f1854e = null;
    }

    @Override // D6.L
    public final boolean zzd() {
        return false;
    }

    @Override // D6.L
    public final void zzdS(InterfaceC0407y interfaceC0407y) {
        this.f1855f = interfaceC0407y;
    }

    @Override // D6.L
    public final boolean zze(v1 v1Var) {
        TreeMap treeMap;
        AbstractC1732v.j(this.f1854e, "This Search Ad has already been torn down");
        l lVar = this.f1853d;
        lVar.getClass();
        q1 q1Var = v1Var.f2513j;
        if (q1Var != null) {
            lVar.f1846c = q1Var.f2484a;
        }
        Bundle bundle = v1Var.f2515m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbkj.zzc.zze();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                treeMap = (TreeMap) lVar.f1849f;
                if (!zHasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    lVar.f1847d = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f1850a.f4927a);
            if (((Boolean) zzbkj.zza.zze()).booleanValue()) {
                Bundle bundleK = Fe.c.K((Context) lVar.f1844a, (String) zzbkj.zzb.zze());
                for (String str2 : bundleK.keySet()) {
                    treeMap.put(str2, bundleK.get(str2).toString());
                }
            }
        }
        this.f1856g = new k(this).execute(new Void[0]);
        return true;
    }

    @Override // D6.L
    public final void zzf() {
        AbstractC1732v.e("pause must be called on the main UI thread.");
    }

    @Override // D6.L
    public final void zzg() {
        AbstractC1732v.e("resume must be called on the main UI thread.");
    }

    @Override // D6.L
    public final void zzi(InterfaceC0362b0 interfaceC0362b0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzj(O o7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzl() {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzm() {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final x1 zzn() {
        return this.f1851b;
    }

    @Override // D6.L
    public final void zzo(x1 x1Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // D6.L
    public final void zzp(zzbzr zzbzrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzq(zzbzu zzbzuVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final String zzr() {
        return null;
    }

    @Override // D6.L
    public final String zzs() {
        return null;
    }

    @Override // D6.L
    public final H0 zzt() {
        return null;
    }

    @Override // D6.L
    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // D6.L
    public final InterfaceC0362b0 zzv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // D6.L
    public final InterfaceC0407y zzw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // D6.L
    public final void zzx(zzbjs zzbjsVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzy(InterfaceC0401v interfaceC0401v) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D6.L
    public final void zzP(A0 a02) {
    }

    @Override // D6.L
    public final void zzR(InterfaceC3876a interfaceC3876a) {
    }

    @Override // D6.L
    public final void zzS(InterfaceC0373g0 interfaceC0373g0) {
    }

    @Override // D6.L
    public final void zzT(long j8) {
    }

    @Override // D6.L
    public final void zzz(boolean z2) {
    }

    @Override // D6.L
    public final void zzQ(v1 v1Var, B b5) {
    }
}
