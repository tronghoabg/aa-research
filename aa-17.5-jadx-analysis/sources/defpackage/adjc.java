package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class adjc implements adjd {
    public static final adjd a = new adjc(0);
    private final /* synthetic */ int b;

    public adjc(int i) {
        this.b = i;
    }

    @Override // defpackage.adjs
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.adje, defpackage.adjs
    public final String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
