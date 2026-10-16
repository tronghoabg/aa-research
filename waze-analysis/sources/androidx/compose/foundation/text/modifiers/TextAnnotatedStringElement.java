package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final l<List<Rect>, ab> onPlaceholderLayout;
    private final l<TextAnnotatedStringNode.TextSubstitutionValue, ab> onShowTranslation;
    private final l<TextLayoutResult, ab> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z, int i3, int i4, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, l lVar3, int i5, o oVar) {
        this(annotatedString, textStyle, resolver, (i5 & 8) != 0 ? null : lVar, (i5 & 16) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i5 & 32) == 0)) | z, (i5 & 64) != 0 ? Integer.MAX_VALUE : i3, (i5 & 128) != 0 ? 1 : i4, (i5 & 256) != 0 ? null : list, (i5 & 512) != 0 ? null : lVar2, (i5 & 1024) != 0 ? null : selectionController, (i5 & 2048) != 0 ? null : colorProducer, (i5 & 4096) != 0 ? null : textAutoSize, (i5 & 8192) != 0 ? null : lVar3, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, this.onShowTranslation, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return x.n(this.color, textAnnotatedStringElement.color) && x.n(this.text, textAnnotatedStringElement.text) && x.n(this.style, textAnnotatedStringElement.style) && x.n(this.placeholders, textAnnotatedStringElement.placeholders) && x.n(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && TextOverflow.m11059equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && x.n(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode();
        l<TextLayoutResult, ab> lVar = this.onTextLayout;
        int iHashCode2 = ((((((((((iHashCode * 31) + (lVar != null ? lVar.hashCode() : 0)) * 31) + this.overflow) * 31) + TextAnnotatedStringElement$$ExternalSyntheticBackport0.m(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<List<Rect>, ab> lVar2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int iHashCode5 = (iHashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        int iHashCode6 = (iHashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        l<TextAnnotatedStringNode.TextSubstitutionValue, ab> lVar3 = this.onShowTranslation;
        return iHashCode6 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextAnnotatedStringNode textAnnotatedStringNode) {
        l<TextLayoutResult, ab> lVar = this.onTextLayout;
        l<List<Rect>, ab> lVar2 = this.onPlaceholderLayout;
        SelectionController selectionController = this.selectionController;
        l<TextAnnotatedStringNode.TextSubstitutionValue, ab> lVar3 = this.onShowTranslation;
        ColorProducer colorProducer = this.color;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int i2 = this.minLines;
        int i3 = this.maxLines;
        boolean z = this.softWrap;
        FontFamily.Resolver resolver = this.fontFamilyResolver;
        int i4 = this.overflow;
        TextAutoSize textAutoSize = this.autoSize;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, textStyle), textAnnotatedStringNode.updateText$foundation(this.text), textAnnotatedStringNode.m3835updateLayoutRelatedArgsy0kMQk(textStyle, list, i2, i3, z, resolver, i4, textAutoSize), textAnnotatedStringNode.updateCallbacks(lVar, lVar2, selectionController, lVar3));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z, int i3, int i4, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, l lVar3, o oVar) {
        this(annotatedString, textStyle, resolver, lVar, i2, z, i3, i4, list, lVar2, selectionController, colorProducer, textAutoSize, lVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l<? super TextLayoutResult, ab> lVar, int i2, boolean z, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, l<? super List<Rect>, ab> lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, l<? super TextAnnotatedStringNode.TextSubstitutionValue, ab> lVar3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = lVar;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = selectionController;
        this.color = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = lVar3;
    }
}
