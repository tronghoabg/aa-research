package defpackage;

import android.util.FloatProperty;
import com.google.android.libraries.gsa.logoview.LogoView;

/* loaded from: classes3.dex */
public final class vbh extends FloatProperty {
    public vbh() {
        super("Logo Height");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = LogoView.d;
        return Float.valueOf(((LogoView) obj).a.k);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        int i = LogoView.d;
        logoView.b(logoView.a.j, f);
    }
}
