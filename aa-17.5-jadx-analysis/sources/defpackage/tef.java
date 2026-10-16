package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class tef extends Fragment {
    public static final yph c = yph.c("GH.SizedFragment");
    private Context a;
    private boolean b;
    public Size d;

    public tef(int i) {
        super(i);
    }

    public final void f(int i, int i2) {
        this.d = new Size(i, i2);
        this.a = null;
        w wVar = new w(getParentFragmentManager());
        wVar.j(this);
        wVar.c();
        w wVar2 = new w(getParentFragmentManager());
        wVar2.o(this);
        wVar2.c();
        if (requireView().isLaidOut() || isInLayout()) {
            return;
        }
        requireView().requestLayout();
    }

    @Override // android.support.v4.app.Fragment
    public final Context getContext() {
        if (this.a == null) {
            if (this.d == null) {
                return super.getContext();
            }
            Context context = super.getContext();
            context.getClass();
            float f = context.getResources().getDisplayMetrics().density;
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.screenWidthDp = (int) (this.d.getWidth() / f);
            configuration.screenHeightDp = (int) (this.d.getHeight() / f);
            configuration.smallestScreenWidthDp = Math.min(configuration.screenWidthDp, configuration.screenHeightDp);
            configuration.orientation = configuration.screenWidthDp > configuration.screenHeightDp ? 2 : 1;
            if (Build.VERSION.SDK_INT > 28) {
                tee teeVar = new tee(context);
                this.a = teeVar;
                teeVar.applyOverrideConfiguration(configuration);
            } else {
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                this.a = context;
            }
        }
        return this.a;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.d == null) {
            ted tedVar = new ted(this, layoutInflater.getContext());
            tedVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.b = true;
            return tedVar;
        }
        this.b = false;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.getClass();
        viewOnCreateView.addOnLayoutChangeListener(new obt(this, 3));
        return viewOnCreateView;
    }

    @Override // android.support.v4.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return this.d == null ? super.onGetLayoutInflater(bundle) : super.onGetLayoutInflater(bundle).cloneInContext(getContext());
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (this.b) {
            return;
        }
        e(view);
    }

    public void e(View view) {
    }
}
