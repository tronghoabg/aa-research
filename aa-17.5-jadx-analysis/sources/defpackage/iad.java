package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes2.dex */
public final class iad implements hup {
    private final hxe a;
    private final hup b;

    public iad(hxe hxeVar, hup hupVar) {
        this.a = hxeVar;
        this.b = hupVar;
    }

    @Override // defpackage.htz
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hum humVar) {
        return this.b.a(new ibn(((BitmapDrawable) ((hwx) obj).c()).getBitmap(), this.a, 1), file, humVar);
    }

    @Override // defpackage.hup
    public final int b() {
        return 2;
    }
}
