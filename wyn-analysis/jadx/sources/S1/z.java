package S1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f10920a;

    /* renamed from: b, reason: collision with root package name */
    public long f10921b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f10922c;

    public z(h hVar) {
        hVar.getClass();
        this.f10920a = hVar;
        this.f10922c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // S1.h
    public final void C(A a5) {
        a5.getClass();
        this.f10920a.C(a5);
    }

    @Override // S1.h
    public final void close() {
        this.f10920a.close();
    }

    @Override // S1.h
    public final Map d() {
        return this.f10920a.d();
    }

    @Override // S1.h
    public final Uri k() {
        return this.f10920a.k();
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        int i11 = this.f10920a.read(bArr, i5, i10);
        if (i11 != -1) {
            this.f10921b += i11;
        }
        return i11;
    }

    @Override // S1.h
    public final long y(k kVar) {
        h hVar = this.f10920a;
        this.f10922c = kVar.f10870a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.y(kVar);
        } finally {
            Uri uriK = hVar.k();
            if (uriK != null) {
                this.f10922c = uriK;
            }
            hVar.d();
        }
    }
}
