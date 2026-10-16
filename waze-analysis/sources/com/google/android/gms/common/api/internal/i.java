package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f4829a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.f f4830b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4831c;

    /* renamed from: d, reason: collision with root package name */
    private final u f4832d;

    private i(u uVar, com.google.android.gms.common.api.f fVar, String str) {
        this.f4832d = uVar;
        this.f4830b = fVar;
        this.f4831c = str;
        this.f4829a = Arrays.hashCode(new Object[]{uVar, fVar, str, null});
    }

    public static i b(u uVar, com.google.android.gms.common.api.f fVar, String str) {
        return new i(uVar, fVar, str);
    }

    public final String a() {
        return this.f4832d.i();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f4832d, iVar.f4832d) && Objects.equals(this.f4830b, iVar.f4830b) && Objects.equals(this.f4831c, iVar.f4831c) && Objects.equals(null, null);
    }

    public final int hashCode() {
        return this.f4829a;
    }
}
