package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class zos {
    public int a = -1;
    final /* synthetic */ Object b;

    public zos(nbb nbbVar) {
        this.b = nbbVar;
        nbbVar.getViewLifecycleOwner().getLifecycle().c(new nay(this, nbbVar));
    }

    public final int a(int i) {
        return ((zot) this.b).a[this.a + i] & 255;
    }

    public final int b() {
        int i = this.a;
        this.a = i + 1;
        return ((zot) this.b).a[i] & 255;
    }

    public final int c() {
        return b() | (b() << 8);
    }

    public final int d(int i) {
        this.a += i;
        return i != 0 ? 1 : 2;
    }

    public final int e(int i) {
        return d(a(i));
    }

    public final void f(float f) {
        int iK;
        Fragment fragment = (Fragment) this.b;
        eps epsVar = ((eqc) fragment.getViewLifecycleOwner().getLifecycle()).e;
        eps epsVar2 = eps.e;
        if (epsVar.a(epsVar2) && (iK = afgi.k(f)) != this.a) {
            this.a = iK;
            Fragment fragmentE = fragment.getChildFragmentManager().e(R.id.media_player);
            Fragment fragmentE2 = fragment.getChildFragmentManager().e(R.id.media_suggestions);
            if (fragmentE == null || fragmentE2 == null) {
                return;
            }
            bt childFragmentManager = fragment.getChildFragmentManager();
            childFragmentManager.getClass();
            w wVar = new w(childFragmentManager);
            wVar.h(fragmentE, iK == 0 ? epsVar2 : eps.d);
            if (iK != 1) {
                epsVar2 = eps.d;
            }
            wVar.h(fragmentE2, epsVar2);
            wVar.c();
        }
    }

    public zos(zot zotVar) {
        this.b = zotVar;
    }
}
