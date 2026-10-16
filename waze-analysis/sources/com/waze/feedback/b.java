package com.waze.feedback;

import android.view.View;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.AddAStopWidget;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.j;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.k;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.l;
import com.waze.menus.SideMenuSearchBar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23854a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23855b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f23855b = i2;
        this.f23854a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [com.waze.main_screen.d.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.waze.main_screen.ae.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [h.g.a.a, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23855b) {
            case 0:
                FeedbackActivity.m((FeedbackActivity) this.f23854a);
                break;
            case 1:
                com.waze.main_screen.bottom_bars.b.a.m((com.waze.main_screen.bottom_bars.b.a) this.f23854a);
                break;
            case 2:
                com.waze.main_screen.bottom_bars.b.a.l((com.waze.main_screen.bottom_bars.b.a) this.f23854a);
                break;
            case 3:
                com.waze.main_screen.bottom_bars.scrollable_eta.d.l((com.waze.main_screen.bottom_bars.scrollable_eta.d) this.f23854a);
                break;
            case 4:
                com.waze.main_screen.bottom_bars.scrollable_eta.d.k((com.waze.main_screen.bottom_bars.scrollable_eta.d) this.f23854a);
                break;
            case 5:
                com.waze.main_screen.bottom_bars.scrollable_eta.d.m((com.waze.main_screen.bottom_bars.scrollable_eta.d) this.f23854a);
                break;
            case 6:
                com.waze.main_screen.bottom_bars.scrollable_eta.h.j((com.waze.main_screen.bottom_bars.scrollable_eta.h) this.f23854a);
                break;
            case 7:
                com.waze.main_screen.bottom_bars.scrollable_eta.h.m((com.waze.main_screen.bottom_bars.scrollable_eta.h) this.f23854a);
                break;
            case 8:
                com.waze.main_screen.bottom_bars.scrollable_eta.h.l((com.waze.main_screen.bottom_bars.scrollable_eta.h) this.f23854a);
                break;
            case 9:
                com.waze.main_screen.bottom_bars.scrollable_eta.h.n((com.waze.main_screen.bottom_bars.scrollable_eta.h) this.f23854a);
                break;
            case 10:
                com.waze.main_screen.bottom_bars.scrollable_eta.h.k((com.waze.main_screen.bottom_bars.scrollable_eta.h) this.f23854a);
                break;
            case 11:
                AddAStopWidget.n((AddAStopWidget) this.f23854a);
                break;
            case 12:
                j.l((j) this.f23854a);
                break;
            case 13:
                k.k((k) this.f23854a);
                break;
            case 14:
                l.k((l) this.f23854a);
                break;
            case 15:
                this.f23854a.b();
                break;
            case 16:
                com.waze.main_screen.g.b.a((com.waze.main_screen.g.b) this.f23854a, view);
                break;
            case 17:
                this.f23854a.b();
                break;
            case 18:
                this.f23854a.invoke();
                break;
            case 19:
                ((SideMenuSearchBar) this.f23854a).t();
                break;
            default:
                SideMenuSearchBar.n((SideMenuSearchBar) this.f23854a);
                break;
        }
    }
}
