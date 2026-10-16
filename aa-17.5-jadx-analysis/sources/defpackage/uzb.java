package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uzb implements iej {
    public final ykd a;
    private final Executor b;

    public uzb(ykd ykdVar, Executor executor) {
        this.a = ykdVar;
        this.b = executor;
    }

    @Override // defpackage.iej
    public final boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        obj.getClass();
        ievVar.getClass();
        this.b.execute(new oyx(13));
        return true;
    }

    @Override // defpackage.iej
    public final /* bridge */ /* synthetic */ boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        Bitmap bitmap = (Bitmap) obj;
        obj2.getClass();
        ievVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.b.execute(new unj(this, bitmap, 7, null));
        return true;
    }
}
