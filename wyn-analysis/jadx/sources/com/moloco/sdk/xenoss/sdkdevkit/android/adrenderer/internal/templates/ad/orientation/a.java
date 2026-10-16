package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import ic.d;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30591a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f30592b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30593c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f30594d;

    static {
        a aVar = new a("Portrait", 0);
        f30591a = aVar;
        a aVar2 = new a("Landscape", 1);
        f30592b = aVar2;
        a aVar3 = new a(OfficeOpenXMLExtended.SECURITY_NONE, 2);
        f30593c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f30594d = aVarArr;
        d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f30594d.clone();
    }
}
