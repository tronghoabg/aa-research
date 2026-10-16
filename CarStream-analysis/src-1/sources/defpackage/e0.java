package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class e0 implements k0, w5, r8 {
    public static void c(byte[] bArr, boolean z) {
        MediaCodec mediaCodec;
        ByteBuffer inputBuffer;
        int[] iArrD;
        r6 r6Var = k1.b;
        if (r6Var == null || bArr.length == 0) {
            return;
        }
        synchronized (r6Var.n) {
            try {
                if (r6Var.f && z && (iArrD = r6.d(bArr)) != null && (iArrD[0] != r6Var.g || iArrD[1] != r6Var.h)) {
                    int i = iArrD[0];
                    int i2 = iArrD[1];
                    r6Var.b();
                }
                if (!r6Var.f) {
                    if (!z) {
                        return;
                    }
                    if (!r6Var.c(bArr)) {
                        return;
                    }
                }
                mediaCodec = r6Var.e;
            } catch (Throwable th) {
                String.valueOf(th);
                r6Var.m++;
                if (r6Var.m <= 5) {
                    u5.d("GIAI MA: NEM LOI lan " + r6Var.m + " — " + th.getClass().getSimpleName() + ": " + th.getMessage() + " (cho khung khoa ke tiep)");
                }
                r6Var.b();
            } finally {
            }
            if (mediaCodec == null) {
                return;
            }
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer >= 0 && (inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer)) != null) {
                inputBuffer.put(bArr);
                mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 1000 * SystemClock.elapsedRealtime(), 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                if (iDequeueOutputBuffer == -1) {
                    break;
                }
                if (iDequeueOutputBuffer >= 0) {
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                    if (!r6Var.i) {
                        r6Var.i = true;
                        c1 c1Var = r6Var.a;
                        ((x5) c1Var.b).g.post(new f(c1Var, 22));
                    }
                    r6Var.a.e();
                } else if (iDequeueOutputBuffer == -2) {
                    try {
                        MediaFormat outputFormat = mediaCodec.getOutputFormat();
                        int integer = outputFormat.getInteger("width");
                        int integer2 = outputFormat.getInteger("height");
                        if (!r6Var.j && (integer != r6Var.g || integer2 != r6Var.h)) {
                            r6Var.j = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static void d(String str) {
        u5.d("MIRROR " + str.replace("[MIRROR] ", ""));
    }

    @Override // defpackage.k0
    public ArrayList a(Context context) {
        Drawable drawable;
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        for (dd ddVar : l0.a) {
            try {
                drawable = context.getDrawable(ddVar.c);
            } catch (Throwable unused) {
                drawable = null;
            }
            String str = ddVar.a;
            String str2 = ddVar.b;
            String strSubstring = ddVar.d;
            if (strSubstring == null || strSubstring.isEmpty()) {
                strSubstring = "";
            } else if (strSubstring.startsWith("file:")) {
                strSubstring = "media".equals(ddVar.a) ? "Tệp trong điện thoại" : "Trang trong ứng dụng";
            } else {
                int iIndexOf2 = strSubstring.indexOf("://");
                if (iIndexOf2 >= 0 && (iIndexOf = (strSubstring = strSubstring.substring(iIndexOf2 + 3)).indexOf(47)) >= 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
            }
            arrayList.add(new j0(str, str2, strSubstring, drawable));
        }
        return arrayList;
    }

    @Override // defpackage.r8
    public void b(bd bdVar) {
    }

    @Override // defpackage.r8
    public void seekTo(long j) {
    }
}
