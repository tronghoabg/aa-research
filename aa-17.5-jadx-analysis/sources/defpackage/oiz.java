package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class oiz extends oji {
    final /* synthetic */ oja a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiz(oja ojaVar) {
        super(ojaVar);
        this.a = ojaVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new oiy(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.bluetooth_connect_permission_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.bluetooth_connect_permission_message);
    }

    @Override // defpackage.ojn
    public final boolean d() {
        return !this.a.c();
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
