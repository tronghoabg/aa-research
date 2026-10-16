package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.car.CarInfo;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class xam extends lt {
    public final List a = new ArrayList();
    public final ykd e;
    private final yfy f;

    public xam(ykd ykdVar, yfy yfyVar) {
        this.e = ykdVar;
        this.f = yfyVar;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new xal(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.material3_settings_car_row, viewGroup, false));
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        xal xalVar = (xal) moVar;
        CarInfo carInfo = (CarInfo) this.a.get(i);
        xalVar.a.findViewById(R.id.content).setOnClickListener(new xae(this, xalVar, 3, null));
        Integer numValueOf = Integer.valueOf(carInfo.r);
        yfy yfyVar = this.f;
        int iIntValue = ((Integer) yfyVar.getOrDefault(numValueOf, (Integer) yfyVar.get(1))).intValue();
        xalVar.s = carInfo;
        xalVar.w = iIntValue;
        xalVar.u.setImageResource(iIntValue);
        TextView textView = xalVar.v;
        String str = carInfo.p;
        if (str == null) {
            str = carInfo.a;
        }
        textView.setText(str);
        xalVar.t.setVisibility(0);
    }
}
