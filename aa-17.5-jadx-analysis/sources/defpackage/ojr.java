package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojr extends oji {
    public final Context a;
    final /* synthetic */ ojs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojr(ojs ojsVar, Context context) {
        super(ojsVar);
        this.b = ojsVar;
        this.a = context;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new ojq(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.getString(R.string.no_hfp_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.getString(R.string.no_hfp_message);
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.b.f();
    }
}
