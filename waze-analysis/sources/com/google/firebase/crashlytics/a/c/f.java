package com.google.firebase.crashlytics.a.c;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9171a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f9172b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f9173c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f9174d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f9175e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f9176f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f9177g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f9178h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f9179i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f9180j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f9181k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ f[] f9182l;

    static {
        f fVar = new f("X86_32", 0);
        f9171a = fVar;
        f fVar2 = new f("X86_64", 1);
        f9172b = fVar2;
        f fVar3 = new f("ARM_UNKNOWN", 2);
        f9173c = fVar3;
        f fVar4 = new f("PPC", 3);
        f9174d = fVar4;
        f fVar5 = new f("PPC64", 4);
        f9175e = fVar5;
        f fVar6 = new f("ARMV6", 5);
        f9176f = fVar6;
        f fVar7 = new f("ARMV7", 6);
        f9177g = fVar7;
        f fVar8 = new f("UNKNOWN", 7);
        f9178h = fVar8;
        f fVar9 = new f("ARMV7S", 8);
        f9179i = fVar9;
        f fVar10 = new f("ARM64", 9);
        f9180j = fVar10;
        f9182l = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        HashMap map = new HashMap(4);
        f9181k = map;
        map.put("armeabi-v7a", fVar7);
        map.put("armeabi", fVar6);
        map.put("arm64-v8a", fVar10);
        map.put("x86", fVar);
    }

    static f a() {
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str)) {
            com.google.firebase.crashlytics.a.i.a().g("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return f9178h;
        }
        f fVar = (f) f9181k.get(str.toLowerCase(Locale.US));
        return fVar == null ? f9178h : fVar;
    }

    public static f[] values() {
        return (f[]) f9182l.clone();
    }
}
