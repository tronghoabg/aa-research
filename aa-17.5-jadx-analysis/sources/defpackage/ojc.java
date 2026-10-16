package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojc extends oji {
    public final Context a;
    final /* synthetic */ ojd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojc(ojd ojdVar, Context context) {
        super(ojdVar);
        this.b = ojdVar;
        this.a = context;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new ojb(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.getString(R.string.charge_only_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.getString(R.string.charge_only_message);
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.b.f();
    }
}
