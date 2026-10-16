package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mgi extends Fragment implements mfv {
    public static final yph a = yph.c("GH.PreflightDsa");
    private TextView b;
    private TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgi() {
        super(R.layout.preflight_dsa);
        leh.a();
    }

    @Override // defpackage.mfv
    public final TextView b() {
        return this.c;
    }

    @Override // defpackage.mfv
    public final TextView c() {
        return this.b;
    }

    @Override // android.support.v4.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return ldz.a().b() ? layoutInflaterOnGetLayoutInflater.cloneInContext(kfl.j(layoutInflaterOnGetLayoutInflater.getContext())) : layoutInflaterOnGetLayoutInflater;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        view.getClass();
        view.findViewById(R.id.preflight_later_button).requestFocus();
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        luk.b();
        mfr mfrVar = new mfr(yzz.PREFLIGHT_DO_NOT_SHOW_AGAIN);
        mfrVar.b(this);
        this.b = (TextView) view.findViewById(R.id.preflight_title);
        this.c = (TextView) view.findViewById(R.id.preflight_body);
        view.findViewById(R.id.preflight_never_button).setOnClickListener(new jmq(this, mfrVar, 10, null));
        view.findViewById(R.id.preflight_later_button).setOnClickListener(new kep(mfrVar, 14));
        leh.a();
        ImageView imageView = (ImageView) view.findViewById(R.id.preflight_dsa_icon);
        imageView.setImageDrawable(getContext().getDrawable(R.drawable.gs_android_auto_vd_theme_24));
        leh.a();
        ksa.d().e.fE(this, new lsh(imageView, 5));
    }
}
