package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class ajad extends ajaj {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.ajaj
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ajac.a);
        return true;
    }

    @Override // defpackage.ajaj
    public final /* bridge */ /* synthetic */ afck[] b(Object obj) {
        this.a.set(null);
        return ajai.a;
    }
}
