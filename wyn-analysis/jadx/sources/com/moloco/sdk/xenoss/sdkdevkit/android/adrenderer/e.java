package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import Ef.H;
import Hf.C0588a0;
import Hf.k0;
import Hf.n0;
import Hf.v0;
import Hf.x0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.L;
import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.M0;

/* loaded from: classes4.dex */
public abstract class e extends FrameLayout implements m, h, f, n {

    /* renamed from: a, reason: collision with root package name */
    public final Kd.a f29882a;

    /* renamed from: b, reason: collision with root package name */
    public i f29883b;

    /* renamed from: c, reason: collision with root package name */
    public View f29884c;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f29885d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f29886e;

    /* renamed from: f, reason: collision with root package name */
    public final C2532p f29887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Kd.a scope) {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(scope, "scope");
        this.f29882a = scope;
        final int i5 = 0;
        this.f29885d = Fe.c.z(new tf.a(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29876b;

            {
                this.f29876b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f29876b.getAdLoader().isLoaded();
                    default:
                        e eVar = this.f29876b;
                        return k0.x(new C0588a0(eVar.isLoaded(), eVar.f29886e, new L(3, null, 1)), eVar.f29882a, n0.f5168a, Boolean.FALSE);
                }
            }
        });
        this.f29886e = k0.c(Boolean.FALSE);
        final int i10 = 1;
        this.f29887f = Fe.c.z(new tf.a(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29876b;

            {
                this.f29876b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.f29876b.getAdLoader().isLoaded();
                    default:
                        e eVar = this.f29876b;
                        return k0.x(new C0588a0(eVar.isLoaded(), eVar.f29886e, new L(3, null, 1)), eVar.f29882a, n0.f5168a, Boolean.FALSE);
                }
            }
        });
    }

    public static /* synthetic */ void getAdView$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, g gVar) {
        H.D(this.f29882a, null, new d(this, j8, gVar, null), 3);
    }

    public abstract void b();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public void destroy() {
        H.j(this.f29882a, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @NotNull
    public abstract h getAdLoader();

    @Nullable
    public i getAdShowListener() {
        return this.f29883b;
    }

    @Nullable
    public final View getAdView() {
        return this.f29884c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @Nullable
    public abstract /* synthetic */ l getCreativeType();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final v0 isLoaded() {
        return (v0) this.f29885d.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public v0 l() {
        return (v0) this.f29887f.getValue();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i5) {
        AbstractC3340k.e(changedView, "changedView");
        super.onVisibilityChanged(changedView, i5);
        Boolean boolValueOf = Boolean.valueOf(i5 == 0);
        x0 x0Var = this.f29886e;
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
    }

    public void setAdShowListener(@Nullable i iVar) {
        this.f29883b = iVar;
    }

    public final void setAdView(@Nullable View view) {
        View view2 = this.f29884c;
        this.f29884c = view;
        removeAllViews();
        try {
            u0.L l10 = view2 instanceof u0.L ? (u0.L) view2 : null;
            if (l10 != null) {
                M0 m02 = l10.f46181c;
                if (m02 != null) {
                    m02.dispose();
                }
                l10.f46181c = null;
                l10.requestLayout();
            }
        } catch (ClassNotFoundException e7) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "XenossBannerView", "Compose not available, skipping ComposeView disposeComposition", e7, false, 8, null);
        } catch (NoClassDefFoundError e10) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "XenossBannerView", "Compose not available, skipping ComposeView disposeComposition", e10, false, 8, null);
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
