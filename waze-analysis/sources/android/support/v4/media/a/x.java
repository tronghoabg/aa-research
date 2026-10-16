package android.support.v4.media.a;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final List f421a;

    /* renamed from: b, reason: collision with root package name */
    private int f422b;

    /* renamed from: c, reason: collision with root package name */
    private long f423c;

    /* renamed from: d, reason: collision with root package name */
    private long f424d;

    /* renamed from: e, reason: collision with root package name */
    private float f425e;

    /* renamed from: f, reason: collision with root package name */
    private long f426f;

    /* renamed from: g, reason: collision with root package name */
    private int f427g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f428h;

    /* renamed from: i, reason: collision with root package name */
    private long f429i;

    /* renamed from: j, reason: collision with root package name */
    private long f430j;

    /* renamed from: k, reason: collision with root package name */
    private Bundle f431k;

    public x(z zVar) {
        ArrayList arrayList = new ArrayList();
        this.f421a = arrayList;
        this.f430j = -1L;
        this.f422b = zVar.f436a;
        this.f423c = zVar.f437b;
        this.f425e = zVar.f439d;
        this.f429i = zVar.f443h;
        this.f424d = zVar.f438c;
        this.f426f = zVar.f440e;
        this.f427g = zVar.f441f;
        this.f428h = zVar.f442g;
        List list = zVar.f444i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f430j = zVar.f445j;
        this.f431k = zVar.f446k;
    }

    public final z a() {
        return new z(this.f422b, this.f423c, this.f424d, this.f425e, this.f426f, this.f427g, this.f428h, this.f429i, this.f421a, this.f430j, this.f431k);
    }

    public final void b(String str) {
        this.f421a.add(new y(str, null, 0, null));
    }

    public final void c(long j2) {
        this.f426f = j2;
    }

    public final void d(Bundle bundle) {
        this.f431k = bundle;
    }

    public final void e(int i2, long j2, float f2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f422b = i2;
        this.f423c = j2;
        this.f429i = jElapsedRealtime;
        this.f425e = f2;
    }

    public x() {
        this.f421a = new ArrayList();
        this.f430j = -1L;
    }
}
