package defpackage;

import android.graphics.Point;

/* loaded from: classes3.dex */
public final class tye {
    public final usy a;

    public tye(usy usyVar) {
        this.a = usyVar;
    }

    public final toi a(Point point) {
        too tooVarI = tsw.i(this.a, point.x, point.y, new float[8]);
        if (tooVarI == null) {
            return null;
        }
        return tmo.p(tooVarI);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("camera", this.a);
        return xxgVarAo.toString();
    }
}
