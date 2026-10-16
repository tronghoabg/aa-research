package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import h.ab;
import h.g.a.l;
import h.g.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, ab> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, ab> rVar2, l<? super Editable, ab> lVar) {
        x.f(textView, "<this>");
        x.f(rVar, "beforeTextChanged");
        x.f(rVar2, "onTextChanged");
        x.f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, r rVar, r rVar2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rVar = new r<CharSequence, Integer, Integer, Integer, ab>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.1
                @Override // h.g.a.r
                public /* bridge */ /* synthetic */ ab invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    num.intValue();
                    num2.intValue();
                    num3.intValue();
                    return ab.f48028a;
                }

                public final void invoke(CharSequence charSequence, int i3, int i4, int i5) {
                }
            };
        }
        if ((i2 & 2) != 0) {
            rVar2 = new r<CharSequence, Integer, Integer, Integer, ab>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.2
                @Override // h.g.a.r
                public /* bridge */ /* synthetic */ ab invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    num.intValue();
                    num2.intValue();
                    num3.intValue();
                    return ab.f48028a;
                }

                public final void invoke(CharSequence charSequence, int i3, int i4, int i5) {
                }
            };
        }
        if ((i2 & 4) != 0) {
            lVar = new l<Editable, ab>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.3
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Editable editable) {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Editable editable) {
                }
            };
        }
        x.f(textView, "<this>");
        x.f(rVar, "beforeTextChanged");
        x.f(rVar2, "onTextChanged");
        x.f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final l<? super Editable, ab> lVar) {
        x.f(textView, "<this>");
        x.f(lVar, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                lVar.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, ab> rVar) {
        x.f(textView, "<this>");
        x.f(rVar, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                rVar.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, ab> rVar) {
        x.f(textView, "<this>");
        x.f(rVar, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                rVar.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
