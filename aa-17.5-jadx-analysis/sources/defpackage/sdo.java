package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment;
import com.google.android.material.search.SearchView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class sdo implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public sdo(Fragment fragment, int i) {
        this.b = i;
        this.a = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                sei seiVar = (sei) this.a;
                seiVar.c(yzy.bH);
                seiVar.b().f("EVENT_USE_VANAGON_CLICKED", null);
                break;
            case 1:
                sei seiVar2 = (sei) this.a;
                seiVar2.c(yzy.bK);
                seiVar2.b().f("EVENT_INTRO_DECLINED", null);
                break;
            case 2:
                sei seiVar3 = (sei) this.a;
                seiVar3.c(yzy.bK);
                seiVar3.b().f("EVENT_INTRO_DECLINED", null);
                break;
            case 3:
                Object obj = this.a;
                if (!((sdr) obj).a) {
                    sei seiVar4 = (sei) obj;
                    seiVar4.c(yzy.bK);
                    seiVar4.b().f("EVENT_APPLICATION_INSTALLATION_CANCELLED", null);
                    break;
                } else {
                    sei seiVar5 = (sei) obj;
                    seiVar5.c(yzy.bL);
                    Bundle bundle = new Bundle();
                    Fragment fragment = (Fragment) obj;
                    bundle.putString("errorTitle", fragment.getString(R.string.common_something_went_wrong));
                    bundle.putString("errorMessage", fragment.getString(R.string.car_frx_apps_installation_aborted_message, sev.d(fragment.getContext(), ((seb) seiVar5.b().l).z())));
                    seiVar5.b().f("EVENT_APPLICATION_INSTALLATION_FAILED", bundle);
                    break;
                }
            case 4:
                sei seiVar6 = (sei) this.a;
                seiVar6.c(yzy.bH);
                seiVar6.b().f("EVENT_APPLICATION_INSTALLATION_ALLOWED", null);
                break;
            case 5:
                sei seiVar7 = (sei) this.a;
                seiVar7.c(yzy.bK);
                seiVar7.b().f("EVENT_INTRO_DECLINED", null);
                break;
            case 6:
                sei seiVar8 = (sei) this.a;
                seiVar8.c(yzy.bH);
                seiVar8.b().f("EVENT_INTRO_ACKNOWLEDGED", null);
                break;
            case 7:
                ((sfw) this.a).c().h(9);
                break;
            case 8:
                ((CheckBox) this.a).performClick();
                break;
            case 9:
                int i = PlatformSystemInfoDialogFragment.a;
                ((en) this.a).cancel();
                break;
            case 10:
                wjb wjbVar = (wjb) this.a;
                wjbVar.c.e = true;
                whn whnVarA = wjbVar.a();
                if (whnVarA != null) {
                    vuf.h.o(whnVarA);
                }
                wjbVar.i(wjbVar.d, wjbVar.j, wjbVar.h, wid.l(wjbVar.f));
                wjbVar.h();
                break;
            case 11:
                wjb wjbVar2 = (wjb) this.a;
                wjbVar2.c.e = false;
                whn whnVarA2 = wjbVar2.a();
                if (whnVarA2 != null) {
                    vuf.h.o(whnVarA2);
                }
                wjbVar2.j(wjbVar2.d, wjbVar2.j, wjbVar2.h, wid.l(wjbVar2.f));
                wjbVar2.i(wjbVar2.d, wjbVar2.j, wjbVar2.h, wid.l(wjbVar2.f));
                wjbVar2.b.dismissAllowingStateLoss();
                break;
            case 12:
                int i2 = wjt.b;
                Object obj2 = this.a;
                ((EditText) obj2).requestFocus();
                wid.i((View) obj2);
                view.scrollTo(0, view.getBottom());
                break;
            case 13:
                ((en) this.a).cancel();
                break;
            case 14:
                woa woaVar = (woa) this.a;
                int i3 = woaVar.j;
                if (i3 == 2) {
                    woaVar.h(1);
                } else if (i3 == 1) {
                    woaVar.h(2);
                }
                woaVar.d(woaVar.getView());
                break;
            case 15:
                wod wodVar = (wod) this.a;
                wodVar.i.setEnabled(wodVar.h().c());
                wodVar.h.toggle();
                wodVar.g = wodVar.g != 1 ? 1 : 0;
                wodVar.m(wodVar.h);
                wodVar.n(wodVar.h);
                wodVar.k();
                break;
            case 16:
                ((wod) this.a).p();
                break;
            case 17:
                ((wod) this.a).j(view);
                break;
            case 18:
                ((SearchView) this.a).c();
                break;
            case 19:
                SearchView searchView = (SearchView) this.a;
                searchView.k.setText("");
                searchView.j.setText("");
                searchView.d();
                break;
            default:
                ((SearchView) this.a).i();
                break;
        }
    }

    public /* synthetic */ sdo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
