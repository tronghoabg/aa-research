package com.google.firebase.sessions.b;

import h.ab;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f10869a;

    /* renamed from: b, reason: collision with root package name */
    Object f10870b;

    /* renamed from: c, reason: collision with root package name */
    int f10871c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f10872d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f10873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f10873e = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f10873e, eVar);
        cVar.f10872d = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((JSONObject) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        if (r0.i(r4, r17) != r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        if (r4.h(r2, r17) != r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018f, code lost:
    
        if (r17.f10873e.f().g(new java.lang.Long(java.lang.System.currentTimeMillis()), r17) != r5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
