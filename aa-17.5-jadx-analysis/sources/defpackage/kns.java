package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class kns extends mdd {
    final /* synthetic */ knt a;

    public kns(knt kntVar) {
        this.a = kntVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("MendelRuleBasedDetector");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        yfq yfqVar = this.a.e;
        if (yfqVar != null) {
            for (int i = 0; i < ((yls) yfqVar).c; i++) {
                ((knw) yfqVar.get(i)).c(intent);
            }
        }
    }
}
