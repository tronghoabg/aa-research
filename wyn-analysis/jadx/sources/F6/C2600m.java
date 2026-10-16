package f6;

import java.util.HashMap;
import t6.InterfaceC4143k;

/* renamed from: f6.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2600m implements InterfaceC2612y {

    /* renamed from: a, reason: collision with root package name */
    public final C8.i f35074a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4143k f35075b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35076c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35077d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35078e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35079f;

    /* renamed from: g, reason: collision with root package name */
    public final float f35080g;

    public C2600m(InterfaceC4143k interfaceC4143k, J5.i iVar) {
        this.f35075b = interfaceC4143k;
        C8.i iVar2 = new C8.i(iVar);
        this.f35074a = iVar2;
        if (interfaceC4143k != ((InterfaceC4143k) iVar2.f1943f)) {
            iVar2.f1943f = interfaceC4143k;
            ((HashMap) iVar2.f1940c).clear();
            ((HashMap) iVar2.f1942e).clear();
        }
        this.f35076c = -9223372036854775807L;
        this.f35077d = -9223372036854775807L;
        this.f35078e = -9223372036854775807L;
        this.f35079f = -3.4028235E38f;
        this.f35080g = -3.4028235E38f;
    }

    public static InterfaceC2612y b(Class cls, InterfaceC4143k interfaceC4143k) {
        try {
            return (InterfaceC2612y) cls.getConstructor(InterfaceC4143k.class).newInstance(interfaceC4143k);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    @Override // f6.InterfaceC2612y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f6.AbstractC2588a a(E5.C0446d0 r20) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2600m.a(E5.d0):f6.a");
    }
}
