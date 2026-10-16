package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
final class zfh extends zff {
    @Override // defpackage.zff
    public final int a(zfi zfiVar) {
        int i;
        synchronized (zfiVar) {
            i = zfiVar.remainingField - 1;
            zfiVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.zff
    public final void b(zfi zfiVar, Set set) {
        synchronized (zfiVar) {
            if (zfiVar.seenExceptionsField == null) {
                zfiVar.seenExceptionsField = set;
            }
        }
    }
}
