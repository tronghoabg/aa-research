package com.waze.sound.c;

import h.ab;
import h.g.b.x;
import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f39635a;

    /* renamed from: b, reason: collision with root package name */
    Object f39636b;

    /* renamed from: c, reason: collision with root package name */
    int f39637c;

    /* renamed from: d, reason: collision with root package name */
    int f39638d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f39639e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.h.c.a f39640f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f39641g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f39642h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, com.waze.h.c.a aVar, kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f39639e = rVar;
        this.f39640f = aVar;
        this.f39641g = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        q qVar = new q(this.f39639e, this.f39640f, this.f39641g, eVar);
        qVar.f39642h = obj;
        return qVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int size;
        ByteArrayOutputStream byteArrayOutputStream;
        WritableByteChannel writableByteChannel;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f39638d != 0) {
                size = this.f39637c;
                writableByteChannel = (WritableByteChannel) this.f39636b;
                byteArrayOutputStream = (ByteArrayOutputStream) this.f39635a;
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                r rVar = this.f39639e;
                com.waze.h.c.a aVar2 = this.f39640f;
                kotlinx.coroutines.b.k kVar = this.f39641g;
                com.waze.h.c.b bVarB = aVar2.b();
                Integer numA = bVarB.a();
                if (numA == null) {
                    throw new IllegalArgumentException("Input format " + bVarB.name() + " is not raw PCM and cannot be encoded to WAV.");
                }
                numA.intValue();
                int iA = aVar2.c().a();
                int iA2 = aVar2.d().a();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream2;
                WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(byteArrayOutputStream3);
                r.c(byteArrayOutputStream3, (short) iA, iA2);
                size = byteArrayOutputStream2.size();
                p pVar = new p(writableByteChannelNewChannel);
                this.f39642h = rVar;
                this.f39635a = byteArrayOutputStream2;
                this.f39636b = writableByteChannelNewChannel;
                this.f39637c = size;
                this.f39638d = 1;
                if (kVar.collect(pVar, this) == aVar) {
                    return aVar;
                }
                byteArrayOutputStream = byteArrayOutputStream2;
                writableByteChannel = writableByteChannelNewChannel;
            }
            writableByteChannel.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            x.e(byteArray, "toByteArray(...)");
            int length = byteArray.length;
            r.b(byteArray, 4, length - 8);
            r.b(byteArray, 40, length - size);
            objA = byteArray;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        return h.m.d(objA);
    }
}
