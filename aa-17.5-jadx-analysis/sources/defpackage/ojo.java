package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojo extends oji {
    final /* synthetic */ ojp a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojo(ojp ojpVar, Context context) {
        super(ojpVar);
        this.a = ojpVar;
        this.b = context;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xvy.a;
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.b.getString(R.string.no_5ghz_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.b.getString(R.string.no_5ghz_message);
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
