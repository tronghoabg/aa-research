package com.waze.ui.r.a.a;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f43299a;

    /* renamed from: b, reason: collision with root package name */
    int f43300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f43301c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f43302d = "location_pin_big_floating.png";

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MutableState f43303e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ MutableState f43304f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f43305g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(q qVar, MutableState mutableState, MutableState mutableState2, h.c.e eVar) {
        super(2, eVar);
        this.f43301c = qVar;
        this.f43303e = mutableState;
        this.f43304f = mutableState2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        r rVar = new r(this.f43301c, this.f43303e, this.f43304f, eVar);
        rVar.f43305g = obj;
        return rVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        af afVar;
        MutableState mutableState;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43300b != 0) {
            mutableState = (MutableState) this.f43299a;
            afVar = (af) this.f43305g;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            afVar = (af) this.f43305g;
            MutableState mutableState2 = this.f43303e;
            this.f43305g = afVar;
            this.f43299a = mutableState2;
            this.f43300b = 1;
            Object objA = this.f43301c.a(this.f43302d, this);
            if (objA == aVar) {
                return aVar;
            }
            mutableState = mutableState2;
            obj = objA;
        }
        mutableState.setValue((Bitmap) obj);
        if (aj.j(afVar)) {
            MutableState mutableState3 = this.f43304f;
            Bitmap bitmapA = t.a(this.f43303e);
            mutableState3.setValue(bitmapA != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmapA) : null);
            return ab.f48028a;
        }
        Bitmap bitmapA2 = t.a(this.f43303e);
        if (bitmapA2 != null) {
            bitmapA2.recycle();
        }
        return ab.f48028a;
    }
}
