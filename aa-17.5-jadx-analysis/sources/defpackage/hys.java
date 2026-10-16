package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hys implements hzi {
    private final /* synthetic */ int a;
    private final Object b;

    public hys(int i) {
        this.a = i;
        this.b = new fxp();
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        int i = this.a;
        if (i == 0) {
            return new hyw(this.b, 0);
        }
        if (i == 1) {
            return new hzl(1);
        }
        Object obj = this.b;
        if (i != 2) {
            return new hyr((Context) obj, hzmVar.a(Integer.class, InputStream.class), 3);
        }
        return new hyr((Context) obj, hzmVar.a(Integer.class, AssetFileDescriptor.class), 3);
    }

    public hys(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
