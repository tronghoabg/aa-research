package defpackage;

import android.util.Property;
import android.view.View;

/* loaded from: classes2.dex */
final class fgs extends Property {
    public fgs(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(fgu.a((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        fgu.d((View) obj, ((Float) obj2).floatValue());
    }
}
