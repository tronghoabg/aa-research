package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public enum oxd {
    Custom(0),
    Oval(R.drawable.gearhead_sdk_oval_button_ripple),
    Rectangular(R.drawable.gearhead_sdk_rectangular_button_ripple),
    Toggle(R.drawable.gearhead_sdk_toggle_button_ripple),
    RoundedRectangular(R.drawable.gearhead_sdk_rounded_rectangle_button_ripple);

    public final int f;

    oxd(int i) {
        this.f = i;
    }
}
