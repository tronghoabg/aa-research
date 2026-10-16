package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tfc extends android.support.v4.app.Fragment {
    public static final defpackage.yqm c = defpackage.yqm.c("GH.SizedFragment");
    private android.content.Context a;
    private boolean b;
    public android.util.Size d;

    public tfc(int i) {
        super(i);
    }

    public final void f(int i, int i2) {
        this.d = new android.util.Size(i, i2);
        this.a = null;
        defpackage.w wVar = new defpackage.w(getParentFragmentManager());
        wVar.j(this);
        wVar.c();
        defpackage.w wVar2 = new defpackage.w(getParentFragmentManager());
        wVar2.o(this);
        wVar2.c();
        if (requireView().isLaidOut() || isInLayout()) {
            return;
        }
        requireView().requestLayout();
    }

    @Override // android.support.v4.app.Fragment
    public final android.content.Context getContext() {
        if (this.a == null) {
            if (this.d == null) {
                return super.getContext();
            }
            android.content.Context context = super.getContext();
            context.getClass();
            float f = context.getResources().getDisplayMetrics().density;
            android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
            configuration.screenWidthDp = (int) (this.d.getWidth() / f);
            configuration.screenHeightDp = (int) (this.d.getHeight() / f);
            configuration.smallestScreenWidthDp = java.lang.Math.min(configuration.screenWidthDp, configuration.screenHeightDp);
            configuration.orientation = configuration.screenWidthDp > configuration.screenHeightDp ? 2 : 1;
            if (android.os.Build.VERSION.SDK_INT > 28) {
                defpackage.tfb tfbVar = new defpackage.tfb(context);
                this.a = tfbVar;
                tfbVar.applyOverrideConfiguration(configuration);
            } else {
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                this.a = context;
            }
        }
        return this.a;
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (this.d == null) {
            defpackage.tfa tfaVar = new defpackage.tfa(this, layoutInflater.getContext());
            tfaVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.b = true;
            return tfaVar;
        }
        this.b = false;
        android.view.View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.getClass();
        viewOnCreateView.addOnLayoutChangeListener(new defpackage.oco(this, 3));
        return viewOnCreateView;
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return this.d == null ? super.onGetLayoutInflater(bundle) : super.onGetLayoutInflater(bundle).cloneInContext(getContext());
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        if (this.b) {
            return;
        }
        e(view);
    }

    public void e(android.view.View view) {
    }
}
