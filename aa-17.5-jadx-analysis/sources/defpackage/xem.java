package defpackage;

import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.sdk.CarAppLayout;

/* loaded from: classes3.dex */
public final class xem extends wpq {
    final /* synthetic */ CarAppLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xem(CarAppLayout carAppLayout) {
        super(null);
        this.a = carAppLayout;
    }

    @Override // defpackage.wpq
    public final void a() {
        CarAppLayout carAppLayout = this.a;
        if (carAppLayout.f) {
            try {
                carAppLayout.e.b(CarAppLayout.a());
            } catch (IllegalStateException e) {
                ((ype) ((ype) ((ype) CarAppLayout.a.h()).p(e)).ai((char) 10163)).u("failed to open demand space");
            }
            this.a.f = false;
        }
    }

    @Override // defpackage.wpq
    public final void b(int i) {
        ((ype) ((ype) CarAppLayout.a.f()).ai((char) 10164)).w("onDemandSpaceStateChanged %d", i);
        CarAppLayout carAppLayout = this.a;
        if (i == 3) {
            carAppLayout.b.setImageResource(R.drawable.ic_mic_disabled_white);
        } else {
            carAppLayout.b.setImageResource(R.drawable.ic_mic_enabled_white);
        }
    }
}
