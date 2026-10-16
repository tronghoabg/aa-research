package K3;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6455a = new a();

    @NotNull
    public final File a(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC3340k.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
