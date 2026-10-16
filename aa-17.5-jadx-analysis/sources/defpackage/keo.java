package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class keo implements gpd {
    private static Context a;
    private gpc b;
    private final geu c;

    public keo(geu geuVar) {
        this.c = geuVar;
    }

    public static Context c(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        if (acob.O()) {
            Context context2 = a;
            if (context2 == null || !context2.getResources().getConfiguration().equals(configuration)) {
                a = mki.a.c.createConfigurationContext(configuration);
            }
            return a;
        }
        Context contextCreateConfigurationContext = a;
        if (contextCreateConfigurationContext == null) {
            contextCreateConfigurationContext = mki.a.c.createConfigurationContext(configuration);
            a = contextCreateConfigurationContext;
        }
        contextCreateConfigurationContext.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        return a;
    }

    @Override // defpackage.gpd
    public final gpc a() {
        gpc gpcVar = this.b;
        if (gpcVar != null) {
            return gpcVar;
        }
        geu geuVar = this.c;
        gpc gpcVar2 = (gpc) LayoutInflater.from(new ContextThemeWrapper(c(geuVar), geuVar.getTheme())).inflate(R.layout.map_view_container_layout, (ViewGroup) null);
        gpcVar2.l(geuVar);
        this.b = gpcVar2;
        return gpcVar2;
    }

    @Override // defpackage.gpd
    public final /* synthetic */ void b() {
        a().h(eps.c);
    }
}
