package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final class mqq extends mqz {
    final int b;
    private static final ComponentName g = new ComponentName(RemoteApiConstants.NOW_PACKAGE, "");
    public static final yph a = yph.c("GH.AssistantAction");

    private mqq(GhIcon ghIcon, String str, int i, String str2) {
        super(new mqc(new ComponentName(str2, "")), ghIcon, str, 0, null);
        this.b = i;
    }

    public static SharedPreferences b() {
        return mki.a.c.getSharedPreferences("AssistantAction", 0);
    }

    public static mqq d(int i, int i2, int i3, String str) {
        Context context = mki.a.c;
        return new mqq(GhIcon.p(context, i), context.getResources().getString(i2), i3, str);
    }

    public static yfq e(qrn qrnVar, boolean z) {
        yfl yflVar = new yfl(4);
        int i = 15;
        Stream map = Collection.EL.stream(lem.a().b(qrnVar, nyj.b())).filter(new lye(16)).map(new miw(15));
        int i2 = yfq.d;
        Collector collector = ycm.a;
        if (!kmo.d(acnp.c(), (yfq) map.collect(collector))) {
            yflVar.i(d(R.drawable.ic_news_assistantaction, R.string.gearhead_assistant_action_news_label, R.string.gearhead_assistant_action_news_query, "NewsAssistantAction"));
        }
        yflVar.i(d(R.drawable.ic_reminder_assistantaction, R.string.gearhead_assistant_action_reminder_label, R.string.gearhead_assistant_action_reminder_query, "ReminderAssistantAction"));
        yflVar.i(d(R.drawable.ic_weather_assistantaction, R.string.gearhead_assistant_action_weather_label, R.string.gearhead_assistant_action_weather_query, "WeatherAssistantAction"));
        yfq yfqVarG = yflVar.g();
        if (!z) {
            int i3 = ((yls) yfqVarG).c;
            return yfqVarG;
        }
        yfq yfqVar = (yfq) Collection.EL.stream(yfqVarG).filter(new lye(i)).collect(collector);
        yfqVar.size();
        return yfqVar;
    }

    @Override // defpackage.mqz
    public final void c() {
        if ("NewsAssistantAction".equals(this.c.a().getPackageName()) && g.equals(lnm.y().a())) {
            ebf.j().o(yzz.APP_LAUNCHER, yzy.kQ);
        }
        kfl.h().A(this.b, osv.GEARHEAD_LAUNCHER_APP_CLICKED);
    }
}
