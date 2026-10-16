package com.google.firebase.ktx;

import com.google.firebase.b.a.b;
import com.google.firebase.b.a.c;
import com.google.firebase.components.ae;
import com.google.firebase.components.d;
import com.google.firebase.components.g;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f10055e;

    /* renamed from: d, reason: collision with root package name */
    public static final a f10054d = new a(3);

    /* renamed from: c, reason: collision with root package name */
    public static final a f10053c = new a(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a f10052b = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public static final a f10051a = new a(0);

    public a(int i2) {
        this.f10055e = i2;
    }

    @Override // com.google.firebase.components.g
    public final /* synthetic */ Object a(d dVar) {
        int i2 = this.f10055e;
        if (i2 == 0) {
            Object objE = dVar.e(new ae(c.class, Executor.class));
            x.e(objE, "get(...)");
            return bo.f((Executor) objE);
        }
        if (i2 == 1) {
            Object objE2 = dVar.e(new ae(com.google.firebase.b.a.a.class, Executor.class));
            x.e(objE2, "get(...)");
            return bo.f((Executor) objE2);
        }
        if (i2 != 2) {
            Object objE3 = dVar.e(new ae(com.google.firebase.b.a.d.class, Executor.class));
            x.e(objE3, "get(...)");
            return bo.f((Executor) objE3);
        }
        Object objE4 = dVar.e(new ae(b.class, Executor.class));
        x.e(objE4, "get(...)");
        return bo.f((Executor) objE4);
    }
}
