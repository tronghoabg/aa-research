package com.dexterous.flutterlocalnotifications;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f26225a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f26226b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f26227c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f26228d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f26229e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f26230f;

    static {
        f fVar = new f(OfficeOpenXMLExtended.SECURITY_NONE, 0);
        f26225a = fVar;
        f fVar2 = new f("RequestingNotificationPermission", 1);
        f26226b = fVar2;
        f fVar3 = new f("RequestingNotificationPolicyAccess", 2);
        f26227c = fVar3;
        f fVar4 = new f("RequestingExactAlarmsPermission", 3);
        f26228d = fVar4;
        f fVar5 = new f("RequestingFullScreenIntentPermission", 4);
        f26229e = fVar5;
        f26230f = new f[]{fVar, fVar2, fVar3, fVar4, fVar5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f26230f.clone();
    }
}
