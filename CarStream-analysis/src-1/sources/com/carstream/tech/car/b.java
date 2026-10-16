package com.carstream.tech.car;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public b(c cVar, int i) {
        this.b = cVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, IOException {
        c cVar = this.b;
        if (cVar.d) {
            int i = this.a;
            if (i != 0) {
                int i2 = i % 5;
            }
            cVar.a.a.keeper.a(20000L);
            cVar.a();
            int i3 = i + 1;
            if (i3 >= 50 || !cVar.d) {
                return;
            }
            cVar.b.postDelayed(new b(cVar, i3), 400L);
        }
    }
}
