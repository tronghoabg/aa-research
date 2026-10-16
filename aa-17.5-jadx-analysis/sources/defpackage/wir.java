package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes3.dex */
public final class wir extends wjz {
    public wir(abyt abytVar) {
        this.a = abytVar;
        this.b = 2;
    }

    @Override // defpackage.wjz
    public final Fragment a(Integer num, int i) {
        abyt abytVar = this.a;
        wis wisVar = new wis();
        wisVar.setArguments(wis.a(abytVar, num, i));
        return wisVar;
    }
}
