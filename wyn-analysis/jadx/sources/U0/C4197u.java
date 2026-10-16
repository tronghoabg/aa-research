package u0;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.AbstractC3756a;

/* renamed from: u0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4197u {

    /* renamed from: a, reason: collision with root package name */
    public static final C4197u f46376a = new C4197u();

    public final void a(@NotNull View view, @Nullable p0.h hVar) {
        PointerIcon systemIcon;
        AbstractC3340k.e(view, "view");
        if (hVar instanceof AbstractC3756a) {
            Context context = view.getContext();
            ((AbstractC3756a) hVar).getClass();
            systemIcon = PointerIcon.getSystemIcon(context, 1008);
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (AbstractC3340k.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
