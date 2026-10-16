package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okj extends ojm {
    final /* synthetic */ okk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okj(okk okkVar) {
        super(okkVar);
        this.a = okkVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.developer_options_action);
    }

    @Override // defpackage.ojm
    public final void b(Context context) {
        context.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
    }
}
