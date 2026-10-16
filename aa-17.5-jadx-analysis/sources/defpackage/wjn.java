package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes3.dex */
public final class wjn extends wjz {
    public wjn(abyt abytVar) {
        this.a = abytVar;
        this.b = 4;
    }

    @Override // defpackage.wjz
    public final Fragment a(Integer num, int i) {
        abyt abytVar = this.a;
        wjp wjpVar = new wjp();
        wjpVar.setArguments(wjp.a(abytVar, num, i));
        return wjpVar;
    }
}
