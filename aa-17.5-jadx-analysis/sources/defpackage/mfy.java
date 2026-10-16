package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mfy extends Fragment implements mfv {
    public static final yph a = yph.c("GH.PreflightNotifListnr");
    private TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfy() {
        super(R.layout.preflight_notification_listener);
        leh.a();
    }

    @Override // defpackage.mfv
    public final TextView b() {
        return null;
    }

    @Override // defpackage.mfv
    public final TextView c() {
        return this.b;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) throws AssertionError {
        super.onAttach(context);
        tec.c(this, mfw.class);
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        lvl.E().b("NLPF.PollerToken");
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        view.getClass();
        view.findViewById(R.id.preflight_continue_button).requestFocus();
        lvl.E().a(lgv.b().a(), new mfx(), "NLPF.PollerToken");
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        luk.b();
        new mfr(yzz.PREFLIGHT_NOTIFICATION_LISTENER).b(this);
        ((ImageView) view.findViewById(R.id.preflight_notification_listener_graphic)).setImageDrawable(getContext().getDrawable(R.drawable.notification_listener_illustration));
        TextView textView = (TextView) view.findViewById(R.id.preflight_title);
        this.b = textView;
        textView.setText(R.string.notification_listener_car_screen_title);
        View viewFindViewById = view.findViewById(R.id.preflight_continue_button);
        viewFindViewById.setFocusedByDefault(true);
        viewFindViewById.setOnClickListener(new mfz(((mfw) tec.b(this, mfw.class)).a(), new kep(this, 13)));
        leh.a();
    }
}
