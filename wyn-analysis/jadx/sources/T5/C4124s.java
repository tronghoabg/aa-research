package t5;

import Va.C1038ka;
import android.content.Context;
import df.InterfaceC2432a;
import v5.InterfaceC4301b;
import z5.C4616a;
import za.C4658a;

/* renamed from: t5.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4124s implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45803a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4301b f45804b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f45805c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4301b f45806d;

    public /* synthetic */ C4124s(InterfaceC4301b interfaceC4301b, InterfaceC2432a interfaceC2432a, InterfaceC4301b interfaceC4301b2, int i5) {
        this.f45803a = i5;
        this.f45804b = interfaceC4301b;
        this.f45805c = interfaceC2432a;
        this.f45806d = interfaceC4301b2;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f45803a) {
            case 0:
                return new C4123r(new C1038ka(15), new C4658a(14), (y5.c) ((y5.b) this.f45804b).get(), (z5.f) ((z5.g) this.f45805c).get(), (z5.h) ((z5.i) this.f45806d).get());
            default:
                return new z5.c((Context) ((A5.e) this.f45804b).f354b, (A5.d) this.f45805c.get(), (C4616a) ((C4119n) this.f45806d).get());
        }
    }
}
