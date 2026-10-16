package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public interface agwe {
    agzo findFieldByName(ahnj ahnjVar);

    Collection<agzr> findMethodsByName(ahnj ahnjVar);

    agzv findRecordComponentByName(ahnj ahnjVar);

    Set<ahnj> getFieldNames();

    Set<ahnj> getMethodNames();

    Set<ahnj> getRecordComponentNames();
}
