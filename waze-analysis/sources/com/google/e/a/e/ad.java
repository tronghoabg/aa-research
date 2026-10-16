package com.google.e.a.e;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.e.a.k.a f8413a = com.google.e.a.k.a.b(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    private final Map f8414b;

    public final Iterable a(byte[] bArr) {
        Map map = this.f8414b;
        List list = (List) map.get(f8413a);
        List list2 = bArr.length >= 5 ? (List) map.get(com.google.e.a.k.a.d(bArr, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new aa(this, list2, list);
    }
}
