package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum oya {
    Custom(0),
    Oval(com.google.android.projection.gearhead.R.drawable.gearhead_sdk_oval_button_ripple),
    Rectangular(com.google.android.projection.gearhead.R.drawable.gearhead_sdk_rectangular_button_ripple),
    Toggle(com.google.android.projection.gearhead.R.drawable.gearhead_sdk_toggle_button_ripple),
    RoundedRectangular(com.google.android.projection.gearhead.R.drawable.gearhead_sdk_rounded_rectangle_button_ripple);

    public final int f;

    oya(int i) {
        this.f = i;
    }
}
