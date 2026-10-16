package com.waze.notifications.c;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32608a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Animatable f32609b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f32610c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f32611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Animatable animatable, long j2, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f32609b = animatable;
        this.f32610c = j2;
        this.f32611d = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f32609b, this.f32610c, this.f32611d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32608a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32608a = 1;
            if (Animatable.animateTo$default(this.f32609b, new Float(0.0f), AnimationSpecKt.tween$default((int) h.o.a.m(this.f32610c), 0, EasingKt.getLinearEasing(), 2, null), null, null, this, 12, null) == aVar) {
                return aVar;
            }
        }
        this.f32611d.invoke();
        return ab.f48028a;
    }
}
