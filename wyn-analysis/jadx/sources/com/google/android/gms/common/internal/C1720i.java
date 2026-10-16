package com.google.android.gms.common.internal;

import Va.M6;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1720i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f26645a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f26646b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f26647c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26648d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26649e;

    /* renamed from: f, reason: collision with root package name */
    public final E7.a f26650f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f26651g;

    public C1720i(Set set, String str, String str2) {
        E7.a aVar = E7.a.f3589a;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f26645a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f26647c = map;
        this.f26648d = str;
        this.f26649e = str2;
        this.f26650f = aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        this.f26646b = DesugarCollections.unmodifiableSet(hashSet);
    }
}
