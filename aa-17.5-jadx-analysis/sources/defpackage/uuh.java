package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class uuh {
    private static final yob d = yob.c("com/google/android/libraries/geo/mapcore/renderer/GlSnapshotter");
    public final Runnable b;
    public boolean c;
    private final ArrayList e = new ArrayList();
    public final ArrayList a = new ArrayList();

    public uuh(Runnable runnable) {
        this.b = runnable;
    }

    public final synchronized void a(int i, int i2) {
        int i3 = i;
        synchronized (this) {
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                aact aactVar = (aact) arrayList.get(i4);
                vaq.d();
                Bitmap bitmapCreateBitmap = aactVar.a;
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                }
                if (bitmapCreateBitmap.getWidth() != i3 || bitmapCreateBitmap.getHeight() != i2) {
                    ((ynz) ((ynz) d.h()).ai(9673)).u("Target bitmap doesn't have the right size");
                    bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                }
                int i5 = i3 * i2 * 4;
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i5);
                if (byteBufferAllocateDirect.capacity() < i5 || !byteBufferAllocateDirect.isDirect()) {
                    ((ynz) ((ynz) d.h()).ai(9674)).u("ByteBuffer has the wrong size or isn't direct");
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(i5);
                }
                ByteBuffer byteBuffer = byteBufferAllocateDirect;
                vaq.d();
                int width = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                byteBuffer.clear();
                vaq.d();
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, byteBuffer);
                if (GLES20.glGetError() != 0) {
                    vaq.d();
                    aactVar.a(null);
                    i4++;
                    i3 = i;
                } else {
                    byteBuffer.rewind();
                    IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
                    int[] iArr = new int[width];
                    int[] iArr2 = new int[width];
                    for (int i6 = 0; i6 < height / 2; i6++) {
                        int i7 = i6 * width;
                        int i8 = ((height - i6) - 1) * width;
                        intBufferAsIntBuffer.position(i7);
                        intBufferAsIntBuffer.get(iArr);
                        intBufferAsIntBuffer.position(i8);
                        intBufferAsIntBuffer.get(iArr2);
                        intBufferAsIntBuffer.position(i8);
                        intBufferAsIntBuffer.put(iArr);
                        intBufferAsIntBuffer.position(i7);
                        intBufferAsIntBuffer.put(iArr2);
                    }
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                    vaq.d();
                    aactVar.a(bitmapCreateBitmap);
                    i4++;
                    i3 = i;
                }
            }
            this.e.clear();
        }
    }

    public final synchronized void b() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.a;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    public final synchronized void c(boolean z) {
        this.c = z;
        if (z) {
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((aact) arrayList.get(i)).a(null);
            }
            arrayList.clear();
            ArrayList arrayList2 = this.a;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((aact) arrayList2.get(i2)).a(null);
            }
            arrayList2.clear();
        }
    }
}
