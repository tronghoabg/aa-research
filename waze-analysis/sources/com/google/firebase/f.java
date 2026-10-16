package com.google.firebase;

import com.google.firebase.components.ae;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements com.google.firebase.components.g {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f9888e;

    /* renamed from: d, reason: collision with root package name */
    public static final f f9887d = new f(3);

    /* renamed from: c, reason: collision with root package name */
    public static final f f9886c = new f(2);

    /* renamed from: b, reason: collision with root package name */
    public static final f f9885b = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public static final f f9884a = new f(0);

    public f(int i2) {
        this.f9888e = i2;
    }

    @Override // com.google.firebase.components.g
    public final /* synthetic */ Object a(com.google.firebase.components.d dVar) {
        int i2 = this.f9888e;
        if (i2 == 0) {
            Object objE = dVar.e(new ae(com.google.firebase.b.a.c.class, Executor.class));
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
        Object objE4 = dVar.e(new ae(com.google.firebase.b.a.b.class, Executor.class));
        x.e(objE4, "get(...)");
        return bo.f((Executor) objE4);
    }
}
