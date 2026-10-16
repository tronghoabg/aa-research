package com.unity3d.services.core.network.domain;

import ef.C2527k;
import ff.o;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lef/k;", "", "", "Ljava/io/File;", "<name for destructuring parameter 0>", "file", "invoke", "(Lef/k;Ljava/io/File;)Lef/k;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class CleanupDirectory$invoke$additionalFiles$2 extends AbstractC3343n implements p {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    public CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // tf.p
    @NotNull
    public final C2527k invoke(@NotNull C2527k c2527k, @NotNull File file) {
        AbstractC3340k.e(c2527k, "<name for destructuring parameter 0>");
        AbstractC3340k.e(file, "file");
        return new C2527k(Long.valueOf(((Number) c2527k.f34671a).longValue() - file.length()), o.F0((List) c2527k.f34672b, file));
    }
}
