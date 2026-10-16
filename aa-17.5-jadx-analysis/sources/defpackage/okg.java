package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okg extends ojm {
    final /* synthetic */ okh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okg(okh okhVar) {
        super(okhVar);
        this.a = okhVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.startup_diagnostic_resolution_text);
    }

    @Override // defpackage.ojm
    protected final void b(Context context) {
        context.startActivity(oki.c());
    }
}
