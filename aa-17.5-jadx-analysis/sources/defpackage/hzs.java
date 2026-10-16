package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hzs implements hzi {
    public static final hzs a = new hzs(1, null);
    private final /* synthetic */ int b;

    public hzs(int i) {
        this.b = i;
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new hyw(hzmVar.a(hyx.class, InputStream.class), 6) : hzl.a : new hzt(hzmVar.a(hyx.class, InputStream.class));
    }

    @Deprecated
    public hzs(int i, byte[] bArr) {
        this.b = i;
    }
}
