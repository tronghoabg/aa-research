package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xdp {
    public static final yph a = yph.c("GH.ProjectionKeyboard");
    public final Locale b;
    public final ArrayList c = new ArrayList();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public xdp(Context context, int i, Locale locale, EditorInfo editorInfo) throws Exception {
        Context context2;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 1;
        this.b = locale;
        Resources resources = context.getResources();
        XmlResourceParser xml = resources.getXml(i);
        oct octVar = null;
        while (true) {
            try {
                int next = xml.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    String name = xml.getName();
                    if ("Keyboard".equals(name)) {
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        for (int i2 = 0; i2 < attributeSetAsAttributeSet.getAttributeCount(); i2++) {
                            String attributeName = attributeSetAsAttributeSet.getAttributeName(i2);
                            if ("keyWidth".equals(attributeName)) {
                                this.d = resources.getDimensionPixelOffset(attributeSetAsAttributeSet.getAttributeResourceValue(i2, 0));
                            } else if ("keyHeight".equals(attributeName)) {
                                this.e = resources.getDimensionPixelOffset(attributeSetAsAttributeSet.getAttributeResourceValue(i2, 0));
                            } else if ("keyVerticalMargin".equals(attributeName)) {
                                this.f = resources.getDimensionPixelOffset(attributeSetAsAttributeSet.getAttributeResourceValue(i2, 0));
                            } else if ("keyHorizontalMargin".equals(attributeName)) {
                                this.g = resources.getDimensionPixelOffset(attributeSetAsAttributeSet.getAttributeResourceValue(i2, 0));
                            } else if ("keySpan".equals(attributeName)) {
                                this.h = resources.getInteger(attributeSetAsAttributeSet.getAttributeResourceValue(i2, 0));
                            } else {
                                tss.q("GH.ProjectionKeyboard", "Unhandled attribute of keyboard in the layout xml: %s", attributeName);
                            }
                        }
                        if (this.e == 0 || this.d == 0) {
                            break;
                        }
                    } else if ("Row".equals(name)) {
                        octVar = new oct(null, null, null);
                        this.c.add(octVar);
                    } else {
                        if ("Key".equals(name)) {
                            context2 = context;
                            octVar.D(new xdo(context2, xml, this.e, this.d, this.h, editorInfo.imeOptions));
                        } else {
                            context2 = context;
                            tss.q("GH.ProjectionKeyboard", "Unhandled tag in the keyboard layout: %s", name);
                        }
                        context = context2;
                    }
                }
                context2 = context;
                context = context2;
            } catch (Exception e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 10141)).u("Parse error");
                e.printStackTrace();
                return;
            }
        }
        throw new Exception("Default Dimensions not set for the keyboard");
    }

    public xdp(Locale locale, int i, int i2, int i3, int i4, int i5) {
        this.b = locale;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }
}
