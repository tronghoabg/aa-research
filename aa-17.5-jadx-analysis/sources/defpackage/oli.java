package defpackage;

import android.util.Property;
import android.view.View;

/* loaded from: classes2.dex */
final class oli extends Property {
    public oli(Class cls) {
        super(cls, "ANDROID_AUTO:TRANSLATE_Y");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getTranslationY());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setTranslationY(((Float) obj2).floatValue());
    }
}
