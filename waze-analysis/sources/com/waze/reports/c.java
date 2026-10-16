package com.waze.reports;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f33758a;

    c(f fVar) {
        Objects.requireNonNull(fVar);
        this.f33758a = fVar;
    }

    @Override // com.waze.reports.e
    public final boolean a(String str) {
        f fVar = this.f33758a;
        if (TextUtils.isEmpty(fVar.f33922a.z())) {
            return (fVar.f33923b || TextUtils.isEmpty(fVar.f33922a.n())) ? false : true;
        }
        return true;
    }
}
