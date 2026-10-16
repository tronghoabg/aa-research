package com.google.l.b.c;

import com.google.l.v;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final v f12357a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f12358b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f12359c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f12360d;

    static {
        try {
            Class.forName("java.sql.Date");
            int i2 = e.f12355b;
            int i3 = f.f12356b;
            v vVar = a.f12348a;
            f12357a = vVar;
            v vVar2 = c.f12351a;
            f12358b = vVar2;
            v vVar3 = d.f12353a;
            f12359c = vVar3;
            f12360d = DesugarCollections.unmodifiableList(Arrays.asList(vVar2, vVar, vVar3));
        } catch (ClassNotFoundException unused) {
            f12357a = null;
            f12358b = null;
            f12359c = null;
            f12360d = Collections.EMPTY_LIST;
        }
    }
}
