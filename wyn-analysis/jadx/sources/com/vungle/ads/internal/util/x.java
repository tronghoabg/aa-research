package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class x extends ObjectInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final List f33877a;

    public x(InputStream inputStream, List list) {
        super(inputStream);
        this.f33877a = list;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        AbstractC3340k.e(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.f33877a == null || Number.class.isAssignableFrom(c10) || String.class.equals(c10) || Boolean.class.equals(c10) || c10.isArray() || this.f33877a.contains(c10)) {
            AbstractC3340k.d(c10, "c");
            return c10;
        }
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Deserialization is not allowed for ");
        sbA.append(desc.getName());
        throw new IOException(sbA.toString());
    }
}
