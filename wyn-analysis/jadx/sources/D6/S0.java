package D6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbvf;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import x6.AbstractC4479j;
import x6.InterfaceC4486q;

/* loaded from: classes3.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzbvf f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f2376b;

    /* renamed from: c, reason: collision with root package name */
    public final VideoController f2377c;

    /* renamed from: d, reason: collision with root package name */
    public final R0 f2378d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0358a f2379e;

    /* renamed from: f, reason: collision with root package name */
    public AdListener f2380f;

    /* renamed from: g, reason: collision with root package name */
    public AdSize[] f2381g;

    /* renamed from: h, reason: collision with root package name */
    public y6.f f2382h;

    /* renamed from: i, reason: collision with root package name */
    public L f2383i;

    /* renamed from: j, reason: collision with root package name */
    public x6.w f2384j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC4479j f2385l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2386m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4486q f2387n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f2388o;

    public S0(AbstractC4479j abstractC4479j) {
        w1 w1Var = w1.f2529a;
        this.f2375a = new zzbvf();
        this.f2377c = new VideoController();
        this.f2378d = new R0(this);
        this.f2388o = new AtomicLong();
        this.f2385l = abstractC4479j;
        this.f2376b = w1Var;
        this.f2383i = null;
        new AtomicBoolean(false);
    }

    public static x1 a(Context context, AdSize[] adSizeArr) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.f26292n)) {
                return new x1("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        x1 x1Var = new x1(context, adSizeArr);
        x1Var.f2539j = false;
        return x1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[Catch: RemoteException -> 0x00bb, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00bb, blocks: (B:26:0x0087, B:28:0x008d, B:30:0x009b, B:32:0x00ad, B:35:0x00bd), top: B:52:0x0087, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(D6.Q0 r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.S0.b(D6.Q0):void");
    }

    public final void c(InterfaceC0358a interfaceC0358a) {
        try {
            this.f2379e = interfaceC0358a;
            L l10 = this.f2383i;
            if (l10 != null) {
                l10.zzy(interfaceC0358a != null ? new r(interfaceC0358a) : null);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void d(AdSize... adSizeArr) {
        AbstractC4479j abstractC4479j = this.f2385l;
        this.f2381g = adSizeArr;
        try {
            L l10 = this.f2383i;
            if (l10 != null) {
                l10.zzo(a(abstractC4479j.getContext(), this.f2381g));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        abstractC4479j.requestLayout();
    }

    public final void e(y6.f fVar) {
        try {
            this.f2382h = fVar;
            L l10 = this.f2383i;
            if (l10 != null) {
                l10.zzi(fVar != null ? new zzbfm(fVar) : null);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
