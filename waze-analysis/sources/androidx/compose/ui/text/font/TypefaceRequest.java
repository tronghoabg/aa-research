package androidx.compose.ui.text.font;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TypefaceRequest {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i2;
        this.fontSynthesis = i3;
        this.resourceLoaderCacheKey = obj;
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m10703copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i4 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i4 & 4) != 0) {
            i2 = typefaceRequest.fontStyle;
        }
        if ((i4 & 8) != 0) {
            i3 = typefaceRequest.fontSynthesis;
        }
        if ((i4 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i5 = i2;
        return typefaceRequest.m10706copye1PVR60(fontFamily, fontWeight, i5, i3, obj3);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m10704component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m10705component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m10706copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i2, i3, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return x.n(this.fontFamily, typefaceRequest.fontFamily) && x.n(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m10661equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m10672equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && x.n(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m10707getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m10708getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int iHashCode = ((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode();
        int i2 = this.fontStyle;
        int i3 = this.fontSynthesis;
        Object obj = this.resourceLoaderCacheKey;
        return (((((iHashCode * 31) + i2) * 31) + i3) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m10663toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m10676toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj, o oVar) {
        this(fontFamily, fontWeight, i2, i3, obj);
    }
}
