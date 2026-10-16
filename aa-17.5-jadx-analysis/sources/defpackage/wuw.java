package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.projection.gearhead.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class wuw {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public wuw(Context context, int i) throws Resources.NotFoundException {
        int next;
        int depth;
        e();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, wuf.a) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, wuf.a, 0, 0);
                                    wuk wukVar = new wuk(wuk.k(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)));
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                                        this.b = wukVar;
                                    }
                                    Object obj = this.c;
                                    if (i5 >= ((int[][]) obj).length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr2 = new int[i6][];
                                        System.arraycopy(obj, 0, iArr2, 0, i5);
                                        this.c = iArr2;
                                        wuk[] wukVarArr = new wuk[i6];
                                        System.arraycopy(this.d, 0, wukVarArr, 0, i5);
                                        this.d = wukVarArr;
                                    }
                                    Object obj2 = this.c;
                                    int i7 = this.a;
                                    ((int[][]) obj2)[i7] = iArrTrimStateSet;
                                    ((wuk[]) this.d)[i7] = wukVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            e();
        }
    }

    private final void e() {
        this.b = new wuk();
        this.c = new int[10][];
        this.d = new wuk[10];
    }

    public final wux a() {
        if (this.a == 0) {
            return null;
        }
        return new wux(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, udx] */
    public final udo b() {
        Object obj;
        int i;
        ?? r0 = this.d;
        if (r0 == 0 || (obj = this.b) == null || (i = this.a) == 0) {
            throw new IllegalStateException();
        }
        return new udo(r0, (udl) obj, i, (xxh) this.c);
    }

    public final void c(int i) {
        this.b = udl.UNPLACED;
        this.a = i;
        this.c = xvy.a;
    }

    public final void d(udx udxVar) {
        udxVar.getClass();
        this.d = udxVar;
    }

    public wuw(udo udoVar) {
        this.c = xvy.a;
        this.d = udoVar.a;
        this.b = udoVar.b;
        this.a = udoVar.d;
        this.c = udoVar.c;
    }

    public wuw() {
        this.c = xvy.a;
    }

    public wuw(wux wuxVar) {
        int i = wuxVar.a;
        this.a = i;
        this.b = wuxVar.b;
        this.c = new int[wuxVar.c.length][];
        this.d = new wuk[wuxVar.d.length];
        System.arraycopy(wuxVar.c, 0, this.c, 0, i);
        System.arraycopy(wuxVar.d, 0, this.d, 0, this.a);
    }
}
