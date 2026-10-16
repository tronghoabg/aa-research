package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;

/* loaded from: classes2.dex */
public final class frn implements frm {
    private final File a;

    public frn(File file) {
        this.a = file;
    }

    @Override // defpackage.frm
    public final Object a(afck afckVar) {
        String str = ajnr.a;
        File file = this.a;
        return new frs(a.bk(ahfo.b(file), ajnf.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(adqs.x(file)), 3);
    }
}
