package defpackage;

import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Objects;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class mjl extends du {
    public final /* synthetic */ mjm e;

    public mjl(mjm mjmVar) {
        this.e = mjmVar;
    }

    @Override // defpackage.du
    public final void b() {
        yph yphVar = mjm.a;
        this.e.c.o(false);
    }

    @Override // defpackage.du
    public final void c() {
        yph yphVar = mjm.a;
        this.e.c.p(1);
    }

    @Override // defpackage.du
    public final void d() {
        yph yphVar = mjm.a;
        this.e.c.p(2);
    }

    @Override // defpackage.du
    public final void e() {
        yph yphVar = mjm.a;
        this.e.c.o(true);
    }

    @Override // defpackage.du
    public final void f(String str) {
        yph yphVar = mjm.a;
        int iHashCode = str.hashCode();
        if (iHashCode != -390438026) {
            if (iHashCode == -279797361 && str.equals("aap.radio.action.favorite.remove")) {
                mjm mjmVar = this.e;
                if (mjmVar.e == null) {
                    return;
                }
                mjmVar.c.n(false);
                return;
            }
        } else if (str.equals("aap.radio.action.favorite.add")) {
            mjm mjmVar2 = this.e;
            if (mjmVar2.e != null) {
                mjmVar2.c.n(true);
                return;
            }
            return;
        }
        mji mjiVar = this.e.c;
        if (mjiVar.j().contains(str)) {
            mjiVar.m(str);
        } else {
            ((ype) ((ype) mjm.a.h()).ai((char) 5030)).y("Unknown custom action %s", str);
        }
    }

    @Override // defpackage.du
    public final void g(String str) {
        Optional optionalOfNullable;
        yph yphVar = mjm.a;
        if (Objects.equals(min.b.a, str)) {
            b();
            return;
        }
        min minVar = this.e.d;
        if (minVar.a()) {
            optionalOfNullable = Optional.ofNullable((RadioProgramSelector) minVar.e.get(str));
        } else {
            ((ype) ((ype) min.a.h()).ai((char) 4980)).u("Trying to access data out of lifecycle");
            optionalOfNullable = Optional.empty();
        }
        optionalOfNullable.or(new llv(str, 9)).ifPresentOrElse(new kqa(this, str, 4), new mhr(this, 3));
    }

    @Override // defpackage.du
    public final void h() {
        yph yphVar = mjm.a;
    }
}
