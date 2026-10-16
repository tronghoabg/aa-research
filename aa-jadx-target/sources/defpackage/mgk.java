package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mgk implements defpackage.mgu {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public mgk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mgu
    public final void a(defpackage.mgt mgtVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.yqm yqmVar = defpackage.mgm.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4878)).y("EventListener.onEvent:%s", mgtVar.name());
            int iOrdinal = mgtVar.ordinal();
            if (iOrdinal == 0) {
                ((defpackage.mgm) this.a).c();
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4880)).u("New requirement active, updating current fragment");
                    defpackage.mfw mfwVar = ((defpackage.mfx) defpackage.luq.b().a()).c;
                    if (mfwVar == null || mfwVar.g == null) {
                        return;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4881)).u("Updating current fragment");
                    defpackage.mgm mgmVar = (defpackage.mgm) this.a;
                    mgmVar.e(mfwVar.g.b(), false);
                    mgmVar.b = mfwVar.g;
                    return;
                }
                if (iOrdinal != 3) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4879)).y("Expanded requirement events: %s - not handled", mgtVar);
                    return;
                }
            }
            ((defpackage.mgm) this.a).c();
            return;
        }
        if (i == 1) {
            defpackage.yqm yqmVar2 = defpackage.mfx.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 4857)).y("EventListener.onEvent:%s", mgtVar.name());
            defpackage.mfw mfwVar2 = (defpackage.mfw) this.a;
            defpackage.mhm mhmVar = mfwVar2.g;
            if (mhmVar != null && mhmVar.f(mgtVar, mfwVar2.l)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 4859)).y("Event handled by requirement: %s", mgtVar.name());
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 4858)).y("Event not handled by requirement: %s", mgtVar.name());
            if (mgtVar == defpackage.mgt.d) {
                mfwVar2.a(false);
                return;
            }
            return;
        }
        if (defpackage.acwj.z()) {
            java.lang.Object obj = this.a;
            android.view.View view = ((android.support.v4.app.Fragment) obj).getView();
            android.view.View viewFindViewById = view != null ? view.findViewById(2131429511) : null;
            if (mgtVar == defpackage.mgt.e || mgtVar == defpackage.mgt.j) {
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                android.widget.TextView textView = ((defpackage.mgp) obj).c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT_CAR_INTRO, defpackage.zbd.hP).l());
                return;
            }
            if (mgtVar == defpackage.mgt.k) {
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                android.widget.TextView textView2 = ((defpackage.mgp) obj).c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
        }
    }

    public /* synthetic */ mgk(defpackage.mgp mgpVar, int i) {
        this.b = i;
        this.a = mgpVar;
    }
}
