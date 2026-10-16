package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import j$.util.Objects;
import java.text.DateFormat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class as extends h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f6430a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextInputLayout f6431b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ at f6432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(at atVar, String str, DateFormat dateFormat, TextInputLayout textInputLayout, c cVar, ap apVar, TextInputLayout textInputLayout2) {
        super(str, dateFormat, textInputLayout, cVar);
        this.f6430a = apVar;
        this.f6431b = textInputLayout2;
        Objects.requireNonNull(atVar);
        this.f6432c = atVar;
    }

    @Override // com.google.android.material.datepicker.h
    final void c() {
        this.f6431b.l();
        this.f6430a.a();
    }

    @Override // com.google.android.material.datepicker.h
    final void d(Long l2) {
        at atVar = this.f6432c;
        if (l2 == null) {
            atVar.f6433a = null;
        } else {
            atVar.h(l2.longValue());
        }
        this.f6430a.b(this.f6432c.a());
    }
}
