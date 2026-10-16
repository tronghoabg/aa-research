package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class krq implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public krq(android.view.View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        switch (this.b) {
            case 0:
                if (z) {
                    ((defpackage.krs) this.a).af.setVisibility(8);
                }
                break;
            case 1:
                if (!z) {
                    ((com.android.car.libraries.apphost.view.MicrophoneRecordingView) this.a).performClick();
                }
                break;
            case 2:
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel.a;
                ((android.view.View) this.a).setSelected(z);
                break;
            case 3:
                int i = com.google.android.apps.auto.components.ui.actionpanel.MaterialInCallViewExpandingActionPanel.n;
                ((android.view.View) this.a).setSelected(z);
                break;
            case 4:
                if (z) {
                    com.google.android.apps.auto.sdk.ui.PagedListView pagedListView = (com.google.android.apps.auto.sdk.ui.PagedListView) this.a;
                    pagedListView.i().d(pagedListView.i().getFocusedChild());
                }
                break;
            case 5:
                if (z) {
                    com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel expandingActionPanel = ((com.google.android.apps.auto.components.ui.media.MediaPlaybackView) this.a).o;
                    if (expandingActionPanel.c) {
                        expandingActionPanel.b(false);
                    }
                }
                break;
            case 6:
                com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator seekableLinearProgressIndicator = (com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator) this.a;
                if (view.equals(seekableLinearProgressIndicator.d) && !z) {
                    seekableLinearProgressIndicator.d(false);
                    break;
                }
                break;
            case 7:
                if (z) {
                    ((defpackage.oyg) this.a).a.h(false);
                }
                break;
            case 8:
                if (z) {
                    ((com.google.android.gearhead.appdecor.DrawerContentLayout) this.a).v.requestFocus();
                }
                break;
            case 9:
                if (z) {
                    ((com.google.android.gearhead.appdecor.DrawerContentLayout) this.a).v.requestFocus();
                }
                break;
            case 10:
                if (z) {
                    java.lang.Object obj = this.a;
                    android.util.Log.v("GH.MenuItemHolder", "Blocked SixTap scroll");
                    ((defpackage.qhm) obj).y.requestFocus();
                }
                break;
            case 11:
                defpackage.wxk wxkVar = (defpackage.wxk) this.a;
                wxkVar.f(wxkVar.k());
                break;
            case 12:
                java.lang.Object obj2 = this.a;
                defpackage.wxs wxsVar = (defpackage.wxs) obj2;
                wxsVar.b = z;
                ((defpackage.wxx) obj2).x();
                if (!z) {
                    wxsVar.k(false);
                    wxsVar.c = false;
                }
                break;
            default:
                ((com.google.android.projection.gearhead.rail.ui.ImageButtonWithAlphaFade) this.a).a();
                break;
        }
    }

    public /* synthetic */ krq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
