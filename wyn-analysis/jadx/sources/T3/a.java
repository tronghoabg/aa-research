package T3;

import android.app.Application;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11401a = new a();

    @NotNull
    public final String a() {
        String processName = Application.getProcessName();
        AbstractC3340k.d(processName, "getProcessName()");
        return processName;
    }
}
