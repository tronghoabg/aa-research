package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    final int f516a;

    /* renamed from: b, reason: collision with root package name */
    int f517b;

    /* renamed from: c, reason: collision with root package name */
    int f518c;

    /* renamed from: d, reason: collision with root package name */
    int f519d;

    /* renamed from: e, reason: collision with root package name */
    ViewGroup f520e;

    /* renamed from: f, reason: collision with root package name */
    View f521f;

    /* renamed from: g, reason: collision with root package name */
    View f522g;

    /* renamed from: h, reason: collision with root package name */
    android.support.v7.view.menu.q f523h;

    /* renamed from: i, reason: collision with root package name */
    android.support.v7.view.menu.m f524i;

    /* renamed from: j, reason: collision with root package name */
    Context f525j;

    /* renamed from: k, reason: collision with root package name */
    boolean f526k;

    /* renamed from: l, reason: collision with root package name */
    boolean f527l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    al(int i2) {
        this.f516a = i2;
    }

    final void a(android.support.v7.view.menu.q qVar) {
        android.support.v7.view.menu.m mVar;
        android.support.v7.view.menu.q qVar2 = this.f523h;
        if (qVar == qVar2) {
            return;
        }
        if (qVar2 != null) {
            qVar2.q(this.f524i);
        }
        this.f523h = qVar;
        if (qVar == null || (mVar = this.f524i) == null) {
            return;
        }
        qVar.j(mVar);
    }
}
