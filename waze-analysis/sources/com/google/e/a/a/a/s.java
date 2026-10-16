package com.google.e.a.a.a;

import com.google.android.gms.common.api.internal.av;
import com.google.e.a.e.ab;
import com.google.e.a.e.ag;
import com.google.e.a.e.ar;
import h.g.b.x;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {
    public static com.google.e.a.a a(com.google.e.a.n nVar, ag agVar) throws GeneralSecurityException {
        com.google.e.a.k.a aVarF;
        if (!ar.b(nVar)) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < nVar.a(); i2++) {
            com.google.e.a.m mVarC = nVar.c(i2);
            if (mVarC.c().equals(com.google.e.a.f.f8466a)) {
                com.google.d.m.a.a.b bVarJ = mVarC.j();
                if (bVarJ instanceof com.google.e.a.a.b) {
                    aVarF = ((com.google.e.a.a.b) bVarJ).f();
                } else {
                    if (!(bVarJ instanceof com.google.e.a.e.i)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + bVarJ.getClass().getName() + " with parameters " + String.valueOf(bVarJ.e()));
                    }
                    aVarF = ((com.google.e.a.e.i) bVarJ).f();
                }
                ab.b(aVarF, new q((com.google.e.a.a) agVar.a(mVarC), mVarC.b()), map);
            }
        }
        if (((com.google.e.a.e.k) nVar.b(com.google.e.a.e.k.class)) == null) {
            return new r(new q((com.google.e.a.a) agVar.a(nVar.d()), nVar.d().b()), ab.a(map));
        }
        throw null;
    }

    public static void b(com.google.firebase.appcheck.b bVar) {
        av.m(bVar);
        av.k(bVar.b());
    }

    public static final com.google.firebase.e c(com.google.firebase.b bVar) {
        x.f(bVar, "<this>");
        com.google.firebase.e eVarB = com.google.firebase.e.b();
        x.e(eVarB, "getInstance(...)");
        return eVarB;
    }
}
