package com.google.gson.internal.sql;

import java.sql.Date;
import java.sql.Timestamp;
import la.InterfaceC3449A;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f27507a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3449A f27508b;

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC3449A f27509c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3449A f27510d;

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f27507a = z2;
        if (!z2) {
            f27508b = null;
            f27509c = null;
            f27510d = null;
        } else {
            new b(0, Date.class);
            new b(1, Timestamp.class);
            f27508b = SqlDateTypeAdapter.f27500b;
            f27509c = SqlTimeTypeAdapter.f27502b;
            f27510d = a.f27504b;
        }
    }
}
