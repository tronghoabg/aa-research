package com.waze.google_assistant;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class af implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ag f24088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24089b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24090c;

    public /* synthetic */ af(ag agVar, String str, int i2) {
        this.f24090c = i2;
        this.f24088a = agVar;
        this.f24089b = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24090c;
        String str = this.f24089b;
        ag agVar = this.f24088a;
        return i2 != 0 ? ag.getBaseEncodedPlaceIdFromBaseEncodedResultSet$lambda$0(agVar, str) : ag.getBaseEncodedPlaceIdFromJsProtoEncodedSessionState$lambda$0(agVar, str);
    }
}
