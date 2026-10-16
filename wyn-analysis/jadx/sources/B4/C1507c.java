package b4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import cg.C1618g;
import java.io.File;
import java.nio.ByteBuffer;
import jf.InterfaceC3103c;
import u3.p;
import vf.AbstractC4345a;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507c implements InterfaceC1511g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19299a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.l f19300b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19301c;

    public /* synthetic */ C1507c(Object obj, h4.l lVar, int i5) {
        this.f19299a = i5;
        this.f19301c = obj;
        this.f19300b = lVar;
    }

    @Override // b4.InterfaceC1511g
    public final Object a(InterfaceC3103c interfaceC3103c) {
        h4.l lVar = this.f19300b;
        Object obj = this.f19301c;
        switch (this.f19299a) {
            case 0:
                return new C1508d(new BitmapDrawable(lVar.f36118a.getResources(), (Bitmap) obj), false, 2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C1618g c1618g = new C1618g();
                    c1618g.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = lVar.f36118a;
                    Bitmap.Config config = k4.e.f39264a;
                    File cacheDir = context.getCacheDir();
                    cacheDir.mkdirs();
                    return new m(new Z3.m(c1618g, cacheDir, null), null, 2);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config config2 = k4.e.f39264a;
                boolean z2 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof p);
                if (z2) {
                    bitmapDrawable = new BitmapDrawable(lVar.f36118a.getResources(), AbstractC4345a.l(bitmapDrawable, lVar.f36119b, lVar.f36120c, lVar.f36121d, lVar.f36122e));
                }
                return new C1508d(bitmapDrawable, z2, 2);
        }
    }
}
