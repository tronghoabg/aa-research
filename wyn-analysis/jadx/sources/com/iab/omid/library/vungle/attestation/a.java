package com.iab.omid.library.vungle.attestation;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f28100a;

    public a(Map<String, String> map) {
        this.f28100a = map == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.f28100a;
    }
}
