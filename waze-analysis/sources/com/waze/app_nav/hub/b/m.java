package com.waze.app_nav.hub.b;

import android.app.Dialog;
import android.media.AudioAttributes;
import androidx.media3.common.AudioAttributes;
import com.waze.car_lib.p.dh;
import com.waze.navigate.bv;
import com.waze.navigate.ea;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class m {
    public /* synthetic */ m(byte[] bArr) {
    }

    public static i a(Dialog dialog) {
        x.f(dialog, "<this>");
        return new h(dialog, (byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(kotlinx.coroutines.CompletableDeferred r4, com.waze.app_nav.hub.b.c r5, com.waze.app_nav.hub.b.k r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.app_nav.hub.b.l
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.app_nav.hub.b.l r0 = (com.waze.app_nav.hub.b.l) r0
            int r1 = r0.f15278c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15278c = r1
            goto L18
        L13:
            com.waze.app_nav.hub.b.l r0 = new com.waze.app_nav.hub.b.l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15277b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15278c
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.waze.app_nav.hub.b.k r6 = r0.f15279d
            r4 = r6
            com.waze.app_nav.hub.b.k r4 = (com.waze.app_nav.hub.b.k) r4
            java.lang.Object r4 = r0.f15276a
            r5 = r4
            com.waze.app_nav.hub.b.c r5 = (com.waze.app_nav.hub.b.c) r5
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L4f
        L31:
            r4 = move-exception
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            e.b.c.b(r7)
            r0.f15276a = r5     // Catch: java.lang.Throwable -> L31
            r0.f15279d = r6     // Catch: java.lang.Throwable -> L31
            r0.f15278c = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r4.c(r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L4f
            return r1
        L4b:
            java.lang.Object r7 = e.b.c.a(r4)
        L4f:
            java.lang.Throwable r4 = h.m.c(r7)
            if (r4 == 0) goto L58
            r5.c(r6)
        L58:
            e.b.c.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.app_nav.hub.b.m.b(kotlinx.coroutines.CompletableDeferred, com.waze.app_nav.hub.b.c, com.waze.app_nav.hub.b.k, h.c.e):java.lang.Object");
    }

    public static c c() {
        return c.f15258a.a();
    }

    public static AudioAttributes d(com.waze.h.i iVar) {
        x.f(iVar, "<this>");
        com.waze.h.i iVar2 = com.waze.h.i.f24356a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(12).setContentType(1).build();
            x.e(audioAttributesBuild, "build(...)");
            return audioAttributesBuild;
        }
        if (iOrdinal != 1) {
            throw new h.i();
        }
        AudioAttributes audioAttributesBuild2 = new AudioAttributes.Builder().setUsage(16).setContentType(1).build();
        x.e(audioAttributesBuild2, "build(...)");
        return audioAttributesBuild2;
    }

    public static androidx.media3.common.AudioAttributes e(com.waze.h.i iVar) {
        x.f(iVar, "<this>");
        com.waze.h.i iVar2 = com.waze.h.i.f24356a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setContentType(1);
            builder.setUsage(12);
            androidx.media3.common.AudioAttributes audioAttributesBuild = builder.build();
            x.e(audioAttributesBuild, "build(...)");
            return audioAttributesBuild;
        }
        if (iOrdinal != 1) {
            throw new h.i();
        }
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setContentType(1);
        builder2.setUsage(16);
        androidx.media3.common.AudioAttributes audioAttributesBuild2 = builder2.build();
        x.e(audioAttributesBuild2, "build(...)");
        return audioAttributesBuild2;
    }

    public static dh f(ea eaVar, bv bvVar, boolean z) {
        com.waze.car_lib.j.b bVar;
        x.f(eaVar, "<this>");
        x.f(bvVar, "side");
        bv bvVar2 = bv.f31145a;
        ea eaVar2 = ea.f31285a;
        switch (eaVar.ordinal()) {
            case 0:
                return new com.waze.car_lib.j.b(0);
            case 1:
                return new com.waze.car_lib.j.b(7);
            case 2:
                return new com.waze.car_lib.j.b(8);
            case 3:
                return new com.waze.car_lib.j.b(3);
            case 4:
                return new com.waze.car_lib.j.b(4);
            case 5:
                return new com.waze.car_lib.j.b(36);
            case 6:
                return z ? i(bvVar) : g(bvVar);
            case 7:
                return z ? i(bvVar) : h(bvVar);
            case 8:
                return g(bvVar);
            case 9:
                return h(bvVar);
            case 10:
                return g(bvVar);
            case 11:
                return h(bvVar);
            case 12:
                return g(bvVar);
            case 13:
                return h(bvVar);
            case 14:
                return g(bvVar);
            case 15:
                return h(bvVar);
            case 16:
                return new com.waze.car_lib.j.b(39);
            case 17:
                return new com.waze.car_lib.j.b(23);
            case 18:
                return new com.waze.car_lib.j.b(24);
            case 19:
                return new com.waze.car_lib.j.b(0);
            case 20:
                int iOrdinal = bvVar.ordinal();
                if (iOrdinal == 0) {
                    bVar = new com.waze.car_lib.j.b(11);
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    bVar = new com.waze.car_lib.j.b(12);
                }
                return bVar;
            case 21:
                return new com.waze.car_lib.j.b(0);
            case 22:
                return new com.waze.car_lib.j.b(5);
            case 23:
                return new com.waze.car_lib.j.b(9);
            case 24:
                return new com.waze.car_lib.j.b(6);
            case 25:
                return new com.waze.car_lib.j.b(18);
            case 26:
                return new com.waze.car_lib.j.b(0);
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return new com.waze.car_lib.j.b(0);
            default:
                throw new h.i();
        }
    }

    private static com.waze.car_lib.j.b g(bv bvVar) {
        bv bvVar2 = bv.f31145a;
        ea eaVar = ea.f31285a;
        int iOrdinal = bvVar.ordinal();
        if (iOrdinal == 0) {
            return new com.waze.car_lib.j.b(45);
        }
        if (iOrdinal == 1) {
            return new com.waze.car_lib.j.b(43);
        }
        throw new h.i();
    }

    private static com.waze.car_lib.j.b h(bv bvVar) {
        bv bvVar2 = bv.f31145a;
        ea eaVar = ea.f31285a;
        int iOrdinal = bvVar.ordinal();
        if (iOrdinal == 0) {
            return new com.waze.car_lib.j.b(46);
        }
        if (iOrdinal == 1) {
            return new com.waze.car_lib.j.b(44);
        }
        throw new h.i();
    }

    private static com.waze.car_lib.j.c i(bv bvVar) {
        bv bvVar2 = bv.f31145a;
        ea eaVar = ea.f31285a;
        int iOrdinal = bvVar.ordinal();
        if (iOrdinal == 0) {
            return new com.waze.car_lib.j.c(34);
        }
        if (iOrdinal == 1) {
            return new com.waze.car_lib.j.c(32);
        }
        throw new h.i();
    }

    private m() {
        throw null;
    }

    public m(byte[] bArr, byte[] bArr2) {
    }
}
