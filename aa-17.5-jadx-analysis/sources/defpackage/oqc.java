package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.widgets.EarthCompanionActivity;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class oqc extends erm {
    public static final /* synthetic */ int c = 0;
    public final eqj a;
    public final eqj b;
    private final eqm d;

    static {
        yph.c("GH.EarthViewModel");
    }

    public oqc() {
        opp oppVar = opr.a;
        eqj eqjVar = oppVar.a().g.a.a;
        this.a = eqjVar;
        afco afcoVar = tby.a;
        tby.G(eqjVar, oppVar.a().k, new ooh(5));
        eqm eqmVar = new eqm(-1);
        this.d = eqmVar;
        this.b = eqmVar;
    }

    public static final void b(Context context) {
        context.getClass();
        Intent intentAddFlags = new Intent(context, (Class<?>) EarthCompanionActivity.class).addFlags(335544320);
        intentAddFlags.getClass();
        mfe.a();
        mfe.b(context, intentAddFlags, context.getString(R.string.widget_picker_check_phone), context.getString(R.string.widget_picker_unlock_phone), context.getString(R.string.widget_picker_driving), new mfd(context.getString(R.string.widget_picker_driving_notification)), yzz.WIDGETS, 2);
    }

    public final void a(int i) {
        this.d.m(Integer.valueOf(i));
    }
}
