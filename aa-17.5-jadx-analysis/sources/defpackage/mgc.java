package defpackage;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mgc implements mgm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mgc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mgm
    public final void a(mgl mglVar) {
        int i = this.b;
        if (i == 0) {
            yph yphVar = mge.a;
            ((ype) ((ype) yphVar.f()).ai((char) 4875)).y("EventListener.onEvent:%s", mglVar.name());
            int iOrdinal = mglVar.ordinal();
            if (iOrdinal == 0) {
                ((mge) this.a).c();
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    ((ype) ((ype) yphVar.f()).ai((char) 4877)).u("New requirement active, updating current fragment");
                    mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
                    if (mfoVar == null || mfoVar.g == null) {
                        return;
                    }
                    ((ype) ((ype) yphVar.f()).ai((char) 4878)).u("Updating current fragment");
                    mge mgeVar = (mge) this.a;
                    mgeVar.e(mfoVar.g.b(), false);
                    mgeVar.b = mfoVar.g;
                    return;
                }
                if (iOrdinal != 3) {
                    ((ype) ((ype) yphVar.h()).ai((char) 4876)).y("Expanded requirement events: %s - not handled", mglVar);
                    return;
                }
            }
            ((mge) this.a).c();
            return;
        }
        if (i == 1) {
            yph yphVar2 = mfp.a;
            ((ype) ((ype) yphVar2.f()).ai((char) 4854)).y("EventListener.onEvent:%s", mglVar.name());
            mfo mfoVar2 = (mfo) this.a;
            mhf mhfVar = mfoVar2.g;
            if (mhfVar != null && mhfVar.f(mglVar, mfoVar2.l)) {
                ((ype) ((ype) yphVar2.f()).ai((char) 4856)).y("Event handled by requirement: %s", mglVar.name());
                return;
            }
            ((ype) ((ype) yphVar2.f()).ai((char) 4855)).y("Event not handled by requirement: %s", mglVar.name());
            if (mglVar == mgl.d) {
                mfoVar2.a(false);
                return;
            }
            return;
        }
        if (acvh.a.gu().x()) {
            Object obj = this.a;
            View view = ((Fragment) obj).getView();
            View viewFindViewById = view != null ? view.findViewById(R.id.show_authorization_dialog_button) : null;
            if (mglVar == mgl.e || mglVar == mgl.j) {
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                TextView textView = ((mgh) obj).c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, yzz.PREFLIGHT_CAR_INTRO, yzy.hP).l());
                return;
            }
            if (mglVar == mgl.k) {
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                TextView textView2 = ((mgh) obj).c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
        }
    }

    public /* synthetic */ mgc(mgh mghVar, int i) {
        this.b = i;
        this.a = mghVar;
    }
}
