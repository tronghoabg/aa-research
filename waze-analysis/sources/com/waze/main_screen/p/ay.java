package com.waze.main_screen.p;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27073a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.l.bp f27074b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f27075c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bf f27076d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f27077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(bf bfVar, float f2, com.waze.ui.l.bp bpVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27077e = i2;
        this.f27076d = bfVar;
        this.f27075c = f2;
        this.f27074b = bpVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27077e;
        return i2 != 0 ? i2 != 1 ? new ay(this.f27076d, this.f27075c, this.f27074b, eVar, 2) : new ay(this.f27074b, this.f27075c, this.f27076d, eVar, 1, null) : new ay(this.f27074b, this.f27075c, this.f27076d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27077e;
        return i2 != 0 ? i2 != 1 ? ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27077e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f27073a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.ui.l.bp bpVar = this.f27074b;
                boolean zF = bpVar.f();
                float fB = this.f27075c;
                if (!zF) {
                    fB = fB + bpVar.b() + 16.0f;
                }
                this.f27073a = 1;
                if (Animatable.animateTo$default(this.f27076d.d(), Dp.m11162boximpl(fB), null, null, null, this, 14, null) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f27073a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                bf bfVar = this.f27076d;
                float f2 = this.f27075c;
                com.waze.ui.l.bp bpVar2 = this.f27074b;
                this.f27073a = 1;
                if (Animatable.animateTo$default(bfVar.d(), Dp.m11162boximpl(f2 + bpVar2.b()), null, null, null, this, 14, null) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f27073a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.ui.l.bp bpVar3 = this.f27074b;
            boolean zF2 = bpVar3.f();
            float fB2 = this.f27075c;
            if (!zF2) {
                fB2 = fB2 + bpVar3.b() + 16.0f;
            }
            this.f27073a = 1;
            if (Animatable.animateTo$default(this.f27076d.d(), Dp.m11162boximpl(fB2), null, null, null, this, 14, null) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(com.waze.ui.l.bp bpVar, float f2, bf bfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27077e = i2;
        this.f27074b = bpVar;
        this.f27075c = f2;
        this.f27076d = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(com.waze.ui.l.bp bpVar, float f2, bf bfVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27077e = i2;
        this.f27074b = bpVar;
        this.f27075c = f2;
        this.f27076d = bfVar;
    }
}
