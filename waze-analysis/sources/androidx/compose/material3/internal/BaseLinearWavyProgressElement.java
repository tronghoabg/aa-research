package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BaseLinearWavyProgressNode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
abstract class BaseLinearWavyProgressElement<N extends BaseLinearWavyProgressNode> extends ModifierNodeElement<N> {
    private final long color;
    private final float gapSize;
    private final Stroke stroke;
    private final long trackColor;
    private final Stroke trackStroke;
    private final float waveSpeed;
    private final float wavelength;

    private BaseLinearWavyProgressElement(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4) {
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.wavelength = f3;
        this.waveSpeed = f4;
    }

    protected final void baseInspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.getProperties().set("color", Color.m8218boximpl(mo6219getColor0d7_KjU()));
        inspectorInfo.getProperties().set("trackColor", Color.m8218boximpl(mo6221getTrackColor0d7_KjU()));
        inspectorInfo.getProperties().set("stroke", getStroke());
        inspectorInfo.getProperties().set("trackStroke", getTrackStroke());
        inspectorInfo.getProperties().set("gapSize", Dp.m11162boximpl(mo6220getGapSizeD9Ej5fM()));
        inspectorInfo.getProperties().set("wavelength", Dp.m11162boximpl(mo6223getWavelengthD9Ej5fM()));
        inspectorInfo.getProperties().set("waveSpeed", Dp.m11162boximpl(mo6222getWaveSpeedD9Ej5fM()));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinearWavyProgressElement)) {
            return false;
        }
        BaseLinearWavyProgressElement baseLinearWavyProgressElement = (BaseLinearWavyProgressElement) obj;
        return Color.m8229equalsimpl0(mo6219getColor0d7_KjU(), baseLinearWavyProgressElement.mo6219getColor0d7_KjU()) && Color.m8229equalsimpl0(mo6221getTrackColor0d7_KjU(), baseLinearWavyProgressElement.mo6221getTrackColor0d7_KjU()) && x.n(getStroke(), baseLinearWavyProgressElement.getStroke()) && x.n(getTrackStroke(), baseLinearWavyProgressElement.getTrackStroke()) && Dp.m11169equalsimpl0(mo6220getGapSizeD9Ej5fM(), baseLinearWavyProgressElement.mo6220getGapSizeD9Ej5fM()) && Dp.m11169equalsimpl0(mo6223getWavelengthD9Ej5fM(), baseLinearWavyProgressElement.mo6223getWavelengthD9Ej5fM()) && Dp.m11169equalsimpl0(mo6222getWaveSpeedD9Ej5fM(), baseLinearWavyProgressElement.mo6222getWaveSpeedD9Ej5fM());
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo6219getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getGapSize-D9Ej5fM, reason: not valid java name */
    public float mo6220getGapSizeD9Ej5fM() {
        return this.gapSize;
    }

    public Stroke getStroke() {
        return this.stroke;
    }

    /* renamed from: getTrackColor-0d7_KjU, reason: not valid java name */
    public long mo6221getTrackColor0d7_KjU() {
        return this.trackColor;
    }

    public Stroke getTrackStroke() {
        return this.trackStroke;
    }

    /* renamed from: getWaveSpeed-D9Ej5fM, reason: not valid java name */
    public float mo6222getWaveSpeedD9Ej5fM() {
        return this.waveSpeed;
    }

    /* renamed from: getWavelength-D9Ej5fM, reason: not valid java name */
    public float mo6223getWavelengthD9Ej5fM() {
        return this.wavelength;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(mo6219getColor0d7_KjU());
        return (((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(mo6221getTrackColor0d7_KjU())) * 31) + getStroke().hashCode()) * 31) + getTrackStroke().hashCode()) * 31) + Dp.m11170hashCodeimpl(mo6220getGapSizeD9Ej5fM())) * 31) + Dp.m11170hashCodeimpl(mo6223getWavelengthD9Ej5fM())) * 31) + Dp.m11170hashCodeimpl(mo6222getWaveSpeedD9Ej5fM());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(N n) {
        n.m6229setColor8_81llA(mo6219getColor0d7_KjU());
        n.m6231setTrackColor8_81llA(mo6221getTrackColor0d7_KjU());
        n.setStroke(getStroke());
        n.setTrackStroke(getTrackStroke());
        n.m6230setGapSize0680j_4(mo6220getGapSizeD9Ej5fM());
        n.m6233setWavelength0680j_4(mo6223getWavelengthD9Ej5fM());
        n.m6232setWaveSpeed0680j_4(mo6222getWaveSpeedD9Ej5fM());
    }

    public /* synthetic */ BaseLinearWavyProgressElement(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, o oVar) {
        this(j2, j3, stroke, stroke2, f2, f3, f4);
    }
}
