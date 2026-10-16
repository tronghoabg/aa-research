package com.waze.sound;

import com.waze.jni.protos.sound.TtsVoice;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ef extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f39898b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f39899c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f39900d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f39901e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f39902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(TtsNativeManager ttsNativeManager, TtsVoice ttsVoice, String str, String str2, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39902f = i2;
        this.f39901e = ttsNativeManager;
        this.f39900d = ttsVoice;
        this.f39899c = str;
        this.f39898b = str2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f39902f;
        if (i2 == 0) {
            Object obj2 = this.f39898b;
            return new ef((el) obj2, (kotlinx.coroutines.a.o) this.f39899c, (com.waze.h.c.a) this.f39900d, (com.waze.h.c.b) this.f39901e, eVar, 0);
        }
        if (i2 != 1) {
            Object obj3 = this.f39901e;
            Object obj4 = this.f39900d;
            return new ef((TtsNativeManager) obj3, (TtsVoice) obj4, (String) this.f39899c, (String) this.f39898b, eVar, 2);
        }
        Object obj5 = this.f39900d;
        Object obj6 = this.f39901e;
        return new ef((eb) obj5, (jn) obj6, (com.waze.sound.a.b) this.f39898b, (String) this.f39899c, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f39902f;
        return i2 != 0 ? i2 != 1 ? ((ef) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ef) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ef) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0193, code lost:
    
        if (kotlinx.coroutines.aj.v(r1.f39879e, new com.waze.sound.ea((java.util.List) r13, r1, (java.lang.String) r12.f39899c, null), r12) == r0) goto L50;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ef.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(eb ebVar, jn jnVar, com.waze.sound.a.b bVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39902f = i2;
        this.f39900d = ebVar;
        this.f39901e = jnVar;
        this.f39898b = bVar;
        this.f39899c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(el elVar, kotlinx.coroutines.a.o oVar, com.waze.h.c.a aVar, com.waze.h.c.b bVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39902f = i2;
        this.f39898b = elVar;
        this.f39899c = oVar;
        this.f39900d = aVar;
        this.f39901e = bVar;
    }
}
