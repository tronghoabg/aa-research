package b1;

import android.content.res.Resources;
import r7.AbstractC3935e;
import x.C4417j;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1497f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3935e f19128a;

    /* renamed from: b, reason: collision with root package name */
    public static final C4417j f19129b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    static {
        /*
            java.lang.String r0 = "TypefaceCompat static init"
            java.lang.String r0 = tg.b.U(r0)
            android.os.Trace.beginSection(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            b1.k r0 = new b1.k
            r0.<init>()
            b1.AbstractC1497f.f19128a = r0
            goto L4f
        L17:
            r1 = 28
            if (r0 < r1) goto L23
            b1.j r0 = new b1.j
            r0.<init>()
            b1.AbstractC1497f.f19128a = r0
            goto L4f
        L23:
            r1 = 26
            if (r0 < r1) goto L2f
            b1.i r0 = new b1.i
            r0.<init>()
            b1.AbstractC1497f.f19128a = r0
            goto L4f
        L2f:
            r1 = 24
            if (r0 < r1) goto L48
            java.lang.reflect.Method r0 = b1.C1499h.f19137e
            if (r0 != 0) goto L3e
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L3e:
            if (r0 == 0) goto L48
            b1.h r0 = new b1.h
            r0.<init>()
            b1.AbstractC1497f.f19128a = r0
            goto L4f
        L48:
            b1.g r0 = new b1.g
            r0.<init>()
            b1.AbstractC1497f.f19128a = r0
        L4f:
            x.j r0 = new x.j
            r1 = 16
            r0.<init>(r1)
            b1.AbstractC1497f.f19129b = r0
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.AbstractC1497f.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, a1.InterfaceC1314d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, a1.AbstractC1312b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.AbstractC1497f.a(android.content.Context, a1.d, android.content.res.Resources, int, java.lang.String, int, int, a1.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i5, String str, int i10, int i11) {
        return resources.getResourcePackageName(i5) + '-' + str + '-' + i10 + '-' + i5 + '-' + i11;
    }
}
