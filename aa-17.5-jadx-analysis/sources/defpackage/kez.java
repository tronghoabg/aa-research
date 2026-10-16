package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kez implements keu {
    public Context a;
    public llu b;
    private zhc c;

    @Override // defpackage.keu
    public final zgp a(Context context, ComponentName componentName) {
        this.a = context;
        llu lluVarE = jtx.e(context, componentName, new key(this));
        this.b = lluVarE;
        lluVarE.p();
        zhc zhcVar = new zhc();
        this.c = zhcVar;
        return zhcVar;
    }

    public final void b(int i, String str) {
        this.b.q();
        zhc zhcVar = this.c;
        Context context = this.a;
        zhcVar.o(jtx.d(context, i, context.getString(R.string.extras_key_search_support_test_summary), str, this.a.getString(R.string.extras_key_search_support_test_failed_recommendation)));
    }
}
