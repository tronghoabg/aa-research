package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cn implements cp {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f33791a;

    public cn(int i2) {
        this.f33791a = i2;
    }

    @Override // com.waze.reports.cp
    public final boolean a(String str) {
        return this.f33791a != 0 ? !str.isEmpty() : str.isEmpty() || str.length() >= 3;
    }
}
