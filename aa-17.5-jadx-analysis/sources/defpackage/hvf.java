package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hvf implements huw {
    private final hxl a;

    public hvf(hxl hxlVar) {
        this.a = hxlVar;
    }

    @Override // defpackage.huw
    public final /* bridge */ /* synthetic */ hux a(Object obj) {
        return new hvg((InputStream) obj, this.a);
    }

    @Override // defpackage.huw
    public final Class b() {
        return InputStream.class;
    }
}
