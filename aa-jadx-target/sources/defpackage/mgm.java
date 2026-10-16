package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mgm extends android.support.v4.app.Fragment implements defpackage.mgo, defpackage.mge, defpackage.ocp, defpackage.mhv {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PreflightCarFragment");
    defpackage.mhm b;
    final defpackage.mgu c;
    final defpackage.eqe d;
    private defpackage.mhw e;
    private android.view.View f;
    private android.view.View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgm() {
        super(2131624485);
        defpackage.lem.a.a();
        this.c = new defpackage.mgk(this, 0);
        this.d = new defpackage.mga(this, 2);
    }

    private final void g(final android.widget.TextView textView, final defpackage.kry kryVar) {
        if (textView == null) {
            return;
        }
        defpackage.ksi.a.a().e.eM(this, new defpackage.eqt() { // from class: mgj
            @Override // defpackage.eqt
            public final void ea(java.lang.Object obj) {
                defpackage.yqm yqmVar = defpackage.mgm.a;
                defpackage.kry kryVar2 = kryVar;
                android.widget.TextView textView2 = textView;
                textView2.setTextColor(kryVar2.b(textView2.getContext(), (defpackage.ksh) obj));
            }
        });
    }

    @Override // defpackage.mge
    public final defpackage.mhw a() {
        defpackage.mhw mhwVar = this.e;
        mhwVar.getClass();
        return mhwVar;
    }

    public final android.view.View b() {
        android.view.View view = getView();
        view.getClass();
        return view.findViewById(2131429221);
    }

    public final void c() {
        defpackage.mgl mglVar = (defpackage.mgl) defpackage.tez.b(this, defpackage.mgl.class);
        if (mglVar.ew()) {
            return;
        }
        mglVar.ex();
    }

    @Override // defpackage.ocp
    public final void d() {
        defpackage.mhw mhwVar = this.e;
        mhwVar.getClass();
        mhwVar.a();
    }

    final void e(android.support.v4.app.Fragment fragment, boolean z) {
        defpackage.epx epxVar = ((defpackage.eqi) getLifecycle()).e;
        if (!epxVar.a(defpackage.epx.d)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4888)).y("PreflightCarFragment is not started, state: %s", epxVar);
            return;
        }
        f(fragment);
        android.view.View view = this.f;
        if (z) {
            view.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            view.setVisibility(0);
            this.g.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void f(android.support.v4.app.Fragment fragment) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4889)).u("setContentFragment");
        defpackage.w wVar = new defpackage.w(getChildFragmentManager());
        wVar.q(2131429210, fragment, null);
        wVar.c();
        defpackage.lem.a.a();
        if (fragment instanceof defpackage.mgd) {
            defpackage.mgd mgdVar = (defpackage.mgd) fragment;
            g(mgdVar.c(), defpackage.kry.s);
            g(mgdVar.b(), defpackage.kry.D);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        defpackage.tez.c(this, defpackage.mgl.class);
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4884)).u("onCreate");
        if (((defpackage.mfx) ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a()).c == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4885)).u("Session is null at onCreate, finishing!");
            c();
        } else {
            defpackage.mgr.a().b(defpackage.mkp.a.c, defpackage.ksi.a.a().c());
            getLifecycle().c(this.d);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        defpackage.mfw mfwVar = ((defpackage.mfx) ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a()).c;
        if (mfwVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4887)).u("Session is null at onStart, finishing!");
            c();
            return;
        }
        defpackage.mhm mhmVar = mfwVar.g;
        this.b = mhmVar;
        if (mhmVar != null) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4886)).w("Setting content fragment on start %s", this.b.a());
            f(this.b.b());
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        this.e = new defpackage.mhw(this, getViewLifecycleOwner());
        if (defpackage.acul.a.fF().k()) {
            android.support.constraint.Guideline guideline = (android.support.constraint.Guideline) view.findViewById(2131427850);
            defpackage.f fVar = (defpackage.f) guideline.getLayoutParams();
            if (fVar != null && guideline != null) {
                fVar.c = 0.05f;
                guideline.setLayoutParams(fVar);
            }
            android.support.constraint.Guideline guideline2 = (android.support.constraint.Guideline) view.findViewById(2131427851);
            defpackage.f fVar2 = (defpackage.f) guideline2.getLayoutParams();
            if (fVar2 != null && guideline2 != null) {
                fVar2.c = 0.95f;
                guideline2.setLayoutParams(fVar2);
            }
        }
        android.view.View viewFindViewById = view.findViewById(2131429214);
        this.f = viewFindViewById;
        viewFindViewById.setOnClickListener(new defpackage.mgi(this, 1));
        android.view.View viewFindViewById2 = view.findViewById(2131429207);
        this.g = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new defpackage.mgi(this, 0));
        defpackage.ksi.a.a().e.eM(this, new defpackage.kkr(view, 2));
        defpackage.lem.a.a();
    }
}
