package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class yka extends WeakReference implements yjz {
    final yiy a;

    public yka(ReferenceQueue referenceQueue, Object obj, yiy yiyVar) {
        super(obj, referenceQueue);
        this.a = yiyVar;
    }

    @Override // defpackage.yjz
    public final yiy a() {
        return this.a;
    }

    @Override // defpackage.yjz
    public final yjz b(ReferenceQueue referenceQueue, yiy yiyVar) {
        return new yka(referenceQueue, get(), yiyVar);
    }
}
