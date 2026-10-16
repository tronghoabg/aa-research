package com.unity3d.services.core.network.domain;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends C3338i implements l {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull File p02) {
        AbstractC3340k.e(p02, "p0");
        return Boolean.valueOf(p02.isFile());
    }
}
