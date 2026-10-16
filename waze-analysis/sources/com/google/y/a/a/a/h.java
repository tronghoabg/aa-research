package com.google.y.a.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f13423a;

    h(String str) {
        this.f13423a = str;
    }

    @Override // com.google.y.a.a.a.j
    protected final int a() {
        return d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        j jVar = (j) obj;
        if (a() != jVar.a()) {
            length = a();
            length2 = jVar.a();
        } else {
            String str = this.f13423a;
            String str2 = ((h) jVar).f13423a;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str.length();
            length2 = str2.length();
        }
        return length - length2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f13423a.equals(((h) obj).f13423a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), this.f13423a);
    }

    public final String toString() {
        return "\"" + this.f13423a + "\"";
    }
}
