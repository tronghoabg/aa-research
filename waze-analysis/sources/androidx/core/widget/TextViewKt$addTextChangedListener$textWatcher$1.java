package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import h.ab;
import h.g.a.l;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ l<Editable, ab> $afterTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, ab> $beforeTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, ab> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(l<? super Editable, ab> lVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, ab> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, ab> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
