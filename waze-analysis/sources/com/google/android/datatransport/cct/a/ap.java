package com.google.android.datatransport.cct.a;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    public static final ap f3979a;

    /* renamed from: b, reason: collision with root package name */
    public static final ap f3980b;

    /* renamed from: c, reason: collision with root package name */
    public static final ap f3981c;

    /* renamed from: d, reason: collision with root package name */
    public static final ap f3982d;

    /* renamed from: e, reason: collision with root package name */
    public static final ap f3983e;

    /* renamed from: f, reason: collision with root package name */
    public static final ap f3984f;

    /* renamed from: g, reason: collision with root package name */
    private static final SparseArray f3985g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ ap[] f3986h;

    static {
        ap apVar = new ap("DEFAULT", 0);
        f3979a = apVar;
        ap apVar2 = new ap("UNMETERED_ONLY", 1);
        f3980b = apVar2;
        ap apVar3 = new ap("UNMETERED_OR_DAILY", 2);
        f3981c = apVar3;
        ap apVar4 = new ap("FAST_IF_RADIO_AWAKE", 3);
        f3982d = apVar4;
        ap apVar5 = new ap("NEVER", 4);
        f3983e = apVar5;
        ap apVar6 = new ap("UNRECOGNIZED", 5);
        f3984f = apVar6;
        f3986h = new ap[]{apVar, apVar2, apVar3, apVar4, apVar5, apVar6};
        SparseArray sparseArray = new SparseArray();
        f3985g = sparseArray;
        sparseArray.put(0, apVar);
        sparseArray.put(1, apVar2);
        sparseArray.put(2, apVar3);
        sparseArray.put(3, apVar4);
        sparseArray.put(4, apVar5);
        sparseArray.put(-1, apVar6);
    }

    public static ap[] values() {
        return (ap[]) f3986h.clone();
    }
}
