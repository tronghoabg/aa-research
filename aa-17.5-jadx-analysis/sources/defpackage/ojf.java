package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojf extends oji {
    final /* synthetic */ ojg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojf(ojg ojgVar) {
        super(ojgVar);
        this.a = ojgVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new oje(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.usb_flaky_cable_detector_cable_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.usb_flaky_cable_detector_message);
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.a.f();
    }
}
