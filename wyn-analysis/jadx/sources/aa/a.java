package Aa;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Bitmap f1247a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ByteBuffer f1248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1249c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1250d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1251e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1252f;

    public a(Bitmap bitmap) {
        AbstractC1732v.i(bitmap);
        this.f1247a = bitmap;
        this.f1249c = bitmap.getWidth();
        this.f1250d = bitmap.getHeight();
        this.f1251e = 0;
        this.f1252f = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[PHI: r11
  0x00a4: PHI (r11v5 android.graphics.Matrix) = (r11v1 android.graphics.Matrix), (r11v2 android.graphics.Matrix) binds: [B:37:0x00a1, B:46:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008c, B:37:0x00a1, B:48:0x00d2, B:50:0x00dc, B:39:0x00a6, B:40:0x00aa, B:41:0x00b1, B:42:0x00b5, B:43:0x00bc, B:44:0x00c0, B:46:0x00c7, B:35:0x0088, B:32:0x0078, B:54:0x00ff, B:55:0x0106), top: B:65:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Aa.a a(android.content.Context r17, android.net.Uri r18) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Aa.a.a(android.content.Context, android.net.Uri):Aa.a");
    }

    public a(ByteBuffer byteBuffer, int i5, int i10, int i11, int i12) {
        boolean z2;
        if (i12 == 842094169) {
            z2 = true;
        } else if (i12 == 17) {
            i12 = 17;
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC1732v.b(z2);
        AbstractC1732v.i(byteBuffer);
        this.f1248b = byteBuffer;
        AbstractC1732v.a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i5 * i10);
        byteBuffer.rewind();
        this.f1249c = i5;
        this.f1250d = i10;
        AbstractC1732v.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270);
        this.f1251e = i11;
        this.f1252f = i12;
    }
}
