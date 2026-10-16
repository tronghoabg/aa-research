package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ylo extends yln implements Serializable {
    static final yln a = new ylo();
    private static final long serialVersionUID = 0;

    @Override // defpackage.yln, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ylp ylpVar = (ylp) obj;
        ylp ylpVar2 = (ylp) obj2;
        return yde.b.e(ylpVar.b, ylpVar2.b).e(ylpVar.c, ylpVar2.c).a();
    }
}
