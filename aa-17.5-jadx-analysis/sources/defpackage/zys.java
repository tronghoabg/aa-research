package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zys {
    public static final String a = "zys";
    static final aahu[] b = {aahu.MAP_CREATED, aahu.MAP_INITIALIZATION_REQUEST_DEFAULT, aahu.MAP_INITIALIZATION_REQUEST_OPT_IN, aahu.MAP_INITIALIZATION_REQUEST_OPT_OUT, aahu.MAP_INITIALIZATION_RESULT_LATEST, aahu.MAP_FALLBACK_LITE_MODE, aahu.MAP_MOVE_CAMERA, aahu.MAP_MAPID, aahu.MAP_USE_CLOUD_STYLING, aahu.MAP_ADD_ADVANCED_MARKER, aahu.ADVANCED_MARKER_REMOVE, aahu.ADVANCED_MARKER_ICON_VIEW, aahu.ADVANCED_MARKER_CUSTOMIZED_GLYPH_IMAGE, aahu.ADVANCED_MARKER_CUSTOMIZED_GLYPH_TEXT, aahu.ADVANCED_MARKER_CUSTOMIZED_BORDER_COLOR, aahu.ADVANCED_MARKER_CUSTOMIZED_BACKGROUND_COLOR, aahu.ADVANCED_MARKER_CUSTOMIZED_GLYPH_COLOR, aahu.ADVANCED_MARKER_MARKER_ALTITUDE, aahu.PREMIUM_QUOTA_REQUEST_FAILED, aahu.PREMIUM_QUOTA_REQUEST_EXCEEDED, aahu.PREMIUM_QUOTA_REQUEST_BLOCKED, aahu.PREMIUM_QUOTA_REQUEST_OK, aahu.PLACE_FEATURE_ACCESS_PLACEID, aahu.FEATURE_LAYER_ADD_CLICK_LISTENER};
    public static final AtomicReference c = new AtomicReference(null);
    private static final AtomicReference e = new AtomicReference(null);
    final boolean d;
    private final zyt f;

    public zys(zyt zytVar) {
        this.f = zytVar;
        this.d = ((double) new Random().nextInt(100)) > adet.a.gu().a();
    }

    public static svz a() {
        return (svz) c.get();
    }

    public static void e(Context context) {
        AtomicReference atomicReference = e;
        if (a.p(atomicReference, sws.a(context))) {
            swo swoVar = (swo) atomicReference.get();
            zkt.m(swoVar);
            c.set(swoVar.a());
            swoVar.b(new zyr(swoVar, 0));
        }
    }

    public static zys g(Context context, zyx zyxVar, String str, kex kexVar, zwj zwjVar) {
        zyt zytVar;
        e(context);
        shv shvVarA = zvy.a(context, "MAPS_API");
        if (shvVarA != null) {
            String str2 = a;
            if (zrn.e(str2, 3)) {
                Log.d(str2, "maps_core_dynamite module version in use (0 represents standalone library): 0");
            }
            zytVar = new zyt(new zyq(context, str, zyxVar, kexVar, zwjVar), new aaau(context, shvVarA), zrz.d("ula"));
        } else {
            zytVar = null;
        }
        return new zys(zytVar);
    }

    public final synchronized void b(aahu aahuVar) {
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, "Added event: ".concat(aahuVar.toString()));
        }
        if (Arrays.binarySearch(b, aahuVar) >= 0 || !this.d) {
            zyt zytVar = this.f;
            if (zytVar != null) {
                synchronized (zytVar) {
                    zytVar.a.add(aahuVar);
                    zytVar.a();
                }
            }
        }
    }

    public final synchronized void c(aahu aahuVar, yvv yvvVar) {
        zyt zytVar = this.f;
        if (zytVar != null) {
            synchronized (zytVar) {
                zytVar.b.add(new aacq(aahuVar, yvvVar, (byte[]) null));
                zytVar.a();
            }
        }
    }

    public final void d() {
        zyt zytVar = this.f;
        if (zytVar == null || !addm.h()) {
            return;
        }
        zytVar.c.shutdown();
    }

    public final synchronized void f(int i) {
        zyt zytVar = this.f;
        if (zytVar != null) {
            synchronized (zytVar) {
                zytVar.d = i;
            }
        }
    }
}
