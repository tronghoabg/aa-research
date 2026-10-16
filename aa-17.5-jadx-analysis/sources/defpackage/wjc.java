package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes3.dex */
public final class wjc extends wjz {
    public wjc(abyt abytVar) {
        this.a = abytVar;
        this.b = 3;
    }

    @Override // defpackage.wjz
    public final Fragment a(Integer num, int i) {
        abyt abytVar = this.a;
        wje wjeVar = new wje();
        wjeVar.setArguments(wje.a(abytVar, num, i));
        return wjeVar;
    }
}
