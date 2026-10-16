package androidx.graphics.path;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J1\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0082 ¨\u0006\u001b"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "value", "", "quadraticCount", "getQuadraticCount", "()I", "currentQuadratic", "getCurrentQuadratic", "setCurrentQuadratic", "(I)V", "quadraticData", "", "nextQuadratic", "", "points", "offset", "convert", "", "weight", "", "tolerance", "internalConicToQuadratics", "conicPoints", "quadraticPoints", "graphics-path"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConicConverter {
    private final native int internalConicToQuadratics(float[] conicPoints, int offset, float[] quadraticPoints, float weight, float tolerance);
}
