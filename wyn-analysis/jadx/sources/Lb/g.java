package Lb;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.common.tpx;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.ui.view.k;
import f8.j;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7068b;

    public /* synthetic */ g(Object obj, int i5) {
        this.f7067a = i5;
        this.f7068b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f7067a) {
            case 0:
                return k.a((k) this.f7068b, view, motionEvent);
            case 1:
                return ((tpx) this.f7068b).uef(view, motionEvent);
            case 2:
                return AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) this.f7068b, view, motionEvent);
            case 3:
                j jVar = (j) this.f7068b;
                jVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - jVar.f35149o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        jVar.f35147m = false;
                    }
                    jVar.u();
                    jVar.f35147m = true;
                    jVar.f35149o = System.currentTimeMillis();
                }
                return false;
            default:
                return r1.a((r1) this.f7068b, view, motionEvent);
        }
    }
}
