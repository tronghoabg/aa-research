package defpackage;

import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class frj implements frm {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public frj(Object obj, ftc ftcVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = ftcVar;
    }

    private static final void b(Uri uri) {
        Objects.toString(uri);
        throw new IllegalStateException("Invalid android.resource URI: ".concat(uri.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x021b  */
    @Override // defpackage.frm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r12) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frj.a(afck):java.lang.Object");
    }

    public frj(ByteBuffer byteBuffer, ftc ftcVar, int i) {
        this.a = i;
        this.c = byteBuffer;
        this.b = ftcVar;
    }
}
