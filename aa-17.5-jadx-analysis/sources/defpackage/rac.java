package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class rac extends Thread {
    final /* synthetic */ Context a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ rad d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rac(Context context, boolean z, boolean z2, rad radVar) {
        super("ImplStager");
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = radVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = new AtomicReference();
        try {
            Context context = this.a;
            uqw.ag(context.getDir("impl", 0), context, this.b, true, this.c);
            if (oni.j("ImplStager")) {
                rrd.a("ImplStager", null, "Done staging impl");
            }
        } catch (IOException e) {
            atomicReference.set(e);
        }
        new sss(Looper.getMainLooper()).post(new qqy(atomicReference, this.d, 5));
    }
}
