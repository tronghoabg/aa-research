package com.waze.o.b.b;

import com.waze.navigate.db;
import com.waze.o.c.c.a.p;
import com.waze.sound.bs;
import com.waze.t.b.aj;
import com.waze.t.b.bb;
import com.waze.t.b.bz;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32720a;

    /* renamed from: b, reason: collision with root package name */
    private final bs f32721b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.i f32722c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.o.c.c.a.e f32723d;

    /* renamed from: e, reason: collision with root package name */
    private final db f32724e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.o.c.c.a.d f32725f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.o.c.c.a.i f32726g;

    /* renamed from: h, reason: collision with root package name */
    private final p f32727h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bl.c.b f32728i;

    public /* synthetic */ c(com.waze.shared_infra.i.e eVar, bs bsVar, com.waze.shared_infra.i.i iVar, com.waze.o.c.c.a.e eVar2, db dbVar, com.waze.o.c.c.a.d dVar, com.waze.o.c.c.a.i iVar2, p pVar, com.waze.bl.c.b bVar) {
        this.f32720a = eVar;
        this.f32721b = bsVar;
        this.f32722c = iVar;
        this.f32723d = eVar2;
        this.f32724e = dbVar;
        this.f32725f = dVar;
        this.f32726g = iVar2;
        this.f32727h = pVar;
        this.f32728i = bVar;
    }

    @Override // com.waze.t.b.aj
    public final /* bridge */ /* synthetic */ bb a(Object obj) {
        bz bzVar = (bz) obj;
        x.f(bzVar, "action");
        if (bzVar instanceof com.waze.o.c.b.a) {
            return bb.f40719g;
        }
        if (bzVar instanceof com.waze.o.c.b.b) {
            return bb.f40722j;
        }
        if (bzVar instanceof com.waze.o.c.b.c) {
            return this.f32728i.a(((com.waze.o.c.b.c) bzVar).a());
        }
        if (bzVar instanceof com.waze.o.c.b.d) {
            return bb.f40723k;
        }
        if (bzVar instanceof com.waze.o.c.b.e) {
            return bb.f40721i;
        }
        if (bzVar instanceof com.waze.o.c.b.f) {
            return bb.f40724l;
        }
        if (bzVar instanceof com.waze.o.c.b.i) {
            return bb.f40718f;
        }
        throw new h.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x025e, code lost:
    
        if (r13 != r1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r13 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (r13 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fb, code lost:
    
        if (r13 != r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0228, code lost:
    
        if (r13 != r1) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.t.b.aj
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.t.b.bz r11, com.waze.t.b.ar r12, h.c.e r13) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.b.b.c.b(com.waze.t.b.bz, com.waze.t.b.ar, h.c.e):java.lang.Object");
    }
}
