package L4;

import android.os.ParcelFileDescriptor;
import c8.C1581e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d implements B4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6897a;

    /* renamed from: b, reason: collision with root package name */
    public final m f6898b;

    public /* synthetic */ d(m mVar, int i5) {
        this.f6897a = i5;
        this.f6898b = mVar;
    }

    @Override // B4.i
    public final E4.B a(Object obj, int i5, int i10, B4.g gVar) {
        switch (this.f6897a) {
            case 0:
                int i11 = Y4.c.f16682a;
                Y4.a aVar = new Y4.a((ByteBuffer) obj);
                C1581e c1581e = m.k;
                m mVar = this.f6898b;
                return mVar.a(new G9.e(mVar.f6915c, aVar, mVar.f6916d), i5, i10, gVar, c1581e);
            default:
                m mVar2 = this.f6898b;
                return mVar2.a(new b7.k((ParcelFileDescriptor) obj, mVar2.f6916d, mVar2.f6915c), i5, i10, gVar, m.k);
        }
    }

    @Override // B4.i
    public final boolean b(Object obj, B4.g gVar) {
        switch (this.f6897a) {
            case 0:
                this.f6898b.getClass();
                break;
            default:
                this.f6898b.getClass();
                break;
        }
        return true;
    }
}
