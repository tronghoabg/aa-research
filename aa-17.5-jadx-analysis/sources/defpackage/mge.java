package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mge extends Fragment implements mgg, mfw, obu, mho {
    public static final yph a = yph.c("GH.PreflightCarFragment");
    mhf b;
    final mgm c;
    final epy d;
    private mhp e;
    private View f;
    private View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mge() {
        super(R.layout.preflight_fragment);
        leh.a.a();
        this.c = new mgc(this, 0);
        this.d = new mfs(this, 2);
    }

    private final void g(final TextView textView, final krr krrVar) {
        if (textView == null) {
            return;
        }
        ksa.a.a().e.fE(this, new eqn() { // from class: mgb
            @Override // defpackage.eqn
            public final void eS(Object obj) {
                yph yphVar = mge.a;
                krr krrVar2 = krrVar;
                TextView textView2 = textView;
                textView2.setTextColor(krrVar2.b(textView2.getContext(), (krz) obj));
            }
        });
    }

    @Override // defpackage.mfw
    public final mhp a() {
        mhp mhpVar = this.e;
        mhpVar.getClass();
        return mhpVar;
    }

    public final View b() {
        View view = getView();
        view.getClass();
        return view.findViewById(R.id.preflight_toast_container);
    }

    public final void c() {
        Object objA = tec.a(this, mgd.class);
        objA.getClass();
        mgd mgdVar = (mgd) objA;
        if (mgdVar.fo()) {
            return;
        }
        mgdVar.fp();
    }

    @Override // defpackage.obu
    public final void d() {
        mhp mhpVar = this.e;
        mhpVar.getClass();
        mhpVar.a();
    }

    final void e(Fragment fragment, boolean z) {
        eps epsVar = ((eqc) getLifecycle()).e;
        if (!epsVar.a(eps.d)) {
            ((ype) ((ype) a.h()).ai((char) 4885)).y("PreflightCarFragment is not started, state: %s", epsVar);
            return;
        }
        f(fragment);
        View view = this.f;
        if (z) {
            view.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            view.setVisibility(0);
            this.g.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void f(Fragment fragment) {
        ((ype) ((ype) a.f()).ai((char) 4886)).u("setContentFragment");
        w wVar = new w(getChildFragmentManager());
        wVar.q(R.id.preflight_content, fragment, null);
        wVar.c();
        leh.a.a();
        if (fragment instanceof mfv) {
            mfv mfvVar = (mfv) fragment;
            g(mfvVar.c(), krr.s);
            g(mfvVar.b(), krr.D);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) throws AssertionError {
        super.onAttach(context);
        tec.c(this, mgd.class);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4881)).u("onCreate");
        if (((mfp) ((mfm) mki.a.i(mfm.class)).a()).c == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 4882)).u("Session is null at onCreate, finishing!");
            c();
        } else {
            mgj.a().b(mki.a.c, ksa.a.a().c());
            getLifecycle().c(this.d);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
        if (mfoVar == null) {
            ((ype) ((ype) a.h()).ai((char) 4884)).u("Session is null at onStart, finishing!");
            c();
            return;
        }
        mhf mhfVar = mfoVar.g;
        this.b = mhfVar;
        if (mhfVar != null) {
            ((ype) ((ype) a.f()).ai((char) 4883)).w("Setting content fragment on start %s", this.b.a());
            f(this.b.b());
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.e = new mhp(this, getViewLifecycleOwner());
        if (actj.a.gu().k()) {
            Guideline guideline = (Guideline) view.findViewById(R.id.content_left_guideline);
            f fVar = (f) guideline.getLayoutParams();
            if (fVar != null && guideline != null) {
                fVar.c = 0.05f;
                guideline.setLayoutParams(fVar);
            }
            Guideline guideline2 = (Guideline) view.findViewById(R.id.content_right_guideline);
            f fVar2 = (f) guideline2.getLayoutParams();
            if (fVar2 != null && guideline2 != null) {
                fVar2.c = 0.95f;
                guideline2.setLayoutParams(fVar2);
            }
        }
        View viewFindViewById = view.findViewById(R.id.preflight_exit_button);
        this.f = viewFindViewById;
        viewFindViewById.setOnClickListener(new mga(this, 1));
        View viewFindViewById2 = view.findViewById(R.id.preflight_back_button);
        this.g = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new mga(this, 0));
        ksa.a.a().e.fE(this, new kkl(view, 2));
        leh.a.a();
    }
}
