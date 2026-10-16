package E5;

import Va.C1038ka;
import android.content.Context;

/* renamed from: E5.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0463m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3461a;

    /* renamed from: b, reason: collision with root package name */
    public final C1038ka f3462b = new C1038ka(27);

    public C0463m(Context context) {
        this.f3461a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E5.AbstractC0449f[] a(android.os.Handler r10, E5.F r11, E5.F r12, E5.F r13, E5.F r14) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v6.f r1 = new v6.f
            Va.ka r4 = r9.f3462b
            android.content.Context r2 = r9.f3461a
            r1.<init>(r2, r4, r10, r11)
            r0.add(r1)
            Dd.c r11 = new Dd.c
            r1 = 5
            r3 = 0
            r11.<init>(r1, r3)
            G5.j r1 = G5.C0529j.f4416c
            r11.f2642b = r1
            G5.H r3 = G5.H.f4311a
            r11.f2644d = r3
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r5 = "android.media.action.HDMI_AUDIO_PLUG"
            r3.<init>(r5)
            r5 = 0
            android.content.Intent r3 = u6.v.C(r2, r5, r3)
            int r5 = u6.v.f46721a
            r6 = 17
            r8 = 0
            if (r5 < r6) goto L55
            java.lang.String r6 = u6.v.f46723c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L45
            java.lang.String r7 = "Xiaomi"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L55
        L45:
            android.content.ContentResolver r6 = r2.getContentResolver()
            java.lang.String r7 = "external_surround_sound_enabled"
            int r6 = android.provider.Settings.Global.getInt(r6, r7, r8)
            r7 = 1
            if (r6 != r7) goto L55
            G5.j r1 = G5.C0529j.f4417d
            goto L97
        L55:
            r6 = 29
            r7 = 8
            if (r5 < r6) goto L7b
            boolean r6 = u6.v.x(r2)
            if (r6 != 0) goto L71
            r6 = 23
            if (r5 < r6) goto L7b
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r5 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r5)
            if (r2 == 0) goto L7b
        L71:
            G5.j r1 = new G5.j
            int[] r2 = G5.AbstractC0528i.a()
            r1.<init>(r7, r2)
            goto L97
        L7b:
            if (r3 == 0) goto L97
            java.lang.String r2 = "android.media.extra.AUDIO_PLUG_STATE"
            int r2 = r3.getIntExtra(r2, r8)
            if (r2 != 0) goto L86
            goto L97
        L86:
            G5.j r1 = new G5.j
            java.lang.String r2 = "android.media.extra.ENCODINGS"
            int[] r2 = r3.getIntArrayExtra(r2)
            java.lang.String r5 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r3 = r3.getIntExtra(r5, r7)
            r1.<init>(r3, r2)
        L97:
            r1.getClass()
            r11.f2642b = r1
            java.lang.Object r1 = r11.f2643c
            G9.e r1 = (G9.e) r1
            if (r1 != 0) goto Lab
            G9.e r1 = new G9.e
            G5.m[] r2 = new G5.InterfaceC0532m[r8]
            r1.<init>(r2)
            r11.f2643c = r1
        Lab:
            G5.G r7 = new G5.G
            r7.<init>(r11)
            G5.K r2 = new G5.K
            android.content.Context r3 = r9.f3461a
            r5 = r10
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            android.os.Looper r10 = r5.getLooper()
            h6.k r11 = new h6.k
            r11.<init>(r13, r10)
            r0.add(r11)
            android.os.Looper r10 = r5.getLooper()
            W5.f r11 = new W5.f
            r11.<init>(r14, r10)
            r0.add(r11)
            w6.b r10 = new w6.b
            r10.<init>()
            r0.add(r10)
            E5.f[] r10 = new E5.AbstractC0449f[r8]
            java.lang.Object[] r10 = r0.toArray(r10)
            E5.f[] r10 = (E5.AbstractC0449f[]) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.C0463m.a(android.os.Handler, E5.F, E5.F, E5.F, E5.F):E5.f[]");
    }
}
