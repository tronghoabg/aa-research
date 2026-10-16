package com.google.android.material.textfield;

import android.text.Editable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x extends com.google.android.material.internal.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f6918a;

    x(ab abVar) {
        Objects.requireNonNull(abVar);
        this.f6918a = abVar;
    }

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f6918a.i().m();
    }

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f6918a.i().B();
    }
}
