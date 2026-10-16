package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MediaView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/vungle/ads/nativead/a;", "getVideoControl", "()Lcom/vungle/ads/nativead/a;", "Lcom/vungle/ads/nativead/NativeVideoListener;", "listener", "Lef/C;", "setNativeVideoListener", "(Lcom/vungle/ads/nativead/NativeVideoListener;)V", "getDuration", "()I", "getCurrentTime", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class MediaView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public NativeVideoListener f33752a;

    /* renamed from: b, reason: collision with root package name */
    public e f33753b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC3340k.e(context, "context");
    }

    private final com.vungle.ads.nativead.a getVideoControl() {
        ViewParent viewParent = this.f33753b;
        if (viewParent instanceof com.vungle.ads.nativead.a) {
            return (com.vungle.ads.nativead.a) viewParent;
        }
        return null;
    }

    public final void a(r1 internal) throws Throwable {
        AbstractC3340k.e(internal, "internal");
        if (internal.s()) {
            if (this.f33753b == null) {
                Context context = getContext();
                AbstractC3340k.d(context, "context");
                n nVar = new n(context, internal);
                nVar.setNativeVideoListener(this.f33752a);
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
                m2Var.a((Long) 1L);
                AnalyticsClient.a(analyticsClient, m2Var, internal.e(), 4);
                this.f33753b = nVar;
            }
        } else if (this.f33753b == null) {
            Context context2 = getContext();
            AbstractC3340k.d(context2, "context");
            e eVar = new e(context2, internal);
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            m2 m2Var2 = new m2(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
            m2Var2.a((Long) 2L);
            AnalyticsClient.a(analyticsClient2, m2Var2, internal.e(), 4);
            this.f33753b = eVar;
        }
        e eVar2 = this.f33753b;
        if (eVar2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            eVar2.setLayoutParams(layoutParams);
            if (!AbstractC3340k.a(eVar2.getParent(), this)) {
                ViewGroup viewGroup = (ViewGroup) eVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(eVar2);
                }
                addView(eVar2);
            }
            Context context3 = getContext();
            AbstractC3340k.d(context3, "context");
            eVar2.a(context3);
        }
    }

    public final int getCurrentTime() {
        com.vungle.ads.nativead.a videoControl = getVideoControl();
        return (videoControl != null ? ((n) videoControl).getCurrentTime() : 0) / 1000;
    }

    public final int getDuration() {
        com.vungle.ads.nativead.a videoControl = getVideoControl();
        return (videoControl != null ? ((n) videoControl).getDuration() : 0) / 1000;
    }

    public final void setNativeVideoListener(@NotNull NativeVideoListener listener) {
        AbstractC3340k.e(listener, "listener");
        this.f33752a = listener;
        e eVar = this.f33753b;
        n nVar = eVar instanceof n ? (n) eVar : null;
        if (nVar == null) {
            return;
        }
        nVar.setNativeVideoListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3340k.e(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        AbstractC3340k.e(context, "context");
    }
}
