package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojx extends oji {
    final /* synthetic */ ojy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojx(ojy ojyVar) {
        super(ojyVar);
        this.a = ojyVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new ojw(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.usb_only_connect_to_known_cars_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.usb_only_connect_to_known_cars_message);
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.a.f();
    }
}
