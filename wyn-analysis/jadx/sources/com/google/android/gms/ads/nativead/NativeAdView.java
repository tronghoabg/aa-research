package com.google.android.gms.ads.nativead;

import D6.C0386n;
import D6.C0388o;
import D6.C0392q;
import D6.C0395s;
import a2.v;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbmp;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f26335a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbmp f26336b;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f26335a = frameLayout;
        this.f26336b = c();
    }

    public final View a(String str) {
        zzbmp zzbmpVar = this.f26336b;
        if (zzbmpVar == null) {
            return null;
        }
        try {
            InterfaceC3876a interfaceC3876aZzc = zzbmpVar.zzc(str);
            if (interfaceC3876aZzc != null) {
                return (View) BinderC3877b.S(interfaceC3876aZzc);
            }
            return null;
        } catch (RemoteException e7) {
            H6.l.d("Unable to call getAssetView on delegate", e7);
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        super.bringChildToFront(this.f26335a);
    }

    public final void b(View view, String str) {
        zzbmp zzbmpVar = this.f26336b;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.zzb(str, new BinderC3877b(view));
        } catch (RemoteException e7) {
            H6.l.d("Unable to call setAssetView on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f26335a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final zzbmp c() {
        if (isInEditMode()) {
            return null;
        }
        C0388o c0388o = C0392q.f2477g.f2479b;
        FrameLayout frameLayout = this.f26335a;
        Context context = frameLayout.getContext();
        c0388o.getClass();
        return (zzbmp) new C0386n(c0388o, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbmp zzbmpVar = this.f26336b;
        if (zzbmpVar != null) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue()) {
                try {
                    zzbmpVar.zzdD(new BinderC3877b(motionEvent));
                } catch (RemoteException e7) {
                    H6.l.d("Unable to call handleTouchEvent on delegate", e7);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        H6.l.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i5) {
        super.onVisibilityChanged(view, i5);
        zzbmp zzbmpVar = this.f26336b;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.zzf(new BinderC3877b(view), i5);
        } catch (RemoteException e7) {
            H6.l.d("Unable to call onVisibilityChanged on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f26335a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f26335a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        b(aVar, "3011");
    }

    public final void setAdvertiserView(View view) {
        b(view, "3005");
    }

    public final void setBodyView(View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        zzbmp zzbmpVar = this.f26336b;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.zzdB(new BinderC3877b(view));
        } catch (RemoteException e7) {
            H6.l.d("Unable to call setClickConfirmingView on delegate", e7);
        }
    }

    public final void setHeadlineView(View view) {
        b(view, "3001");
    }

    public final void setIconView(View view) {
        b(view, "3003");
    }

    public final void setImageView(View view) {
        b(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        b(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new v(this, 3));
        mediaView.zzb(new l(this, 0));
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbmp zzbmpVar = this.f26336b;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.zzd((InterfaceC3876a) nativeAd.zza());
        } catch (RemoteException e7) {
            H6.l.d("Unable to call setNativeAd on delegate", e7);
        }
    }

    public final void setPriceView(View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(View view) {
        b(view, "3009");
    }

    public final void setStoreView(View view) {
        b(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f26335a = frameLayout;
        this.f26336b = c();
    }
}
