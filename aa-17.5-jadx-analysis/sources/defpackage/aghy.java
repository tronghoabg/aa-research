package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public interface aghy {
    List<agic> getAllDependencies();

    List<agic> getDirectExpectedByDependencies();

    Set<agic> getModulesWhoseInternalsAreVisible();
}
