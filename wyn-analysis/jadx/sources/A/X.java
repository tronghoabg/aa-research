package A;

import N.InterfaceC0742p;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import e.C2434b;

/* loaded from: classes.dex */
public final class X implements N.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f95b;

    public /* synthetic */ X(Object obj, int i5) {
        this.f94a = i5;
        this.f95b = obj;
    }

    @Override // N.B
    public final void dispose() {
        switch (this.f94a) {
            case 0:
                U u10 = (U) this.f95b;
                u10.f84f.setValue(Long.MIN_VALUE);
                Object value = u10.f81c.getValue();
                S3.c cVar = u10.f79a;
                ((N.Y) cVar.f10936b).setValue(value);
                u10.f83e.setValue(0L);
                ((N.Y) cVar.f10937c).setValue(Boolean.FALSE);
                break;
            case 1:
                ((G9.e) this.f95b).H();
                break;
            case 2:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i) this.f95b).a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.f31673a);
                break;
            case 3:
                WebView webView = (WebView) this.f95b;
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                    break;
                }
                break;
            case 4:
                ((C2434b) this.f95b).e();
                break;
            case 5:
                ((InterfaceC0742p) this.f95b).dispose();
                break;
            default:
                ((u0.O) this.f95b).f46161a.invoke();
                break;
        }
    }
}
