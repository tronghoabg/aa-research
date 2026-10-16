package L4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: L4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709a implements B4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6888a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6889b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6890c;

    public /* synthetic */ C0709a(int i5, Object obj, Object obj2) {
        this.f6888a = i5;
        this.f6889b = obj;
        this.f6890c = obj2;
    }

    @Override // B4.i
    public final E4.B a(Object obj, int i5, int i10, B4.g gVar) {
        boolean z2;
        t tVar;
        Y4.f fVar;
        switch (this.f6888a) {
            case 0:
                E4.B bA = ((B4.i) this.f6889b).a(obj, i5, i10, gVar);
                if (bA == null) {
                    return null;
                }
                return new c((Resources) this.f6890c, bA);
            case 1:
                E4.B bC = ((N4.b) this.f6889b).c((Uri) obj);
                if (bC == null) {
                    return null;
                }
                return o.a((F4.a) this.f6890c, (Drawable) ((N4.a) bC).get(), i5, i10);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof t) {
                    tVar = (t) inputStream;
                    z2 = false;
                } else {
                    z2 = true;
                    tVar = new t(inputStream, (F4.f) this.f6890c);
                }
                ArrayDeque arrayDeque = Y4.f.f16686c;
                synchronized (arrayDeque) {
                    fVar = (Y4.f) arrayDeque.poll();
                }
                if (fVar == null) {
                    fVar = new Y4.f();
                }
                Y4.f fVar2 = fVar;
                fVar2.f16687a = tVar;
                Y4.j jVar = new Y4.j(fVar2);
                S3.e eVar = new S3.e(tVar, false, fVar2, 10);
                try {
                    m mVar = (m) this.f6889b;
                    c cVarA = mVar.a(new G9.e(mVar.f6915c, jVar, mVar.f6916d), i5, i10, gVar, eVar);
                    fVar2.a();
                    if (z2) {
                        tVar.b();
                    }
                    return cVarA;
                } finally {
                }
        }
    }

    @Override // B4.i
    public final boolean b(Object obj, B4.g gVar) {
        switch (this.f6888a) {
            case 0:
                return ((B4.i) this.f6889b).b(obj, gVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((m) this.f6889b).getClass();
                return true;
        }
    }

    public C0709a(Resources resources, B4.i iVar) {
        this.f6888a = 0;
        this.f6890c = resources;
        this.f6889b = iVar;
    }
}
