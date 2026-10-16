package b4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505a implements InterfaceC1510f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19295a;

    public /* synthetic */ C1505a(int i5) {
        this.f19295a = i5;
    }

    @Override // b4.InterfaceC1510f
    public final InterfaceC1511g a(Object obj, h4.l lVar) {
        switch (this.f19295a) {
            case 0:
                Uri uri = (Uri) obj;
                if (k4.e.c(uri)) {
                    return new C1506b(uri, lVar, 0);
                }
                return null;
            case 1:
                return new C1507c((Bitmap) obj, lVar, 0);
            case 2:
                return new C1507c((ByteBuffer) obj, lVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC3340k.a(uri2.getScheme(), "content")) {
                    return new C1506b(uri2, lVar, 1);
                }
                return null;
            case 4:
                return new C1507c((Drawable) obj, lVar, 2);
            case 5:
                return new C1512h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC3340k.a(uri3.getScheme(), "android.resource")) {
                    return new C1506b(uri3, lVar, 2);
                }
                return null;
        }
    }
}
