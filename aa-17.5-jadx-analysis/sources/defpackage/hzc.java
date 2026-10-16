package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hzc implements hzi {
    private final /* synthetic */ int a;
    private final Object b;

    public hzc(int i) {
        this.a = i;
        this.b = new gms((byte[]) null, (byte[]) null);
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        switch (this.a) {
            case 0:
                return new hyw(this.b, 2);
            case 1:
                return new gnd((Context) this.b);
            case 2:
                return new hyr(this.b, hzmVar.a(Uri.class, AssetFileDescriptor.class), 2);
            case 3:
                return new hyr(this.b, hzmVar.a(Uri.class, InputStream.class), 2);
            case 4:
                return new hyr(this.b, hzl.a, 2);
            case 5:
                return new hzu((gms) this.b);
            case 6:
                return new hyw((Context) this.b, 4, (byte[]) null);
            default:
                return new hyw((Context) this.b, 5, (char[]) null);
        }
    }

    public hzc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
