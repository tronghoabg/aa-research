package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.SessionInfo;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jvo extends jsp {
    private final boolean w;
    private boolean x;
    private boolean y;

    public jvo(boolean z) {
        this.w = z;
    }

    @Override // defpackage.jsp
    protected final boolean i() {
        return false;
    }

    public final void k() {
        Boolean bool;
        if (this.y || !this.x || (bool = (Boolean) this.d.e()) == null || !bool.booleanValue()) {
            return;
        }
        tfk tfkVar = tfk.a;
        tfkVar.d(tfj.GEARHEAD_ASSISTANT_COLD_STARTUP, 1);
        tfkVar.d(tfj.GEARHEAD_ASSISTANT_WARM_STARTUP, 1);
        this.y = true;
    }

    public final void l(boolean z) {
        this.x = z;
        k();
        TemplateView templateViewD = d(this.p, this.q);
        hln hlnVarO = templateViewD != null ? templateViewD.o() : null;
        if (z) {
            if (hlnVarO != null) {
                hlnVarO.e();
            }
        } else {
            this.y = false;
            if (hlnVarO != null) {
                hlnVarO.c();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        requireContext().setTheme(R.style.Theme_Template_Material);
        this.i = new jvn(0);
        h(new SessionInfo(0, "voice_plate"));
        super.onAttach(context);
    }

    @Override // defpackage.jsp, android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        super.onViewCreated(view, bundle);
        this.d.fE(getViewLifecycleOwner(), new ewg(new hku(this, 17), 6));
        e(new Intent().setComponent(kyg.b).putExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH", (Parcelable) null).putExtra("com.google.android.apps.auto.components.apphost.EXTRA_WIDGET_APP", true));
        TemplateView templateViewD = d(this.p, this.q);
        hln hlnVarO = templateViewD != null ? templateViewD.o() : null;
        if (this.w && hlnVarO != null) {
            hlnVarO.setZOrderOnTop(true);
            hlnVarO.g();
            hlnVarO.d();
        }
        if (this.x || hlnVarO == null) {
            return;
        }
        hlnVarO.c();
    }

    public jvo() {
        this(true);
    }
}
