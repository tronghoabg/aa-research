package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class oka extends oji {
    final /* synthetic */ okb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oka(okb okbVar) {
        super(okbVar);
        this.a = okbVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new ojz(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.connection_rejected_cars_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.connection_rejected_cars_message);
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
