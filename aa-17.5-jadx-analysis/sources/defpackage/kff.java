package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.projection.gearhead.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kff implements keu {
    public Context a;
    public Map b;
    public yfl c;
    public int d;
    public llu e;
    private zhc f;

    @Override // defpackage.keu
    public final zgp a(Context context, ComponentName componentName) {
        this.a = context;
        llu lluVarE = jtx.e(context, componentName, new kfd(this));
        this.e = lluVarE;
        lluVarE.p();
        this.f = new zhc();
        this.b = new HashMap();
        int i = yfq.d;
        this.c = new yfl(4);
        this.d = 0;
        return this.f;
    }

    public final void b(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        this.e.M(str, new kfe(this));
        this.d++;
    }

    public final void c(int i, String str) {
        this.e.q();
        zhc zhcVar = this.f;
        Context context = this.a;
        zhcVar.o(jtx.d(context, i, context.getString(R.string.uri_image_validation_test_summary), str, this.a.getString(R.string.uri_image_validation_test_failed_recommendation)));
    }
}
