package io.ktor.utils.io;

import java.util.ArrayList;
import java.util.List;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final List f37379b = AbstractC3935e.D(new Y(1), new Y(2), new Y(4));

    /* renamed from: a, reason: collision with root package name */
    public final int f37380a;

    public /* synthetic */ Y(int i5) {
        this.f37380a = i5;
    }

    public static String a(int i5) {
        if (i5 == 1) {
            return "CR";
        }
        if (i5 == 2) {
            return "LF";
        }
        if (i5 == 4) {
            return "CRLF";
        }
        List list = f37379b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((((Y) obj).f37380a | i5) == i5) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return this.f37380a == ((Y) obj).f37380a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37380a;
    }

    public final String toString() {
        return a(this.f37380a);
    }
}
