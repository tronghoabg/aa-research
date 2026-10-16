package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class oko extends oji {
    final /* synthetic */ okp a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oko(okp okpVar, Context context) {
        super(okpVar);
        this.a = okpVar;
        this.b = context;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xvy.a;
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.b.getString(R.string.vpn_detected_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.b.getString(R.string.vpn_detected_message);
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.a.f();
    }
}
