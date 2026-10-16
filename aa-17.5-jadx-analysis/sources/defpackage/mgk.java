package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mgk extends mft implements mfv {
    private TextView c;

    public mgk() {
        super(R.layout.preflight_lock);
    }

    @Override // defpackage.mft
    public final void a(View view) {
        luk.b();
        new mfr(yzz.PREFLIGHT_PROJECTION_LOCK).b(this);
        TextView textView = (TextView) view.findViewById(R.id.preflight_title);
        this.c = textView;
        textView.setText(R.string.unlock_to_start);
        ImageView imageView = (ImageView) view.findViewById(R.id.preflight_lock_icon);
        imageView.setImageDrawable(getContext().getDrawable(R.drawable.quantum_gm_ic_lock_open_vd_theme_24));
        leh.a();
        ksa.d().e.fE(this, new lsh(imageView, 6));
    }

    @Override // defpackage.mfv
    public final TextView b() {
        return null;
    }

    @Override // defpackage.mfv
    public final TextView c() {
        return this.c;
    }
}
