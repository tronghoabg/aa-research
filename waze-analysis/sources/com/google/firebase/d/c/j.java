package com.google.firebase.d.c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9860a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9861b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.d.f f9862c;

    j(Map map, Map map2, com.google.firebase.d.f fVar) {
        this.f9860a = map;
        this.f9861b = map2;
        this.f9862c = fVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new h(byteArrayOutputStream, this.f9860a, this.f9861b, this.f9862c).j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
