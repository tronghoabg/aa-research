package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kzv {
    public static final yph a = yph.c("GH.Assistant.Suggestion");
    public final Context b;
    public final kzw c;
    private final Map d;

    public kzv(Context context) {
        kzx kzxVar = new kzx(1);
        this.d = new HashMap();
        this.b = context;
        this.c = kzxVar;
    }

    static final GhIcon c(osd osdVar) {
        String str = osdVar.e;
        if (str.isEmpty()) {
            return null;
        }
        return GhIcon.j(new ComponentName(str, osdVar.f));
    }

    final GhIcon a(osd osdVar) {
        GhIcon ghIconB = b(osdVar);
        return ghIconB != null ? ghIconB : c(osdVar);
    }

    final GhIcon b(osd osdVar) {
        String str = osdVar.c;
        if (str.isEmpty()) {
            return null;
        }
        return (GhIcon) Map.EL.computeIfAbsent(this.d, str, new jxf(this, str, 7));
    }
}
