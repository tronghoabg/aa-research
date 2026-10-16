package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xdq {
    public final Locale a;
    public final SparseIntArray b = new SparseIntArray();

    static {
        yph.c("GH.PrKbCharCycler");
    }

    public xdq(Context context, Locale locale) throws Resources.NotFoundException {
        this.a = locale;
        Resources resources = context.getResources();
        XmlResourceParser xml = resources.getXml(resources.getIdentifier("character_cycler", "xml", context.getPackageName()));
        while (true) {
            try {
                int next = xml.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    String name = xml.getName();
                    if (!"CharacterCycler".equals(name)) {
                        if ("item".equals(name)) {
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                            char cCharAt = attributeSetAsAttributeSet.getAttributeValue(null, "labelFrom").charAt(0);
                            char cCharAt2 = attributeSetAsAttributeSet.getAttributeValue(null, "labelTo").charAt(0);
                            if (this.b.indexOfKey(cCharAt) >= 0) {
                                tss.q("GH.PrKbCharCycler", "Duplication of keys in char cycler. Key: %d", Integer.valueOf(cCharAt));
                            }
                            this.b.put(cCharAt, cCharAt2);
                        } else {
                            tss.q("GH.PrKbCharCycler", "Unhandled attribute in Char cycler: %s", name);
                        }
                    }
                }
            } catch (Exception e) {
                tss.r("GH.PrKbCharCycler", e, "Parse error", new Object[0]);
                return;
            }
        }
    }
}
