package Vc;

import android.util.Log;
import java.util.HashMap;
import uc.C4271h;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4271h f14872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f14873c;

    public /* synthetic */ f(C4271h c4271h, HashMap map, int i5) {
        this.f14871a = i5;
        this.f14872b = c4271h;
        this.f14873c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4271h c4271h = this.f14872b;
        HashMap map = this.f14873c;
        switch (this.f14871a) {
            case 0:
                c4271h.a(map);
                c4271h.b();
                break;
            case 1:
                c4271h.a(map);
                break;
            default:
                if (c4271h == null) {
                    Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send event %s on a null event sink.", map));
                    break;
                } else {
                    c4271h.a(map);
                    break;
                }
        }
    }
}
