package defpackage;

import android.content.ComponentName;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lme implements lju {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lme(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    private final void c(AaPlaybackState aaPlaybackState, lmd lmdVar) {
        int i = true != omu.i(aaPlaybackState, lmdVar) ? 8 : 0;
        kca kcaVar = (kca) this.a;
        kcaVar.e.setVisibility(i);
        kcaVar.f.setVisibility(i);
        ViewGroup viewGroup = kcaVar.g;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    private final void d(AaPlaybackState aaPlaybackState, lmd lmdVar) {
        CharSequence string;
        omw omwVarC = omu.c(aaPlaybackState, lmdVar);
        omw omwVar = omw.b;
        Object obj = this.a;
        if (omwVarC == omwVar) {
            kca kcaVar = (kca) obj;
            kcaVar.d.setVisibility(0);
            kcaVar.a.setVisibility(8);
            kcaVar.r.m(null);
            return;
        }
        kca kcaVar2 = (kca) obj;
        kcaVar2.d.setVisibility(8);
        if (omwVarC == omw.c) {
            geu geuVar = ((hlf) obj).i;
            ImageView imageView = kcaVar2.b;
            hbz.j(geuVar, CarIcon.ERROR, imageView, kcaVar2.h);
            if (aaPlaybackState == null || aaPlaybackState.W() == null) {
                string = geuVar.getString(R.string.something_went_wrong);
                string.getClass();
            } else {
                string = aaPlaybackState.W();
                string.getClass();
            }
            kcaVar2.c.a(geuVar, CarText.create(string));
            kcaVar2.a.setVisibility(0);
            imageView.setVisibility(0);
            kcaVar2.e.setVisibility(8);
            return;
        }
        ComponentName componentName = kcaVar2.p;
        kcaVar2.a.setVisibility(0);
        kcaVar2.b.setVisibility(8);
        if (componentName != null && lnm.y().h(componentName)) {
            eqm eqmVar = kcaVar2.r;
            if (eqmVar.e() == null) {
                kcaVar2.e.setVisibility(0);
                kcaVar2.c.setVisibility(8);
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gQ);
                rrbVarH.p(kcaVar2.q.a().a);
                ohsVarJ.F(rrbVarH.l());
                eqmVar.m(new gjv((xyi) oit.a().b));
                return;
            }
        }
        CarTextView carTextView = kcaVar2.c;
        geu geuVar2 = ((hlf) obj).i;
        carTextView.a(geuVar2, CarText.create(geuVar2.getString(R.string.loading)));
        kcaVar2.e.setVisibility(8);
        carTextView.setVisibility(0);
    }

    @Override // defpackage.lju
    public final void a(ComponentName componentName, ComponentName componentName2) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            ((eqj) obj).m(((lmf) obj).a.b());
        } else if (i != 1) {
            Object obj2 = this.a;
            ((eqj) obj2).m(((lmg) obj2).a.c());
        } else if (componentName2 != null) {
            MediaPlaybackView mediaPlaybackView = ((kca) this.a).d;
            mediaPlaybackView.r = componentName2;
            mediaPlaybackView.o.f = componentName2;
        }
    }

    @Override // defpackage.lju
    public final void b() {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            ((eqj) obj).m(((lmf) obj).a.b());
            return;
        }
        Object obj2 = this.a;
        if (i != 1) {
            ((eqj) obj2).m(((lmg) obj2).a.c());
            return;
        }
        kca kcaVar = (kca) obj2;
        ljv ljvVar = kcaVar.q;
        int i2 = ljvVar.a().h;
        d(ljvVar.c(), ljvVar.b());
        if (acrz.s()) {
            c(ljvVar.c(), ljvVar.b());
        }
        MediaPlaybackView mediaPlaybackView = kcaVar.d;
        mediaPlaybackView.f.a.setIndeterminateTintList(ColorStateList.valueOf(i2));
        mediaPlaybackView.c(((lmu) ljvVar).h);
        if (ljvVar.b() != null) {
            mediaPlaybackView.g(ljvVar.b());
        }
        if (ljvVar.c() != null) {
            mediaPlaybackView.i(ljvVar.c());
        }
    }

    @Override // defpackage.lju
    public final void e(CharSequence charSequence) {
        if (this.b != 1) {
            return;
        }
        charSequence.getClass();
        ((kca) this.a).p();
    }

    @Override // defpackage.lju
    public final void f() {
        int i = this.b;
        if (i == 0) {
            ((eqj) this.a).m(null);
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            ((eqj) obj).m(null);
        } else {
            ((kca) obj).p();
        }
    }

    @Override // defpackage.lju
    public final void g(lmd lmdVar) {
        int i = this.b;
        if (i == 0) {
            ((eqj) this.a).m(lmdVar);
            return;
        }
        if (i != 1) {
            return;
        }
        kca kcaVar = (kca) this.a;
        ljn ljnVar = kcaVar.q;
        d(ljnVar.c(), lmdVar);
        if (acrz.s()) {
            c(ljnVar.c(), lmdVar);
        }
        if (lmdVar != null) {
            kcaVar.d.g(lmdVar);
        }
    }

    @Override // defpackage.lju
    public final void h(AaPlaybackState aaPlaybackState) {
        int i = this.b;
        if (i != 0) {
            Object obj = this.a;
            if (i != 1) {
                ((eqj) obj).m(aaPlaybackState);
                return;
            }
            kca kcaVar = (kca) obj;
            ljn ljnVar = kcaVar.q;
            d(aaPlaybackState, ljnVar.b());
            if (acrz.s()) {
                c(aaPlaybackState, ljnVar.b());
            }
            if (aaPlaybackState != null) {
                kcaVar.d.i(aaPlaybackState);
            }
        }
    }

    @Override // defpackage.lju
    public final void i(boolean z) {
        if (this.b != 1) {
            return;
        }
        ((kca) this.a).d.c(z);
    }

    @Override // defpackage.lju
    public final void j(CharSequence charSequence) {
        int i = this.b;
        if (i == 0) {
            ((eqj) this.a).m(null);
        } else if (i != 1) {
            ((eqj) this.a).m(null);
        } else {
            charSequence.getClass();
            ((kca) this.a).p();
        }
    }
}
