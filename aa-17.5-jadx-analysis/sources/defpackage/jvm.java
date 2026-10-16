package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.car.app.SessionInfo;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jvm extends jsp {
    public static final /* synthetic */ int x = 0;
    public int w;

    @Override // defpackage.jsp
    public final void f(mqb mqbVar, SessionInfo sessionInfo) {
        super.f(mqbVar, sessionInfo);
        kfl.h().y();
    }

    @Override // defpackage.jsp
    protected final boolean i() {
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        if (leh.a.a().b()) {
            requireContext().setTheme(R.style.Theme_Template_Material);
        } else {
            requireContext().setTheme(R.style.Theme_Template_Material_Dark);
        }
        this.i = new jvn(1);
        h(new SessionInfo(0, "dashboard_card"));
        super.onAttach(context);
        this.j = obs.a();
    }

    @Override // defpackage.jsp, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        layoutInflater.getClass();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateView == null) {
            return null;
        }
        return new jvl(viewOnCreateView, this, requireContext());
    }

    @Override // defpackage.jsp, android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        Intent intent = Build.VERSION.SDK_INT >= 33 ? (Intent) bundleRequireArguments.getParcelable("dash_template_intent_key", Intent.class) : (Intent) bundleRequireArguments.getParcelable("dash_template_intent_key");
        if (intent != null) {
            e(intent);
        }
    }
}
