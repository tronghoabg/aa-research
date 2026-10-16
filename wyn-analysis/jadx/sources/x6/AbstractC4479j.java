package x6;

import D6.C0392q;
import D6.C0395s;
import D6.H0;
import D6.InterfaceC0358a;
import D6.L;
import D6.R0;
import D6.S0;
import D6.n1;
import D6.x1;
import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: x6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4479j extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f47739a;

    public AbstractC4479j(Context context) {
        super(context);
        this.f47739a = new S0(this);
    }

    public final void a() {
        zzbix.zza(getContext());
        if (((Boolean) zzbkv.zze.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmL)).booleanValue()) {
                H6.c.f4936b.execute(new y(this, 2));
                return;
            }
        }
        S0 s02 = this.f47739a;
        s02.getClass();
        try {
            L l10 = s02.f2383i;
            if (l10 != null) {
                l10.zzc();
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void b(C4476g c4476g) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(getContext());
        if (((Boolean) zzbkv.zzf.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                H6.c.f4936b.execute(new L7.b(27, this, c4476g));
                return;
            }
        }
        this.f47739a.b(c4476g.f47736a);
    }

    public AdListener getAdListener() {
        return this.f47739a.f2380f;
    }

    public AdSize getAdSize() {
        x1 x1VarZzn;
        S0 s02 = this.f47739a;
        s02.getClass();
        try {
            L l10 = s02.f2383i;
            if (l10 != null && (x1VarZzn = l10.zzn()) != null) {
                return new AdSize(x1VarZzn.f2534e, x1VarZzn.f2531b, x1VarZzn.f2530a);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        AdSize[] adSizeArr = s02.f2381g;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        L l10;
        S0 s02 = this.f47739a;
        if (s02.k == null && (l10 = s02.f2383i) != null) {
            try {
                s02.k = l10.zzu();
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
        return s02.k;
    }

    public InterfaceC4486q getOnPaidEventListener() {
        return this.f47739a.f2387n;
    }

    public long getPlacementId() {
        S0 s02 = this.f47739a;
        AtomicLong atomicLong = s02.f2388o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            L l10 = s02.f2383i;
            if (l10 != null) {
                atomicLong.set(l10.zzU());
                return atomicLong.get();
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        return 0L;
    }

    public t getResponseInfo() {
        L l10;
        S0 s02 = this.f47739a;
        s02.getClass();
        try {
            l10 = s02.f2383i;
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        H0 h0Zzt = l10 != null ? l10.zzt() : null;
        if (h0Zzt != null) {
            return new t(h0Zzt);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i13 = ((i11 - i5) - measuredWidth) / 2;
        int i14 = ((i12 - i10) - measuredHeight) / 2;
        childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        AdSize adSize;
        int measuredHeight;
        int iB;
        int iB2;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e7) {
                H6.l.d("Unable to retrieve ad size.", e7);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i11 = adSize.f26293a;
                if (i11 == -3) {
                    iB = -1;
                } else if (i11 != -1) {
                    H6.f fVar = C0392q.f2477g.f2478a;
                    iB = H6.f.b(context, i11);
                } else {
                    iB = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i12 = adSize.f26294b;
                if (i12 == -4 || i12 == -3) {
                    iB2 = -1;
                } else if (i12 != -2) {
                    H6.f fVar2 = C0392q.f2477g.f2478a;
                    iB2 = H6.f.b(context, i12);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.heightPixels;
                    float f11 = displayMetrics.density;
                    int i13 = (int) (f10 / f11);
                    iB2 = (int) ((i13 <= 400 ? 32 : i13 <= 720 ? 50 : 90) * f11);
                }
                measuredHeight = iB2;
                measuredWidth = iB;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i5, i10);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i5), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        S0 s02 = this.f47739a;
        s02.f2380f = adListener;
        R0 r02 = s02.f2378d;
        synchronized (r02.f2372a) {
            r02.f2373b = adListener;
        }
        if (adListener == 0) {
            s02.c(null);
            return;
        }
        if (adListener instanceof InterfaceC0358a) {
            s02.c((InterfaceC0358a) adListener);
        }
        if (adListener instanceof y6.f) {
            s02.e((y6.f) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        AdSize[] adSizeArr = {adSize};
        S0 s02 = this.f47739a;
        if (s02.f2381g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        s02.d(adSizeArr);
    }

    public void setAdUnitId(String str) {
        S0 s02 = this.f47739a;
        if (s02.k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        s02.k = str;
    }

    public void setOnPaidEventListener(InterfaceC4486q interfaceC4486q) {
        S0 s02 = this.f47739a;
        s02.getClass();
        try {
            s02.f2387n = interfaceC4486q;
            L l10 = s02.f2383i;
            if (l10 != null) {
                l10.zzP(new n1(interfaceC4486q));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public void setPlacementId(long j8) {
        S0 s02 = this.f47739a;
        s02.f2388o.set(j8);
        try {
            L l10 = s02.f2383i;
            if (l10 != null) {
                l10.zzT(j8);
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
