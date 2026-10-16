package com.waze.notifications.c;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.ui.a.l;
import com.waze.ui.a.q;
import com.waze.ui.ac.n;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f32587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f32594h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f32595i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ int f32596j;

    public /* synthetic */ e(Modifier modifier, String str, String str2, Drawable drawable, Integer num, h.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, int i3) {
        this.f32596j = i3;
        this.f32589c = modifier;
        this.f32590d = str;
        this.f32591e = str2;
        this.f32592f = drawable;
        this.f32593g = num;
        this.f32594h = aVar;
        this.f32587a = aVar2;
        this.f32595i = aVar3;
        this.f32588b = i2;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.ui.ac.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f32596j;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f32588b;
            ?? r7 = this.f32595i;
            h.g.a.a aVar = this.f32587a;
            Object obj3 = this.f32594h;
            Object obj4 = this.f32593g;
            Object obj5 = this.f32592f;
            Object obj6 = this.f32591e;
            return k.b(this.f32589c, (String) this.f32590d, (String) obj6, (Drawable) obj5, (Integer) obj4, (h.o.a) obj3, aVar, r7, i3, composer);
        }
        if (i2 != 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f32588b;
            ?? r9 = this.f32594h;
            ?? r8 = this.f32595i;
            h.g.a.a aVar2 = this.f32587a;
            ?? r6 = this.f32591e;
            Object obj7 = this.f32590d;
            Object obj8 = this.f32593g;
            com.waze.ui.n.e.g((n) this.f32592f, (n) this.f32589c, (n) obj8, (n) obj7, r6, aVar2, r8, r9, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return ab.f48028a;
        }
        Composer composer3 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i5 = this.f32588b;
        ?? r72 = this.f32595i;
        h.g.a.a aVar3 = this.f32587a;
        ?? r5 = this.f32591e;
        Object obj9 = this.f32594h;
        Object obj10 = this.f32590d;
        Object obj11 = this.f32592f;
        l.h((String) this.f32593g, this.f32589c, (q) obj11, (String) obj10, (h.o.a) obj9, r5, aVar3, r72, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
        return ab.f48028a;
    }

    public /* synthetic */ e(n nVar, n nVar2, n nVar3, n nVar4, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, int i2, int i3) {
        this.f32596j = i3;
        this.f32592f = nVar;
        this.f32589c = nVar2;
        this.f32593g = nVar3;
        this.f32590d = nVar4;
        this.f32591e = aVar;
        this.f32587a = aVar2;
        this.f32595i = aVar3;
        this.f32594h = aVar4;
        this.f32588b = i2;
    }

    public /* synthetic */ e(String str, com.waze.ui.ac.i iVar, q qVar, String str2, h.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.l lVar, int i2, int i3) {
        this.f32596j = i3;
        this.f32593g = str;
        this.f32589c = iVar;
        this.f32592f = qVar;
        this.f32590d = str2;
        this.f32594h = aVar;
        this.f32591e = aVar2;
        this.f32587a = aVar3;
        this.f32595i = lVar;
        this.f32588b = i2;
    }
}
