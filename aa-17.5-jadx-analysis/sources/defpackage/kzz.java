package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.demand.suggestions.PendingIntentFactory;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class kzz {
    public static final int a;
    private static final yfq e;
    public final PendingIntentFactory b;
    public final kzv c;
    public final Context d;

    static {
        yfq yfqVarS = yfq.s(yzy.tL, yzy.tM, yzy.tN);
        e = yfqVarS;
        a = ((yls) yfqVarS).c;
    }

    public kzz(PendingIntentFactory pendingIntentFactory, kzv kzvVar, Context context) {
        this.b = pendingIntentFactory;
        this.c = kzvVar;
        this.d = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nul a(orz orzVar, int i) {
        osj osjVar = orzVar.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        GhIcon ghIconA = null;
        if (i >= osjVar.i.size()) {
            return null;
        }
        ose oseVar = (ose) osjVar.i.get(i);
        int i2 = oseVar.b;
        if ((i2 & 4) == 0) {
            throw new IllegalArgumentException(wub.M("LabeledAction #%s (%s) must have an Action", Integer.valueOf(i), oseVar));
        }
        aaew aaewVar = new aaew(null);
        if ((i2 & 2) != 0) {
            kzv kzvVar = this.c;
            osd osdVar = oseVar.d;
            if (osdVar == null) {
                osdVar = osd.a;
            }
            ghIconA = kzvVar.a(osdVar);
        }
        aaewVar.e = ghIconA;
        aaewVar.d = oseVar.c;
        PendingIntentFactory pendingIntentFactory = this.b;
        ory oryVar = oseVar.e;
        if (oryVar == null) {
            oryVar = ory.a;
        }
        aaewVar.b = pendingIntentFactory.a(orzVar, oryVar, (yzy) e.get(i));
        return new nul(aaewVar);
    }
}
