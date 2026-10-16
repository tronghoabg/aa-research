package com.waze.shared_infra.q;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.design_components.button.timer.WazeButtonTimer;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.ui.alerter.Alerter;
import com.waze.ui.b.z;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37936a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37937b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f37937b = i2;
        this.f37936a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v70, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f37937b) {
            case 0:
                return i.d((i) this.f37936a);
            case 1:
                return (WazeButtonTimer) ((Alerter) this.f37936a).findViewById(R.id.alerterTopTimer);
            case 2:
                return (LinearLayout) ((Alerter) this.f37936a).findViewById(R.id.alerterContainer);
            case 3:
                return (LinearLayout) ((Alerter) this.f37936a).findViewById(R.id.alerterContentBox);
            case 4:
                return (ImageView) ((Alerter) this.f37936a).findViewById(R.id.alerterIcon);
            case 5:
                return (WazeTextView) ((Alerter) this.f37936a).findViewById(R.id.alerterSingleString);
            case 6:
                return (LinearLayout) ((Alerter) this.f37936a).findViewById(R.id.alerterDoubleString);
            case 7:
                return (WazeTextView) ((Alerter) this.f37936a).findViewById(R.id.alerterTitle);
            case 8:
                return (WazeTextView) ((Alerter) this.f37936a).findViewById(R.id.alerterSubtitle);
            case 9:
                return (CallToActionBar) ((Alerter) this.f37936a).findViewById(R.id.alerterButtonBar);
            case 10:
                return Float.valueOf(((Alerter) this.f37936a).getResources().getDimension(R.dimen.alerter_corner_radius));
            case 11:
                return Float.valueOf(((Alerter) this.f37936a).getResources().getDimension(R.dimen.card_elevation_3));
            case 12:
                return Integer.valueOf(((Alerter) this.f37936a).getResources().getDimensionPixelSize(R.dimen.alerter_top_separator_height));
            case 13:
                return Integer.valueOf(((Alerter) this.f37936a).getResources().getDimensionPixelSize(R.dimen.alerter_top_timer_height));
            case 14:
                return (ViewGroup) ((Alerter) this.f37936a).findViewById(R.id.alerterLayout);
            case 15:
                return ((Alerter) this.f37936a).findViewById(R.id.alerterTopSeparator);
            case 16:
                int i2 = com.waze.ui.b.n.f42077a;
                ((com.waze.ui.b.p) this.f37936a).f();
                return ab.f48028a;
            case 17:
                ?? r1 = this.f37936a;
                int i3 = z.f42115a;
                return a.a.k(r1);
            case 18:
                this.f37936a.invoke(com.waze.ui.d.j.f42147a);
                return ab.f48028a;
            case 19:
                return a.a.k(this.f37936a);
            default:
                return com.waze.ui.f.b.a(this.f37936a);
        }
    }
}
