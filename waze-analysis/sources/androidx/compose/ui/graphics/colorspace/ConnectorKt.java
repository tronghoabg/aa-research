package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ConnectorKt {
    private static final MutableIntObjectMap<Connector> Connectors;

    static {
        int id$ui_graphics = ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics() | (ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics() << 6);
        int iM8718getPerceptualuksYyKA = RenderIntent.Companion.m8718getPerceptualuksYyKA() << 12;
        Connector connectorIdentity$ui_graphics = Connector.Companion.identity$ui_graphics(ColorSpaces.INSTANCE.getSrgb());
        int id$ui_graphics2 = ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics() | (ColorSpaces.INSTANCE.getOklab().getId$ui_graphics() << 6);
        int iM8718getPerceptualuksYyKA2 = RenderIntent.Companion.m8718getPerceptualuksYyKA() << 12;
        o oVar = null;
        Connector connector = new Connector(ColorSpaces.INSTANCE.getSrgb(), ColorSpaces.INSTANCE.getOklab(), RenderIntent.Companion.m8718getPerceptualuksYyKA(), oVar);
        int id$ui_graphics3 = ColorSpaces.INSTANCE.getOklab().getId$ui_graphics() | (ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics() << 6) | (RenderIntent.Companion.m8718getPerceptualuksYyKA() << 12);
        int i2 = id$ui_graphics | iM8718getPerceptualuksYyKA;
        Connectors = IntObjectMapKt.mutableIntObjectMapOf(i2, connectorIdentity$ui_graphics, id$ui_graphics2 | iM8718getPerceptualuksYyKA2, connector, id$ui_graphics3, new Connector(ColorSpaces.INSTANCE.getOklab(), ColorSpaces.INSTANCE.getSrgb(), RenderIntent.Companion.m8718getPerceptualuksYyKA(), oVar));
    }

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m8709connectorKeyYBCOT_4(int i2, int i3, int i4) {
        return i2 | (i3 << 6) | (i4 << 12);
    }

    public static final MutableIntObjectMap<Connector> getConnectors() {
        return Connectors;
    }
}
