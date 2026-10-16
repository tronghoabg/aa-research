package com.waze.sharedrive.g;

import android.support.v4.app.bv;
import android.support.v4.app.ch;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class an implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f38632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38635d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f38636e;

    public /* synthetic */ an(MutableState mutableState, h.k kVar, bv bvVar, String str, int i2) {
        this.f38636e = i2;
        this.f38635d = mutableState;
        this.f38633b = kVar;
        this.f38634c = bvVar;
        this.f38632a = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f38636e == 0) {
            ?? r0 = this.f38634c;
            Object obj = this.f38635d;
            if (((Boolean) r0.getValue()).booleanValue()) {
                ?? r5 = this.f38632a;
                ((com.waze.sharedrive.e.n) obj).c();
                r5.invoke();
            } else {
                ?? r52 = this.f38633b;
                ((com.waze.sharedrive.e.n) obj).b();
                r52.invoke();
            }
            return h.ab.f48028a;
        }
        ?? r02 = this.f38635d;
        Object value = r02.getValue();
        Object obj2 = this.f38633b;
        if (h.g.b.x.n(value, obj2)) {
            return h.ab.f48028a;
        }
        Object obj3 = this.f38632a;
        Object obj4 = this.f38634c;
        bv bvVar = (bv) obj4;
        android.support.v4.app.ar arVarH = bvVar.h((String) obj3);
        if (arVarH != null) {
            h.g.b.x.c(obj4);
            ch chVarU = bvVar.u();
            h.g.b.x.e(chVarU, "beginTransaction(...)");
            chVarU.m(arVarH);
            chVarU.g();
            ch chVarU2 = bvVar.u();
            h.g.b.x.e(chVarU2, "beginTransaction(...)");
            chVarU2.v(arVarH);
            chVarU2.g();
        }
        r02.setValue(obj2);
        return h.ab.f48028a;
    }

    public /* synthetic */ an(com.waze.sharedrive.e.n nVar, h.g.a.a aVar, h.g.a.a aVar2, State state, int i2) {
        this.f38636e = i2;
        this.f38635d = nVar;
        this.f38632a = aVar;
        this.f38633b = aVar2;
        this.f38634c = state;
    }
}
