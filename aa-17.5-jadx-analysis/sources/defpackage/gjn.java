package defpackage;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class gjn {
    public static final yob a = yob.c("com/android/car/libraries/apphost/external/graphics/CachingColorExtractor");
    public final ieb b;
    private final ConcurrentHashMap c;
    private final boolean d;

    public gjn(ieb iebVar, ConcurrentHashMap concurrentHashMap, boolean z) {
        this.b = iebVar;
        this.c = concurrentHashMap;
        this.d = z;
    }

    protected static final int[] b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x02c6 A[EDGE_INSN: B:239:0x02c6->B:77:0x02c6 BREAK  A[LOOP:6: B:28:0x0170->B:75:0x02bb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bb A[LOOP:6: B:28:0x0170->B:75:0x02bb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(android.graphics.Bitmap r38) {
        /*
            Method dump skipped, instructions count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjn.c(android.graphics.Bitmap):int");
    }

    public final int a(Bitmap bitmap) {
        int i = 0;
        if (bitmap.isRecycled()) {
            ((ynz) a.h().o(ypi.a, "CarApp.H").ai(56)).u("Bitmap was recycled while extracting the color.");
            return 0;
        }
        if (bitmap.getWidth() > 128 && bitmap.getHeight() > 128) {
            bitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, false);
            bitmap.getClass();
        }
        if (!this.d) {
            return c(bitmap);
        }
        yob yobVar = a;
        yop yopVarE = yobVar.e();
        yos yosVar = ypi.a;
        ((ynz) yopVarE.o(yosVar, "CarApp.H").ai(54)).u("Attempting to get computed color");
        ConcurrentHashMap concurrentHashMap = this.c;
        int[] iArrB = b(bitmap);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArrB.length * 4);
        byteBufferAllocate.getClass();
        for (int i2 : iArrB) {
            byteBufferAllocate.putInt(i2);
        }
        byteBufferAllocate.position(0);
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, Integer.valueOf(byteBufferAllocate.hashCode()), new gjm(new fzl(bitmap, 17), i));
        objComputeIfAbsent.getClass();
        int iIntValue = ((Number) objComputeIfAbsent).intValue();
        ((ynz) yobVar.e().o(yosVar, "CarApp.H").ai(55)).y("Computed color #%s", afyh.G(aiht.a(iIntValue), 8));
        return iIntValue;
    }
}
