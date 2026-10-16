package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ea implements h.g.a.l {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28815c;

    /* renamed from: b, reason: collision with root package name */
    public static final ea f28814b = new ea(1);

    /* renamed from: a, reason: collision with root package name */
    public static final ea f28813a = new ea(0);

    public ea(int i2) {
        this.f28815c = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        return this.f28815c != 0 ? Boolean.valueOf(obj instanceof com.waze.shared_infra.s.a) : Boolean.valueOf(obj instanceof com.waze.shared_infra.s.a);
    }
}
