package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;
    private final TextStyle style;
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, ColorProducer colorProducer, int i5, o oVar) {
        this(str, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i5 & 16) == 0)) | z, (i5 & 32) != 0 ? Integer.MAX_VALUE : i3, (i5 & 64) != 0 ? 1 : i4, (i5 & 128) != 0 ? null : colorProducer, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return x.n(this.color, textStringSimpleElement.color) && x.n(this.text, textStringSimpleElement.text) && x.n(this.style, textStringSimpleElement.style) && x.n(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && TextOverflow.m11059equalsimpl0(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode();
        ColorProducer colorProducer = this.color;
        int iHashCode2 = colorProducer != null ? colorProducer.hashCode() : 0;
        int i2 = this.overflow;
        boolean z = this.softWrap;
        int i3 = ((iHashCode * 31) + i2) * 31;
        return ((((((i3 + TextStringSimpleElement$$ExternalSyntheticBackport0.m(z)) * 31) + this.maxLines) * 31) + this.minLines) * 31) + iHashCode2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextStringSimpleNode textStringSimpleNode) {
        ColorProducer colorProducer = this.color;
        TextStyle textStyle = this.style;
        int i2 = this.minLines;
        int i3 = this.maxLines;
        boolean z = this.softWrap;
        FontFamily.Resolver resolver = this.fontFamilyResolver;
        int i4 = this.overflow;
        textStringSimpleNode.doInvalidations(textStringSimpleNode.updateDraw(colorProducer, textStyle), textStringSimpleNode.updateText(this.text), textStringSimpleNode.m3837updateLayoutRelatedArgsHuAbxIM(textStyle, i2, i3, z, resolver, i4));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, ColorProducer colorProducer, o oVar) {
        this(str, textStyle, resolver, i2, z, i3, i4, colorProducer);
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.color = colorProducer;
    }
}
