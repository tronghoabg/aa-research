package h0;

import d0.f;
import e0.C2465q;
import e0.r;
import ef.C2539w;
import g0.InterfaceC2663d;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2764b extends AbstractC2765c {

    /* renamed from: f, reason: collision with root package name */
    public final long f35926f;

    /* renamed from: h, reason: collision with root package name */
    public r f35928h;

    /* renamed from: g, reason: collision with root package name */
    public float f35927g = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public final long f35929i = f.f33950c;

    public C2764b(long j8) {
        this.f35926f = j8;
    }

    @Override // h0.AbstractC2765c
    public final boolean a(float f10) {
        this.f35927g = f10;
        return true;
    }

    @Override // h0.AbstractC2765c
    public final boolean b(r rVar) {
        this.f35928h = rVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2764b) {
            return C2465q.b(this.f35926f, ((C2764b) obj).f35926f);
        }
        return false;
    }

    @Override // h0.AbstractC2765c
    public final long f() {
        return this.f35929i;
    }

    @Override // h0.AbstractC2765c
    public final void g(InterfaceC2663d interfaceC2663d) {
        AbstractC3340k.e(interfaceC2663d, "<this>");
        com.google.android.gms.internal.consent_sdk.a.g(interfaceC2663d, this.f35926f, 0L, this.f35927g, this.f35928h, 86);
    }

    public final int hashCode() {
        int i5 = C2465q.f34381j;
        return C2539w.a(this.f35926f);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) C2465q.h(this.f35926f)) + ')';
    }
}
