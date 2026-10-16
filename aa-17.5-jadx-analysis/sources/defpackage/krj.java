package defpackage;

import android.util.Log;
import android.view.View;
import com.android.car.libraries.apphost.view.MicrophoneRecordingView;
import com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel;
import com.google.android.apps.auto.components.ui.actionpanel.MaterialInCallViewExpandingActionPanel;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.gearhead.appdecor.DrawerContentLayout;
import com.google.android.projection.gearhead.rail.ui.ImageButtonWithAlphaFade;

/* loaded from: classes2.dex */
public final /* synthetic */ class krj implements View.OnFocusChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krj(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.b) {
            case 0:
                if (z) {
                    ((krl) this.a).af.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    ((MicrophoneRecordingView) this.a).performClick();
                    break;
                }
                break;
            case 2:
                yph yphVar = ExpandingActionPanel.a;
                ((View) this.a).setSelected(z);
                break;
            case 3:
                int i = MaterialInCallViewExpandingActionPanel.n;
                ((View) this.a).setSelected(z);
                break;
            case 4:
                if (z) {
                    PagedListView pagedListView = (PagedListView) this.a;
                    pagedListView.i().d(pagedListView.i().getFocusedChild());
                    break;
                }
                break;
            case 5:
                if (z) {
                    ExpandingActionPanel expandingActionPanel = ((MediaPlaybackView) this.a).o;
                    if (expandingActionPanel.c) {
                        expandingActionPanel.b(false);
                        break;
                    }
                }
                break;
            case 6:
                SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) this.a;
                if (view.equals(seekableLinearProgressIndicator.d) && !z) {
                    seekableLinearProgressIndicator.d(false);
                    break;
                }
                break;
            case 7:
                if (z) {
                    ((oxj) this.a).a.h(false);
                    break;
                }
                break;
            case 8:
                if (z) {
                    ((DrawerContentLayout) this.a).v.requestFocus();
                    break;
                }
                break;
            case 9:
                if (z) {
                    ((DrawerContentLayout) this.a).v.requestFocus();
                    break;
                }
                break;
            case 10:
                if (z) {
                    Object obj = this.a;
                    Log.v("GH.MenuItemHolder", "Blocked SixTap scroll");
                    ((qgr) obj).y.requestFocus();
                    break;
                }
                break;
            case 11:
                wwn wwnVar = (wwn) this.a;
                wwnVar.f(wwnVar.k());
                break;
            case 12:
                Object obj2 = this.a;
                www wwwVar = (www) obj2;
                wwwVar.b = z;
                ((wxb) obj2).x();
                if (!z) {
                    wwwVar.k(false);
                    wwwVar.c = false;
                    break;
                }
                break;
            default:
                ((ImageButtonWithAlphaFade) this.a).a();
                break;
        }
    }

    public /* synthetic */ krj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
