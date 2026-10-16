package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private final bl f40749a;

    /* renamed from: b, reason: collision with root package name */
    private String f40750b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.copilot.a.z f40751c;

    public bn(bl blVar, com.waze.copilot.a.z zVar) {
        h.g.b.x.f(blVar, "serviceName");
        h.g.b.x.f(zVar, "statSender");
        this.f40749a = blVar;
        this.f40751c = zVar;
    }

    public final void a(boolean z) {
        this.f40751c.b(z, this.f40750b, this.f40749a);
    }

    public final void b() {
        this.f40751c.c(this.f40750b, this.f40749a);
    }

    public final void c(bb bbVar, boolean z) {
        h.g.b.x.f(bbVar, "function");
        this.f40751c.d(bbVar, z, this.f40750b, this.f40749a);
    }

    public final void d(bb bbVar) {
        h.g.b.x.f(bbVar, "function");
        this.f40751c.e(bbVar, this.f40750b, this.f40749a);
    }

    public final void e() {
        this.f40751c.f(this.f40750b, this.f40749a);
    }

    public final void f(bc bcVar, String str) {
        h.g.b.x.f(bcVar, "reason");
        this.f40751c.g(bcVar, str, this.f40750b, this.f40749a);
    }

    public final void g(String str) {
        h.g.b.x.f(str, "conversationId");
        this.f40751c.h(str, this.f40749a);
    }

    public final void h() {
        this.f40751c.i(this.f40750b, this.f40749a);
    }

    public final void i(String str) {
        h.g.b.x.f(str, "conversationId");
        this.f40751c.j(str, this.f40749a);
    }

    public final void j(String str) {
        h.g.b.x.f(str, "conversationId");
        this.f40751c.k(str, this.f40749a);
    }

    public final void k(bm bmVar) {
        h.g.b.x.f(bmVar, "firstSpeaker");
        this.f40751c.l(bmVar, this.f40750b, this.f40749a);
    }

    public final void l() {
        this.f40751c.m(this.f40750b, this.f40749a);
    }

    public final void m(String str) {
        this.f40750b = str;
    }

    public final void n(boolean z) {
        this.f40751c.n(z, this.f40750b, this.f40749a);
    }

    public final void o() {
        this.f40751c.o(this.f40750b, this.f40749a);
    }

    public final void q(com.waze.z.a.b.n nVar) {
        h.g.b.x.f(nVar, "chunk");
        this.f40751c.p(nVar, this.f40750b, this.f40749a);
    }

    public final void r(com.waze.z.a.b.n nVar) {
        h.g.b.x.f(nVar, "request");
        this.f40751c.q(nVar, this.f40750b, this.f40749a);
    }
}
