package com.waze.reports_v2.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f34483a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f34484b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f34485c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f34486d;

    static {
        f fVar = new f("SENDING_NOW", 0);
        f34483a = fVar;
        f fVar2 = new f("SENDING_LATER", 1);
        f34484b = fVar2;
        f fVar3 = new f("SEND_LATER_REACHED_MAX_COUNT", 2);
        f34485c = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f34486d = fVarArr;
        h.d.b.a(fVarArr);
    }

    public static f[] values() {
        return (f[]) f34486d.clone();
    }
}
