package com.google.android.datatransport.cct.a;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f3929a;

    /* renamed from: b, reason: collision with root package name */
    public static final aa f3930b;

    /* renamed from: c, reason: collision with root package name */
    private static final SparseArray f3931c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ aa[] f3932d;

    static {
        aa aaVar = new aa("NOT_SET", 0);
        f3929a = aaVar;
        aa aaVar2 = new aa("EVENT_OVERRIDE", 1);
        f3930b = aaVar2;
        f3932d = new aa[]{aaVar, aaVar2};
        SparseArray sparseArray = new SparseArray();
        f3931c = sparseArray;
        sparseArray.put(0, aaVar);
        sparseArray.put(5, aaVar2);
    }

    public static aa[] values() {
        return (aa[]) f3932d.clone();
    }
}
