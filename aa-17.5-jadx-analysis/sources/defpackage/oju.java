package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class oju extends oji {
    final /* synthetic */ ojv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oju(ojv ojvVar) {
        super(ojvVar);
        this.a = ojvVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new ojt(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.online_help_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.online_help_message);
    }

    @Override // defpackage.ojn
    public final int f() {
        return 2;
    }

    @Override // defpackage.ojn
    public final int q() {
        return 1;
    }
}
