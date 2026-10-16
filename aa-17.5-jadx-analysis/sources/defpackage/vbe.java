package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class vbe implements adiz {
    private static vbe a;

    public static synchronized vbe a() {
        vbe vbeVar;
        vbeVar = a;
        if (vbeVar == null) {
            vbeVar = new vbe();
            a = vbeVar;
        }
        return vbeVar;
    }

    @Override // defpackage.adiz
    public final adqq b(admf admfVar, adiw adiwVar, adix adixVar) {
        vbd vbdVar;
        Boolean bool = true;
        bool.getClass();
        vky vkyVar = (vky) adiwVar.g(vay.a);
        if (vkyVar == null) {
            vbdVar = new vbd(new vvu(null, "https://" + adixVar.a() + "/" + admfVar.b, false, SystemClock.elapsedRealtime()));
        } else {
            vbdVar = new vbd(new vvu(adixVar.a(), vky.e(vkyVar), true, SystemClock.elapsedRealtime()));
        }
        return new vbb(adixVar.d(admfVar, adiwVar.i(vbdVar)), vbdVar);
    }
}
