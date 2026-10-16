package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojt extends ojm {
    final /* synthetic */ oju a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojt(oju ojuVar) {
        super(ojuVar);
        this.a = ojuVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.online_help_resolution_text);
    }

    @Override // defpackage.ojm
    protected final void b(Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/androidauto/answer/6348029")));
    }
}
