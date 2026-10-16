package F6;

import G6.AbstractC0552p;
import android.content.Context;

/* loaded from: classes3.dex */
public final class j extends AbstractC0552p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3968a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3969b;

    public /* synthetic */ j(l lVar) {
        this.f3969b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // G6.AbstractC0552p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza() {
        /*
            r8 = this;
            r0 = 0
            int r1 = r8.f3968a
            switch(r1) {
                case 0: goto L4a;
                default: goto L6;
            }
        L6:
            java.lang.Object r1 = r8.f3969b     // Catch: d7.h -> Lf d7.g -> L11 java.lang.IllegalStateException -> L13 java.io.IOException -> L15
            android.content.Context r1 = (android.content.Context) r1     // Catch: d7.h -> Lf d7.g -> L11 java.lang.IllegalStateException -> L13 java.io.IOException -> L15
            boolean r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getIsAdIdFakeForDebugLogging(r1)     // Catch: d7.h -> Lf d7.g -> L11 java.lang.IllegalStateException -> L13 java.io.IOException -> L15
            goto L1d
        Lf:
            r1 = move-exception
            goto L16
        L11:
            r1 = move-exception
            goto L16
        L13:
            r1 = move-exception
            goto L16
        L15:
            r1 = move-exception
        L16:
            int r2 = G6.L.f4523b
            java.lang.String r2 = "Fail to get isAdIdFakeForDebugLogging"
            H6.l.d(r2, r1)
        L1d:
            java.lang.Object r1 = H6.i.f4948b
            monitor-enter(r1)
            r2 = 1
            H6.i.f4949c = r2     // Catch: java.lang.Throwable -> L47
            H6.i.f4950d = r0     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 38
            r2.<init>(r1)
            java.lang.String r1 = "Update ad debug logging enablement as "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = G6.L.f4523b
            H6.l.f(r0)
            return
        L47:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r0
        L4a:
            C6.n r1 = C6.n.f1857D
            Y9.c r1 = r1.f1883x
            java.lang.Object r2 = r8.f3969b
            F6.l r2 = (F6.l) r2
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r2.f3972b
            C6.g r3 = r3.f26321o
            int r3 = r3.f1836f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.f16739b
            j$.util.concurrent.ConcurrentHashMap r1 = (j$.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r3)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto Ld9
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r2.f3972b
            C6.g r3 = r3.f26321o
            boolean r4 = r3.f1834d
            android.app.Activity r2 = r2.f3971a
            if (r4 == 0) goto Lc4
            float r3 = r3.f1835e
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lc4
            r4 = 1103626240(0x41c80000, float:25.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L80
            goto Lc4
        L80:
            int r4 = r1.getWidth()     // Catch: java.lang.RuntimeException -> Lba
            int r5 = r1.getHeight()     // Catch: java.lang.RuntimeException -> Lba
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r1, r4, r5, r0)     // Catch: java.lang.RuntimeException -> Lba
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r4)     // Catch: java.lang.RuntimeException -> Lba
            android.renderscript.RenderScript r6 = android.renderscript.RenderScript.create(r2)     // Catch: java.lang.RuntimeException -> Lba
            android.renderscript.Element r7 = android.renderscript.Element.U8_4(r6)     // Catch: java.lang.RuntimeException -> Lba
            android.renderscript.ScriptIntrinsicBlur r7 = android.renderscript.ScriptIntrinsicBlur.create(r6, r7)     // Catch: java.lang.RuntimeException -> Lba
            android.renderscript.Allocation r4 = android.renderscript.Allocation.createFromBitmap(r6, r4)     // Catch: java.lang.RuntimeException -> Lba
            android.renderscript.Allocation r6 = android.renderscript.Allocation.createFromBitmap(r6, r5)     // Catch: java.lang.RuntimeException -> Lba
            r7.setRadius(r3)     // Catch: java.lang.RuntimeException -> Lba
            r7.setInput(r4)     // Catch: java.lang.RuntimeException -> Lba
            r7.forEach(r6)     // Catch: java.lang.RuntimeException -> Lba
            r6.copyTo(r5)     // Catch: java.lang.RuntimeException -> Lba
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.RuntimeException -> Lba
            android.content.res.Resources r4 = r2.getResources()     // Catch: java.lang.RuntimeException -> Lba
            r3.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> Lba
            goto Lcd
        Lba:
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r2.getResources()
            r3.<init>(r2, r1)
            goto Lcd
        Lc4:
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r2.getResources()
            r3.<init>(r2, r1)
        Lcd:
            G6.M r1 = G6.U.f4562l
            A7.p r2 = new A7.p
            r4 = 17
            r2.<init>(r8, r0, r3, r4)
            r1.post(r2)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.j.zza():void");
    }

    public j(Context context) {
        this.f3969b = context;
    }
}
