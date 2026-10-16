package defpackage;

import android.support.v4.app.Fragment;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes2.dex */
public final class nxf implements afdr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public nxf(afec afecVar, oqb oqbVar, int i) {
        this.c = i;
        this.b = afecVar;
        this.a = oqbVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [afec, java.lang.Object] */
    @Override // defpackage.afdr
    public final /* synthetic */ Object invoke() {
        erq defaultViewModelProviderFactory;
        int i = this.c;
        if (i == 0) {
            ((SnapshotStateList) this.a).add(((nuh) this.b).d);
            return afak.a;
        }
        if (i != 1) {
            if (i == 2) {
                return Boolean.valueOf(((SnapshotStateList) this.a).contains(((nuh) this.b).d));
            }
            if (i != 3) {
                this.b.invoke(Integer.valueOf(((oqb) this.a).a));
                return afak.a;
            }
            jty.b();
            return kfn.h((eru) tec.b((Fragment) this.b, eru.class), (esc) this.a, 2).a(oal.class);
        }
        eru eruVarH = ebi.h(this.b);
        epo epoVar = eruVarH instanceof epo ? (epo) eruVarH : null;
        if (epoVar != null && (defaultViewModelProviderFactory = epoVar.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        erq defaultViewModelProviderFactory2 = ((Fragment) this.a).getDefaultViewModelProviderFactory();
        defaultViewModelProviderFactory2.getClass();
        return defaultViewModelProviderFactory2;
    }

    public nxf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
