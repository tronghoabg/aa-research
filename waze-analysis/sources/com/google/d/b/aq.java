package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class aq {
    private static final aq SYSTEM_TICKER = new ap();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7222a = 0;

    protected aq() {
    }

    public static aq systemTicker() {
        return SYSTEM_TICKER;
    }

    public abstract long read();
}
