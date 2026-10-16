package Nd;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8658b;

    public c(String content) {
        AbstractC3340k.e(content, "content");
        this.f8657a = content;
        int length = content.length();
        int lowerCase = 0;
        for (int i5 = 0; i5 < length; i5++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(content.charAt(i5));
        }
        this.f8658b = lowerCase;
    }

    public final boolean equals(Object obj) {
        String str;
        c cVar = obj instanceof c ? (c) obj : null;
        return (cVar == null || (str = cVar.f8657a) == null || !str.equalsIgnoreCase(this.f8657a)) ? false : true;
    }

    public final int hashCode() {
        return this.f8658b;
    }

    public final String toString() {
        return this.f8657a;
    }
}
