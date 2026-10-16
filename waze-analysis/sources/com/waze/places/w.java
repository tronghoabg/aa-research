package com.waze.places;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class w implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab f33150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33151b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33152c;

    public /* synthetic */ w(ab abVar, long j2, int i2) {
        this.f33152c = i2;
        this.f33150a = abVar;
        this.f33151b = j2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f33152c;
        long j2 = this.f33151b;
        ab abVar = this.f33150a;
        return i2 != 0 ? ab.removeFavorite$lambda$0(abVar, j2) : ab.removeRecentPlace$lambda$0(abVar, j2);
    }
}
