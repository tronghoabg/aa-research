package a0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1308d f17096a = new C1308d();

    @Nullable
    public final AutofillId a(@NotNull ViewStructure structure) {
        AbstractC3340k.e(structure, "structure");
        return structure.getAutofillId();
    }

    public final boolean b(@NotNull AutofillValue value) {
        AbstractC3340k.e(value, "value");
        return value.isDate();
    }

    public final boolean c(@NotNull AutofillValue value) {
        AbstractC3340k.e(value, "value");
        return value.isList();
    }

    public final boolean d(@NotNull AutofillValue value) {
        AbstractC3340k.e(value, "value");
        return value.isText();
    }

    public final boolean e(@NotNull AutofillValue value) {
        AbstractC3340k.e(value, "value");
        return value.isToggle();
    }

    public final void f(@NotNull ViewStructure structure, @NotNull String[] hints) {
        AbstractC3340k.e(structure, "structure");
        AbstractC3340k.e(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public final void g(@NotNull ViewStructure structure, @NotNull AutofillId parent, int i5) {
        AbstractC3340k.e(structure, "structure");
        AbstractC3340k.e(parent, "parent");
        structure.setAutofillId(parent, i5);
    }

    public final void h(@NotNull ViewStructure structure, int i5) {
        AbstractC3340k.e(structure, "structure");
        structure.setAutofillType(i5);
    }

    @NotNull
    public final CharSequence i(@NotNull AutofillValue value) {
        AbstractC3340k.e(value, "value");
        CharSequence textValue = value.getTextValue();
        AbstractC3340k.d(textValue, "value.textValue");
        return textValue;
    }
}
