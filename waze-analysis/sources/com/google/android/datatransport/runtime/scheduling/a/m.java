package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f4270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4271b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f4272c;

    public /* synthetic */ m(r rVar, x xVar, int i2) {
        this.f4272c = i2;
        this.f4270a = rVar;
        this.f4271b = xVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.o
    public final Object a(Object obj) {
        if (this.f4272c != 0) {
            x xVar = this.f4271b;
            return r.f(this.f4270a, xVar, (SQLiteDatabase) obj);
        }
        x xVar2 = this.f4271b;
        return r.m(this.f4270a, xVar2, (SQLiteDatabase) obj);
    }
}
