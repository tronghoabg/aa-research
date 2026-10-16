package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.unit.Density;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FlexConfigScope extends Density {
    void alignSelf(AlignmentLine alignmentLine);

    void alignSelf(l<? super Measured, Integer> lVar);

    /* renamed from: alignSelf-aKVMlHY, reason: not valid java name */
    void mo2557alignSelfaKVMlHY(int i2);

    void basis(float f2);

    /* renamed from: basis-0680j_4, reason: not valid java name */
    void mo2558basis0680j_4(float f2);

    /* renamed from: basis-MFoeH6Y, reason: not valid java name */
    void mo2559basisMFoeH6Y(long j2);

    int getFlexBoxCrossAxisMax();

    int getFlexBoxCrossAxisMin();

    int getFlexBoxMainAxisMax();

    int getFlexBoxMainAxisMin();

    void grow(float f2);

    void order(int i2);

    void shrink(float f2);
}
