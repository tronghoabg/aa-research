package a2;

import N1.C;
import N1.C0764m;
import N1.C0765n;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import wa.C4398a;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324d {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17157c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public C4398a f17158a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17159b;

    public static void a(ArrayList arrayList, int i5) {
        if (S3.f.w(f17157c, i5, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i5))) {
            return;
        }
        arrayList.add(Integer.valueOf(i5));
    }

    public final C0765n b(C0765n c0765n) {
        if (!this.f17159b || !this.f17158a.d(c0765n)) {
            return c0765n;
        }
        C0764m c0764mA = c0765n.a();
        c0764mA.f8194m = C.m("application/x-media3-cues");
        c0764mA.f8179H = this.f17158a.g(c0765n);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0765n.f8232n);
        String str = c0765n.k;
        sb2.append(str != null ? StringUtils.SPACE.concat(str) : "");
        c0764mA.f8192j = sb2.toString();
        c0764mA.f8199r = Long.MAX_VALUE;
        return new C0765n(c0764mA);
    }
}
