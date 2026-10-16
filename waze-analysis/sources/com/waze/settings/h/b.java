package com.waze.settings.h;

import android.support.v4.app.ar;
import android.support.v4.app.bv;
import com.waze.settings.ba;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f37374a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f37375b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f37376c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f37377d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f37378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(bv bvVar, String str, int i2, int i3, int i4, e eVar) {
        super(2, eVar);
        this.f37374a = bvVar;
        this.f37375b = str;
        this.f37376c = i2;
        this.f37377d = i3;
        this.f37378e = i4;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f37374a, this.f37375b, this.f37376c, this.f37377d, this.f37378e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ar arVarH = this.f37374a.h(this.f37375b);
        ba baVar = arVarH instanceof ba ? (ba) arVarH : null;
        if (baVar != null) {
            baVar.B(this.f37376c, this.f37377d, this.f37378e);
        }
        return ab.f48028a;
    }
}
