package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.car.CarInfo;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xal extends mo {
    public CarInfo s;
    public final View t;
    public final ImageView u;
    public final TextView v;
    public int w;

    public xal(View view) {
        super(view);
        this.t = view.findViewById(R.id.content);
        this.u = (ImageView) view.findViewById(R.id.car_icon);
        this.v = (TextView) view.findViewById(R.id.car_text);
    }
}
