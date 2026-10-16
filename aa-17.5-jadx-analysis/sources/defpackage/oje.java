package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class oje extends ojm {
    final /* synthetic */ ojf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oje(ojf ojfVar) {
        super(ojfVar);
        this.a = ojfVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.resolve_issue_resolution_text);
    }

    @Override // defpackage.ojm
    public final void b(Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(acxj.c())));
    }
}
