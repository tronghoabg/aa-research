package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class kfc implements keu {
    static final Duration a = Duration.ofSeconds(5);
    public lmb b;
    public Context c;
    public zhc d;
    public llu e;
    public llu f;

    public static boolean b(int i) {
        return i == 3 || i == 6 || i == 8;
    }

    public static void d(llu lluVar, AaPlaybackState aaPlaybackState) {
        if ((aaPlaybackState.R() & 2) != 0) {
            lluVar.y();
        } else {
            lluVar.A();
        }
    }

    @Override // defpackage.keu
    public final zgp a(Context context, ComponentName componentName) {
        this.c = context;
        llu lluVarE = jtx.e(context, componentName, new kfa(this));
        this.e = lluVarE;
        lluVarE.p();
        this.d = new zhc();
        this.f = new kfb(this);
        return this.d;
    }

    public final void c(int i, String str) {
        zhc zhcVar = this.d;
        Context context = this.c;
        zhcVar.o(jtx.d(context, i, context.getString(R.string.play_from_search_supported_test_summary), str, this.c.getString(R.string.play_from_search_supported_test_failed_recommendation)));
        lmb lmbVar = this.b;
        if (lmbVar != null) {
            lmbVar.X(this.f);
        }
        this.e.q();
    }
}
