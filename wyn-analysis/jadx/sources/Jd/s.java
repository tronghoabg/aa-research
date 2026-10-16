package Jd;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f6065b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f6066c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f6067d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f6068e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f6069f;

    /* renamed from: a, reason: collision with root package name */
    public final String f6070a;

    static {
        s sVar = new s("GET");
        f6065b = sVar;
        s sVar2 = new s("POST");
        f6066c = sVar2;
        s sVar3 = new s("PUT");
        s sVar4 = new s("PATCH");
        s sVar5 = new s("DELETE");
        s sVar6 = new s("HEAD");
        f6067d = sVar6;
        s sVar7 = new s("OPTIONS");
        f6068e = sVar7;
        f6069f = AbstractC3935e.D(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7);
    }

    public s(String str) {
        this.f6070a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && AbstractC3340k.a(this.f6070a, ((s) obj).f6070a);
    }

    public final int hashCode() {
        return this.f6070a.hashCode();
    }

    public final String toString() {
        return this.f6070a;
    }
}
