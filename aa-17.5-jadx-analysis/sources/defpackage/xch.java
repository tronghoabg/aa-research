package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class xch extends sei {
    public boolean a;

    static {
        yph.c("GH.FRX");
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.frx_sensitive_permissions, viewGroup, false);
        roc.bq(layoutInflater, (ViewGroup) viewInflate);
        Button button = (Button) viewInflate.findViewById(R.id.left_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.right_button);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        ((ImageView) viewInflate.findViewById(R.id.illustration)).setImageDrawable(getActivity().getDrawable(2131231524));
        textView.setText(R.string.sensitive_permissions_fragment_title);
        textView2.setText(getString(R.string.sensitive_permissions_fragment_body_text));
        button.setVisibility(0);
        button.setText(getString(R.string.frx_no_thanks));
        button.setOnClickListener(new xao(this, 16));
        xcj xcjVar = (xcj) b().l;
        button2.setVisibility(0);
        button2.setText(R.string.sensitive_permissions_fragment_right_button_text);
        button2.setOnClickListener(new xae(this, xcjVar, 4));
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        xcj xcjVar = (xcj) b().l;
        if (this.a) {
            if (xcjVar.m()) {
                b().f("EVENT_ALL_SENSITIVE_PERMISSIONS_GRANTED", null);
                this.a = false;
                return;
            }
            rrb rrbVarH = rrc.h(yxy.FRX, yzz.FRX_SENSITIVE_PERMISSIONS, yzy.bW);
            List listF = xcjVar.f();
            if (rrbVarH.l != null) {
                throw new IllegalStateException("Cannot set permissions after calling permissionsBuilder()");
            }
            rrbVarH.m = yfq.o(listF);
            ebf.j().F(rrbVarH.l());
        }
    }
}
