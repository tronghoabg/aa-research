package com.waze.stats.b;

import com.waze.sharedui.f.l;
import i.b.l.cd;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40564a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40565b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f40565b = i2;
        this.f40564a = obj;
    }

    @Override // com.waze.sharedui.f.l
    public final void a(com.waze.sharedui.b bVar, cd cdVar) {
        int i2 = this.f40565b;
        Object obj = this.f40564a;
        if (i2 != 0) {
            b.b((b) obj, bVar, cdVar);
        } else {
            f.b((f) obj, bVar, cdVar);
        }
    }
}
