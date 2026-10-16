package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final class enx implements bvn {
    final /* synthetic */ bt a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ affq c;
    final /* synthetic */ vo d;

    public enx(bt btVar, Fragment fragment, vo voVar, affq affqVar) {
        this.a = btVar;
        this.b = fragment;
        this.d = voVar;
        this.c = affqVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [bwq, java.lang.Object] */
    @Override // defpackage.bvn
    public final void a() {
        Fragment fragment = this.b;
        bt btVar = this.a;
        by byVarD = btVar.b.d(fragment.mWho);
        if (byVarD == null || !byVarD.a.equals(fragment)) {
            btVar.W(new IllegalStateException(a.bm(fragment, "Fragment ", " is not currently in the FragmentManager")));
        }
        this.d.a.b(byVarD.a.mState >= 0 ? new Fragment.SavedState(byVarD.a()) : null);
        if (this.c.a) {
            w wVar = new w(btVar);
            wVar.k(fragment);
            wVar.d();
        } else {
            if (btVar.af()) {
                return;
            }
            w wVar2 = new w(btVar);
            wVar2.k(fragment);
            wVar2.c();
        }
    }
}
