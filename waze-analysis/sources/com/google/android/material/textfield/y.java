package com.google.android.material.textfield;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y implements at {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f6919a;

    y(ab abVar) {
        Objects.requireNonNull(abVar);
        this.f6919a = abVar;
    }

    @Override // com.google.android.material.textfield.at
    public final void a(TextInputLayout textInputLayout) {
        ab abVar = this.f6919a;
        if (abVar.p == textInputLayout.f6797a) {
            return;
        }
        if (abVar.p != null) {
            abVar.p.removeTextChangedListener(abVar.s);
            if (abVar.p.getOnFocusChangeListener() == abVar.i().d()) {
                abVar.p.setOnFocusChangeListener(null);
            }
        }
        abVar.p = textInputLayout.f6797a;
        if (abVar.p != null) {
            abVar.p.addTextChangedListener(abVar.s);
        }
        abVar.i().h(abVar.p);
        abVar.K(abVar.i());
    }
}
