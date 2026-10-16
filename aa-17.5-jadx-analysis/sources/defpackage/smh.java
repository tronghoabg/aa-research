package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class smh implements Runnable {
    private WeakReference a;
    private slk b;
    private final int c;
    private final erb d;

    public smh(sme smeVar, erb erbVar, slk slkVar, int i) {
        this.a = new WeakReference(smeVar);
        this.d = erbVar;
        this.b = slkVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            WeakReference weakReference = this.a;
            sme smeVar = weakReference != null ? (sme) weakReference.get() : null;
            slk slkVar = this.b;
            if (smeVar != null && slkVar != null) {
                int i = this.c;
                smi smiVar = smeVar.k;
                spu.ao(smiVar.o);
                try {
                    if (slkVar.d) {
                        smiVar.j().K(i);
                        slkVar.d = false;
                    }
                    smeVar.m(slkVar);
                } catch (Throwable th) {
                    smeVar.m(slkVar);
                    throw th;
                }
            } else if (slkVar != null && slkVar.d) {
                this.d.K(this.c);
                slkVar.d = false;
            }
        } finally {
            this.a = null;
            this.b = null;
        }
    }
}
