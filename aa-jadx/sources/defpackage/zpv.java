package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpv {
    public int a = -1;
    final /* synthetic */ java.lang.Object b;

    public zpv(defpackage.nbp nbpVar) {
        this.b = nbpVar;
        nbpVar.getViewLifecycleOwner().getLifecycle().c(new defpackage.nbm(this, nbpVar));
    }

    public final int a(int i) {
        return ((defpackage.zpw) this.b).a[this.a + i] & 255;
    }

    public final int b() {
        int i = this.a;
        this.a = i + 1;
        return ((defpackage.zpw) this.b).a[i] & 255;
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
        android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) this.b;
        defpackage.epx epxVar = ((defpackage.eqi) fragment.getViewLifecycleOwner().getLifecycle()).e;
        defpackage.epx epxVar2 = defpackage.epx.e;
        if (epxVar.a(epxVar2) && (iK = defpackage.afhi.k(f)) != this.a) {
            this.a = iK;
            android.support.v4.app.Fragment fragmentE = fragment.getChildFragmentManager().e(com.google.android.projection.gearhead.R.id.media_player);
            android.support.v4.app.Fragment fragmentE2 = fragment.getChildFragmentManager().e(com.google.android.projection.gearhead.R.id.media_suggestions);
            if (fragmentE == null || fragmentE2 == null) {
                return;
            }
            defpackage.bt childFragmentManager = fragment.getChildFragmentManager();
            childFragmentManager.getClass();
            defpackage.w wVar = new defpackage.w(childFragmentManager);
            wVar.h(fragmentE, iK == 0 ? epxVar2 : defpackage.epx.d);
            if (iK != 1) {
                epxVar2 = defpackage.epx.d;
            }
            wVar.h(fragmentE2, epxVar2);
            wVar.c();
        }
    }

    public zpv(defpackage.zpw zpwVar) {
        this.b = zpwVar;
    }
}
