package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class IndeterminateCircularWavyProgressElement extends BaseCircularWavyProgressElement<IndeterminateCircularWavyProgressNode> {
    private final float amplitude;
    private final long color;
    private final float gapSize;
    private final Stroke stroke;
    private final long trackColor;
    private final Stroke trackStroke;
    private final float waveSpeed;
    private final float wavelength;

    private IndeterminateCircularWavyProgressElement(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        super(j2, j3, stroke, stroke2, f2, f4, f5, null);
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.amplitude = f3;
        this.wavelength = f4;
        this.waveSpeed = f5;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IndeterminateCircularWavyProgressNode create() {
        return new IndeterminateCircularWavyProgressNode(mo6202getColor0d7_KjU(), mo6204getTrackColor0d7_KjU(), getStroke(), getTrackStroke(), mo6203getGapSizeD9Ej5fM(), this.amplitude, mo6206getWavelengthD9Ej5fM(), mo6205getWaveSpeedD9Ej5fM(), null);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IndeterminateCircularWavyProgressElement) && super.equals(obj) && this.amplitude == ((IndeterminateCircularWavyProgressElement) obj).amplitude;
    }

    public final float getAmplitude() {
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
        return (super.hashCode() * 31) + Float.floatToIntBits(this.amplitude);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indeterminateCircularWavyProgressIndicator");
        baseInspectableProperties(inspectorInfo);
        inspectorInfo.getProperties().set("amplitude", Float.valueOf(this.amplitude));
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement, androidx.compose.ui.node.ModifierNodeElement
    public void update(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode) {
        super.update((IndeterminateCircularWavyProgressElement) indeterminateCircularWavyProgressNode);
        indeterminateCircularWavyProgressNode.setAmplitude(this.amplitude);
    }

    public /* synthetic */ IndeterminateCircularWavyProgressElement(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, o oVar) {
        this(j2, j3, stroke, stroke2, f2, f3, f4, f5);
    }
}
