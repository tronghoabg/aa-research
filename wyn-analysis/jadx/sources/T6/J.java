package t6;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class J implements InterfaceC4144l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4144l f45841a;

    /* renamed from: b, reason: collision with root package name */
    public long f45842b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f45843c;

    public J(InterfaceC4144l interfaceC4144l) {
        interfaceC4144l.getClass();
        this.f45841a = interfaceC4144l;
        this.f45843c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        this.f45841a.close();
    }

    @Override // t6.InterfaceC4144l
    public final Map d() {
        return this.f45841a.d();
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f45841a.k();
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        int i11 = this.f45841a.read(bArr, i5, i10);
        if (i11 != -1) {
            this.f45842b += i11;
        }
        return i11;
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) {
        this.f45843c = nVar.f45879a;
        Map map = Collections.EMPTY_MAP;
        InterfaceC4144l interfaceC4144l = this.f45841a;
        long jT = interfaceC4144l.t(nVar);
        Uri uriK = interfaceC4144l.k();
        uriK.getClass();
        this.f45843c = uriK;
        interfaceC4144l.d();
        return jT;
    }

    @Override // t6.InterfaceC4144l
    public final void z(K k) {
        k.getClass();
        this.f45841a.z(k);
    }
}
