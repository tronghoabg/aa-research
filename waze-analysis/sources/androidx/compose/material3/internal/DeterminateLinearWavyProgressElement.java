package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DeterminateLinearWavyProgressElement extends BaseLinearWavyProgressElement<DeterminateLinearWavyProgressNode> {
    private final l<Float, Float> amplitude;
    private final long color;
    private final float gapSize;
    private final a<Float> progress;
    private final float stopSize;
    private final Stroke stroke;
    private final long trackColor;
    private final Stroke trackStroke;
    private final float waveSpeed;
    private final float wavelength;

    /* JADX WARN: Multi-variable type inference failed */
    private DeterminateLinearWavyProgressElement(a<Float> aVar, l<? super Float, Float> lVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        super(j2, j3, stroke, stroke2, f2, f4, f5, null);
        this.progress = aVar;
        this.amplitude = lVar;
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.stopSize = f3;
        this.wavelength = f4;
        this.waveSpeed = f5;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DeterminateLinearWavyProgressNode create() {
        return new DeterminateLinearWavyProgressNode(this.progress, this.amplitude, this.stopSize, mo6219getColor0d7_KjU(), mo6221getTrackColor0d7_KjU(), getStroke(), getTrackStroke(), mo6220getGapSizeD9Ej5fM(), mo6223getWavelengthD9Ej5fM(), mo6222getWaveSpeedD9Ej5fM(), null);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof DeterminateLinearWavyProgressElement)) {
            return false;
        }
        DeterminateLinearWavyProgressElement determinateLinearWavyProgressElement = (DeterminateLinearWavyProgressElement) obj;
        return Dp.m11169equalsimpl0(this.stopSize, determinateLinearWavyProgressElement.stopSize) && this.progress == determinateLinearWavyProgressElement.progress && this.amplitude == determinateLinearWavyProgressElement.amplitude;
    }

    public final l<Float, Float> getAmplitude() {
        return this.amplitude;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getColor-0d7_KjU */
    public long mo6219getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    /* renamed from: getGapSize-D9Ej5fM */
    public float mo6220getGapSizeD9Ej5fM() {
        return this.gapSize;
    }

    public final a<Float> getProgress() {
        return this.progress;
    }

    /* renamed from: getStopSize-D9Ej5fM, reason: not valid java name */
    public final float m6251getStopSizeD9Ej5fM() {
        return this.stopSize;
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
        return (((((super.hashCode() * 31) + Dp.m11170hashCodeimpl(this.stopSize)) * 31) + this.progress.hashCode()) * 31) + this.amplitude.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("determinateLinearWavyProgressIndicator");
        inspectorInfo.getProperties().set("stopSize", Dp.m11162boximpl(this.stopSize));
        baseInspectableProperties(inspectorInfo);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public void update(DeterminateLinearWavyProgressNode determinateLinearWavyProgressNode) {
        super.update((DeterminateLinearWavyProgressElement) determinateLinearWavyProgressNode);
        determinateLinearWavyProgressNode.m6253setStopSize0680j_4(this.stopSize);
        if (determinateLinearWavyProgressNode.getProgress() == this.progress && determinateLinearWavyProgressNode.getAmplitude() == this.amplitude) {
            return;
        }
        determinateLinearWavyProgressNode.setProgress(this.progress);
        determinateLinearWavyProgressNode.setAmplitude(this.amplitude);
        determinateLinearWavyProgressNode.getCacheDrawNodeDelegate().invalidateDrawCache();
    }

    public /* synthetic */ DeterminateLinearWavyProgressElement(a aVar, l lVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, o oVar) {
        this(aVar, lVar, j2, j3, stroke, stroke2, f2, f3, f4, f5);
    }
}
