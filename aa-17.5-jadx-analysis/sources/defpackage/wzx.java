package defpackage;

import android.view.View;
import android.widget.CheckBox;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wzx extends wzy {
    public static final yph s = yph.c("GH.SettingAppRowVH");
    final CheckBox t;

    public wzx(xai xaiVar, View view) {
        super(xaiVar, view);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.enable_disable_app);
        checkBox.getClass();
        this.t = checkBox;
    }

    @Override // defpackage.wzy
    protected final void E() {
        boolean zH = nrz.e().h(this.w.c.a());
        CheckBox checkBox = this.t;
        checkBox.setChecked(zH);
        nrz.e();
        checkBox.setVisibility(true != nrz.k(this.w.c.a()) ? 8 : 0);
        checkBox.setOnCheckedChangeListener(new eyj(this, 6, null));
    }

    @Override // defpackage.wzy
    public final void F() {
        nrz.e();
        if (nrz.k(this.w.c.a())) {
            this.t.toggle();
        }
    }

    @Override // defpackage.wzy
    protected final void G() {
        this.t.setOnCheckedChangeListener(null);
    }

    @Override // defpackage.wzy
    protected final boolean H() {
        return nrz.e().h(this.w.c.a());
    }
}
