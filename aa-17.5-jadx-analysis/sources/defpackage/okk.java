package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okk extends oji {
    final /* synthetic */ okl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okk(okl oklVar) {
        super(oklVar);
        this.a = oklVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new okj(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.usb_debugging_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.usb_debugging_message);
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
