package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okm extends oji {
    final /* synthetic */ okn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okm(okn oknVar) {
        super(oknVar);
        this.a = oknVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xvy.a;
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.usb_signal_disabled_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.usb_signal_disabled_message);
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.ojn
    public final int q() {
        return 4;
    }
}
