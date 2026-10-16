package com.waze.z.a;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45812a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f45813b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableState f45814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(MutableInteractionSource mutableInteractionSource, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f45813b = mutableInteractionSource;
        this.f45814c = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bd(this.f45813b, this.f45814c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45812a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            MutableInteractionSource mutableInteractionSource = this.f45813b;
            MutableState mutableState = this.f45814c;
            this.f45812a = 1;
            if (mutableInteractionSource.getInteractions().collect(new bc(mutableState), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
