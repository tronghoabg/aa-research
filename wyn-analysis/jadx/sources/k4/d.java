package k4;

import A.AbstractC0213f;
import E5.Q;
import h4.C2775b;
import i4.C2846c;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2775b f39263a = new C2775b();

    public static final boolean a(h4.h hVar) {
        int iF = AbstractC0213f.f(hVar.f36112v);
        if (iF == 0) {
            return false;
        }
        if (iF != 1) {
            if (iF != 2) {
                throw new Q((byte) 0, 9);
            }
            if (hVar.f36110t.f36067a != null || !(hVar.f36108r instanceof C2846c)) {
                return false;
            }
        }
        return true;
    }
}
