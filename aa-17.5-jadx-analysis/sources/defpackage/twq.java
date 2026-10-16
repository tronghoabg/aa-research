package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class twq {
    private static final yob j = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/GoogleMapImpl");
    public final tno a;
    public final tqv b;
    public volatile boolean c = false;
    public final List d = new ArrayList();
    public final twp e;
    public final tvm f;
    public final txj g;
    public final txg h;
    public final uvg i;

    public twq(tno tnoVar, uvg uvgVar, twp twpVar, tvm tvmVar, txj txjVar, tqv tqvVar, txg txgVar) {
        this.i = uvgVar;
        this.e = twpVar;
        this.f = tvmVar;
        this.g = txjVar;
        this.b = tqvVar;
        this.h = txgVar;
        this.a = tnoVar;
    }

    public final void a(tqd tqdVar, too tooVar) {
        uvl uvlVar = this.i.q;
        if (uvlVar == null) {
            ((ynz) j.a(uys.a).ai((char) 9172)).u("GoogleMap.pick called with a null picker");
            return;
        }
        tqd tqdVar2 = tqd.a;
        if (tqdVar == tqdVar2) {
            twm twmVar = (twm) uvlVar;
            twl twlVar = twmVar.h;
            twlVar.a(twmVar);
            twlVar.b(new roa(tqdVar2, tooVar));
            return;
        }
        twm twmVar2 = (twm) uvlVar;
        twl twlVar2 = twmVar2.h;
        twlVar2.a(twmVar2);
        twlVar2.b(new roa(tqd.b, tooVar));
    }

    public final void b(tqb tqbVar) {
        this.e.a(tqbVar);
    }

    public final void c(tqc tqcVar) {
        this.e.b(tqcVar);
    }

    public final roa d() {
        return new roa(((txu) this.a.b()).ai);
    }
}
