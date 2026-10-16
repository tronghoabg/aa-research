package defpackage;

import android.opengl.GLSurfaceView;
import android.util.Log;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class aafa implements GLSurfaceView.Renderer, aagp {
    public static final String a = "aafa";
    public final aagr b;
    public final zrt c;
    public boolean d;
    public aagf e;
    private final aahn f;
    private final double g;
    private aagc h;
    private StreetViewPanoramaCamera i;
    private aagn j;
    private aagi k;
    private aagi l;
    private aagh m;
    private double n;
    private final HashSet o;

    public aafa(aagr aagrVar, aahn aahnVar, double d) {
        zrt zrtVar = zrt.a;
        zkt.n(aagrVar, "tileProvider");
        this.b = aagrVar;
        zkt.n(aahnVar, "frameRequestor");
        this.f = aahnVar;
        zkt.k(d, "displayDensityRatio");
        this.g = d;
        aclh.o(d > 0.0d, "displayDensityRatio[%s] < 0", new Object[]{Double.valueOf(d)});
        zkt.n(zrtVar, "uiThreadChecker");
        this.c = zrtVar;
        synchronized (this) {
            this.d = false;
            this.e = null;
            this.h = null;
            this.i = zyj.a;
            this.j = null;
            aagi aagiVar = aagi.a;
            this.k = aagiVar;
            this.l = aagiVar;
            this.m = null;
            this.n = 0.0d;
            this.o = new HashSet();
        }
    }

    private final synchronized aagc d() {
        return this.h;
    }

    @Override // defpackage.aagp
    public final void a(aagi aagiVar, aagi aagiVar2, aagh aaghVar, double d) {
        this.c.b();
        zkt.n(aagiVar, "fromPano");
        zkt.e(!aagiVar.i(), "Cannot blend from the null target");
        zkt.e(aagiVar2 == null || !aagiVar2.i(), "Cannot blend into the null target");
        aclh.o(d >= 0.0d && d <= 1.0d, "Invalid blendRatio %s", new Object[]{Double.valueOf(d)});
        String str = a;
        if (zrn.e(str, 2)) {
            Log.v(str, String.format("setMultiPano(%s + %s => %s @ %s%%)", aagiVar.b, aaghVar, aagiVar2 == null ? null : aagiVar2.b, Long.valueOf(Math.round(100.0d * d))));
        }
        this.k = aagiVar;
        if (aagiVar2 == null) {
            aagiVar2 = aagi.a;
        }
        this.l = aagiVar2;
        this.m = aaghVar;
        if (aaghVar == null) {
            d = 0.0d;
        }
        this.n = d;
    }

    public final synchronized void b(aagc aagcVar) {
        this.h = aagcVar;
    }

    @Override // defpackage.aagp
    public final void c(aagi aagiVar) {
        this.c.b();
        zkt.n(aagiVar, "panorama");
        String str = a;
        if (zrn.e(str, 2)) {
            Log.v(str, String.format("setSoloPano(%s)", aagiVar.b));
        }
        this.k = aagiVar;
        this.l = aagi.a;
        this.m = null;
        this.n = 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0383 A[Catch: all -> 0x0416, TryCatch #1 {all -> 0x0416, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0014, B:9:0x001a, B:11:0x001e, B:13:0x0026, B:15:0x002c, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x005e, B:23:0x0063, B:65:0x0133, B:67:0x014a, B:68:0x0157, B:69:0x015c, B:74:0x0177, B:76:0x0181, B:77:0x0185, B:79:0x018b, B:80:0x0191, B:82:0x0197, B:83:0x019b, B:85:0x01a3, B:87:0x01b1, B:88:0x01be, B:90:0x01c4, B:99:0x01d3, B:105:0x0214, B:107:0x0230, B:108:0x025a, B:110:0x026f, B:112:0x0276, B:165:0x0377, B:167:0x0383, B:169:0x038f, B:171:0x03b9, B:173:0x03cb, B:174:0x03d0, B:186:0x03ff, B:185:0x03f8, B:190:0x0414, B:115:0x0290, B:116:0x02a9, B:118:0x02af, B:120:0x02bd, B:122:0x02c3, B:124:0x02c8, B:125:0x02cc, B:127:0x02d2, B:128:0x02e2, B:130:0x02e8, B:133:0x02f3, B:135:0x02fd, B:145:0x0311, B:148:0x031f, B:151:0x032a, B:153:0x0330, B:157:0x034e, B:159:0x0356, B:161:0x035d, B:94:0x01cd, B:48:0x00b1, B:50:0x00b8, B:52:0x00c4, B:54:0x00dc, B:56:0x00ec, B:57:0x00fb, B:59:0x010f, B:63:0x0126, B:60:0x0113, B:62:0x0119, B:64:0x012a, B:97:0x01d0, B:175:0x03d1, B:177:0x03d5, B:179:0x03d7, B:181:0x03ea, B:183:0x03f5, B:70:0x015d, B:71:0x0172, B:24:0x0064, B:26:0x0068, B:28:0x006e, B:29:0x0073, B:31:0x0078, B:33:0x0080, B:35:0x0086, B:36:0x008b, B:38:0x008d, B:40:0x0091, B:42:0x0097, B:43:0x009c, B:44:0x009f, B:46:0x00a1, B:47:0x00b0), top: B:204:0x0002, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038f A[Catch: all -> 0x0416, TryCatch #1 {all -> 0x0416, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0014, B:9:0x001a, B:11:0x001e, B:13:0x0026, B:15:0x002c, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x005e, B:23:0x0063, B:65:0x0133, B:67:0x014a, B:68:0x0157, B:69:0x015c, B:74:0x0177, B:76:0x0181, B:77:0x0185, B:79:0x018b, B:80:0x0191, B:82:0x0197, B:83:0x019b, B:85:0x01a3, B:87:0x01b1, B:88:0x01be, B:90:0x01c4, B:99:0x01d3, B:105:0x0214, B:107:0x0230, B:108:0x025a, B:110:0x026f, B:112:0x0276, B:165:0x0377, B:167:0x0383, B:169:0x038f, B:171:0x03b9, B:173:0x03cb, B:174:0x03d0, B:186:0x03ff, B:185:0x03f8, B:190:0x0414, B:115:0x0290, B:116:0x02a9, B:118:0x02af, B:120:0x02bd, B:122:0x02c3, B:124:0x02c8, B:125:0x02cc, B:127:0x02d2, B:128:0x02e2, B:130:0x02e8, B:133:0x02f3, B:135:0x02fd, B:145:0x0311, B:148:0x031f, B:151:0x032a, B:153:0x0330, B:157:0x034e, B:159:0x0356, B:161:0x035d, B:94:0x01cd, B:48:0x00b1, B:50:0x00b8, B:52:0x00c4, B:54:0x00dc, B:56:0x00ec, B:57:0x00fb, B:59:0x010f, B:63:0x0126, B:60:0x0113, B:62:0x0119, B:64:0x012a, B:97:0x01d0, B:175:0x03d1, B:177:0x03d5, B:179:0x03d7, B:181:0x03ea, B:183:0x03f5, B:70:0x015d, B:71:0x0172, B:24:0x0064, B:26:0x0068, B:28:0x006e, B:29:0x0073, B:31:0x0078, B:33:0x0080, B:35:0x0086, B:36:0x008b, B:38:0x008d, B:40:0x0091, B:42:0x0097, B:43:0x009c, B:44:0x009f, B:46:0x00a1, B:47:0x00b0), top: B:204:0x0002, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 r28) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafa.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        int iE;
        try {
            this.c.b();
            String str = a;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("onSurfaceChanged(%s,%s)", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            StreetViewPanoramaCamera streetViewPanoramaCamera = this.i;
            this.j = new aagn(streetViewPanoramaCamera.tilt, streetViewPanoramaCamera.bearing, streetViewPanoramaCamera.zoom, i, i2);
            aagf aagfVar = this.e;
            if (aagfVar != null) {
                String str2 = aagf.a;
                if (zrn.e(str2, 4)) {
                    Log.i(str2, "onSurfaceChanged()");
                }
                aafs.f(String.format("%s.onSurfaceChanged()::start", str2));
                try {
                    aagfVar.d = 0;
                    aagfVar.b();
                    iE = aafu.e(str2);
                    aagfVar.d = iE;
                } catch (RuntimeException e) {
                    String str3 = aagf.a;
                    if (zrn.e(str3, 6)) {
                        Log.e(str3, String.format("onSurfaceChanged() FAILED %s", e), e);
                    }
                }
                if (iE == 0) {
                    aafs.f(String.format("%s.onSurfaceChanged()::failed", str2));
                    throw new IllegalStateException("Failed to register GridMesh shader program!");
                }
                aafs.f(String.format("%s.onSurfaceChanged()::end", aagf.a));
            } else {
                zrn.b("onSurfaceChanged() called before onSurfaceCreated() or after onDestroy()");
            }
            aagc aagcVarD = d();
            if (aagcVarD != null) {
                aagn aagnVar = this.j;
                ((aafc) aagcVarD).k.b();
                zkt.n(aagnVar, "rendererRaycaster");
                aage aageVar = ((aafc) aagcVarD).l;
                aageVar.c.b();
                aageVar.b("onSurfaceChanged()");
                aafz aafzVar = ((aafc) aagcVarD).m;
                aafzVar.e.b();
                String str4 = aafz.a;
                if (zrn.e(str4, 4)) {
                    Log.i(str4, "onSurfaceChanged()");
                }
                aafzVar.d();
            }
            this.f.b("VIEW_onSurfaceChanged()");
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.c.b();
            if (this.d) {
                String str = a;
                if (zrn.e(str, 5)) {
                    Log.w(str, "onSurfaceCreated() called after onDestroy().");
                    return;
                }
                return;
            }
            if (this.e != null) {
                String str2 = a;
                if (zrn.e(str2, 4)) {
                    Log.i(str2, "onSurfaceCreated() invoked more than once.");
                }
            } else {
                String str3 = a;
                if (zrn.e(str3, 4)) {
                    Log.i(str3, "onSurfaceCreated()");
                }
                aagr aagrVar = this.b;
                aagf aagfVar = new aagf(aagrVar, this.f, this.g);
                this.e = aagfVar;
                aagrVar.b(aagfVar);
            }
            aagc aagcVarD = d();
            if (aagcVarD != null) {
                ((aafc) aagcVarD).k.b();
                aage aageVar = ((aafc) aagcVarD).l;
                aageVar.c.b();
                aageVar.b("onSurfaceCreated()");
                aafz aafzVar = ((aafc) aagcVarD).m;
                aafzVar.e.b();
                String str4 = aafz.a;
                if (zrn.e(str4, 4)) {
                    Log.i(str4, "onSurfaceCreated()");
                }
                aafzVar.d();
            }
            this.f.b("VIEW_onSurfaceCreated()");
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
