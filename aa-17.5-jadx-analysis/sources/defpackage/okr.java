package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okr extends oji {
    public final Context a;
    final /* synthetic */ oks b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okr(oks oksVar, Context context) {
        super(oksVar);
        this.b = oksVar;
        this.a = context;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new okq(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.getString(R.string.wifi_disabled_detected_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.getString(R.string.wifi_disabled_detected_message);
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.b.f();
    }

    @Override // defpackage.ojn
    public final xxh i() {
        return xxh.h(new Intent("android.settings.WIFI_SETTINGS").addFlags(268435456));
    }

    @Override // defpackage.ojn
    public final xxh n() {
        return xxh.h(this.a.getString(R.string.wifi_disabled_detected_notification_message));
    }
}
