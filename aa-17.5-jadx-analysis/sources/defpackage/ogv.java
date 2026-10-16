package defpackage;

import android.telecom.Call;
import android.telecom.CallAudioState;

/* loaded from: classes2.dex */
public final /* synthetic */ class ogv implements ogx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ogv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ogx
    public final void a(ajmd ajmdVar) {
        int i = this.b;
        if (i == 0) {
            int i2 = ogw.b;
            ajmdVar.o((CallAudioState) this.a);
            return;
        }
        if (i == 1) {
            int i3 = ogw.b;
            ajmdVar.p((Call) this.a);
            return;
        }
        if (i == 2) {
            int i4 = ogw.b;
            ajmdVar.n((Call) this.a);
        } else if (i == 3) {
            yph yphVar = ohh.b;
            ajmdVar.n((Call) this.a);
        } else if (i != 4) {
            yph yphVar2 = ohh.b;
            ajmdVar.p((Call) this.a);
        } else {
            yph yphVar3 = ohh.b;
            ajmdVar.o((CallAudioState) this.a);
        }
    }
}
