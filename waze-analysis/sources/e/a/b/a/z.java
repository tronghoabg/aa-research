package e.a.b.a;

import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.d.d.ci;
import e.a.cx;
import e.a.dd;
import e.a.de;
import e.a.ep;
import j$.util.Objects;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends de {
    private static Intent g(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // e.a.cz
    public final dd a(ep epVar, cx cxVar) {
        if (Objects.equals(epVar.d(), AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT)) {
            return new y(g(epVar.toString()), cxVar);
        }
        return null;
    }

    @Override // e.a.cz
    public final dd b(URI uri, cx cxVar) {
        if (Objects.equals(uri.getScheme(), AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT)) {
            return new y(g(uri.toString()), cxVar);
        }
        return null;
    }

    @Override // e.a.cz
    public final String c() {
        return AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT;
    }

    @Override // e.a.de
    public final int d() {
        return 3;
    }

    @Override // e.a.de
    public final /* bridge */ /* synthetic */ Collection e() {
        return ci.p(e.a.b.b.class);
    }

    @Override // e.a.de
    public final void f() {
    }
}
