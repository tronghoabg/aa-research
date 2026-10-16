package u0;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4172f {

    /* renamed from: a, reason: collision with root package name */
    public static final C4172f f46227a = new C4172f();

    public final void a(@NotNull AccessibilityNodeInfo node, @NotNull List<String> data) {
        AbstractC3340k.e(node, "node");
        AbstractC3340k.e(data, "data");
        node.setAvailableExtraData(data);
    }
}
