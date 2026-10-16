package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class IndeterminateLinearWavyProgressElement extends BaseLinearWavyProgressElement<IndeterminateLinearWavyProgressNode> {
    private final float amplitude;
    private final long color;
    private final a<Float> firstLineHeadProgress;
    private final a<Float> firstLineTailProgress;
    private final float gapSize;
    private final a<Float> secondLineHeadProgress;
    private final a<Float> secondLineTailProgress;
    private final Stroke stroke;
    private final long trackColor;
    private final Stroke trackStroke;
    private final float waveSpeed;
    private final float wavelength;

    private IndeterminateLinearWavyProgressElement(a<Float> aVar, a<Float> aVar2, a<Float> aVar3, a<Float> aVar4, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        super(j2, j3, stroke, stroke2, f2, f3, f4, null);
        this.firstLineHeadProgress = aVar;
        this.firstLineTailProgress = aVar2;
        this.secondLineHeadProgress = aVar3;
        this.secondLineTailProgress = aVar4;
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.wavelength = f3;
        this.waveSpeed = f4;
        this.amplitude = f5;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IndeterminateLinearWavyProgressNode create() {
        return new IndeterminateLinearWavyProgressNode(this.firstLineHeadProgress, this.firstLineTailProgress, this.secondLineHeadProgress, this.secondLineTailProgress, this.amplitude, mo6219getColor0d7_KjU(), mo6221getTrackColor0d7_KjU(), getStroke(), getTrackStroke(), mo6220getGapSizeD9Ej5fM(), mo6223getWavelengthD9Ej5fM(), mo6222getWaveSpeedD9Ej5fM(), null);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof IndeterminateLinearWavyProgressElement) && this.amplitude == ((IndeterminateLinearWavyProgressElement) obj).amplitude;
    }

    public final float getAmplitude() {
        return this.amplitude;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getColor-0d7_KjU */
    public long mo6219getColor0d7_KjU() {
        return this.color;
    }

    public final a<Float> getFirstLineHeadProgress() {
        return this.firstLineHeadProgress;
    }

    public final a<Float> getFirstLineTailProgress() {
        return this.firstLineTailProgress;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getGapSize-D9Ej5fM */
    public float mo6220getGapSizeD9Ej5fM() {
        return this.gapSize;
    }

    public final a<Float> getSecondLineHeadProgress() {
        return this.secondLineHeadProgress;
    }

    public final a<Float> getSecondLineTailProgress() {
        return this.secondLineTailProgress;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public Stroke getStroke() {
        return this.stroke;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getTrackColor-0d7_KjU */
    public long mo6221getTrackColor0d7_KjU() {
        return this.trackColor;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public Stroke getTrackStroke() {
        return this.trackStroke;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getWaveSpeed-D9Ej5fM */
    public float mo6222getWaveSpeedD9Ej5fM() {
        return this.waveSpeed;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getWavelength-D9Ej5fM */
    public float mo6223getWavelengthD9Ej5fM() {
        return this.wavelength;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (super.hashCode() * 31) + Float.floatToIntBits(this.amplitude);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indeterminateLinearWavyProgressIndicator");
        inspectorInfo.getProperties().set("amplitude", Float.valueOf(this.amplitude));
        baseInspectableProperties(inspectorInfo);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public void update(IndeterminateLinearWavyProgressNode indeterminateLinearWavyProgressNode) {
        super.update((IndeterminateLinearWavyProgressElement) indeterminateLinearWavyProgressNode);
        indeterminateLinearWavyProgressNode.setFirstLineHeadProgress(this.firstLineHeadProgress);
        indeterminateLinearWavyProgressNode.setFirstLineTailProgress(this.firstLineTailProgress);
        indeterminateLinearWavyProgressNode.setSecondLineHeadProgress(this.secondLineHeadProgress);
        indeterminateLinearWavyProgressNode.setSecondLineTailProgress(this.secondLineTailProgress);
        indeterminateLinearWavyProgressNode.setAmplitude(this.amplitude);
    }

    public /* synthetic */ IndeterminateLinearWavyProgressElement(a aVar, a aVar2, a aVar3, a aVar4, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, o oVar) {
        this(aVar, aVar2, aVar3, aVar4, j2, j3, stroke, stroke2, f2, f3, f4, f5);
    }
}
