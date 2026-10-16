package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class lvo implements ltw {
    public static final yph a = yph.c("GH.ConversationUpdater");
    public final List b;
    public final Map c;
    private final Handler d;
    private boolean e;
    private final boolean f;
    private lvp g;

    public lvo() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.d = handler;
        boolean z = true;
        if (!actj.x() && !actj.w()) {
            z = false;
        }
        this.f = z;
        if (z) {
            this.g = new lvp();
        }
    }

    public static final void l(int i, String str) {
        yzy yzyVar = yzy.Kw;
        if (i == 0) {
            yzyVar = yzy.Kx;
        } else if (i == 1) {
            yzyVar = yzy.Ky;
        } else if (i == 2) {
            yzyVar = yzy.Kz;
        } else if (i == 3) {
            yzyVar = yzy.KA;
        } else if (i == 4) {
            yzyVar = yzy.KB;
        } else if (i == 5) {
            yzyVar = yzy.KC;
        }
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PROJECTION_NOTIFICATION, yzyVar);
        rrbVarH.p(new ComponentName(str, ""));
        ohsVarJ.F(rrbVarH.l());
    }

    @Override // defpackage.ltw
    public final lvg a(long j) {
        return (lvg) this.c.get(Long.valueOf(j));
    }

    @Override // defpackage.ltw
    public final yfq b() {
        return yfq.o(this.c.values());
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.f) {
            this.e = true;
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.f) {
            this.e = false;
            this.d.removeCallbacksAndMessages(null);
            this.c.clear();
            this.b.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e4  */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    @Override // defpackage.ltw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.lvg r29) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvo.e(lvg):void");
    }

    @Override // defpackage.ltw
    public final void f(lvg lvgVar, boolean z, boolean z2) {
        if (this.e) {
            if (!z2) {
                this.d.post(new lvn(this, lvgVar, z, 0));
            } else {
                k(lvgVar);
                this.d.post(new kzu(this, lvgVar, 10));
            }
        }
    }

    @Override // defpackage.ltw
    public final void g(long j, int i) {
        if (this.e) {
            ((ype) a.l().ai(4304)).F("updateConversationAsRead. Id: %d numRead: %d", j, i);
            this.d.post(new lvm(this, j, i, 0));
        }
    }

    @Override // defpackage.ltw
    public final void h(lvk lvkVar) {
        if (this.e) {
            ((ype) a.l().ai((char) 4305)).y("updateSmsConversation: %s", lvkVar);
            this.d.post(new kzu(this, lvkVar, 11));
        }
    }

    @Override // defpackage.ltw
    public final void i(ajmd ajmdVar) {
        this.b.add(ajmdVar);
    }

    @Override // defpackage.ltw
    public final void j(ajmd ajmdVar) {
        if (this.b.remove(ajmdVar)) {
            return;
        }
        ((ype) ((ype) a.h()).ai((char) 4299)).y("Listener was not registered: %s", ajmdVar);
    }

    public final void k(lvg lvgVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kex) ((ajmd) it.next()).a).d(lvgVar);
        }
    }
}
