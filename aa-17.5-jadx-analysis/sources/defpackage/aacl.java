package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.maps.model.PatternItem;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aacl {
    public static final Bitmap a = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public static final aacl b = new aacl();

    public static Bitmap a(PatternItem[] patternItemArr, trh trhVar) {
        int i;
        zkt.n(patternItemArr, "patternItems");
        for (PatternItem patternItem : patternItemArr) {
            if (patternItem != null) {
                int type = patternItem.getType();
                if (type == 0) {
                    trhVar.c.add(new trf(-1, Math.round((patternItem.getLength().floatValue() * 8.0f) / trhVar.b)));
                } else if (type == 1) {
                    trhVar.c.add(new trg());
                } else if (type == 2) {
                    trhVar.c.add(new trf(0, Math.round((patternItem.getLength().floatValue() * 8.0f) / trhVar.b)));
                }
            }
        }
        List list = trhVar.c;
        Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((tri) it.next()).a(trhVar.a);
        }
        if (iA == 0 || (i = trhVar.a) == 0) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * 4 * iA);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((tri) it2.next()).b(byteBufferAllocate, i);
        }
        byteBufferAllocate.position(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, iA, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
        return bitmapCreateBitmap;
    }

    public final int b(twq twqVar, Bitmap bitmap, float f) {
        zkt.n(twqVar, "phoenixGoogleMap");
        zkt.n(bitmap, "bitmap");
        return ((txk) twqVar.b.h(bitmap, aaaw.e(f))).e;
    }

    public final void c(twq twqVar, int i) {
        zkt.n(twqVar, "phoenixGoogleMap");
        tqv tqvVar = twqVar.b;
        tqvVar.e(((typ) tqvVar).g.b(i));
    }

    public final int d(twq twqVar, abnp abnpVar, int i, float f) {
        zkt.n(twqVar, "phoenixGoogleMap");
        zkt.n(abnpVar, "strokeStyleBuilder");
        int iE = aaaw.e(f);
        yfq yfqVarQ = yfq.q(new tpq((abes) abnpVar.q(), null, null, null));
        tqv tqvVar = twqVar.b;
        return ((txk) tqvVar.a(i, iE, tqvVar.b(iE, yfqVarQ))).e;
    }
}
