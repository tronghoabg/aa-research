package com.waze.sharedui.views;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f39208a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39209b;

    ah(WazeEditTextBase wazeEditTextBase, int i2) {
        this.f39209b = i2;
        Objects.requireNonNull(wazeEditTextBase);
        this.f39208a = wazeEditTextBase;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(final Editable editable) {
        int i2 = this.f39209b;
        if (i2 == 0) {
            View view = this.f39208a;
            aj ajVar = (aj) view;
            ai aiVar = ajVar.f39211e;
            if (aiVar != null) {
                aiVar.a(editable);
            }
            if (ajVar.f39212f != null) {
                ajVar.removeCallbacks(ajVar.f39212f);
            }
            if (ajVar.f39210d != null) {
                ajVar.f39212f = new Runnable() { // from class: com.waze.sharedui.views.ag
                    @Override // java.lang.Runnable
                    public final void run() {
                        aj ajVar2 = (aj) this.f39206a.f39208a;
                        ajVar2.f39210d.a(editable);
                        ajVar2.f39212f = null;
                    }
                };
                ajVar.postDelayed(ajVar.f39212f, 250L);
            }
            ((ad) view).f().setVisibility(editable.length() == 0 ? 8 : 0);
            return;
        }
        if (i2 != 1) {
            View view2 = this.f39208a;
            if (((WazeValidatedEditText) view2).C()) {
                String strValueOf = String.valueOf(editable);
                String string = h.n.o.v(strValueOf).toString();
                if (h.g.b.x.n(strValueOf, string)) {
                    return;
                }
                ad adVar = (ad) view2;
                adVar.g().setText(string);
                adVar.g().setSelection(string.length());
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = this.f39209b;
        if (i5 == 0 || i5 == 1) {
            return;
        }
        WazeValidatedEditText wazeValidatedEditText = (WazeValidatedEditText) this.f39208a;
        if (wazeValidatedEditText.B()) {
            wazeValidatedEditText.c(y.f39287a);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.f39209b == 1 && charSequence.length() > 0 && WazeEditTextBase.f39153h != null) {
            WazeEditTextBase wazeEditTextBase = (WazeEditTextBase) this.f39208a;
            if (wazeEditTextBase.isFocused()) {
                wazeEditTextBase.a();
            }
        }
    }

    ah(WazeValidatedEditText wazeValidatedEditText, int i2) {
        this.f39209b = i2;
        this.f39208a = wazeValidatedEditText;
    }

    ah(aj ajVar, int i2) {
        this.f39209b = i2;
        Objects.requireNonNull(ajVar);
        this.f39208a = ajVar;
    }
}
