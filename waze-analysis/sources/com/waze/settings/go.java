package com.waze.settings;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.realtime.RealtimeNativeManager;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class go implements com.waze.settings.tree.c.h {
    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        String strSubstring = RealtimeNativeManager.getInstance().getServerGeoConfig().substring(0, 3);
        h.g.b.x.e(strSubstring, "substring(...)");
        String upperCase = strSubstring.toUpperCase(Locale.ROOT);
        h.g.b.x.e(upperCase, "toUpperCase(...)");
        return h.n.o.v(upperCase).toString();
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        if (str != null) {
            RealtimeNativeManager realtimeNativeManager = RealtimeNativeManager.getInstance();
            h.g.b.x.e(realtimeNativeManager, "getInstance(...)");
            com.waze.realtime.h.setServerGeoConfig$default(realtimeNativeManager, str, null, 2, null);
        }
    }
}
