package a4;

import android.os.StatFs;
import cg.u;
import cg.y;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328a {

    /* renamed from: a, reason: collision with root package name */
    public y f17336a;

    /* renamed from: b, reason: collision with root package name */
    public u f17337b;

    /* renamed from: c, reason: collision with root package name */
    public double f17338c;

    /* renamed from: d, reason: collision with root package name */
    public long f17339d;

    /* renamed from: e, reason: collision with root package name */
    public long f17340e;

    /* renamed from: f, reason: collision with root package name */
    public Lf.d f17341f;

    public final i a() {
        long jT;
        y yVar = this.f17336a;
        if (yVar == null) {
            throw new IllegalStateException("directory == null");
        }
        double d3 = this.f17338c;
        if (d3 > 0.0d) {
            try {
                StatFs statFs = new StatFs(yVar.e().getAbsolutePath());
                jT = android.support.v4.media.session.b.T((long) (d3 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f17339d, this.f17340e);
            } catch (Exception unused) {
                jT = this.f17339d;
            }
        } else {
            jT = 0;
        }
        return new i(jT, this.f17341f, this.f17337b, yVar);
    }
}
