package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class uhh extends uhg {
    private final aert b;
    private final int c;

    private uhh(uwm uwmVar, aert aertVar, int i) {
        super(uwmVar);
        this.b = aertVar;
        this.c = i;
    }

    static uhh e(List list) {
        float fA = uhf.a(list);
        aesj aesjVar = new aesj(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uhi uhiVar = ((uhf) it.next()).c;
            if (!aesjVar.containsKey(uhiVar)) {
                aesjVar.a(uhiVar, aesjVar.h);
            }
        }
        return g(aesjVar, fA);
    }

    static uhh g(aert aertVar, float f) {
        uwm uwmVarF = f(aertVar, f, ((aesj) aertVar).h, true);
        uuz uuzVar = uwmVarF.c;
        uuzVar.getClass();
        return new uhh(uwmVarF, aertVar, uuzVar.f);
    }

    @Override // defpackage.uhg
    public final float a(int i) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.uhg
    public final float b(int i) {
        return 1.0f;
    }

    @Override // defpackage.uhg
    public final float c() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.uhg
    public final float d(uhi uhiVar) {
        aert aertVar = this.b;
        woy.Z(aertVar.containsKey(uhiVar));
        int iO = aertVar.o(uhiVar);
        return ((iO + iO) + 1.0f) / this.c;
    }
}
