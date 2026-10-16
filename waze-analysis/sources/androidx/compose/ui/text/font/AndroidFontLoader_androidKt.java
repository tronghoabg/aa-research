package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.res.ResourcesCompat;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.b.x;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        x.c(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, e<? super android.graphics.Typeface> eVar) throws Resources.NotFoundException {
        l lVar = new l(h.d(eVar), 1);
        lVar.u();
        final l lVar2 = lVar;
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrievalFailed */
            public void m11721xb24343b7(int i2) {
                lVar2.f(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i2 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrieved */
            public void m11722x46c88379(android.graphics.Typeface typeface) {
                lVar2.resumeWith(typeface);
            }
        }, null);
        Object objJ = lVar.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }
}
