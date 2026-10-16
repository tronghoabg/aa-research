package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xbi extends defpackage.mr {
    public com.google.android.gms.car.CarInfo s;
    public final android.view.View t;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public int w;

    public xbi(android.view.View view) {
        super(view);
        this.t = view.findViewById(com.google.android.projection.gearhead.R.id.content);
        this.u = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.car_icon);
        this.v = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.car_text);
    }
}
