package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class ucg {
    private static final yob g = yob.c("com/google/android/libraries/geo/mapcore/internal/label/LabelControllerImpl$LabelCompleteState");
    public boolean a;
    public boolean b;
    public boolean c;
    public List d = new ArrayList();
    public List e = new ArrayList();
    public final vaa f;

    public ucg(vaa vaaVar) {
        this.f = vaaVar;
    }

    final synchronized void a() {
        this.b = true;
        this.a = true;
        this.f.c(false);
    }

    final synchronized void b() {
        this.c = true;
        this.b = false;
        this.a = false;
        this.f.c(false);
        List list = this.d;
        this.d = this.e;
        this.e = list;
        if (list.isEmpty()) {
            return;
        }
        ((ynz) g.a(uys.a).ai((char) 9242)).u("Logic error in label pass completion; had pending listeners when starting a new pass");
        this.e.clear();
    }

    final synchronized boolean c() {
        if (!this.b) {
            if (!this.c) {
                return true;
            }
        }
        return false;
    }
}
