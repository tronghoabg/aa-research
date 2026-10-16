package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public interface agee extends agbd, aime {
    int getIndex();

    @Override // defpackage.agbd, defpackage.agbi
    agee getOriginal();

    aiei getStorageManager();

    @Override // defpackage.agbd
    aiid getTypeConstructor();

    List<aigl> getUpperBounds();

    aijg getVariance();

    boolean isCapturedFromOuterDeclaration();

    boolean isReified();
}
