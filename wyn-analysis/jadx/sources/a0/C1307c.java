package a0;

import android.view.ViewStructure;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1307c f17095a = new C1307c();

    public final int a(@NotNull ViewStructure structure, int i5) {
        AbstractC3340k.e(structure, "structure");
        return structure.addChildCount(i5);
    }

    @Nullable
    public final ViewStructure b(@NotNull ViewStructure structure, int i5) {
        AbstractC3340k.e(structure, "structure");
        return structure.newChild(i5);
    }

    public final void c(@NotNull ViewStructure structure, int i5, int i10, int i11, int i12, int i13, int i14) {
        AbstractC3340k.e(structure, "structure");
        structure.setDimens(i5, i10, i11, i12, i13, i14);
    }

    public final void d(@NotNull ViewStructure structure, int i5, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        AbstractC3340k.e(structure, "structure");
        structure.setId(i5, str, str2, str3);
    }
}
