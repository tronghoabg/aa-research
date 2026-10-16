package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okq extends ojm {
    final /* synthetic */ okr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okq(okr okrVar) {
        super(okrVar);
        this.a = okrVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.getString(R.string.turn_wifi_on_resolution_text);
    }

    @Override // defpackage.ojm
    public final void b(Context context) {
        context.startActivity(new Intent("android.settings.WIFI_SETTINGS").addFlags(268435456));
    }
}
