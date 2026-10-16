package com.google.android.libraries.e.b;

import com.google.android.libraries.phenotype.client.stable.am;
import com.google.android.libraries.phenotype.client.stable.an;
import com.google.b.d.b.ah;
import com.google.d.m.a.af;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements af {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm f5900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f5901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f5902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5903d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f5904e;

    public /* synthetic */ s(Object obj, bm bmVar, ag agVar, Executor executor, int i2) {
        this.f5904e = i2;
        this.f5903d = obj;
        this.f5900a = bmVar;
        this.f5901b = agVar;
        this.f5902c = executor;
    }

    @Override // com.google.d.m.a.af
    public final bm a() {
        if (this.f5904e == 0) {
            Executor executor = this.f5902c;
            return bd.n(this.f5900a, ah.b(new an(this.f5903d, this.f5901b, executor, 2)), cf.y());
        }
        Object obj = this.f5903d;
        bm bmVarN = bd.n(this.f5900a, new am(obj, 7), cf.y());
        bm bmVarN2 = bd.n(bmVarN, this.f5901b, this.f5902c);
        return bd.n(bmVarN2, ah.b(new an(obj, bmVarN, bmVarN2, 1)), cf.y());
    }
}
