package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class mlk extends fh {
    public kqg g;
    public EditText h;

    public final void h(boolean z) {
        ((mlj) tec.b(this, mlj.class)).r(z);
        super.g(false, false);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getClass();
        CarInfoWrapper$Core carInfoWrapper$Core = (CarInfoWrapper$Core) arguments.getParcelable("key_car_info_core");
        carInfoWrapper$Core.getClass();
        this.g = kqg.d(carInfoWrapper$Core);
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setTitle(R.string.name_this_car);
        }
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.settings_car_name_dialog, viewGroup, false);
        this.h = (EditText) viewInflate.findViewById(R.id.name_text);
        EditText editText = (EditText) viewInflate.findViewById(R.id.manufacturer_text);
        Button button = (Button) viewInflate.findViewById(android.R.id.button1);
        Button button2 = (Button) viewInflate.findViewById(android.R.id.button2);
        this.h.setText(this.g.g());
        Optional optionalOfNullable = this.g.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((CarInfoInternal) optionalOfNullable.get()).a.a);
        }
        editText.setText((String) optionalOfNullable.orElse(""));
        button.setOnClickListener(new mli(this, i));
        button2.setOnClickListener(new mli(this, 2));
        return viewInflate;
    }
}
