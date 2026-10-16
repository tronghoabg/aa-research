package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class eaz extends ebb {
    public eaz(Class cls) {
        super(R.id.tag_accessibility_heading, cls, 0, 28);
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ebi.e(view));
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ebi.b(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
