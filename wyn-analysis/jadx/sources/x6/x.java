package x6;

import D6.C0382l;
import D6.C0388o;
import D6.C0392q;
import D6.X;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbvf;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile X f47756a;

    /* renamed from: b, reason: collision with root package name */
    public static final d7.d f47757b;

    /* renamed from: c, reason: collision with root package name */
    public static final d7.d[] f47758c;

    static {
        d7.d dVar = new d7.d(-1, 1L, "additional_video_csi", true);
        f47757b = dVar;
        f47758c = new d7.d[]{dVar};
    }

    public static X a(Context context) {
        if (f47756a == null) {
            synchronized (x.class) {
                try {
                    if (f47756a == null) {
                        C0388o c0388o = C0392q.f2477g.f2479b;
                        zzbvf zzbvfVar = new zzbvf();
                        c0388o.getClass();
                        f47756a = (X) new C0382l(c0388o, context, zzbvfVar).d(context, false);
                    }
                } finally {
                }
            }
        }
        return f47756a;
    }
}
