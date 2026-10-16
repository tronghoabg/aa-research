package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DeterminateCircularWavyProgressElement extends BaseCircularWavyProgressElement<DeterminateCircularWavyProgressNode> {
    private final l<Float, Float> amplitude;
    private final long color;
    private final float gapSize;
    private final a<Float> progress;
    private final Stroke stroke;
    private final long trackColor;
    private final Stroke trackStroke;
    private final float waveSpeed;
    private final float wavelength;

    /* JADX WARN: Multi-variable type inference failed */
    private DeterminateCircularWavyProgressElement(a<Float> aVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, l<? super Float, Float> lVar, float f3, float f4) {
        super(j2, j3, stroke, stroke2, f2, f3, f4, null);
        this.progress = aVar;
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.amplitude = lVar;
        this.wavelength = f3;
        this.waveSpeed = f4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DeterminateCircularWavyProgressNode create() {
        return new DeterminateCircularWavyProgressNode(this.progress, this.amplitude, mo6202getColor0d7_KjU(), mo6204getTrackColor0d7_KjU(), getStroke(), getTrackStroke(), mo6203getGapSizeD9Ej5fM(), mo6206getWavelengthD9Ej5fM(), mo6205getWaveSpeedD9Ej5fM(), null);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof DeterminateCircularWavyProgressElement)) {
            return false;
        }
        DeterminateCircularWavyProgressElement determinateCircularWavyProgressElement = (DeterminateCircularWavyProgressElement) obj;
        return this.progress == determinateCircularWavyProgressElement.progress && this.amplitude == determinateCircularWavyProgressElement.amplitude;
    }

    public final l<Float, Float> getAmplitude() {
        return this.amplitude;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    /* renamed from: getColor-0d7_KjU */
    public long mo6202getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    /* renamed from: getGapSize-D9Ej5fM */
    public float mo6203getGapSizeD9Ej5fM() {
        return this.gapSize;
    }

    public final a<Float> getProgress() {
        return this.progress;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public Stroke getStroke() {
        return this.stroke;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    /* renamed from: getTrackColor-0d7_KjU */
    public long mo6204getTrackColor0d7_KjU() {
        return this.trackColor;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public Stroke getTrackStroke() {
        return this.trackStroke;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    /* renamed from: getWaveSpeed-D9Ej5fM */
    public float mo6205getWaveSpeedD9Ej5fM() {
        return this.waveSpeed;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    /* renamed from: getWavelength-D9Ej5fM */
    public float mo6206getWavelengthD9Ej5fM() {
        return this.wavelength;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((super.hashCode() * 31) + this.progress.hashCode()) * 31) + this.amplitude.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("determinateCircularWavyProgressIndicator");
        baseInspectableProperties(inspectorInfo);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public void update(DeterminateCircularWavyProgressNode determinateCircularWavyProgressNode) {
        super.update((DeterminateCircularWavyProgressElement) determinateCircularWavyProgressNode);
        if (determinateCircularWavyProgressNode.getProgress() == this.progress && determinateCircularWavyProgressNode.getAmplitude() == this.amplitude) {
            return;
        }
        determinateCircularWavyProgressNode.setProgress(this.progress);
        determinateCircularWavyProgressNode.setAmplitude(this.amplitude);
        determinateCircularWavyProgressNode.getCacheDrawNode().invalidateDrawCache();
    }

    public /* synthetic */ DeterminateCircularWavyProgressElement(a aVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, l lVar, float f3, float f4, o oVar) {
        this(aVar, j2, j3, stroke, stroke2, f2, lVar, f3, f4);
    }
}
