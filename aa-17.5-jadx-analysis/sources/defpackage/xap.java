package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class xap extends Fragment {
    public static final yph a = yph.c("GH.CarDetailsFragment");
    public jlo b;
    public CarInfoInternal c;
    public boolean d;
    public final Supplier e;
    private Button f;
    private Button g;
    private TextView h;

    public xap() {
        xyc xycVarL = wub.L(new txv(15));
        xycVarL.getClass();
        this.e = new llv(xycVarL, 18);
    }

    public final void a(String str) {
        CarInfo carInfo;
        jlo jloVar = this.b;
        jloVar.getClass();
        Optional optionalFindAny = Collection.EL.stream(jloVar.d()).filter(new pcx(str, 19)).findAny();
        String str2 = null;
        CarInfoInternal carInfoInternal = (CarInfoInternal) optionalFindAny.orElse(null);
        this.c = carInfoInternal;
        if (carInfoInternal == null) {
            ((ype) ((ype) a.h()).ai((char) 10001)).u("Database Failure: data of connected car is null");
            getActivity().getFragmentManager().popBackStack();
            AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).create();
            alertDialogCreate.setMessage(getString(R.string.car_details_database_failure));
            alertDialogCreate.setButton(-3, getString(R.string.close), new xan(0));
            alertDialogCreate.show();
            return;
        }
        this.g.setOnClickListener(new xao(this, 1));
        this.f.setOnClickListener(new xao(this, 0));
        TextView textView = this.h;
        CarInfoInternal carInfoInternal2 = this.c;
        if (carInfoInternal2 != null && (str2 = (carInfo = carInfoInternal2.a).p) == null) {
            str2 = carInfo.a;
        }
        textView.setText(str2);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.material3_activity_car_details, viewGroup, false);
        this.f = (Button) viewInflate.findViewById(R.id.delete_button);
        this.g = (Button) viewInflate.findViewById(R.id.rename_button);
        this.h = (TextView) viewInflate.findViewById(R.id.car_name);
        Bundle arguments = getArguments();
        woy.O(arguments != null, "Invalid args: did not pass bundle");
        woy.O(arguments.containsKey("isRejected"), "Invalid args: did not pass isRejected boolean.");
        woy.O(arguments.containsKey("vehicleID"), "Invalid args: did not pass vehicleID string.");
        woy.O(arguments.containsKey("vehicleIconResId"), "Invalid args: did not pass vehicleIconResId int.");
        ((ImageView) viewInflate.findViewById(R.id.vehicle_icon)).setImageResource(arguments.getInt("vehicleIconResId"));
        String string = arguments.getString("vehicleID");
        this.d = arguments.getBoolean("isRejected");
        this.b = new jlo(getActivity());
        a(string);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        this.b.close();
        this.b = null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.b == null) {
            this.b = new jlo(getActivity());
        }
    }
}
