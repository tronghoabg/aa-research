package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
final class adwk implements adzx {
    private InputStream a;

    public adwk(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.adzx
    public final InputStream g() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
