package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final i f4725a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.f f4726b;

    /* synthetic */ ae(i iVar, com.google.android.gms.common.f fVar) {
        this.f4725a = iVar;
        this.f4726b = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae) {
            ae aeVar = (ae) obj;
            if (Objects.equals(this.f4725a, aeVar.f4725a) && Objects.equals(this.f4726b, aeVar.f4726b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4725a, this.f4726b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.common.internal.bb.c("key", this.f4725a, arrayList);
        com.google.android.gms.common.internal.bb.c("feature", this.f4726b, arrayList);
        return com.google.android.gms.common.internal.bb.b(arrayList, this);
    }
}
