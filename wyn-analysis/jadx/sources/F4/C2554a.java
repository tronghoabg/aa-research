package f4;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2554a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34804a;

    /* renamed from: b, reason: collision with root package name */
    public final double f34805b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34806c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34807d;

    public C2554a(Context context) {
        this.f34804a = context;
        Bitmap.Config config = k4.e.f39264a;
        double d3 = 0.2d;
        try {
            Object systemService = Y0.e.getSystemService(context, ActivityManager.class);
            AbstractC3340k.b(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d3 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f34805b = d3;
        this.f34806c = true;
        this.f34807d = true;
    }
}
