package Cg;

import android.net.Uri;
import java.util.HashMap;
import tc.g;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2229b;

    public /* synthetic */ b(g gVar, int i5) {
        this.f2228a = i5;
        this.f2229b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f2229b;
        switch (this.f2228a) {
            case 0:
                Uri uri = c.f2230e;
                gVar.a(null);
                break;
            case 1:
                Uri uri2 = c.f2230e;
                gVar.a(null);
                break;
            case 2:
                Uri uri3 = c.f2230e;
                gVar.a(null);
                break;
            case 3:
                gVar.a(new HashMap());
                break;
            case 4:
                gVar.a(new HashMap());
                break;
            case 5:
                gVar.a(new HashMap());
                break;
            default:
                gVar.c();
                break;
        }
    }
}
