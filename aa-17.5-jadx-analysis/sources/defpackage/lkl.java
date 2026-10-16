package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lkl {
    public static final long a;
    public final afdr b;
    public final eqm c;
    public final String d;
    public final String e;
    public final afdr f;
    private final aitx g;

    static {
        long j = aisq.a;
        a = afzc.c(5, aiss.d);
    }

    public lkl(Context context, aitx aitxVar, afdr afdrVar) {
        this.g = aitxVar;
        this.b = afdrVar;
        afco afcoVar = tby.a;
        this.c = new eqm(false);
        String string = context.getString(R.string.empty_radio_tab_message);
        string.getClass();
        this.d = string;
        String string2 = context.getString(R.string.empty_radio_tab_action_label);
        string2.getClass();
        this.e = string2;
        this.f = new lkd(this, 2);
    }

    public final void a() {
        ahnc.d(this.g, null, 0, new gfw(this, (afck) null, 18), 3);
    }
}
