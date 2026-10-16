package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af extends bi {

    /* renamed from: a, reason: collision with root package name */
    private final List f9316a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9317b;

    /* synthetic */ af(List list, String str) {
        this.f9316a = list;
        this.f9317b = str;
    }

    @Override // com.google.firebase.crashlytics.a.e.bi
    public final String a() {
        return this.f9317b;
    }

    @Override // com.google.firebase.crashlytics.a.e.bi
    public final List b() {
        return this.f9316a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bi) {
            bi biVar = (bi) obj;
            if (this.f9316a.equals(biVar.b()) && ((str = this.f9317b) != null ? str.equals(biVar.a()) : biVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9316a.hashCode() ^ 1000003;
        String str = this.f9317b;
        return (str == null ? 0 : str.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "FilesPayload{files=" + this.f9316a.toString() + ", orgId=" + this.f9317b + "}";
    }
}
