package A1;

import android.text.Editable;
import y1.C4533n;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f234a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f235b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f236c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f236c;
        return cls != null ? new C4533n(cls, charSequence) : super.newEditable(charSequence);
    }
}
