package Fd;

import Jd.H;
import Jd.m;
import Jd.o;
import Jd.s;
import jf.InterfaceC3108h;
import xd.C4511c;

/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C4511c f4040a;

    /* renamed from: b, reason: collision with root package name */
    public final s f4041b;

    /* renamed from: c, reason: collision with root package name */
    public final H f4042c;

    /* renamed from: d, reason: collision with root package name */
    public final o f4043d;

    /* renamed from: e, reason: collision with root package name */
    public final Nd.d f4044e;

    public a(C4511c c4511c, d dVar) {
        this.f4040a = c4511c;
        this.f4041b = dVar.f4052b;
        this.f4042c = dVar.f4051a;
        this.f4043d = dVar.f4053c;
        this.f4044e = dVar.f4056f;
    }

    @Override // Jd.q
    public final m a() {
        return this.f4043d;
    }

    @Override // Fd.b
    public final Nd.d b() {
        return this.f4044e;
    }

    @Override // Fd.b, Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f4040a.getCoroutineContext();
    }

    @Override // Fd.b
    public final H getUrl() {
        return this.f4042c;
    }

    @Override // Fd.b
    public final s h() {
        return this.f4041b;
    }
}
