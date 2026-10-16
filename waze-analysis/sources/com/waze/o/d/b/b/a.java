package com.waze.o.d.b.b;

import androidx.compose.animation.core.Animatable;
import com.waze.ui.f.ak;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32879a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f32880b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable f32881c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f32882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(ak akVar, Animatable animatable, h.c.e eVar) {
        super(2, eVar);
        this.f32880b = akVar;
        this.f32881c = animatable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        a aVar = new a(this.f32880b, this.f32881c, eVar);
        aVar.f32882d = obj;
        return aVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r20.f32881c, new java.lang.Float(r2), androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, null, r20, 12, null) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r20.f32881c, new java.lang.Float(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(150, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, null, r20, 12, null) == r1) goto L44;
     */
    /* JADX WARN: Path cross not found for [B:4:0x0013, B:9:0x002c], limit reached: 47 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[Catch: IllegalArgumentException -> 0x00ee, TryCatch #0 {IllegalArgumentException -> 0x00ee, blocks: (B:16:0x0085, B:18:0x0093, B:20:0x009c, B:21:0x00aa, B:23:0x00b2, B:24:0x00c2, B:28:0x00db, B:29:0x00ed), top: B:47:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[Catch: IllegalArgumentException -> 0x00ee, TRY_ENTER, TryCatch #0 {IllegalArgumentException -> 0x00ee, blocks: (B:16:0x0085, B:18:0x0093, B:20:0x009c, B:21:0x00aa, B:23:0x00b2, B:24:0x00c2, B:28:0x00db, B:29:0x00ed), top: B:47:0x0085 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d7 -> B:11:0x0039). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.d.b.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
